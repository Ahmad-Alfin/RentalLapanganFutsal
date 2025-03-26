/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentalLapanganFutsal;

/**
 *
 * @author alfin
 */
class Pelanggan {
    private String nama;
    private String nomorTelepon;

    public Pelanggan(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("Nomor Telepon: " + nomorTelepon);
    }
}
