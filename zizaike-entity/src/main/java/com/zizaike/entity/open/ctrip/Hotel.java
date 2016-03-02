package com.zizaike.entity.open.ctrip;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("HotelList")
    public class Hotel implements Serializable{
    private static final long serialVersionUID = -2528228305091600265L;
        /**
         * hotel
         */
        @XStreamAlias("Hotel")
        private String hotel;
        /**
         * 酒店名称
         */
        @XStreamAlias("HotelName")
        private String hotelName;
        /**
         * 城市
         */
        @XStreamAlias("CountryName")
        private String countryName;
        /**
         * 上海
         */
        @XStreamAlias("CityName")
        private String cityName;
        /**
         * 地址
         */
        @XStreamAlias("Address")
        private String address;
        /**
         * 手机号
         */
        @XStreamAlias("Telephone")
        private String telephone;
        public String getHotel() {
            return hotel;
        }
        public void setHotel(String hotel) {
            this.hotel = hotel;
        }
        public String getHotelName() {
            return hotelName;
        }
        public void setHotelName(String hotelName) {
            this.hotelName = hotelName;
        }
        public String getCountryName() {
            return countryName;
        }
        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }
        public String getCityName() {
            return cityName;
        }
        public void setCityName(String cityName) {
            this.cityName = cityName;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public String getTelephone() {
            return telephone;
        }
        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }
        @Override
        public String toString() {
            return "Hotel [hotel=" + hotel + ", hotelName=" + hotelName + ", countryName=" + countryName
                    + ", cityName=" + cityName + ", address=" + address + ", telephone=" + telephone + "]";
        }
        
    }