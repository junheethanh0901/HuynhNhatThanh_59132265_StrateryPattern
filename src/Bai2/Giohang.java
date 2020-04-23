/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class GioHang {
    IThanhToan thanhToan;
    ArrayList<HangHoa> hh = new ArrayList<HangHoa>();
    public GioHang() {
    }
    

    public void hinhthucTT(IThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }
    public double thanhToan(int tienHang)
    {
        return thanhToan.thanhToan(tienHang);
    }
}
