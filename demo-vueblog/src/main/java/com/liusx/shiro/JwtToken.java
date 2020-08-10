package com.liusx.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * description: JwtToken <br>
 * date: 2020/8/10 15:18 <br>
 * author: liusx <br>
 * version: 1.0 <br>
 */
public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String jwt) {
        this.token = jwt;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
