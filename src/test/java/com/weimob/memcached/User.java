package com.weimob.memcached;

import java.io.Serializable;

/**
 * Created by Devin on 4/14/2016.
 */
public class User implements Serializable{

    String userId;

    public User(String userId) {
        super();
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        StringBuffer sb=new StringBuffer();
        sb.append("userId="+this.userId);
        return sb.toString();
    }
}
