package jawabanNo3;

import java.util.Scanner;

public class main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("=================================================");
System.out.println("------ SELAMAT DATANG DI RUMAH SAKIT WARAS ------");
System.out.println("=================================================");
System.out.println("Masukkan data pasien");

System.out.print("Masukkan nama \t: ");
String nama = scanner.nextLine();
System.out.print("Masukkan alamat \t: ");
String alamat = scanner.nextLine();
System.out.print("Masukkan no telp \t: ");
String noTelp = scanner.nextLine();

Pasien pasien = new Pasien(nama, alamat, noTelp);

System.out.println("\n*Nama Poli*");
System.out.println("Pilih Poli :");
System.out.println("1. Poli Umum");
System.out.println("2. Poli Anak");
System.out.print("Pilih Poli: ");
int pilihanPoli = scanner.nextInt();
scanner.nextLine();

String namaPoli = (pilihanPoli == 1) ? "Umum" : "Anak";

System.out.println("\n*Nama Dokter*");
System.out.println("1. drg. Ahmad Afandi");
System.out.println("2. dr. Aris Wicaksono, Sp.A.");
System.out.println("3. dr. Alfia Putri");
System.out.print("Pilih Dokter : ");
int pilihanDokter = scanner.nextInt();
scanner.nextLine();

String namaDokter = "";
String keteranganDokter = "";

switch (pilihanDokter) {
case 1:
namaDokter = "drg. Ahmad Afandi";
break;
case 2:
namaDokter = "dr. Aris Wicaksono, Sp.A.";
break;
case 3:
namaDokter = "dr. Alfia Putri";
break;
default:
System.out.println("Pilihan tidak valid.");
break;
}

System.out.println("\n*Berikan Keterangan Dokter*");
System.out.println("1. Tindakan UAP");
System.out.println("2. Rawat Inap");
System.out.println("3. Rawat Jalan");
System.out.println("4. Penanganan Serius");
System.out.print("Pilih : ");
int pilihanKeterangan = scanner.nextInt();
scanner.nextLine();

switch (pilihanKeterangan) {
case 1:
keteranganDokter = "Tindakan UAP";
break;
case 2:
keteranganDokter = "Rawat Inap";
break;
case 3:
keteranganDokter = "Rawat Jalan";
break;
case 4:
keteranganDokter = "Penanganan Serius";
break;
default:
System.out.println("Pilihan tidak valid.");
break;
}

System.out.print("Masukkan Biaya Pendaftaran : Rp. ");
double biayaPendaftaran = scanner.nextDouble();
System.out.print("Masukkan Biaya Obat : Rp. ");
double biayaObat = scanner.nextDouble();
System.out.print("Masukkan Biaya Vitamin : Rp. ");
double biayaVitamin = scanner.nextDouble();
System.out.print("Masukkan Biaya Dokter : Rp. ");
double biayaDokter = scanner.nextDouble();

Pembayaran pembayaran = new Pembayaran(pasien);
pembayaran.setPoli(namaPoli);
pembayaran.setDokter(namaDokter, keteranganDokter);
pembayaran.setBiaya(biayaPendaftaran, biayaObat, biayaVitamin, biayaDokter);

pembayaran.hitungTotalBiaya();
}
}