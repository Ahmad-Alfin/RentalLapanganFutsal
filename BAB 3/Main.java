/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentalLapanganFutsal;

/**
 *
 * @author alfin
 */

public class Main {
    public static void main(String[] args) {
        // Membuat 3 objek lapangan futsal
        LapanganFutsal lap1 = new LapanganFutsal("Lapangan A", 50000, true, "Sudimoro");
        LapanganFutsal lap2 = new LapanganFutsal("Lapangan B", 60000, true, "Kepanjen");
        LapanganFutsal lap3 = new LapanganFutsal("Lapangan C", 55000, false, "Singosari");
        
        // Menampilkan informasi awal
        lap1.tampilkanInfo();
        lap2.tampilkanInfo();
        lap3.tampilkanInfo();
        
        // Menyewa lapangan A selama 2 jam
        lap1.sewaLapangan(2);
        
        // Mengembalikan lapangan A
        lap1.kembalikanLapangan();
        
        // Menampilkan informasi setelah perubahan
        lap1.tampilkanInfo();
    }
}
