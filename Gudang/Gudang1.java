package Gudang;
import java.util.ArrayList;
import java.io.Console;

public class Gudang1 {
    static Console con = System.console();
    
    public class barispertama{

        public static void daftarproduk(){

            //Daftar produk pada baris 1
            ArrayList<String> barang = new ArrayList<String>();
            barang.add("Baju");
            barang.add("Celana");
            barang.add("Sepatu");
            barang.add("Jaket");
            barang.add("Topi");
            barang.add("Kacamata");
            barang.add("Kaos");
            barang.add("Kaos Kaki");
            barang.add("Sarung Tangan"); 
            barang.add("Hoodie");
            barang.add("Jas");
            barang.add("Celana Jeans");
            barang.add("Celana Chinos");
            barang.add("Celana Pendek");  
            barang.add("Sweater");  
            
            //Daftar harga pada baris 1
            ArrayList<Integer> harga = new ArrayList<Integer>();
            harga.add(150000);
            harga.add(100000);
            harga.add(50000);
            harga.add(120000);
            harga.add(70000);
            harga.add(30000);
            harga.add(150000);
            harga.add(100000);
            harga.add(50000);
            harga.add(180000);
            harga.add(250000);
            harga.add(150000);
            harga.add(100000);
            harga.add(350000);
            harga.add(85000);
            harga.add(100000);
            harga.add(174000);
            harga.add(150000);
            harga.add(100000);
            harga.add(50000);

            //Daftar stok pada baris 1
            ArrayList<Integer> stok = new ArrayList<Integer>();
            stok.add(1100);           
            stok.add(1000);
            stok.add(2420);
            stok.add(2341);
            stok.add(1234);
            stok.add(4242);
            stok.add(2342);
            stok.add(2672);
            stok.add(2398);
            stok.add(6521);
            stok.add(2334);
            stok.add(2342);
            stok.add(3252);
            stok.add(1252);
            stok.add(2387);
            stok.add(3112);
            stok.add(3278);
            stok.add(3028);
            stok.add(4402);
            stok.add(3786);
            stok.add(4738);
            stok.add(2342); 
            stok.add(2924);
            stok.add(3492);
            stok.add(3899);
            stok.add(4398);
            stok.add(9794);
            stok.add(3769);
            stok.add(4398);
            stok.add(5482);
            stok.add(4572);
            stok.add(5482);

            //Daftar kode pada baris 1
            ArrayList<String> kode = new ArrayList<String>();
            kode.add("B01");
            kode.add("C01");
            kode.add("S01");
            kode.add("J01");
            kode.add("T01");
            kode.add("K01");
            kode.add("K02");
            kode.add("S02");
            kode.add("H01");
            kode.add("J02");
            kode.add("C02");
            kode.add("C03");
            kode.add("C04");
            kode.add("S03");
            kode.add("S04");
            kode.add("S05");
            kode.add("T02");
            kode.add("T03");
            kode.add("T04");
            kode.add("T05");
            kode.add("T06");
            kode.add("K03");
            kode.add("K04");
            kode.add("K05");
            kode.add("K06");
            kode.add("K07");
            kode.add("K08");

            System.out.println("DAFTAR PRODUK PADA BARIS PERTAMA");
            System.out.println("============================");
            for (int i = 0; i < barang.size(); i++) {
                System.out.println("Nama Produk: "+ barang.get(i));
                System.out.println("Harga Produk: "+ harga.get(i));
                System.out.println("Stok Produk: "+ stok.get(i));
                System.out.println("Kode Produk: "+ kode.get(i));
                System.out.println("============================");
            }
        }
        
