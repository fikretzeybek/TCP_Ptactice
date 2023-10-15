package practice02;

import java.util.Scanner;

public class yuzlerYazdirma {
    public static void main(String[] args) {
         /*
    Kullanıcıdan uc basamaklı pozitif bir sayı sisteme girmesini isteyiniz
    Bu sayıyı okunuşuna çeviren bir kod yazınız.
    or: girilen sayı = 425
    konsolda;
    dort yuz
    yirmi
    bes
    */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen uc basamaklı bir sayi giriniz: ");
        int sayi = scan.nextInt();

        if (sayi >= 100 && sayi <= 999) {
            int yuzler = sayi / 100;
            int onlar =  (sayi / 10)% 10;
            int birler = sayi % 10;

            switch (yuzler) {
                case 1:
                    System.out.println("yüz"); break;
                case 2:
                    System.out.println("ikiüz"); break;
                case 3:
                    System.out.println("üçyüz"); break;
                case 4:
                    System.out.println("dörtyüz");break;
                case 5:
                    System.out.println("beşyüz");break;
                case 6:
                    System.out.println("altıyüz");break;
                case 7:
                    System.out.println("yediyüz");break;
                case 8:
                    System.out.println("sekizyüz");break;
                case 9:
                    System.out.println("dokuzyüz");break;
            }
            switch (onlar) {
                case 1:
                    System.out.println("on");break;
                case 2:
                    System.out.println("yirmi");break;
                case 3:
                    System.out.println("otuz");break;
                case 4:
                    System.out.println("kırk");break;
                case 5:
                    System.out.println("elli");break;
                case 6:
                    System.out.println("altmıs");break;
                case 7:
                    System.out.println("yetmis");break;
                case 8:
                    System.out.println("seksen");break;
                case 9:
                    System.out.println("doksan");break;
            }
            switch (birler) {
                case 1:
                    System.out.println("bir");break;

                case 2:
                    System.out.println("iki");break;
                case 3:
                    System.out.println("üç");break;
                case 4:
                    System.out.println("dört");break;
                case 5:
                    System.out.println("beş");break;
                case 6:
                    System.out.println("altı");break;
                case 7:
                    System.out.println("yedi");break;
                case 8:
                    System.out.println("sekiz");break;
                case 9:
                    System.out.println("dokuz");break;
            }
            } else {
                    System.out.print(" geçersiz sayı, tekrar giriniz:");

        }









    }


    }





