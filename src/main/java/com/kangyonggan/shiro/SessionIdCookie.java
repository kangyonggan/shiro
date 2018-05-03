package com.kangyonggan.shiro;

import org.apache.shiro.web.servlet.SimpleCookie;

/**
 * @author kangyonggan
 */
public class SessionIdCookie extends SimpleCookie {

    public SessionIdCookie() {
        setName("sid");
        setPath("/");
        setHttpOnly(true);
        setMaxAge(-1);
    }


}
