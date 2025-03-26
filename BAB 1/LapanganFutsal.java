/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentalLapanganFutsal;

/**
 *
 * @author alfin
 */
class LapanganFutsal {
    // Atribut
    String nama;
    double hargaPerJam;
    boolean tersedia;
    String lokasi;

    // Method untuk menyewa lapangan
    public void sewaLapangan(int jam) {
        if (tersedia) {
            double totalHarga = jam * hargaPerJam;
            System.out.println("Lapangan " + nama + " berhasil disewa selama " + jam + " jam.");
            System.out.println("Total harga: Rp " + totalHarga);
            tersedia = false; // Setelah disewa, lapangan tidak tersedia
        } else {
            System.out.println("Maaf, lapangan " + nama + " sedang tidak tersedia.");
        }
    }

    // Method untuk mengembalikan lapangan
    public void kembalikanLapangan() {
        tersedia = true;
        System.out.println("Lapangan " + nama + " telah dikembalikan dan sekarang tersedia.");
    }

    // Method untuk menampilkan info lapangan
    public void tampilkanInfo() {
        System.out.println("Lapangan: " + nama);
        System.out.println("Harga per jam: Rp " + hargaPerJam);
        System.out.println("Tersedia: " + (tersedia ? "Ya" : "Tidak"));
        System.out.println("Lokasi: " + lokasi);
    }
}

//class LapanganFutsal {
//    // Atribut
//    private String nama;
//    private double hargaPerJam;
//    private boolean tersedia;
//    private String lokasi; // Atribut baru
//
//    // Constructor
//    public LapanganFutsal(String nama, double hargaPerJam, boolean tersedia, String lokasi) {
//        this.nama = nama;
//        this.hargaPerJam = hargaPerJam;
//        this.tersedia = tersedia;
//        this.lokasi = lokasi;
//    }
//
//    // Method untuk menyewa lapangan
//    public void sewaLapangan(int jam) {
//        if (tersedia) {
//            double totalHarga = jam * hargaPerJam;
//            System.out.println("Lapangan " + nama + " berhasil disewa selama " + jam + " jam.");
//            System.out.println("Total harga: Rp " + totalHarga);
//            tersedia = false; // Setelah disewa, lapangan tidak tersedia
//        } else {
//            System.out.println("Maaf, lapangan " + nama + " sedang tidak tersedia.");
//        }
//    }
//
//    // Method untuk mengembalikan lapangan
//    public void kembalikanLapangan() {
//        tersedia = true;
//        System.out.println("Lapangan " + nama + " telah dikembalikan dan sekarang tersedia.");
//    }
//    
//    // Method untuk menampilkan info lapangan
//    public void tampilkanInfo() {
//        System.out.println("Lapangan: " + nama);
//        System.out.println("Harga per jam: Rp " + hargaPerJam);
//        System.out.println("Tersedia: " + (tersedia ? "Ya" : "Tidak"));
//        System.out.println("Lokasi: " + lokasi);
//    }
//}