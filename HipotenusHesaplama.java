package Giris;

import java.util.Scanner;

public class HipotenuzHesaplama {
    public static void main(String[] args) {

        // Scanner sınıfını tanımlıyorux.
        Scanner giris = new Scanner(System.in) ;

        // Değişkenleri tanımlıyoruz.
        double aKenari , bKenari , cKenari , aKare, bKare, cKare , sonuc ;

        // A ve B kenar uzunluklarını kullanıcıdan alıyoruz.
        System.out.print(" A kerarının uzunluğunu giriniz : ");
        aKenari = giris.nextDouble();
        System.out.print(" B kerarının uzunluğunu giriniz : ");
        bKenari = giris.nextDouble();

        // Hesaplamaları yapıyoruz.
        aKare = aKenari * aKenari;
        bKare = bKenari * bKenari;
        cKare = aKare + bKare ;
        cKenari = Math.sqrt(cKare); // ckare nin karekökü c kenarını verir.
        System.out.println(" A kenar Uzunluğu : " + aKenari);
        System.out.println(" A kenar Uzunluğunun Karesi  : " + aKare);
        System.out.println(" B kenar Uzunluğu : " + bKenari);
        System.out.println(" B kenar Uzunluğunun Karesi : " + bKare);
        System.out.println(" C kenar Uzunluğunun Karesi : " + cKare);
        System.out.println(" C kenar Uzunluğu ( Hipotenus ) : " + cKenari);

    }
}
