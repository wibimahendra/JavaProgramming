package com.gudang;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Sistem Gudang Oke");
        System.out.println("Masukkan nama Anda = ");
        //String input
        String Name = userInput.nextLine();
        System.out.println("Stok Gudang Input Barang");
        System.out.println("########################");
        System.out.println("Selamat datang " + Name);

        //Numerical input
        System.out.println("Masukkan nama barang yang mau ditambah : "); String barang = userInput.nextLine();
        System.out.println("Masukkan jumlah barang yang mau ditambah : "); int jumlah = userInput.nextInt();
        System.out.println("Masukkan harga beli untuk barang tersebut : "); float hargabeli = userInput.nextFloat();
        System.out.println("Masukkan harga jual untuk barang tersebut : "); float hargajual = userInput.nextFloat();

        //Output input by user
        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("########################");
        System.out.println("Nama barang = " + barang);
        System.out.println("Jumlah barang = " + jumlah);
        System.out.println("Harga Beli = " + hargabeli);
        System.out.println("Harga Jual = " + hargajual);

    }
}
