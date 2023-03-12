import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Konversi Suhu");

        System.out.print("Masukkan suhu dalam satuan Celcius");
        double Celcius = input.nextDouble();

        double Fahrenheit = (Celcius * 9/5) + 32;
        double Kelvin = Celcius + 273.15;

        System.out.println(Celcius + " Celcius sama dengan " + Fahrenheit + " Fahrenheit");
        System.out.println(Celcius + " Celcius sama dengan " + Kelvin + " Kelvin");
        System.out.print("Asik Belajar Programming Bersama Suhunya");
    }
}
