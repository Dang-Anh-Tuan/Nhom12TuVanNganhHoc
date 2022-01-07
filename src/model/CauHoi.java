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
public class CauHoi implements Serializable {
    private int id;
    private String cauhoi;
    private ArrayList<TraLoi> traloi;
    private int trangthai;

    public CauHoi() {
    }

    public CauHoi(int id, String cauhoi, ArrayList<TraLoi> traloi, int trangthai) {
        this.id = id;
        this.cauhoi = cauhoi;
        this.traloi = traloi;
        this.trangthai = trangthai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCauhoi() {
        return cauhoi;
    }

    public void setCauhoi(String cauhoi) {
        this.cauhoi = cauhoi;
    }

    public ArrayList<TraLoi> getTraloi() {
        return traloi;
    }

    public void setTraloi(ArrayList<TraLoi> traloi) {
        this.traloi = traloi;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }
    
    
}
