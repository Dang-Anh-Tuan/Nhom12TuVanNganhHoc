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
public class Truong implements Serializable {
    private int id;
    private String ten;
    private ArrayList<NganhDaoTao> nganhdaotao;

    public Truong() {
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

    public ArrayList<NganhDaoTao> getNganhdaotao() {
        return nganhdaotao;
    }

    public void setNganhdaotao(ArrayList<NganhDaoTao> nganhdaotao) {
        this.nganhdaotao = nganhdaotao;
    }
    
    
}
