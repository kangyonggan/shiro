package com.kangyonggan.shiro;

import org.apache.shiro.web.mgt.DefaultWebSecurityManager;

/**
 * @author kangyonggan
 */
public class SecurityManager extends DefaultWebSecurityManager {

    public SecurityManager() {
        setSessionManager(new SessionManager());
        setRememberMeManager(new RememberMeManager());
    }

}
