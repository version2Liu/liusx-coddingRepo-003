package com.liusx.demoshiroback.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * description: MyRealm <br>
 * date: 2020/7/15 11:03 <br>
 * author: liusx <br>
 * version: 1.0 <br>
 */
public class MyRealm extends AuthorizingRealm {

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        if(!"helloworld".equals(username)){
            throw new UnknownAccountException("账户不存在");
        }
        return new SimpleAuthenticationInfo(username,"123",getName());
    }
}
