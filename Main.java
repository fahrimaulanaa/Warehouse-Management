import java.util.Scanner;
import Gudang.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("SYSTEM WAREHOUSING");
        System.out.println("=================");
        System.out.println("Masukkan nomor gudang: ");
        int nomorGudang = input.nextInt();
        switch (nomorGudang) {
            case 1:
                System.out.println("INFORMASI GUDANG 1");
                System.out.println("============================");
                System.out.println("Nama gudang: Gudang 1");
                System.out.println("Lokasi: Jl. Kebon Kacang");
                System.out.println("Kapasitas: 300000 barang");
                System.out.println("Jenis barang: Pakaian dan sejenisnya");
                System.out.println("============================");
                System.out.println("");
                System.out.println("PILIHAN MENU GUDANG 1");
                System.out.println("============================");
                System.out.println("1. Tambah barang");
                System.out.println("2. Hapus barang");
                System.out.println("3. Lihat barang");
                System.out.println("4. Beli Barang");
                System.out.println("5. Keluar");
                System.out.println("============================");
                System.out.println("");
                System.out.println("Masukkan pilihan: ");
                int pilihan = input.nextInt();
                if (pilihan == 1) {
                    Gudang.Gudang1.barispertama.tambahproduk();
                }
                else if(pilihan == 2){
                    Gudang.Gudang1.barispertama.hapusproduk();
                }
                else if(pilihan == 3){
                    Gudang.Gudang1.barispertama.daftarproduk();
                }
                else if(pilihan == 4){
                    Gudang.Gudang1.barispertama.beliproduk();
                }
                else if(pilihan == 5){
                    System.out.println("Terima kasih telah menggunakan aplikasi ini");
                }
                else{
                    System.out.println("Pilihan tidak ada");
                }
                break;

            case 2:
            System.out.println("INFORMASI GUDANG 2");
                System.out.println("============================");
                System.out.println("Nama gudang: Gudang 2");
                System.out.println("Lokasi: Jl. Kebon Jeruk");
                System.out.println("Kapasitas: 300000 barang");
                System.out.println("Jenis barang: Makanan dan sejenisnya");
                System.out.println("============================");
                System.out.println("");
                System.out.println("PILIHAN MENU GUDANG 1");
                System.out.println("============================");
                System.out.println("1. Tambah barang");
                System.out.println("2. Hapus barang");
                System.out.println("3. Lihat barang");
                System.out.println("4. Beli Barang");
                System.out.println("5. Keluar");
                System.out.println("============================");
                System.out.println("");
                System.out.println("Masukkan pilihan: ");
                int pilihan2 = input.nextInt();
                if (pilihan2 == 1) {
                    Gudang.Gudang2.bariskedua.tambahproduk();
                }
                else if(pilihan2 == 2){
                    Gudang.Gudang2.bariskedua.hapusproduk();
                }
                else if(pilihan2 == 3){
                    Gudang.Gudang2.bariskedua.daftarproduk();
                }
                else if(pilihan2 == 4){
                    Gudang.Gudang2.bariskedua.beliproduk();
                }
                else if(pilihan2 == 5){
                    System.out.println("Terima kasih telah menggunakan aplikasi ini");
                }
                else{
                    System.out.println("Pilihan tidak ada");
                }
                break;
            default:
                break;
        }       
    }  
}