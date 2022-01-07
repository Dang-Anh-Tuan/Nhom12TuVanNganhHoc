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
public class DiemThi implements Serializable{
    private int id;
    private Khoi khoi;
    private int diem;

    public DiemThi() {
    }

    public DiemThi(int id, Khoi khoi, int diem) {
        this.id = id;
        this.khoi = khoi;
        this.diem = diem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Khoi getKhoi() {
        return khoi;
    }

    public void setKhoi(Khoi khoi) {
        this.khoi = khoi;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
    
    
}
