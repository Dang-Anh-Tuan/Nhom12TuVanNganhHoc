/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author HOANG LONG
 */
public class Nganh implements Serializable {
    private int id;
    private String ten;
    private XuHuong xuhuong;

    public Nganh() {
    }

    public Nganh(int id, String ten, XuHuong xuhuong) {
        this.id = id;
        this.ten = ten;
        this.xuhuong = xuhuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public XuHuong getXuhuong() {
        return xuhuong;
    }

    public void setXuhuong(XuHuong xuhuong) {
        this.xuhuong = xuhuong;
    }
    
    
}
