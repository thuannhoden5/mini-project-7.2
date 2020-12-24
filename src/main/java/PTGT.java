/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguyentienthuan
 */
public class PTGT {
    //Khai bao thuoc tinh
    private String hangSanXuat;
    private int namSanXuat;
    private double giaBan;
    private String mau;
    //Tao ham khoi tao
    public PTGT(){
        
    }
    public PTGT(String hangSanXuat, int namSanXuat, String mau,double giaBan){
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
        this.mau = mau;
    }
    // Tao cac ham getter setter
    public void setHangSanXuat(String hangSanXuat){
        this.hangSanXuat = hangSanXuat;
    }
    public String getHangSanXuat(){
        return hangSanXuat;
    }
    public void setNamSanXuat(int namSanXuat){
        this.namSanXuat = namSanXuat;
    }
    public int getNamSanXuat(){
        return namSanXuat;
    }
    public void setGiaBan(double giaBan){
        this.giaBan = giaBan;
    }
    public double getGiaBan(){
        return giaBan;
    }
    public void setMau(String mau){
        this.mau = mau;
    }
    public String getMau(){
        return mau;
    }
}
