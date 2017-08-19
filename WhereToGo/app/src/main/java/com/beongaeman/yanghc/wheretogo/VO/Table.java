package com.beongaeman.yanghc.wheretogo.VO;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by YangHC on 2017-07-04.
 */

public class Table implements Serializable {
    private int num;
    private int maxPeople;
    private ArrayList<Menu> menuList;

    public Table() {
        maxPeople=10;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public ArrayList<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<Menu> menuList) {
        this.menuList.addAll(menuList);
    }
}
