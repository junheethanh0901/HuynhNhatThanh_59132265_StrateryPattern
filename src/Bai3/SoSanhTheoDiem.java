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
public class SoSanhTheoDiem implements ISoSanh<SinhVien>{
    @Override
    public int SoSanh(SinhVien o1, SinhVien o2) {
        double m1 = o1.getDiemTB(); 
        double m2 = o2.getDiemTB();
        
        if( m1 > m2 ) {
            return 1;
        } 
        if( m1 == m2 ) {
            return 0;
        }
        return -1;
    }
    
}
