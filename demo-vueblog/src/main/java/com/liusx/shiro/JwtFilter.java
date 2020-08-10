package com.liusx.shiro;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.AuthenticatingFilter;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * description: JwtFilter <br>
 * date: 2020/8/10 15:15 <br>
 * author: liusx <br>
 * version: 1.0 <br>
 */
@Component
public class JwtFilter extends AuthenticatingFilter {

    @Override
    protected AuthenticationToken createToken(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {

        return null;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        return false;
    }
}
