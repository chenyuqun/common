package com.zizaike.core.common.util.http;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.tools.generic.DateTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * ClassName: VelocityUtils <br/>  
 * Function: 模板 <br/>  
 * date: 2016年1月7日 下午5:42:23 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public final class VelocityUtils {
    private static Logger logger = LoggerFactory.getLogger(VelocityUtils.class);

    /**
     * 构造函数
     */
    public VelocityUtils() {

    }

    public final static void generator(Map model, String filePath, String templatePath) {
        BufferedWriter writer = null;
        BufferedReader reader = null;
        System.err.println(filePath + "----" + templatePath);
        try {
            Velocity.init();
            // 初始化上下文
            VelocityContext ctx = new VelocityContext();
            if (null != model && !model.isEmpty()) {
                Iterator<Map> iter = model.keySet().iterator();
                Object key = null;
                while (iter.hasNext()) {
                    key = iter.next();
                    if (null == key || !(key instanceof String)) {
                        continue;
                    }
                    ctx.put(key.toString(), model.get(key));
                }
            }
            ctx.put("create_date", new DateTool());
            // 加载模板
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            reader = new BufferedReader(new InputStreamReader(contextClassLoader.getResourceAsStream(templatePath)));
            // 生成的文件
            File file = new File(filePath);
            File parentFile = file.getParentFile();
            if (null != parentFile && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            if (file.exists()) {// 存在，先备份原文件
                logger.error(" 文件已经存在  filePath=" + filePath);
                file.renameTo(new File(filePath + ".bak_" + System.currentTimeMillis()));
            }
            writer = new BufferedWriter(new FileWriter(filePath));

            Velocity.evaluate(ctx, writer, "GC", reader);
        } catch (Exception e) {
            logger.error("VelocityUtils.generator(Map, String, String)", e);
        } finally {
            try {
                if (null != reader) {
                    reader.close();
                }
                if (null != writer) {
                    writer.close();
                }
            } catch (IOException e) {
                logger.error("VelocityUtils.generator(Map, String, String)", e);
            }
        }
    }

    public final static String getSOAPRequest(Map model, String filePath, String templatePath) {
        BufferedWriter writer = null;
        BufferedReader reader = null;
        try {
            Velocity.init();
            // 初始化上下文
            VelocityContext ctx = new VelocityContext();
            if (null != model && !model.isEmpty()) {
                Iterator<Map> iter = model.keySet().iterator();
                Object key = null;
                while (iter.hasNext()) {
                    key = iter.next();
                    if (null == key || !(key instanceof String)) {
                        continue;
                    }
                    ctx.put(key.toString(), model.get(key));
                }
            }
            // 加载模板
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(
                    templatePath))));
            // 生成的文件
            File file = new File(filePath);
            writer = new BufferedWriter(new FileWriter(filePath));

            Velocity.evaluate(ctx, writer, "GC", reader);
        } catch (Exception e) {
            logger.error("VelocityUtils.generator(Map, String, String)", e);
        } finally {
            try {
                if (null != reader) {
                    reader.close();
                }
                if (null != writer) {
                    writer.close();
                }
            } catch (IOException e) {
                logger.error("VelocityUtils.generator(Map, String, String)", e);
            }
        }
        
        InputStream in = null;
        File targetFile = new File(filePath);
        try {
            in = new FileInputStream(targetFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();  
        }finally{//删除文件
            if (targetFile.isFile() && targetFile.exists()) {  
                targetFile.delete();  
            }  
        }
        String a = stream2String(in, "UTF-8"); 
        return a.toString();
    }
    public static String stream2String(InputStream in, String charset) {
        StringBuffer sb = new StringBuffer();
        try {
            Reader r = new InputStreamReader(in, charset);
            int length = 0;
            for (char[] c = new char[1024]; (length = r.read(c)) != -1;) {
                sb.append(c, 0, length);
            }
            r.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
