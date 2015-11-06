package com.zizaike.core.common.util.logger;

import org.slf4j.LoggerFactory;

/**
 * 
 * ClassName: Logger <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2015年9月8日 下午2:00:41 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.6
 */
public class Logger {

    private final org.slf4j.Logger logger;

    private Logger(Class<?> clazz) {
        logger = LoggerFactory.getLogger(clazz);
    }

    public static Logger getLogger(Class<?> clazz) {
        return new Logger(clazz);
    }

    public void trace(String pattern, Object... arguments) {
        logger.trace(pattern, arguments);
    }

    public void trace(String pattern, Throwable t, Object... arguments) {
        logger.trace(format(pattern, arguments), t);
    }

    public void debug(String pattern, Object... arguments) {
        logger.debug(pattern, arguments);
    }

    public void debug(String pattern, Throwable t, Object... arguments) {
        logger.debug(format(pattern, arguments), t);
    }

    public void info(String pattern, Object... arguments) {
        logger.info(pattern, arguments);
    }

    public void info(String pattern, Throwable t, Object... arguments) {
        logger.info(format(pattern, arguments), t);
    }

    public void warn(String pattern, Object... arguments) {
        logger.warn(pattern, arguments);
    }

    public void warn(String pattern, Throwable t, Object... arguments) {
        logger.warn(format(pattern, arguments), t);
    }

    public void error(String pattern, Object... arguments) {
        logger.error(pattern, arguments);
    }

    public void error(String pattern, Throwable t, Object... arguments) {
        logger.error(format(pattern, arguments), t);
    }

    private static String format(String pattern, Object... arguments) {
        return java.text.MessageFormat.format(pattern, arguments);
    }

}
