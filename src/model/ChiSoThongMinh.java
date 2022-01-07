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
public class ChiSoThongMinh implements Serializable {
    private int id;
    private ThongMinh thongminh;
    private int chiso;

    public ChiSoThongMinh() {
    }

    public ChiSoThongMinh(int id, ThongMinh thongminh, int chiso) {
        this.id = id;
        this.thongminh = thongminh;
        this.chiso = chiso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ThongMinh getThongminh() {
        return thongminh;
    }

    public void setThongminh(ThongMinh thongminh) {
        this.thongminh = thongminh;
    }

    public int getChiso() {
        return chiso;
    }

    public void setChiso(int chiso) {
        this.chiso = chiso;
    }
    
    
}
