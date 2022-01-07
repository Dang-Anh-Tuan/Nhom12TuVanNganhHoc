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
public class ChiSoTinhCach implements Serializable {
    private int id;
    private TinhCach tinhcach;
    private int chiso;

    public ChiSoTinhCach() {
    }

    public ChiSoTinhCach(int id, TinhCach tinhcach, int chiso) {
        this.id = id;
        this.tinhcach = tinhcach;
        this.chiso = chiso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TinhCach getTinhcach() {
        return tinhcach;
    }

    public void setTinhcach(TinhCach tinhcach) {
        this.tinhcach = tinhcach;
    }

    public int getChiso() {
        return chiso;
    }

    public void setChiso(int chiso) {
        this.chiso = chiso;
    }
    
    
}
