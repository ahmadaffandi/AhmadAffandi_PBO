package jawabanNo1;

import java.util.Scanner;

class Sewa {
public double sewaMenu() {
Scanner input = new Scanner(System.in);
double totalHarga = 0.0;

System.out.println("Menu Penyewaan:");
System.out.println("1. Rias wajah");
System.out.println("2. Baju Pengantin");
System.out.println("3. Aksesoris");
System.out.println("-----------------o0o----------------");
System.out.print("Pilihan Anda : ");
int jenisPenyewaan = input.nextInt();
System.out.println("-----------------o0o----------------");

switch (jenisPenyewaan) {
case 1:
totalHarga += riasWajah();
break;
case 2:
totalHarga += bajuPengantin();
break;
case 3:
totalHarga += aksesoris();
break;
default:
System.out.println("Menu penyewaan tidak valid.");
}

return totalHarga;
}

private double riasWajah() {
Scanner input = new Scanner(System.in);
double totalHarga = 0.0;

System.out.println("Pilihan Rias Wajah:");
System.out.println("1. Rias wajah biasa = Rp 100,000");
System.out.println("2. Rias wajah (Make Up Artis) = Rp 250,000");
System.out.println("-----------------o0o----------------");
System.out.print("Pilihan Anda : ");
int jenisRiasWajah = input.nextInt();
System.out.println("-----------------o0o----------------");

if (jenisRiasWajah == 1) {
totalHarga += 100000;
} else if (jenisRiasWajah == 2) {
totalHarga += 250000;
} else {
System.out.println("Jenis rias wajah tidak valid.");
}

return totalHarga;
}

private double bajuPengantin() {
Scanner input = new Scanner(System.in);
double totalHarga = 0.0;

System.out.println("Pilihan Baju Pengantin:");
System.out.println("1. Baju Pengantin Adat = Rp 150,000");
System.out.println("2. Baju Pengantin Internasional = Rp 350,000");
System.out.println("-----------------o0o----------------");
System.out.print("Pilihan Anda : ");
int jenisBajuPengantin = input.nextInt();
System.out.println("-----------------o0o----------------");

if (jenisBajuPengantin == 1) {
totalHarga += 150000;
} else if (jenisBajuPengantin == 2) {
totalHarga += 350000;
} else {
System.out.println("Jenis baju pengantin tidak valid.");
}

return totalHarga;
}

private double aksesoris() {
Scanner input = new Scanner(System.in);
double totalHarga = 0.0;

System.out.println("Pilihan Aksesoris:");
System.out.println("1. Aksesoris Anak = Rp 20,000");
System.out.println("2. Aksesoris Dewasa = Rp 50,000");
System.out.println("-----------------o0o----------------");
System.out.print("Pilihan Anda : ");
int jenisAksesoris = input.nextInt();
System.out.println("-----------------o0o----------------");

if (jenisAksesoris == 1) {
totalHarga += 20000;
} else if (jenisAksesoris == 2) {
totalHarga += 50000;
} else {
System.out.println("Jenis aksesoris tidak valid.");
}

return totalHarga;
}
}