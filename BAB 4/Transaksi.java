/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentalLapanganFutsal;

/**
 *
 * @author alfin
 */

public class Transaksi {
    private Pelanggan pelanggan;     // Objek pelanggan
    private String lapangan;         // Nama lapangan
    private int durasi;              // Durasi sewa (jam)
    private double totalHarga;       // Total harga transaksi

    // Konstruktor untuk membuat objek transaksi
    public Transaksi(Pelanggan pelanggan, String lapangan, int durasi, double hargaPerJam) {
        this.pelanggan = pelanggan;                               // Set objek pelanggan
        this.lapangan = lapangan;                                 // Set nama lapangan
        this.durasi = durasi;                                     // Set durasi
        this.totalHarga = durasi * hargaPerJam;                   // Hitung total harga
    }

    // Getter untuk pelanggan
    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    // Setter untuk pelanggan
    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    // Getter untuk lapangan
    public String getLapangan() {
        return lapangan;
    }

    // Setter untuk lapangan
    public void setLapangan(String lapangan) {
        this.lapangan = lapangan;
    }

    // Getter untuk durasi
    public int getDurasi() {
        return durasi;
    }

    // Setter untuk durasi
    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    // Getter untuk total harga
    public double getTotalHarga() {
        return totalHarga;
    }

    // Setter untuk total harga
    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    // Menampilkan detail transaksi di console
    public void tampilkanDetailTransaksi() {
        System.out.println("Detail Transaksi:");
        pelanggan.tampilkanInfo();                                     // Tampilkan data pelanggan
        System.out.println("Lapangan: " + lapangan);                  // Tampilkan nama lapangan
        System.out.println("Durasi: " + durasi + " jam");             // Tampilkan durasi
        System.out.println("Total Harga: Rp " + totalHarga);          // Tampilkan total harga
    }
}