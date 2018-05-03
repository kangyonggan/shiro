package com.kangyonggan.shiro;

import org.apache.shiro.session.mgt.eis.EnterpriseCacheSessionDAO;
import org.apache.shiro.session.mgt.eis.JavaUuidSessionIdGenerator;

/**
 * @author kangyonggan
 */
public class SessionDAO extends EnterpriseCacheSessionDAO {

    public SessionDAO() {
        setActiveSessionsCacheName("shiro-activeSessionCache");
        setSessionIdGenerator(new JavaUuidSessionIdGenerator());
    }

}
