package Class;

import java.util.Scanner;

public class NhanVien extends CanBo {
	private String congViec;

	public NhanVien() {

	}

	public NhanVien(String hoten, String ngaySinh, String gioiTinh, String diaChi, String congViec) {
		super(hoten, ngaySinh, gioiTinh, diaChi);
		this.congViec = congViec;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap cong viec: ");
		congViec = sc.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tCong viec: " + congViec);
	}
}
