package Class;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private String bac123;  

    public CongNhan() {

    }

    public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String bac123) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.bac123 = bac123;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap bac: ");
        bac123 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tBac: " + bac123);
    }
}
