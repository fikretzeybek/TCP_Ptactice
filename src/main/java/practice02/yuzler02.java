package practice02;

import java.util.Scanner;

public class yuzler02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üç basamaklı bir sayı giriniz: ");
        int sayi = input.nextInt();

        if (sayi < 100 || sayi > 999) {
            System.out.println("Lütfen üç basamaklı bir sayı giriniz.");
            return;
        }

        String[] birler = {"", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", " dokuz"};
        String[] onlar = { "","on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};
        String[] yuzler = {"", "", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", " dokuz"};

        int yuzlerBasamagi = sayi / 100;
        int onlarBasamagi = (sayi / 10) % 10;
        int birlerBasamagi = sayi % 10;

        System.out.println( yuzler[yuzlerBasamagi]+ "yüz");
        System.out.println( onlar[onlarBasamagi]);
        System.out.println( birler[birlerBasamagi]);




    }








}
