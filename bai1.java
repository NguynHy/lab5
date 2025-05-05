package LABTUAN5;
import java.util.ArrayList;
public class Mainbai1 {
    public static void main(String[] args) {
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

        QuanLy quanLy = new QuanLy("QL001", "Pham Huy Hoang", "Dai hoc", "CNTT", 2000000);
        quanLy.setLuongCoBan(5000000);
        quanLy.xuat();
        System.out.println("Luong: " + quanLy.tinhLuong());

        NghienCuu nghienCuu = new NghienCuu("NC001", "Khanh Luong", "Dai Hoc", "Hoa hoc", 1500000);
        nghienCuu.setLuongCoBan(6000000);
        nghienCuu.xuat();
        System.out.println("Luong: " + nghienCuu.tinhLuong());
        
        PhucVu phucVu = new PhucVu("PV001", "Tien Hoang", "Trung cap");
        phucVu.setLuongCoBan(4000000);
        phucVu.xuat();
        System.out.println("Luong: " + phucVu.tinhLuong());

        danhSachNhanVien.add(quanLy);
        danhSachNhanVien.add(nghienCuu);
        danhSachNhanVien.add(phucVu);

        System.out.println("\nDanh sach nhan vien:");
        for (NhanVien nv : danhSachNhanVien) {
            nv.xuat();
            System.out.println("Luong: " + nv.tinhLuong());
        }
    }
}
