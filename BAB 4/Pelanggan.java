/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentalLapanganFutsal;

/**
 *
 * @author alfin
 */
public class Pelanggan {
    private String nama;                  // Menyimpan nama pelanggan
    private String nomorTelepon;          // Menyimpan nomor telepon pelanggan

    // Konstruktor untuk mengisi nama dan nomor telepon saat objek dibuat
    public Pelanggan(String nama, String nomorTelepon) {
        this.nama = nama;                 // Inisialisasi nama
        this.nomorTelepon = nomorTelepon; // Inisialisasi nomor telepon
    }

    // Mengambil nilai nama pelanggan
    public String getNama() {
        return nama;                      // Mengembalikan nilai variabel nama
    }

    // Mengatur ulang nama pelanggan
    public void setNama(String nama) {
        this.nama = nama;                 // Set nilai baru untuk nama
    }

    // Mengambil nilai nomor telepon pelanggan
    public String getNomorTelepon() {
        return nomorTelepon;              // Mengembalikan nilai variabel nomorTelepon
    }

    // Mengatur ulang nomor telepon pelanggan
    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon; // Set nilai baru untuk nomorTelepon
    }

    // Menampilkan informasi pelanggan ke konsol
    public void tampilkanInfo() {
        System.out.println("Nama Pelanggan: " + nama);         // Tampilkan nama
        System.out.println("Nomor Telepon: " + nomorTelepon);  // Tampilkan nomor telepon
    }
}
