package com.zizaike.entity.open.alibaba;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
 public class RateInventoryPrice implements Serializable{
        /**  
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
     * @since JDK 1.7
     */
    private static final long serialVersionUID = 2617066559154587367L;
        @JSONField(name = "out_rid")
        private String outRid;
        @JSONField(name = "rateplan_code")
        private String rateplanCode;
        private String vendor;
        private Data data;

        public String getOutRid() {
            return outRid;
        }

        public void setOutRid(String outRid) {
            this.outRid = outRid;
        }

        public String getRateplanCode() {
            return rateplanCode;
        }

        public void setRateplanCode(String rateplanCode) {
            this.rateplanCode = rateplanCode;
        }

        public String getVendor() {
            return vendor;
        }

        public void setVendor(String vendor) {
            this.vendor = vendor;
        }

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

        public RateInventoryPrice() {
        }
    }
