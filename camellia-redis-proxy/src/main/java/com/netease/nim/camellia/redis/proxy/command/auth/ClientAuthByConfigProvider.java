package com.netease.nim.camellia.redis.proxy.command.auth;

import com.netease.nim.camellia.redis.proxy.conf.CamelliaServerProperties;
import io.netty.util.internal.StringUtil;

public class ClientAuthByConfigProvider implements ClientAuthProvider {
    private final String configPassword;

    public ClientAuthByConfigProvider(CamelliaServerProperties properties) {
        this.configPassword = properties.getPassword();
    }

    @Override
    public ClientIdentity auth(String userName, String password) {
        String nameSpace = null;
        if (password.contains("#")) {
            String[] split = password.split("#");
            nameSpace = split[0];
            password = split[1];
        }
        ClientIdentity clientIdentity = new ClientIdentity();
        if (userName != null && !userName.equals("default")) {
            clientIdentity.setPass(false);
            return clientIdentity;
        }
        clientIdentity.setPass(!StringUtil.isNullOrEmpty(this.configPassword)
                && this.configPassword.equals(password));
        if (nameSpace != null) {
            clientIdentity.setNameSpace(nameSpace);
        }
        return clientIdentity;
    }

    @Override
    public boolean isPasswordRequired() {
        return !StringUtil.isNullOrEmpty(this.configPassword);
    }
}
