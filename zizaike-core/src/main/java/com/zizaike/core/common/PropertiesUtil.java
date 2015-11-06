package com.zizaike.core.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.zizaike.core.common.util.logger.Logger;

/**
 * 
 * ClassName: PropertiesUtil <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2015年10月15日 下午3:11:08 <br/>
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
public class PropertiesUtil {
    private static final Logger LOG = Logger.getLogger(PropertiesUtil.class);

    /**
     * 增加属性文件值
     * 
     * @param key
     * @param value
     */
    public static void addProperties(String[] key, String[] value, String file) {
        Properties iniFile = getProperties(file);
        FileOutputStream oFile = null;
        try {
            iniFile.put(key, value);
            oFile = new FileOutputStream(file, true);
            iniFile.store(oFile, "modify properties file addProperties");
        } catch (FileNotFoundException e) {
            LOG.error("addProperties FileNotFoundException", e.toString());
        } catch (IOException e) {
            LOG.error("addProperties IOException", e);
        } finally {
            try {
                if (oFile != null) {
                    oFile.close();
                }
            } catch (IOException e) {
                LOG.error("addPropertiesn oFile.close", e);
            }
        }
    }

    /**
     * 读取配置文件
     * 
     * @return
     */
    public static Properties getProperties(String file) {
        Properties pro = null;
        // 从文件mdxbu.properties中读取网元ID和模块ID信息
        FileInputStream in = null;
        try {
            in = new FileInputStream(file);
            pro = new Properties();
            pro.load(in);

        } catch (Exception e) {
            LOG.error("getProperties Exception", e);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                LOG.error("getProperties IOException", ex);
            }
        }
        return pro;
    }

    /**
     * 保存属性到文件中
     * 
     * @param pro
     * @param file
     */
    public static void saveProperties(Properties pro, String file) {
        if (pro == null) {
            return;
        }
        FileOutputStream oFile = null;
        try {
            oFile = new FileOutputStream(file, false);
            pro.store(oFile, "modify properties file saveProperties");
        } catch (FileNotFoundException ex) {
            LOG.error("saveProperties FileNotFoundException", ex);
        } catch (IOException e) {
            LOG.error("saveProperties IOException", e);
        } finally {
            try {
                if (oFile != null) {
                    oFile.close();
                }
            } catch (IOException e) {
                LOG.error("saveProperties", e);
            }
        }
    }

    /**
     * 修改属性文件
     * 
     * @param key
     * @param value
     */
    public static void updateProperties(String key, String value, String file) {
        // key为空则返回
        if (key == null || "".equalsIgnoreCase(key)) {
            return;
        }
        Properties pro = getProperties(file);
        if (pro == null) {
            pro = new Properties();
        }
        pro.put(key, value);

        // 保存属性到文件中
        saveProperties(pro, file);
    }

}
