package nmduyy;

import java.util.Scanner;

public class demoo {
    public static void main(String[] args) {

        System.out.println("Chương trình quản lí công nhân sơ khai: ");
        System.out.println("Mời nhập thông tin của công nhân: ");
        Scanner ss = new Scanner(System.in);

        System.out.println("Tên Công ti & Nhà máy : " );
        String Inamecty = ss.nextLine();
        System.out.println("Thành tích Công ti & Nhà máy : " );
        String Ithanhtich = ss.nextLine();
        System.out.println("--------------Về Công nhân--------------");
        System.out.println("Mã Công nhân : " );
        int IidCn  = ss.nextInt();
        System.out.println("Tên Công nhân : " );
        String ItenCn = ss.nextLine();
        ss.nextLine(); // Tiêu diệt ký tự xuống dòng
        System.out.println("Tuổi Công nhân : " );
        int ItuoiCn = ss.nextInt();
        System.out.println("Quê quán Công nhân : " );
        String IqueCn = ss.nextLine();
        ss.nextLine(); // Tiêu diệt ký tự xuống dòng
        System.out.println("Ngày việc đã làm của Công nhân : " );
        int Ingaylam = ss.nextInt();


        class3 s1 = new class3("Inamecty", Ithanhtich,ItenCn, ItuoiCn, IidCn, IqueCn, Ingaylam );
        System.out.println(s1.getThanhtich());
        s1.TTcn();
        s1.bm1();
        s1.bm2();
        s1.tinhluong();
    }
}
