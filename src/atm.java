import java.util.Scanner;

public class atm {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int total = 1500;
        int select;

        while (right > 0) {

            System.out.print("Kullanıcı adı giriniz : ");
            userName = inp.nextLine();

            System.out.print("Şifre giriniz : ");
            password = inp.nextLine();

            if (userName.equals("zeynep") && password.equals("zey123")) {
                System.out.println("Hoşgeldiniz.");

                do {
                    System.out.println(
                            "1) Para yatırma \n" +
                                    "2) Para çekme \n" +
                                    "3) Bakiye sorgulama \n" +
                                    "4) Çıkış yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");

                    select = inp.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            int price = inp.nextInt();
                            total += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            price = inp.nextInt();
                            if (price > total) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                total -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + total);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                        default:
                            System.out.println("Geçersiz işlem.");
                    }

                } while (select != 4);
                break;

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Kalan deneme hakkı: " + right);
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Bankanızla iletişime geçiniz.");
                }
            }
        }
    }
}
