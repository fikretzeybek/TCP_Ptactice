package practice02;

import java.util.Scanner;

public class binlerYazdirma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Dört basamakli bir sayi giriniz:\n");
        int sayi = scan.nextInt();

        int binler = sayi/ 1000 ;
        int yuzler = (sayi / 100)% 10;
        int onlar = (sayi / 10) % 10 ;
        int birler = sayi % 10 ;

        if(sayi>999 && sayi<10000){

            switch (binler) {
                case 1 :
                    System.out.println("bin"); break;
                case 2 :
                    System.out.println("ikibin"); break;
                case 3 :
                    System.out.println("üçbin"); break;
                case 4 :
                    System.out.println("dörtbin"); break;
                case 5 :
                    System.out.println("beşbin");break;
                case 6 :
                    System.out.println("altıbin");break;
                case 7 :
                    System.out.println("yedibin");break;
                case 8 :
                    System.out.println("sekizbin"); break;
                case 9:
                    System.out.println("dokuzbin");break;
            }
            switch (yuzler) {
                case 1 :
                    System.out.println("yüz"); break;
                case 2 :
                    System.out.println("ikiyüz"); break;
                case 3 :
                    System.out.println("üçyüz"); break;
                case 4 :
                    System.out.println("dörtyüz"); break;
                case 5 :
                    System.out.println("beşyüz");break;
                case 6 :
                    System.out.println("altıyüz");break;
                case 7 :
                    System.out.println("yediyüz");break;
                case 8 :
                    System.out.println("sekizyüz"); break;
                case 9:
                    System.out.println("dokuzyüz");break;
            }
            switch (onlar) {
                case 1 :
                    System.out.println("on"); break;
                case 2 :
                    System.out.println("yirmi"); break;
                case 3 :
                    System.out.println("otuz"); break;
                case 4 :
                    System.out.println("kırk"); break;
                case 5 :
                    System.out.println("elli"); break;
                case 6 :
                    System.out.println("altmış"); break;
                case 7 :
                    System.out.println("yetmiş"); break;
                case 8 :
                    System.out.println("seksen"); break;
                case 9 :
                    System.out.println("doksan5"); break;
            }
            switch (birler){
                case 1 :
                    System.out.println("bir"); break;
                case 2 :
                    System.out.println("iki"); break;
                case 3 :
                    System.out.println("üç"); break;
                case 4 :
                    System.out.println("dört"); break;
                case 5 :
                    System.out.println("beş"); break;
                case 6 :
                    System.out.println("altı"); break;
                case 7 :
                    System.out.println("yedi"); break;
                case 8 :
                    System.out.println("sekiz"); break;
                case 9 :
                    System.out.println("dokuz"); break;
                }

            }else {
            System.out.println("Geçersiz sayi girişi, tekrar giriniz!");
        }
    }

}
