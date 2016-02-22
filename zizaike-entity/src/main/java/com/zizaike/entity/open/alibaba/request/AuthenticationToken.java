/**  
 * Project Name:open-api  <br/>
 * File Name:AuthenticationToken.java  <br/>
 * Package Name:com.zizaike.open.entity  <br/>
 * Date:2016年1月13日下午4:27:39  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.alibaba.request;  

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**  
 * ClassName:AuthenticationToken <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年1月13日 下午4:27:39 <br/>  
 * @author   zeuskingzb  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
@XStreamAlias("AuthenticationToken")
public class AuthenticationToken {
    @XStreamAlias("Username")
    private String username;
    @XStreamAlias("Password")
    private String password;
    @XStreamAlias("CreateToken")
    private String createToken;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCreateToken() {
        return createToken;
    }
    public void setCreateToken(String createToken) {
        this.createToken = createToken;
    }
    public AuthenticationToken() {
      super();
    }
    public AuthenticationToken(String username, String password, String createToken) {
        super();
        this.username = username;
        this.password = password;
        this.createToken = createToken;
    }
    
    @Override
    public String toString() {
        return "AuthenticationToken [username=" + username + ", password=" + password + ", createToken=" + createToken
                + "]";
    }
    public static void main(String[] args) {
        String xml = "<?xml version='1.0' encoding='utf-8'?>"
                    +"<AuthenticationToken>"
                    +"<Username>taobao</Username>"
                    +"<Password>B75!jaJb[eO8</Password>"
                    +"<CreateToken>22251178182015010620150107497867981843210904377</CreateToken>"
                    +"</AuthenticationToken>";
        
        XStream stream = new XStream();
        stream.processAnnotations(AuthenticationToken.class);  
        AuthenticationToken msg = new AuthenticationToken("1","2","3");  
        System.out.println(stream.toXML(msg));
        AuthenticationToken authenticationToken = (AuthenticationToken) stream.fromXML(xml);
        System.out.println(authenticationToken);
    }
    
}
  
