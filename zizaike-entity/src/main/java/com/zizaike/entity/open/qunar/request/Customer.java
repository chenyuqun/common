/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:Customer.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar.request  <br/>
 * Date:2016年4月7日下午1:45:03  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
/**  
 * Project Name:zizaike-entity <br/> 
 * File Name:Customer.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar.request  <br/>
 * Date:2016年4月7日下午1:45:03  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved. 
 *  
 */  
  
package com.zizaike.entity.open.qunar.request;  

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**  
 * ClassName: Customer <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason: TODO ADD REASON(可选). <br/>  
 * date: 2016年4月7日 下午1:45:03 <br/>  
 *  
 * @author lin  
 * @version   
 * @since JDK 1.7  
 */
@XStreamAlias("customer")
public class Customer {
    /**  
     * Creates a new instance of Customer.  
     *  
     * @param firstname
     * @param lastName
     * @param nationality
     * @param gender  
     */  
    

    @XStreamAsAttribute()
    @XStreamAlias("firstName")
    private String firstname;
    
    @XStreamAsAttribute()
    @XStreamAlias("lastName")
    private String lastName;
    
    @XStreamAsAttribute()
    @XStreamAlias("nationality")
    private String nationality;
    
    @XStreamAsAttribute()
    @XStreamAlias("gender")
    private String gender;
    
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Customer(String firstname, String lastName, String nationality, String gender) {
        super();
        this.firstname = firstname;
        this.lastName = lastName;
        this.nationality = nationality;
        this.gender = gender;
    }
    
    
}
  
