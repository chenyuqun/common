package com.zizaike.entity.open.ctrip.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("GuestEntity")
    public class GuestEntity {
        @XStreamAlias("FirstName")
        private String firstName;
        @XStreamAlias("LastName")
        private String lastName;
        @XStreamAlias("ChinesName")
        private String chinesName;
        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public String getChinesName() {
            return chinesName;
        }
        public void setChinesName(String chinesName) {
            this.chinesName = chinesName;
        }
        @Override
        public String toString() {
            return "GuestEntity [firstName=" + firstName + ", lastName=" + lastName + ", chinesName=" + chinesName
                    + "]";
        }
        
    }