package com.kangyonggan.shiro;

import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;

/**
 * @author kangyonggan
 */
public class SessionManager extends DefaultWebSessionManager {

    public SessionManager() {
        setGlobalSessionTimeout(1800000);
        setDeleteInvalidSessions(true);
        setSessionValidationSchedulerEnabled(true);
        setSessionValidationScheduler(new SessionValidationScheduler());
        setSessionDAO(new SessionDAO());
        setSessionIdCookieEnabled(true);
        setSessionIdCookie(new SessionIdCookie());
    }

}
