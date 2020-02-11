package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

            ArrayList<String> kopi = new ArrayList<String>();
            ArrayList<String> Topping = new ArrayList<>();
            ArrayList<String> Asal = new ArrayList<String>();

            Mesinkopi robusta = new Mesinkopi();
            robusta.setJenisKopi("Robusta");
            robusta.setAsal("Eropa");
            kopi.add(robusta.getJenisKopi());
            Asal.add(robusta.getAsal());

            Mesinkopi florest = new Mesinkopi();
            florest.setJenisKopi("Florest");
            florest.setAsal("Asia");
            kopi.add(florest.getJenisKopi());
            Asal.add(florest.getAsal());

            Mesinkopi arabica = new Mesinkopi();
            arabica.setJenisKopi("Arabica");
            arabica.setAsal("Timur Tengah");
            kopi.add(arabica.getJenisKopi());
            Asal.add(arabica.getAsal());

            Toping mz = new Toping();
            mz.setTopping("Cream");
            Topping.add(mz.getTopping());
            mz.setTopping("gula");
           Topping.add(mz.getTopping());

            for (int i = 0; i < kopi.size(); i++) {
                int j = i + 1;
                System.out.println("Menu kopi : " + j + " " + kopi.get(i));
            }

            for (int i = 0; i < Topping.size(); i++) {
                int j = i + 1;
                System.out.println("Menu Toping :" + j + " " + Topping.get(i));
            }
try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Masukan kopi yang mau dipilih ");
            int pilihanKopi = keyboard.nextInt() - 1;
            int pilihantopping = keyboard.nextInt() - 1;

            System.out.println("Pesanan anda adalah kopi " + kopi.get(pilihanKopi) + "dari " + Asal.get(pilihanKopi) + "denngan toping" + Topping.get(pilihantopping));
        } catch (Exception e) {
    System.out.println("Inputan anda salah");
    System.out.println(e+ "/n");

        }
    }
}


