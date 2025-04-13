/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentalLapanganFutsal;

/**
 *
 * @author alfin
 */


public class LapanganFutsal {
    // Atribut private untuk enkapsulasi
    private String nama;              // Nama lapangan
    private double hargaPerJam;       // Harga sewa per jam
    private boolean tersedia;         // Status ketersediaan lapangan
    private String lokasi;            // Lokasi lapangan

    // Konstruktor untuk menginisialisasi objek LapanganFutsal
    public LapanganFutsal(String nama, double hargaPerJam, boolean tersedia, String lokasi) {
        this.nama = nama;
        this.hargaPerJam = hargaPerJam;
        this.tersedia = tersedia;
        this.lokasi = lokasi;
    }

    // Getter untuk nama lapangan
    public String getNama() {
        return nama;
    }

    // Setter untuk nama lapangan
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk harga per jam
    public double getHargaPerJam() {
        return hargaPerJam;
    }

    // Setter untuk harga per jam
    public void setHargaPerJam(double hargaPerJam) {
        this.hargaPerJam = hargaPerJam;
    }

    // Getter untuk status ketersediaan
    public boolean isTersedia() {
        return tersedia;
    }

    // Setter untuk status ketersediaan
    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    // Getter untuk lokasi lapangan
    public String getLokasi() {
        return lokasi;
    }

    // Setter untuk lokasi lapangan
    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    // Method untuk menyewa lapangan
    public void sewaLapangan(int jam) {
        if (tersedia) {
            double totalHarga = jam * hargaPerJam; // Hitung total biaya
            System.out.println("Lapangan " + nama + " berhasil disewa selama " + jam + " jam.");
            System.out.println("Total harga: Rp " + totalHarga);
            tersedia = false; // Set lapangan jadi tidak tersedia
        } else {
            System.out.println("Maaf, lapangan " + nama + " sedang tidak tersedia.");
        }
    }

    // Method untuk mengembalikan lapangan agar bisa disewa lagi
    public void kembalikanLapangan() {
        tersedia = true;
        System.out.println("Lapangan " + nama + " telah dikembalikan dan sekarang tersedia.");
    }

    // Method untuk menampilkan informasi lengkap lapangan
    public void tampilkanInfo() {
        System.out.println("Lapangan: " + nama);
        System.out.println("Harga per jam: Rp " + hargaPerJam);
        System.out.println("Tersedia: " + (tersedia ? "Ya" : "Tidak"));
        System.out.println("Lokasi: " + lokasi);
    }
}