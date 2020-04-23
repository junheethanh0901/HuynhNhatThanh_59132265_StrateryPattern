/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;
import java.text.ParseException;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException{
        
        // TODO code application logic here
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        
        ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();
        dsSV.add(new SinhVien("Huỳnh Nhật Thanh", dateFormat.parse("09-01-1999"), 10));
        dsSV.add(new SinhVien("Nguyễn Thái Tuấn", dateFormat.parse("09-10-1999"), 9));
        dsSV.add(new SinhVien("Trần Tuyết Trinh", dateFormat.parse("26-10-1999"), 8));
        
        QLSV qlsv = new QLSV();
        qlsv.setDsSV(dsSV);
        
        System.out.println(" Chưa sắp xếp ");
        qlsv.inDS();;
        
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        System.out.println("So Sánh theo Điểm ");
        qlsv.inDS();
        
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        System.out.println(" So Sánh theo Tên ");
        qlsv.inDS();
    }
    
    
}
