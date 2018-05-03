package com.kangyonggan.shiro;

import org.apache.shiro.session.mgt.quartz.QuartzSessionValidationScheduler;

/**
 * @author kangyonggan
 */
public class SessionValidationScheduler extends QuartzSessionValidationScheduler {

    public SessionValidationScheduler() {
        setSessionValidationInterval(1800000);
    }

}
