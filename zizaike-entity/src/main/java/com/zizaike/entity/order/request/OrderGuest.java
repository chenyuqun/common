package com.zizaike.entity.order.request;
    public class OrderGuest {
        /*
         * 姓名
         */
        private String name;
        /*
         * 房间序号
         */
        private Integer roomPos;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getRoomPos() {
            return roomPos;
        }

        public void setRoomPos(Integer roomPos) {
            this.roomPos = roomPos;
        }

        public OrderGuest() {
        }

        public OrderGuest(String name, Integer roomPos) {
            super();
            this.name = name;
            this.roomPos = roomPos;
        }

        @Override
        public String toString() {
            return "OrderGuest [name=" + name + ", roomPos=" + roomPos + "]";
        }

    }
