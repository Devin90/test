package com.weimob.zookeeper;

import org.apache.zookeeper.KeeperException;

import java.util.List;

/**
 * Created by Devin on 4/14/2016.
 */
public class DeleteGroup extends ConnectionWatcher {

    public void delete(String groupName) {
        String path = "/" + groupName;

        try {
            List<String> children = zk.getChildren(path, false);

            for(String child : children){
                zk.delete(path + "/" + child, -1);
            }
            zk.delete(path, -1);//版本号为-1，
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
