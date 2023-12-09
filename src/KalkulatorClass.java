import java.util.Scanner;

public class KalkulatorClass {

    public void kalkulator() {

        //Variabel yang digunakan
        int angkaPertama;
        int angkaKedua;
        Scanner inputUser = new Scanner(System.in);
        System.out.println(" Kalkulator");

        System.out.println(" Masukkan Angka");
        System.out.print("\n Angka pertama: ");
        angkaPertama = inputUser.nextInt();
        System.out.print(" Angka kedua: ");
        angkaKedua = inputUser.nextInt();

        // Function untuk menentukan operasi hitung
        System.out.println("\n Pilih salah satu karakter operasi hitung (+,-,*,/) : ");
        String operasi = inputUser.next();

        //Function Switch case
        switch (operasi) {
            case "+":
                System.out.println(" Hasil: "+ ( angkaPertama + angkaKedua ));
                break;
            case "-":
                System.out.println(" Hasil: "+ ( angkaPertama - angkaKedua ));
                break;
            case "*":
                System.out.println(" Hasil: "+ ( angkaPertama * angkaKedua ));
                break;
            case "/":
                System.out.println(" Hasil: "+ ( angkaPertama / angkaKedua ));
                break;
            default: System.out.println(" Harap pilih karakter");
        }
    }
}