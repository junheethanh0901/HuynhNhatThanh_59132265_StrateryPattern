/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Admin
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GioHang gh1 = new GioHang();
        HangHoa hh = new HangHoa();
        hh.setTenHH("Socola");
        hh.setGia(30000);
        hh.setMoTa("Banh");
        HangHoa hh2 = new HangHoa();
        hh2.setTenHH("Keo");
        hh2.setGia(30000);
        hh2.setMoTa("Keo ngot");
        gh1.hh.add(hh);
        gh1.hh.add(hh2);
        System.out.println("Gio hang1 :");
        int tien = 0;
        for(int i = 0; i < gh1.hh.size(); i++)
        {
            System.out.println("Mat hang "+i+":[ "+gh1.hh.get(i).toString()+"]");
        }
        for(int i = 0; i < gh1.hh.size(); i++)
        {
            tien = tien + gh1.hh.get(i).getGia();
        }
        gh1.hinhthucTT(new ThanhToanOL());
        System.out.println("So tien phai tra: "+ gh1.thanhToan(tien));
        GioHang gh2 = new GioHang();
        HangHoa hh4 = new HangHoa();
        hh4.setTenHH("Revive");
        hh4.setGia(4000000);
        hh4.setMoTa("30 thung Revive");
        HangHoa hh5 = new HangHoa();
        hh5.setTenHH("Sting");
        hh5.setGia(1720000);
        hh5.setMoTa("10 thung Sting");
        HangHoa hh6 = new HangHoa();
        hh6.setTenHH("Numberone");
        hh6.setGia(1720000);
        hh6.setMoTa("10 thung Numberone");
        gh2.hh.add(hh4);
        gh2.hh.add(hh5);
        gh2.hh.add(hh6);
        System.out.println("Gio hang 2:");
        int tien2 = 0;
        for(int i = 0; i < gh2.hh.size(); i++)
        {
            System.out.println("Mat hang "+i+":[ "+gh2.hh.get(i).toString()+"]");
        }
        for(int i = 0; i < gh2.hh.size(); i++)
        {
            tien2 = tien2 + gh2.hh.get(i).getGia();
        }
        gh2.hinhthucTT(new ThanhToanCOD());
        System.err.println("So tien phai tra: "+gh2.thanhToan(tien2));
        
        
    }
  }
    
