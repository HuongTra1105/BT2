package Class;

import java.util.Scanner;

public class CanBo {
	private String hoTen;
	private String ngaySinh;
	private String gioiTinh;
	private String diaChi;
	public CanBo() {
	}
	public CanBo(String hoten, String ngaySinh, String gioiTinh, String diaChi) {
		this.hoTen = hoten;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
		ngaySinh = sc.nextLine();
		System.out.print("\tNhap gioi tinh: ");
		gioiTinh = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi = sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen);
		System.out.println("\tNgay sinh: " + ngaySinh);
		System.out.println("\tGioi tinh: " + gioiTinh);
		System.out.println("\tDia chi: " + diaChi);
	}
	public String getHoTen() {
		return this.hoTen;
	}
}
