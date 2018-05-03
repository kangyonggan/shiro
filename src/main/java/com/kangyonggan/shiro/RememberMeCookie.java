package com.kangyonggan.shiro;

import org.apache.shiro.web.servlet.SimpleCookie;

/**
 * @author kangyonggan
 */
public class RememberMeCookie extends SimpleCookie {

    public RememberMeCookie() {
        setName("rememberMe");
        setHttpOnly(true);
        setMaxAge(2592000);
    }

}
