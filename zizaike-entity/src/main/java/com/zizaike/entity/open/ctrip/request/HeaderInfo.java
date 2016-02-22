/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:HeaderInfo.java  <br/>
 * Package Name:com.zizaike.entity.open.ctrip.request  <br/>
 * Date:2016年2月3日下午3:12:40  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.open.ctrip.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * ClassName:HeaderInfo <br/>
 * Function: HeaderInfo. <br/>
 * Date: 2016年2月3日 下午3:12:40 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
@XStreamAlias("HeaderInfo")
public class HeaderInfo  {
    @XStreamAsAttribute
    private String UserID;
    @XStreamAsAttribute
    private String RequestorId;
    @XStreamAsAttribute
    private String AsyncRequest;
    @XStreamAsAttribute
    private String TimeStamp;
    @XStreamAlias("Authentication")
    private Authentication authentication;
    @XStreamAlias("RequestType")
    private RequestType requestType;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getRequestorId() {
        return RequestorId;
    }

    public void setRequestorId(String requestorId) {
        RequestorId = requestorId;
    }

    public String getAsyncRequest() {
        return AsyncRequest;
    }

    public void setAsyncRequest(String asyncRequest) {
        AsyncRequest = asyncRequest;
    }

    public String getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        TimeStamp = timeStamp;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    @Override
    public String toString() {
        return "HeaderInfo [UserID=" + UserID + ", RequestorId=" + RequestorId + ", AsyncRequest=" + AsyncRequest
                + ", TimeStamp=" + TimeStamp + ", authentication=" + authentication + ", requestType=" + requestType
                + "]";
    }
    @XStreamAlias("Authentication")
    public class Authentication {
        @XStreamAsAttribute
        private String UserName;
        @XStreamAsAttribute
        private String Password;
        public String getPassword() {
            return Password;
        }
        public void setPassword(String password) {
            Password = password;
        }
        public String getUserName() {
            return UserName;
        }
        public void setUserName(String userName) {
            UserName = userName;
        }
        
        public Authentication(String userName, String password) {
            super();
            UserName = userName;
            Password = password;
        }
        @Override
        public String toString() {
            return "Authentication [UserName=" + UserName + ", Password=" + Password + "]";
        }
        
        
    }
    /**
     * ClassName:Authentication <br/>
     * Function: 请求类型. <br/>
     * Date: 2016年2月3日 下午3:49:42 <br/>
     * 
     * @author snow.zhang
     * @version
     * @since JDK 1.7
     * @see
     */
    @XStreamAlias("RequestType")
    public class RequestType {
        @XStreamAsAttribute
        private String Name;
        @XStreamAsAttribute
        private String Version;
        public String getName() {
            return Name;
        }
        public void setName(String name) {
            Name = name;
        }
        public String getVersion() {
            return Version;
        }
        public void setVersion(String version) {
            Version = version;
        }
        
        public RequestType(String name, String version) {
            super();
            Name = name;
            Version = version;
        }
        @Override
        public String toString() {
            return "RequestType [Name=" + Name + ", Version=" + Version + "]";
        }
        
        
    }


}
