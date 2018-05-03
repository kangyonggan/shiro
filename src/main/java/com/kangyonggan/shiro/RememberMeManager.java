package com.kangyonggan.shiro;

import org.apache.shiro.web.mgt.CookieRememberMeManager;

/**
 * @author kangyonggan
 */
public class RememberMeManager extends CookieRememberMeManager {

    public RememberMeManager() {
        setCookie(new RememberMeCookie());
    }

}
