package com.netease.nim.camellia.redis.proxy.command.async;

import java.net.SocketAddress;

/**
 * 注意各字段的判空
 * Created by caojiajun on 2020/11/10
 */
public class CommandContext extends CommandContextForNameSpace {
    protected final Long bid;
    protected final String bgroup;
    protected final SocketAddress clientSocketAddress;

    public CommandContext(Long bid, String bgroup, SocketAddress clientSocketAddress) {
        super(null);
        this.bid = bid;
        this.bgroup = bgroup;
        this.clientSocketAddress = clientSocketAddress;
    }
    public CommandContext(Long bid, String bgroup, SocketAddress clientSocketAddress,String nameSpace) {
        super(nameSpace);
        this.bid = bid;
        this.bgroup = bgroup;
        this.clientSocketAddress = clientSocketAddress;
    }

    public Long getBid() {
        return bid;
    }

    public String getBgroup() {
        return bgroup;
    }

    public SocketAddress getClientSocketAddress() {
        return clientSocketAddress;
    }

    @Override
    public String toString() {
        return "CommandContext{" +
                "bid=" + bid +
                ", bgroup='" + bgroup + '\'' +
                ", clientSocketAddress=" + clientSocketAddress +
                '}';
    }
}
