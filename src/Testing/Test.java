package Testing;

import java.util.Scanner;
import Class.QLCB;

public class Test {

    public static void main(String[] args) {
        Scanner sc123 = new Scanner(System.in);

        QLCB qlcb123 = new QLCB();

        qlcb123.nhapDanhSach(sc123);

        System.out.print("Nhap vao ho ten can tim kiem: ");
        String name123 = sc123.nextLine();

        qlcb123.timKiemCanBo(name123);

        sc123.close();
    }
}