        public static void beliproduk(){

                        //Daftar produk pada baris 1
            ArrayList<String> barang = new ArrayList<String>();
            barang.add("Baju");
            barang.add("Celana");
            barang.add("Sepatu");
            barang.add("Jaket");
            barang.add("Topi");
            barang.add("Kacamata");
            barang.add("Kaos");
            barang.add("Kaos Kaki");
            barang.add("Sarung Tangan"); 
            barang.add("Hoodie");
            barang.add("Jas");
            barang.add("Celana Jeans");
            barang.add("Celana Chinos");
            barang.add("Celana Pendek");  
            barang.add("Sweater");  
            
            //Daftar harga pada baris 1
            ArrayList<Integer> harga = new ArrayList<Integer>();
            harga.add(150000);
            harga.add(100000);
            harga.add(50000);
            harga.add(120000);
            harga.add(70000);
            harga.add(30000);
            harga.add(150000);
            harga.add(100000);
            harga.add(50000);
            harga.add(180000);
            harga.add(250000);
            harga.add(150000);
            harga.add(100000);
            harga.add(350000);
            harga.add(85000);
            harga.add(100000);
            harga.add(174000);
            harga.add(150000);
            harga.add(100000);
            harga.add(50000);

            //Daftar stok pada baris 1
            ArrayList<Integer> stok = new ArrayList<Integer>();
            stok.add(1100);           
            stok.add(1000);
            stok.add(2420);
            stok.add(2341);
            stok.add(1234);
            stok.add(4242);
            stok.add(2342);
            stok.add(2672);
            stok.add(2398);
            stok.add(6521);
            stok.add(2334);
            stok.add(2342);
            stok.add(3252);
            stok.add(1252);
            stok.add(2387);
            stok.add(3112);
            stok.add(3278);
            stok.add(3028);
            stok.add(4402);
            stok.add(3786);
            stok.add(4738);
            stok.add(2342); 
            stok.add(2924);
            stok.add(3492);
            stok.add(3899);
            stok.add(4398);
            stok.add(9794);
            stok.add(3769);
            stok.add(4398);
            stok.add(5482);
            stok.add(4572);
            stok.add(5482);

            //Daftar kode pada baris 1
            ArrayList<String> kode = new ArrayList<String>();
            kode.add("B01");
            kode.add("C01");
            kode.add("S01");
            kode.add("J01");
            kode.add("T01");
            kode.add("K01");
            kode.add("K02");
            kode.add("S02");
            kode.add("H01");
            kode.add("J02");
            kode.add("C02");
            kode.add("C03");
            kode.add("C04");
            kode.add("S03");
            kode.add("S04");
            kode.add("S05");
            kode.add("T02");
            kode.add("T03");
            kode.add("T04");
            kode.add("T05");
            kode.add("T06");
            kode.add("K03");
            kode.add("K04");
            kode.add("K05");
            kode.add("K06");
            kode.add("K07");
            kode.add("K08");
            
            System.out.println("DAFTAR PRODUK PADA BARIS PERTAMA");
            System.out.println("============================");
            for (int i = 0; i < barang.size(); i++) {
                System.out.println("Nama Produk: "+ barang.get(i));
                System.out.println("Harga Produk: "+ harga.get(i));
                System.out.println("Stok Produk: "+ stok.get(i));
                System.out.println("Kode Produk: "+ kode.get(i));
                System.out.println("============================");
            }
            System.out.println("");
            System.out.println("");
            System.out.print("MASUKKAN KODE BARANG YANG INGIN DIBELI(PAKAI CAPSLOCK): ");
            String kodebarang = con.readLine();
            System.out.println("");
            System.out.println("");
            System.out.print("MASUKKAN JUMLAH BARANG YANG INGIN DIBELI: ");
            int jumlah = Integer.parseInt(con.readLine());
            System.out.println("");
            System.out.println("Produk yang anda beli: ");
            System.out.println("============================");
            for (int i = 0; i < barang.size(); i++) {
                if (kodebarang.equals(kode.get(i))) {
                    System.out.println("Nama Produk: "+ barang.get(i));
                    System.out.println("Harga Produk: "+ harga.get(i));
                    System.out.println("Stok Produk: "+ stok.get(i));
                    System.out.println("Kode Produk: "+ kode.get(i));
                    System.out.println("Jumlah barang yang dibeli: "+ jumlah);
                    System.out.println("Harga total: "+ harga.get(i)*jumlah);
                    System.out.println("============================");
                }
            }
        }

