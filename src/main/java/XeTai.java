/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguyentienthuan
 */
public class XeTai extends PTGT{
    private double trongTai;

    public XeTai() {
    }

    public XeTai(double trongTai, String hangSanXuat, int namSanXuat, String mau, double giaBan) {
        super(hangSanXuat, namSanXuat, mau, giaBan);
        this.trongTai = trongTai;
    }
   
    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }
}
