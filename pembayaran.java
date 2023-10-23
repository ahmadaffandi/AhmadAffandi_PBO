package jawabanNo3;

class Pembayaran {
Pasien pasien;
String namaPoli;
String namaDokter;
String keteranganDokter;
double biayaPendaftaran;
double biayaObat;
double biayaVitamin;
double biayaDokter;

public Pembayaran(Pasien pasien) {
this.pasien = pasien;
}

public void setPoli(String namaPoli) {
this.namaPoli = namaPoli;
}

public void setDokter(String namaDokter, String keteranganDokter) {
this.namaDokter = namaDokter;
this.keteranganDokter = keteranganDokter;
}

public void setBiaya(double biayaPendaftaran, double biayaObat, double biayaVitamin, double biayaDokter) {
this.biayaPendaftaran = biayaPendaftaran;
this.biayaObat = biayaObat;
this.biayaVitamin = biayaVitamin;
this.biayaDokter = biayaDokter;
}

public void hitungTotalBiaya() {
double totalBiaya = biayaPendaftaran + biayaObat + biayaVitamin + biayaDokter;
System.out.println("=======================o0o=======================");
System.out.println("Poli \t" + namaPoli);
System.out.println("Dokter \t" + namaDokter);
System.out.println("Keterangan \t" + keteranganDokter);
System.out.println("_________________");
System.out.println("Total biaya yang dibayar pasien : Rp. " + totalBiaya);
System.out.println("Selamat Sehat " + pasien.nama + " dari Rumah Sakit Waras");
}
}