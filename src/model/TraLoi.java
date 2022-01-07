/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author HOANG LONG
 */
public class TraLoi implements Serializable {
    private int id;
    private String traloi;
    private ArrayList<ThongMinh> thongminh;
    private ArrayList<TinhCach> tinhcach;

    public TraLoi() {
    }

    public TraLoi(int id, String traloi, ArrayList<ThongMinh> thongminh, ArrayList<TinhCach> tinhcach) {
        this.id = id;
        this.traloi = traloi;
        this.thongminh = thongminh;
        this.tinhcach = tinhcach;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTraloi() {
        return traloi;
    }

    public void setTraloi(String traloi) {
        this.traloi = traloi;
    }

    public ArrayList<ThongMinh> getThongminh() {
        return thongminh;
    }

    public void setThongminh(ArrayList<ThongMinh> thongminh) {
        this.thongminh = thongminh;
    }

    public ArrayList<TinhCach> getTinhcach() {
        return tinhcach;
    }

    public void setTinhcach(ArrayList<TinhCach> tinhcach) {
        this.tinhcach = tinhcach;
    }
    
    
}
