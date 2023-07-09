import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, sifirlama, newPassword;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adınız:");
        username = input.nextLine();
        System.out.println("Şifreniz:");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java1234")) {
            System.out.println("Giriş yaptınız!");
        } else if (username.equals("patika") && !password.equals("java1234")) {
            System.out.println("Şifrenizi hatalı girdiniz.\nŞifrenizi sıfırlamak ister misiniz?");
            System.out.println("Evet için 'E', Hayır için 'H'");
            sifirlama = input.nextLine();

            switch (sifirlama) {
                case "E":
                    System.out.println("Yeni şifrenizi giriniz.");
                    newPassword = input.nextLine();
                    if (!newPassword.equals(password)) {
                        System.out.println("Şifre oluşturuldu.");
                    } else if (newPassword.equals(password)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Hatalı giriş yaptınız.");
                    }
                    break;
                case "H":
                    System.out.println("Tekrar giriş yapınız.");
            }

        } else {
            System.out.println("Hatalı giriş yaptınız.");
        }
    }
}