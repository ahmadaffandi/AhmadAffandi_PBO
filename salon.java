package jawabanNo1;

import java.util.Scanner;

public class salon {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
String nama;
String noTelepon;
System.out.println("---- Selamat Datang di Salon Cantika ----");
System.out.println("=========================================");
System.out.print("Masukkan Nama Pelanggan : ");
nama = input.nextLine();
System.out.print("Masukkan No.Telp Pelanggan : ");
noTelepon = input.nextLine();

Perawatan perawatan = new Perawatan();
Sewa sewa = new Sewa();

double totalHarga = 0.0;

char ulangi;
do {
System.out.println("Menu Pilihan:");
System.out.println("1. Perawatan");
System.out.println("2. Penyewaan");
System.out.println("-----------------o0o----------------");
System.out.print("Pilihan menu : ");
int menu = input.nextInt();
System.out.println("-----------------o0o----------------");
switch (menu) {
case 1:
totalHarga += perawatan.perawatanMenu();
break;
case 2:
totalHarga += sewa.sewaMenu();
break;
case 3:
ulangi = 'n';
break;
default:
System.out.println("Menu tidak valid.");
ulangi = 'y';
}

System.out.print("Input lagi? (y/t): ");
ulangi = input.next().charAt(0);
} while (ulangi == 'y');
System.out.println("------------------------o0o----------------------");
System.out.println("Terima kasih Atas Kunjungannya , " + nama);
System.out.println("Total yang harus dibayar : Rp " + totalHarga);
System.out.println("-------------------------------------------------");
}
}
