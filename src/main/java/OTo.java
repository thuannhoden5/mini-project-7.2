/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguyentienthuan
 */
public class OTo extends PTGT{
    private String kieuDongCo;
    private int soChoNgoi;

    public OTo() {
    }

    
    public OTo(String kieuDongCo, int soChoNgoi, String hangSanXuat, int namSanXuat, String mau, double giaBan) {
       super(hangSanXuat, namSanXuat,mau,giaBan);
       this.kieuDongCo = kieuDongCo;
       this.soChoNgoi = soChoNgoi;
       
    }
    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }
}
