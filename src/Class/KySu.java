package Class;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao123;  

    public KySu() {

    }

    public KySu(String hoTen123, String ngaySinh123, String gioiTinh123, String diaChi123, String nganhDaoTao123) {
        super(hoTen123, ngaySinh123, gioiTinh123, diaChi123);
        this.nganhDaoTao123 = nganhDaoTao123;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap nganh dao tao: ");
        nganhDaoTao123 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tNganh dao tao: " + nganhDaoTao123);
    }
}
