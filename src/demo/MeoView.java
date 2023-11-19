package demo;
import java.util.Scanner;


public class MeoView {
    private App MeoView;
    private static Scanner sc = new Scanner(System.in);
    public MeoView(){
        MeoView = new App();
        menu();
    }
    public void menu(){
        System.out.println("--------Quan ly meo cho me----------");
        System.out.println("1.Them meo");
        System.out.println("2.Xoa meo theo ID");
        System.out.println("3.Hien thi toan bo meo");
        System.out.println("4.Hien thi meo theo ID");
        System.out.println("5.Thay doi tieng keu theo ID");
        System.out.println("6.Thoat");
        System.out.println("Chon:");
        int chon = Integer.parseInt(sc.nextLine());
        controller(chon);
    }
    public void controller(int chon){
        switch (chon){
            case 1:
                System.out.println(MeoView.themMeo());
                break;
            case 2:
            	System.out.println("nhap id can xoa:");
                int idxoa = Integer.parseInt(sc.nextLine());
                System.out.println(MeoView.xoaMeoTheoID(idxoa));
                break;
            case 3:
                MeoView.hienThi().forEach(x ->x.inThongTin());
                break;
            case 4:
            	System.out.println("nhap id meo can hien thi:");
            	int idtim = Integer.parseInt(sc.nextLine());
                MeoView.hienThiTheoID(idtim).forEach(x -> x.inThongTin());
                break;
            case 5:
            	System.out.println("nhap id meo can thay tieng:");
            	int idtieng = Integer.parseInt(sc.nextLine());
                TiengKeu tiengKeu = null;
                boolean isValid = false;
                while (!isValid) {
                    System.out.print("chon tieng  keu moi (1. meo anh long dai, 2. meo anh long ngan,3.meo ba tu,4.meo nga): ");
                    int loaiMeo = sc.nextInt();
                    sc.nextLine();

                    switch (loaiMeo) {
                        case 1:
                            tiengKeu = new TiengMeoAnhLongDai();
                            isValid = true;
                            break;
                        case 2:
                            tiengKeu = new TiengMeoAnhLongNgan();
                            isValid = true;
                            break;
                        case 3:
                            tiengKeu = new TiengMeoBaTu();
                            isValid = true;
                            break;
                        case 4:
                            tiengKeu = new TiengMeoNga();
                            isValid = true;
                            break;
                        default:
                            System.out.println("khong hop le,nhaplai");
                    }
                    System.out.println(MeoView.thayDoiTiengKeu(idtieng,tiengKeu));
                }
                break;
            case 6:
                System.out.println("Da thoat ung dung");
                System.exit(0);
                break;
            default:
                System.out.println("lua chon khong hop le");
                break;
        }
        menu();
    }
}

