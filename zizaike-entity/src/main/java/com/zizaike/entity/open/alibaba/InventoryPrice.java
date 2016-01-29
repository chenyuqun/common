package com.zizaike.entity.open.alibaba;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class InventoryPrice implements Serializable{
        /**  
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
     * @since JDK 1.7
     */
    private static final long serialVersionUID = 289881836721171077L;
        @JSONField(format = "yyyy-MM-dd")
        private Date date;
        private Integer price;
        private Integer status;
        private Integer quota;

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getQuota() {
            return quota;
        }

        public void setQuota(Integer quota) {
            this.quota = quota;
        }
        

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public InventoryPrice() {

        }

        @Override
        public String toString() {
            return "InventoryPrice [date=" + date + ", price=" + price + ", status=" + status + ", quota=" + quota
                    + "]";
        }
        
    }