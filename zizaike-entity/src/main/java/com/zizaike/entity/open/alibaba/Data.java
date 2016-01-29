package com.zizaike.entity.open.alibaba;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * ClassName: Data <br/>
 * Function: Data. <br/>
 * date: 2016年1月29日 下午3:27:53 <br/>
 * 
 * @author snow.zhang
 * @version Rates
 * @since JDK 1.7
 */
public class Data implements Serializable{
    private static final long serialVersionUID = -7302092879704276026L;
    @JSONField(name = "inventory_price")
    List<InventoryPrice> inventoryPrice;
    @JSONField(name = "use_room_inventory")
    Boolean userRoomInventory;

    public List<InventoryPrice> getInventoryPrice() {
        return inventoryPrice;
    }

    public void setInventoryPrice(List<InventoryPrice> inventoryPrice) {
        this.inventoryPrice = inventoryPrice;
    }

    public Boolean getUserRoomInventory() {
        return userRoomInventory;
    }

    public void setUserRoomInventory(Boolean userRoomInventory) {
        this.userRoomInventory = userRoomInventory;
    }

    public Data() {

    }

    @Override
    public String toString() {
        return "Data [inventoryPrice=" + inventoryPrice + ", userRoomInventory=" + userRoomInventory + "]";
    }
    

}