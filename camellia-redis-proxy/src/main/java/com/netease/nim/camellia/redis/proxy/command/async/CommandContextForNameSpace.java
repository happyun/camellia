package com.netease.nim.camellia.redis.proxy.command.async;

import java.net.SocketAddress;

/**
 * 注意各字段的判空
 * Created by caojiajun on 2020/11/10
 */
public class CommandContextForNameSpace {
    protected final String nameSpace;

    public CommandContextForNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public String getNameSpace() {
        return nameSpace;
    }

    @Override
    public String toString() {
        return "CommandContext{" +
                ", nameSpace='" + nameSpace + '\'' +
                '}';
    }
}
