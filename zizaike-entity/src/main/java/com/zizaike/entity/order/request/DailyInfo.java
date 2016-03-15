package com.zizaike.entity.order.request;

import java.util.Date;
/**
 * 
 * ClassName: DailyInfo <br/>  
 * Reason: 每日价格. <br/>  
 * date: 2016年2月27日 下午1:51:01 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
 public class DailyInfo {
        private Date day;
        private Long price;

        public Date getDay() {
            return day;
        }

        public void setDay(Date day) {
            this.day = day;
        }

        public Long getPrice() {
            return price;
        }

        public void setPrice(Long price) {
            this.price = price;
        }

        public DailyInfo() {
        }

        public DailyInfo(Date day, Long price) {
            super();
            this.day = day;
            this.price = price;
        }

        @Override
        public String toString() {
            return "DailyInfo [day=" + day + ", price=" + price + "]";
        }
    }