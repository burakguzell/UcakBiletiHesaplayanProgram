import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mesafe, yas, yolculukTipi;

        double normalTutar, indirimOrani = 1, gidisDonusIndirimi, yasIndirimi, indirimliTutar, toplamTutar = 0;

        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş : ");
        yolculukTipi = input.nextInt();

        normalTutar = (mesafe * 0.10);

        if (mesafe > 0) {
            if (yas > 0) {
                if (yolculukTipi == 1) {
                    if (yas < 12) {

                        indirimOrani = 0.50;
                        yasIndirimi = (normalTutar * indirimOrani);
                        indirimliTutar = (normalTutar - yasIndirimi);
                        toplamTutar = indirimliTutar;
                    } else if ((yas >= 12) && (yas <= 24)) {

                        indirimOrani = 0.10;
                        yasIndirimi = (normalTutar * indirimOrani);
                        indirimliTutar = (normalTutar - yasIndirimi);
                        toplamTutar = indirimliTutar;
                    } else if ((yas > 24) && (yas < 65)) {

                        yasIndirimi = 0;
                        indirimliTutar = (normalTutar - yasIndirimi);
                        toplamTutar = indirimliTutar;
                    } else {
                        indirimOrani = 0.30;
                        yasIndirimi = (normalTutar * indirimOrani);
                        indirimliTutar = (normalTutar - yasIndirimi);
                        toplamTutar = indirimliTutar;
                    }
                } else if (yolculukTipi == 2) {

                    if (yas < 12) {

                        indirimOrani = 0.50;
                        yasIndirimi = (normalTutar * indirimOrani);
                        indirimliTutar = (normalTutar - yasIndirimi);
                        gidisDonusIndirimi = (indirimliTutar * 0.20);
                        toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
                    } else if ((yas >= 12) && (yas <= 24)) {

                        indirimOrani = 0.10;
                        yasIndirimi = (normalTutar * indirimOrani);
                        indirimliTutar = (normalTutar - yasIndirimi);
                        gidisDonusIndirimi = (indirimliTutar * 0.20);
                        toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
                    } else if ((yas > 24) && (yas < 65)) {

                        yasIndirimi = 0;
                        indirimliTutar = (normalTutar - yasIndirimi);
                        gidisDonusIndirimi = (indirimliTutar * 0.20);
                        toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;

                    } else {
                        indirimOrani = 0.30;
                        yasIndirimi = (normalTutar * indirimOrani);
                        indirimliTutar = (normalTutar - yasIndirimi);
                        gidisDonusIndirimi = (indirimliTutar * 0.20);
                        toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
                    }
                } else {
                    isError = true;
                }
            } else{
                isError = true;
            }
        } else {
            isError = true;
        }
        if (isError) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            System.out.println("Toplam Tutar = " + toplamTutar + " TL");
        }
    }
}
