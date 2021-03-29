/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fs112b.pkg2022429952.latihan58.tambahkurang;

/**
 * @author
 * NAMA     : Eggi Firman Saputra
 * KELAS    : PBO/ FS112B
 * NIM      : 2022429952
 * Deskripsi Program : Program penjumlahan dan pengurangan menggunakan inheritance,
 * dengan nilai X dan Y ditentukan di konstruktor Bilangan
 *
 */
public class Main {
    public static void main(String[] args) {
        JumlahBilangan jumlahBil = new JumlahBilangan();
        SelisihBilangan selisihBil = new SelisihBilangan();

        jumlahBil.tampilHasilJumlah();
        selisihBil.tampilHasilSelisih();
    }
}

