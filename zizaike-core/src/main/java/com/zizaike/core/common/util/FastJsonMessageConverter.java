package com.zizaike.core.common.util;


import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.support.converter.AbstractJsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConversionException;

import com.alibaba.fastjson.JSON;

/**
 * 
 * ClassName: FastJsonMessageConverter <br/>  
 * Function: fastjson消息转换类. <br/>  
 * date: 2015年12月31日 下午4:16:11 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class FastJsonMessageConverter  extends AbstractJsonMessageConverter {

    @Override
    protected Message createMessage(Object object,
            MessageProperties messageProperties) {
        messageProperties.setContentType(MessageProperties.CONTENT_TYPE_JSON);
        messageProperties.setContentEncoding("utf-8");
        return new Message(JSON.toJSONBytes(object), messageProperties);
    }

    @Override
    public Object fromMessage(Message message)
            throws MessageConversionException {
        Object content = message.getBody();
        if(content == null){
            return null;
        }
  

        return content;
    }
}