        public static void tambahproduk(){

            ArrayList<String> barang = new ArrayList<String>();
            barang.add("Baju");
            barang.add("Celana");
            barang.add("Sepatu");
            barang.add("Jaket");
            barang.add("Topi");
            barang.add("Kacamata");
            barang.add("Kaos");
            barang.add("Kaos Kaki");
            barang.add("Sarung Tangan"); 
            barang.add("Hoodie");
            barang.add("Jas");
            barang.add("Celana Jeans");
            barang.add("Celana Chinos");
            barang.add("Celana Pendek");  
            barang.add("Sweater");  
            
            //Daftar harga pada baris 1
            ArrayList<Integer> harga = new ArrayList<Integer>();
            harga.add(150000);
            harga.add(100000);
            harga.add(50000);
            harga.add(120000);
            harga.add(70000);
            harga.add(30000);
            harga.add(150000);
            harga.add(100000);
            harga.add(50000);
            harga.add(180000);
            harga.add(250000);
            harga.add(150000);
            harga.add(100000);
            harga.add(350000);
            harga.add(85000);
            harga.add(100000);
            harga.add(174000);
            harga.add(150000);
            harga.add(100000);
            harga.add(50000);

            //Daftar stok pada baris 1
            ArrayList<Integer> stok = new ArrayList<Integer>();
            stok.add(1100);           
            stok.add(1000);
            stok.add(2420);
            stok.add(2341);
            stok.add(1234);
            stok.add(4242);
            stok.add(2342);
            stok.add(2672);
            stok.add(2398);
            stok.add(6521);
            stok.add(2334);
            stok.add(2342);
            stok.add(3252);
            stok.add(1252);
            stok.add(2387);
            stok.add(3112);
            stok.add(3278);
            stok.add(3028);
            stok.add(4402);
            stok.add(3786);
            stok.add(4738);
            stok.add(2342); 
            stok.add(2924);
            stok.add(3492);
            stok.add(3899);
            stok.add(4398);
            stok.add(9794);
            stok.add(3769);
            stok.add(4398);
            stok.add(5482);
            stok.add(4572);
            stok.add(5482);

            //Daftar kode pada baris 1
            ArrayList<String> kode = new ArrayList<String>();
            kode.add("B01");
            kode.add("C01");
            kode.add("S01");
            kode.add("J01");
            kode.add("T01");
            kode.add("K01");
            kode.add("K02");
            kode.add("S02");
            kode.add("H01");
            kode.add("J02");
            kode.add("C02");
            kode.add("C03");
            kode.add("C04");
            kode.add("S03");
            kode.add("S04");
            kode.add("S05");
            kode.add("T02");
            kode.add("T03");
            kode.add("T04");
            kode.add("T05");
            kode.add("T06");
            kode.add("K03");
            kode.add("K04");
            kode.add("K05");
            kode.add("K06");
            kode.add("K07");
            kode.add("K08");

            System.out.println("TAMBAHKAN PRODUK BARU");
            System.out.println("============================");
            System.out.println("");
            System.out.println("Masukkan nama produk baru: ");
            String namabarang = con.readLine();
            System.out.println("");
            System.out.println("Masukkan harga produk baru: ");
            int hargabarang = Integer.parseInt(con.readLine());
            System.out.println("");
            System.out.println("Masukkan stok produk baru: ");
            int stokbarang = Integer.parseInt(con.readLine());
            System.out.println("");
            System.out.println("Masukkan kode untuk produk baru: ");
            String kodebarang = con.readLine();
            System.out.println("");
            System.out.println("============================");
            System.out.println("");
            System.out.println("Nama Produk yang ditambahkan: "+ namabarang);
            System.out.println("Harga Produk yang ditambahkan: "+ hargabarang);
            System.out.println("Stok Produk yang ditambahkan: "+ stokbarang);
            System.out.println("Kode Produk yang ditambahkan: "+ kodebarang);   
            System.out.println("");
            System.out.println("============================");
            System.out.println("");
            System.out.println("Apakah anda ingin menambahkan produk ini? (Y/N)");
            String jawab = con.readLine();
            System.out.println("");
            System.out.println("============================");
            System.out.println("");
            if (jawab.equals("Y")){
                barang.add(namabarang);
                harga.add(hargabarang);
                stok.add(stokbarang);
                kode.add(kodebarang);
                System.out.println("Produk berhasil ditambahkan");
                System.out.println("");
                System.out.println("============================");
                System.out.println("");
                System.out.println("Apakah anda ingin menambahkan produk lagi? (Y/N)");
                String jawab2 = con.readLine();
                System.out.println("");
                System.out.println("============================");
                System.out.println("");
                if (jawab2.equals("Y")){
                    System.out.println("TAMBAHKAN PRODUK BARU");
                    System.out.println("============================");
                    System.out.println("");
                    System.out.println("Masukkan nama produk baru: ");
                    String namabarang2 = con.readLine();
                    System.out.println("");
                    System.out.println("Masukkan harga produk baru: ");
                    int hargabarang2 = Integer.parseInt(con.readLine());
                    System.out.println("");
                    System.out.println("Masukkan stok produk baru: ");
                    int stokbarang2 = Integer.parseInt(con.readLine());
                    System.out.println("");
                    System.out.println("Masukkan kode untuk produk baru: ");
                    String kodebarang2 = con.readLine();
                    System.out.println("");
                    System.out.println("============================");
                    System.out.println("");
                    System.out.println("Nama Produk yang ditambahkan: "+ namabarang2);
                    System.out.println("Harga Produk yang ditambahkan: "+ hargabarang2);
                    System.out.println("Stok Produk yang ditambahkan: "+ stokbarang2);
                    System.out.println("Kode Produk yang ditambahkan: "+ kodebarang2);
                    System.out.println("");
                    System.out.println("============================");
                    System.out.println("");
                }          
            }       
        }
        
