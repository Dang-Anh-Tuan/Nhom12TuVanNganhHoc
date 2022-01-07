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
public class NguoiDung implements Serializable {
    private int id;
    private String ten;
    private ArrayList<TinhCach> tinhcach;
    private ArrayList<ThongMinh> thongminh;
    private DiemThi diem;
    private ThuNhap thunhap;
    private ArrayList<TraLoi> traloi;
    private ArrayList<NganhDaoTao> nganhphuhop;

    public NguoiDung() {
    }

    public NguoiDung(int id, String ten, ArrayList<TinhCach> tinhcach, ArrayList<ThongMinh> thongminh, DiemThi diem, ThuNhap thunhap, ArrayList<TraLoi> traloi, ArrayList<NganhDaoTao> nganhphuhop) {
        this.id = id;
        this.ten = ten;
        this.tinhcach = tinhcach;
        this.thongminh = thongminh;
        this.diem = diem;
        this.thunhap = thunhap;
        this.traloi = traloi;
        this.nganhphuhop = nganhphuhop;
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

    public ArrayList<TinhCach> getTinhcach() {
        return tinhcach;
    }

    public void setTinhcach(ArrayList<TinhCach> tinhcach) {
        this.tinhcach = tinhcach;
    }

    public ArrayList<ThongMinh> getThongminh() {
        return thongminh;
    }

    public void setThongminh(ArrayList<ThongMinh> thongminh) {
        this.thongminh = thongminh;
    }

    public DiemThi getDiem() {
        return diem;
    }

    public void setDiem(DiemThi diem) {
        this.diem = diem;
    }

    public ThuNhap getThunhap() {
        return thunhap;
    }

    public void setThunhap(ThuNhap thunhap) {
        this.thunhap = thunhap;
    }

    public ArrayList<TraLoi> getTraloi() {
        return traloi;
    }

    public void setTraloi(ArrayList<TraLoi> traloi) {
        this.traloi = traloi;
    }

    public ArrayList<NganhDaoTao> getNganhphuhop() {
        return nganhphuhop;
    }

    public void setNganhphuhop(ArrayList<NganhDaoTao> nganhphuhop) {
        this.nganhphuhop = nganhphuhop;
    }
    
    
}
