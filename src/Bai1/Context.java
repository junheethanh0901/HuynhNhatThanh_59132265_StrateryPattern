/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author Admin
 */
public class Context {
    ITinh tinhToan; 
    public Context() {
    }

    public void setTinhToan(ITinh tinhToan) {
        this.tinhToan = tinhToan;
    }
    
    public float Tinh1(float a,float b){
        return 36+63; 
    }
    public float Tinh2(float a,float b){
        return 63-36;
    }    
    public float Tinh3(float a,float b){
        return 44*22;
    }   
    public float Tinh4(float a,float b){
        return 44/22;
    }   
    
}
