package jawabanNo1;

import java.util.Scanner;

class Perawatan {
public double perawatanMenu() {
Scanner input = new Scanner(System.in);
double totalHarga = 0.0;

System.out.println("\nMenu Perawatan:");
System.out.println("1. Facial wajah");
System.out.println("2. Masker");
System.out.println("3. Potong rambut");
System.out.println("-----------------o0o----------------");
System.out.print("Pilihan Anda : ");
int jenisPerawatan = input.nextInt();
System.out.println("-----------------o0o----------------");

switch (jenisPerawatan) {
case 1:
totalHarga += perawatanFasial();
break;
case 2:
totalHarga += perawatanMasker();
break;
case 3:
totalHarga += potongRambut();
break;
default:
System.out.println("Menu perawatan tidak valid.");
}

return totalHarga;
}

private double perawatanFasial() {
Scanner input = new Scanner(System.in);
double totalHarga = 0.0;

System.out.println("Pilihan Facial Wajah:");
System.out.println("1. Facial Biasa = Rp 50,000");
System.out.println("2. Facial Emas = Rp 100,000");
System.out.println("-----------------o0o----------------");
System.out.print("Masukkan Pilihan Anda : ");
int jenisFasial = input.nextInt();
System.out.println("-----------------o0o----------------");

if (jenisFasial == 1) {
totalHarga += 50000;
} else if (jenisFasial == 2) {
totalHarga += 100000;
} else {
System.out.println("Jenis facial tidak valid.");
}

return totalHarga;
}

private double perawatanMasker() {
Scanner input = new Scanner(System.in);
double totalHarga = 0.0;

System.out.println("Pilihan Masker:");
System.out.println("1. Masker Buah = Rp 40,000");
System.out.println("2. Masker Lumpur = Rp 75,000");
System.out.println("-----------------o0o----------------");
System.out.print("Masukkan Pilihan Anda : ");
int jenisMasker = input.nextInt();
System.out.println("-----------------o0o----------------");

if (jenisMasker == 1) {
totalHarga += 40000;
} else if (jenisMasker == 2) {
totalHarga += 75000;
} else {
System.out.println("Jenis masker tidak valid.");
}

return totalHarga;
}

private double potongRambut() {
Scanner input = new Scanner(System.in);
double totalHarga = 0.0;

System.out.println("Pilihan Potong Rambut:");
System.out.println("1. Tidak Keramas = Rp 20,000");
System.out.println("2. Keramas = Rp 35,000");
System.out.println("-----------------o0o----------------");
System.out.print("Masukkan Pilihan Anda : ");
int jenisPotongRambut = input.nextInt();
System.out.println("-----------------o0o----------------");

if (jenisPotongRambut == 1) {
totalHarga += 20000;
} else if (jenisPotongRambut == 2) {
totalHarga += 35000;
} else {
System.out.println("Jenis potong rambut tidak valid.");
}

return totalHarga;
}
}
