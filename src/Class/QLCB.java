package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> dscb123;   

    public QLCB() {
        dscb123 = new ArrayList<CanBo>(10);
    }

    public void themCanBo(CanBo cb123) {
        dscb123.add(cb123);
    }

    public void nhapDanhSach(Scanner sc) {
        CanBo cb123;
        System.out.print("Nhap vao so luong can bo: ");
        int n123 = sc.nextInt();   
        sc.nextLine();

        System.out.println("Nhap thong tin chi tiet:");
        for (int i123 = 0; i123 < n123; i123++) {
            System.out.println("Lan nhap thu " + (i123 + 1) + ":");
            System.out.print("Chon can bo (1-KySu; 2-NhanVien;3-CongNhan): ");
            int chon123 = sc.nextInt();
            sc.nextLine();

            cb123 = new CanBo();

            switch (chon123) {
                case 1:
                    cb123 = new KySu();
                    break;
                case 2:
                    cb123 = new NhanVien();
                    break;
                case 3:
                    cb123 = new CongNhan();
                    break;
                default:
                    cb123 = new KySu();
                    break;
            }

            cb123.nhapThongTin(sc);
            themCanBo(cb123);
        }
    }

    public void timKiemCanBo(String hoTen123) {
        for (CanBo cb123 : dscb123) {
            if (hoTen123.equals(cb123.getHoTen123())) {
                cb123.hienThiThongTin();
            }
        }
    }
}
