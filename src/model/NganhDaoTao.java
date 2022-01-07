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
public class NganhDaoTao implements Serializable {
    private int id;
    private Nganh nganh;
    private String ten;
    private int diemchuan;

    public NganhDaoTao() {
    }

    public NganhDaoTao(int id, Nganh nganh, String ten, int diemchuan) {
        this.id = id;
        this.nganh = nganh;
        this.ten = ten;
        this.diemchuan = diemchuan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Nganh getNganh() {
        return nganh;
    }

    public void setNganh(Nganh nganh) {
        this.nganh = nganh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getDiemchuan() {
        return diemchuan;
    }

    public void setDiemchuan(int diemchuan) {
        this.diemchuan = diemchuan;
    }
    
    
}
