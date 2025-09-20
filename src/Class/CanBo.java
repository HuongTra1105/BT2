package Class;
import java.util.Scanner;

public class CanBo {
    private String hoTen123;
    private String ngaySinh123;
    private String gioiTinh123;
    private String diaChi123;

    public CanBo() {
    }
    public CanBo(String hoTen123, String ngaySinh123, String gioiTinh123, String diaChi123) {
        this.hoTen123 = hoTen123;
        this.ngaySinh123 = ngaySinh123;
        this.gioiTinh123 = gioiTinh123;
        this.diaChi123 = diaChi123;
    }
    public void nhapThongTin(Scanner sc) {   
        System.out.print("\tNhap ho ten: ");
        hoTen123 = sc.nextLine();
        System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
        ngaySinh123 = sc.nextLine();
        System.out.print("\tNhap gioi tinh: ");
        gioiTinh123 = sc.nextLine();
        System.out.print("\tNhap dia chi: ");
        diaChi123 = sc.nextLine();
    }
    public void hienThiThongTin() {  
        System.out.println("\tHo ten: " + hoTen123);
        System.out.println("\tNgay sinh: " + ngaySinh123);
        System.out.println("\tGioi tinh: " + gioiTinh123);
        System.out.println("\tDia chi: " + diaChi123);
    }
    public String getHoTen123() {
        return this.hoTen123;
    }
}
