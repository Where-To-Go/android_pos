package com.beongaeman.yanghc.wheretogo.VO;

import java.io.Serializable;

/**
 * Created by YangHC on 2017-07-04.
 */

public class Menu implements Serializable{
    private int menuId;
    private String name;
    private String category;
    private int price;

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
