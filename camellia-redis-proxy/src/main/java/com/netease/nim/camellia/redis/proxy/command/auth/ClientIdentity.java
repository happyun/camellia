package com.netease.nim.camellia.redis.proxy.command.auth;

public class ClientIdentity {
    private Long bid;

    private String bgroup;

    private boolean pass;

    private String nameSpace;

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public String getBgroup() {
        return bgroup;
    }

    public void setBgroup(String bgroup) {
        this.bgroup = bgroup;
    }

    public boolean isPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    public String getNameSpace() {
        return nameSpace;
    }

    public ClientIdentity setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
}
