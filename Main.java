import java.util.Scanner;
// patika.dev linkim --> https://app.patika.dev/ailker
/* Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
 eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile
 aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
 sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
*/
public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int select;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici Adiniz : ");
        userName = input.nextLine();

        System.out.print("Sifre : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Kullanici adi ve sifre dogru.\nGiris yapildi.");
        } else {
            System.out.println("Kullanici adi veya sifre hatali.\nSifrenizi sifirlamak ister misiniz ?");

            System.out.println("1-Sifirla\n2-Sifirlama");
            select = input.nextInt();

            if (select == 1) {
                System.out.println("Yeni sifrenizi giriniz :");
                input.nextLine();
                newPassword = input.nextLine();

                boolean kosul1 = (password.equals("java123") != newPassword.equals("java123"));
                String result = kosul1 ? "Sifre olusturulamadi, lutfen baska sifre giriniz." : "Sifre olusturuldu";
                System.out.print(result);
            }
        }


    }
}