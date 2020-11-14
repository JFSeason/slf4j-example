package com.example.slf4j.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author
 * @date 2020/11/12 14:30
 */
public class Slf4jHandler {
    private Logger logger = LoggerFactory.getLogger(Slf4jHandler.class);

    public void start() {
        logger.info("测试");
        logger.error("报错");
        logger.debug("调试");
    }
}
