/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentalLapanganFutsal;

/**
 *
 * @author alfin
 */
class Transaksi {
    private Pelanggan pelanggan;
    private String lapangan;
    private int durasi;
    private double totalHarga;

    public Transaksi(Pelanggan pelanggan, String lapangan, int durasi, double hargaPerJam) {
        this.pelanggan = pelanggan;
        this.lapangan = lapangan;
        this.durasi = durasi;
        this.totalHarga = durasi * hargaPerJam;
    }

    public void tampilkanDetailTransaksi() {
        System.out.println("Detail Transaksi:");
        pelanggan.tampilkanInfo();
        System.out.println("Lapangan: " + lapangan);
        System.out.println("Durasi: " + durasi + " jam");
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}
