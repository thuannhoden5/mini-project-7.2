/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguyentienthuan
 */
public class XeMay extends PTGT{
     private int congSuat;

    public XeMay() {
    }

    public XeMay(int congSuat, String hangSanXuat, int namSanXuat, String mau, double giaBan) {
        super(hangSanXuat, namSanXuat, mau, giaBan);
        this.congSuat = congSuat;
    }   

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
}
