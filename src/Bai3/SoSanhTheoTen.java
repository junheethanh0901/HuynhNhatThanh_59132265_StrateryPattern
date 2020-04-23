/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Admin
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien>{
    @Override
    public int SoSanh(SinhVien o1, SinhVien o2) {
        // Lấy tên từ HoTen
        String[] s1 = o1.getHoTen().split(" ");
        String[] s2 = o2.getHoTen().split(" ");
        String n1 = s1[s1.length - 1];
        String n2 = s2[s2.length - 1];
        
        if( n1.compareTo(n2) > 0 ) {
            return 1;
        }
        if( n1.compareTo(n2) == 0 ) {
            return 0;
        }
        return -1;
    }
    
}
