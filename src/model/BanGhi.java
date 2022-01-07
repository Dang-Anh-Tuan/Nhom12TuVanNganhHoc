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
public class BanGhi implements Serializable {
    private int id;
    private ArrayList<ThongMinh> thongminh;
    private ArrayList<TinhCach> tinhcach;
    private ThuNhap thunhap;
    private Khoi khoi;
    private Nganh nganh;

    public BanGhi() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ThuNhap getThunhap() {
        return thunhap;
    }

    public void setThunhap(ThuNhap thunhap) {
        this.thunhap = thunhap;
    }

    public Khoi getKhoi() {
        return khoi;
    }

    public void setKhoi(Khoi khoi) {
        this.khoi = khoi;
    }

    public Nganh getNganh() {
        return nganh;
    }

    public void setNganh(Nganh nganh) {
        this.nganh = nganh;
    }
    
    
}