        public static void hapusproduk(){

            ArrayList<String> barang = new ArrayList<String>();
            barang.add("Baju");
            barang.add("Celana");
            barang.add("Sepatu");
            barang.add("Jaket");
            barang.add("Topi");
            barang.add("Kacamata");
            barang.add("Kaos");
            barang.add("Kaos Kaki");
            barang.add("Sarung Tangan"); 
            barang.add("Hoodie");
            barang.add("Jas");
            barang.add("Celana Jeans");
            barang.add("Celana Chinos");
            barang.add("Celana Pendek");  
            barang.add("Sweater");  
            
            //Daftar harga pada baris 1
            ArrayList<Integer> harga = new ArrayList<Integer>();
            harga.add(150000);
            harga.add(100000);
            harga.add(50000);
            harga.add(120000);
            harga.add(70000);
            harga.add(30000);
            harga.add(150000);
            harga.add(100000);
            harga.add(50000);
            harga.add(180000);
            harga.add(250000);
            harga.add(150000);
            harga.add(100000);
            harga.add(350000);
            harga.add(85000);
            harga.add(100000);
            harga.add(174000);
            harga.add(150000);
            harga.add(100000);
            harga.add(50000);

            //Daftar stok pada baris 1
            ArrayList<Integer> stok = new ArrayList<Integer>();
            stok.add(1100);           
            stok.add(1000);
            stok.add(2420);
            stok.add(2341);
            stok.add(1234);
            stok.add(4242);
            stok.add(2342);
            stok.add(2672);
            stok.add(2398);
            stok.add(6521);
            stok.add(2334);
            stok.add(2342);
            stok.add(3252);
            stok.add(1252);
            stok.add(2387);
            stok.add(3112);
            stok.add(3278);
            stok.add(3028);
            stok.add(4402);
            stok.add(3786);
            stok.add(4738);
            stok.add(2342); 
            stok.add(2924);
            stok.add(3492);
            stok.add(3899);
            stok.add(4398);
            stok.add(9794);
            stok.add(3769);
            stok.add(4398);
            stok.add(5482);
            stok.add(4572);
            stok.add(5482);

            //Daftar kode pada baris 1
            ArrayList<String> kode = new ArrayList<String>();
            kode.add("B01");
            kode.add("C01");
            kode.add("S01");
            kode.add("J01");
            kode.add("T01");
            kode.add("K01");
            kode.add("K02");
            kode.add("S02");
            kode.add("H01");
            kode.add("J02");
            kode.add("C02");
            kode.add("C03");
            kode.add("C04");
            kode.add("S03");
            kode.add("S04");
            kode.add("S05");
            kode.add("T02");
            kode.add("T03");
            kode.add("T04");
            kode.add("T05");
            kode.add("T06");
            kode.add("K03");
            kode.add("K04");
            kode.add("K05");
            kode.add("K06");
            kode.add("K07");
            kode.add("K08");


            System.out.println("HAPUS PRODUK");
            System.out.println("============================");
            System.out.println("");
            System.out.println("Masukkan kode produk yang ingin dihapus: ");
            String kodehapus = con.readLine();
            System.out.println("");
            System.out.println("============================");
            System.out.println("");
            System.out.println("Apakah anda ingin menghapus produk ini? (Y/N)");
            String jawab = con.readLine();
            System.out.println("");
            System.out.println("============================");
            System.out.println("");
            if (jawab.equals("Y")){
                for (int i = 0; i < kode.size(); i++){
                    if (kodehapus.equals(kode.get(i))){
                        barang.remove(i);
                        harga.remove(i);
                        stok.remove(i);
                        kode.remove(i);
                        System.out.println("Produk berhasil dihapus");
                        System.out.println("");
                        System.out.println("============================");
                        System.out.println("");
                    }
                }
            }
        }
    }

}

