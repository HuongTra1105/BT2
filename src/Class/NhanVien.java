package Class;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String congViec123;  

    public NhanVien() {

    }

    public NhanVien(String hoTen123, String ngaySinh123, String gioiTinh123, String diaChi123, String congViec123) {
        super(hoTen123, ngaySinh123, gioiTinh123, diaChi123);
        this.congViec123 = congViec123;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap cong viec: ");
        congViec123 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tCong viec: " + congViec123);
    }
}
