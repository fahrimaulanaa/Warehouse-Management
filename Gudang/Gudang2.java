package Gudang;
import java.util.ArrayList;
import java.io.Console;

public class Gudang2 {

    static Console input = System.console();  

    public class bariskedua{
        
        public static void daftarproduk(){

            ArrayList<String> produk = new ArrayList<String>();
            produk.add("Chitato Barbeque");
            produk.add("Lays Chips");
            produk.add("Lays Rumput Laut");
            produk.add("Dorittos");
            produk.add("Dorittos Original");
            produk.add("Dorittos Keju");
            produk.add("Dorittos Balado");
            produk.add("Cheetos");
            produk.add("Cheetos Spicy");
            produk.add("Cheetos Keju");
            produk.add("Happy Tos");
            produk.add("Q~Tela");
            produk.add("Pringles");
            produk.add("Pringles Mini");
            produk.add("Pringles Sour Cream");

            ArrayList<Integer> harga = new ArrayList<Integer>();
            harga.add(8000);
            harga.add(6000);
            harga.add(7000);
            harga.add(10000);
            harga.add(8000);
            harga.add(9000); 
            harga.add(5000);
            harga.add(11000);
            harga.add(13000); 
            harga.add(7000); 
            harga.add(8000);
            harga.add(9000);
            harga.add(10000);
            harga.add(11000);
            harga.add(6000); 

            ArrayList<Integer> jumlah = new ArrayList<Integer>();
            jumlah.add(6585);
            jumlah.add(8562);
            jumlah.add(5547);
            jumlah.add(5456);
            jumlah.add(7621);
            jumlah.add(9657);
            jumlah.add(2547);
            jumlah.add(8037);
            jumlah.add(9657);
            jumlah.add(8852);
            jumlah.add(9167);
            jumlah.add(7695);
            jumlah.add(6851);
            jumlah.add(5684);
            jumlah.add(7202);

            ArrayList<String> kode = new ArrayList<String>();
            kode.add("A04");
            kode.add("K05");
            kode.add("C56");
            kode.add("Q07");
            kode.add("B04");
            kode.add("D56");
            kode.add("E04");
            kode.add("F05");
            kode.add("G56");
            kode.add("H04");
            kode.add("I05");
            kode.add("J56");
            kode.add("K04");
            kode.add("L05");
            kode.add("M56");

            System.out.println("DAFTAR PRODUK GUDANG 2");
            System.out.println("========================");
            for (int i = 0; i < produk.size(); i++) {
                System.out.println("Produk : " + produk.get(i));
                System.out.println("Harga : " + harga.get(i));
                System.out.println("Jumlah : " + jumlah.get(i));
                System.out.println("Kode : " + kode.get(i));
                System.out.println("========================");
            }
        }

        public static void tambahproduk(){

            ArrayList<String> produk = new ArrayList<String>();
            produk.add("Chitato Barbeque");
            produk.add("Lays Chips");
            produk.add("Lays Rumput Laut");
            produk.add("Dorittos");
            produk.add("Dorittos Original");
            produk.add("Dorittos Keju");
            produk.add("Dorittos Balado");
            produk.add("Cheetos");
            produk.add("Cheetos Spicy");
            produk.add("Cheetos Keju");
            produk.add("Happy Tos");
            produk.add("Q~Tela");
            produk.add("Pringles");
            produk.add("Pringles Mini");
            produk.add("Pringles Sour Cream");

            ArrayList<Integer> harga = new ArrayList<Integer>();
            harga.add(8000);
            harga.add(6000);
            harga.add(7000);
            harga.add(10000);
            harga.add(8000);
            harga.add(9000); 
            harga.add(5000);
            harga.add(11000);
            harga.add(13000); 
            harga.add(7000); 
            harga.add(8000);
            harga.add(9000);
            harga.add(10000);
            harga.add(11000);
            harga.add(6000); 

            ArrayList<Integer> jumlah = new ArrayList<Integer>();
            jumlah.add(6585);
            jumlah.add(8562);
            jumlah.add(5547);
            jumlah.add(5456);
            jumlah.add(7621);
            jumlah.add(9657);
            jumlah.add(2547);
            jumlah.add(8037);
            jumlah.add(9657);
            jumlah.add(8852);
            jumlah.add(9167);
            jumlah.add(7695);
            jumlah.add(6851);
            jumlah.add(5684);
            jumlah.add(7202);

            ArrayList<String> kode = new ArrayList<String>();
            kode.add("A04");
            kode.add("K05");
            kode.add("C56");
            kode.add("Q07");
            kode.add("B04");
            kode.add("D56");
            kode.add("E04");
            kode.add("F05");
            kode.add("G56");
            kode.add("H04");
            kode.add("I05");
            kode.add("J56");
            kode.add("K04");
            kode.add("L05");
            kode.add("M56");

            System.out.println("DAFTAR PRODUK GUDANG 2");
            System.out.println("========================");
            for (int i = 0; i < produk.size(); i++) {
                System.out.println("Produk : " + produk.get(i));
                System.out.println("Harga : " + harga.get(i));
                System.out.println("Jumlah : " + jumlah.get(i));
                System.out.println("Kode : " + kode.get(i));
                System.out.println("========================");
            }   

            System.out.println("TAMBAH PRODUK BARU");
            System.out.println("========================");
            System.out.println("");
            System.out.print("Masukkan nama produk yang ingin ditambahkan : ");
            String nama = input.readLine();
            System.out.print("Masukkan harga produk yang ingin ditambahkan : ");
            int harga1 = Integer.parseInt(input.readLine());
            System.out.print("Masukkan jumlah produk yang ingin ditambahkan : ");
            int jumlah1 = Integer.parseInt(input.readLine());
            System.out.print("Masukkan kode produk yang ingin ditambahkan : ");
            String kode1 = input.readLine();
            produk.add(nama);
            harga.add(harga1);
            jumlah.add(jumlah1);
            kode.add(kode1);
            System.out.println("");
            System.out.println("DAFTAR PRODUK GUDANG 2");
            System.out.println("========================");
            for (int i = 0; i < produk.size(); i++) {
                System.out.println("Produk : " + produk.get(i));
                System.out.println("Harga : " + harga.get(i));
                System.out.println("Jumlah : " + jumlah.get(i));
                System.out.println("Kode : " + kode.get(i));
                System.out.println("========================");
            }
        }

        public static void hapusproduk(){
            
            ArrayList<String> produk = new ArrayList<String>();
            produk.add("Chitato Barbeque");
            produk.add("Lays Chips");
            produk.add("Lays Rumput Laut");
            produk.add("Dorittos");
            produk.add("Dorittos Original");
            produk.add("Dorittos Keju");
            produk.add("Dorittos Balado");
            produk.add("Cheetos");
            produk.add("Cheetos Spicy");
            produk.add("Cheetos Keju");
            produk.add("Happy Tos");
            produk.add("Q~Tela");
            produk.add("Pringles");
            produk.add("Pringles Mini");
            produk.add("Pringles Sour Cream");

            ArrayList<Integer> harga = new ArrayList<Integer>();
            harga.add(8000);
            harga.add(6000);
            harga.add(7000);
            harga.add(10000);
            harga.add(8000);
            harga.add(9000); 
            harga.add(5000);
            harga.add(11000);
            harga.add(13000); 
            harga.add(7000); 
            harga.add(8000);
            harga.add(9000);
            harga.add(10000);
            harga.add(11000);
            harga.add(6000); 

            ArrayList<Integer> jumlah = new ArrayList<Integer>();
            jumlah.add(6585);
            jumlah.add(8562);
            jumlah.add(5547);
            jumlah.add(5456);
            jumlah.add(7621);
            jumlah.add(9657);
            jumlah.add(2547);
            jumlah.add(8037);
            jumlah.add(9657);
            jumlah.add(8852);
            jumlah.add(9167);
            jumlah.add(7695);
            jumlah.add(6851);
            jumlah.add(5684);
            jumlah.add(7202);

            ArrayList<String> kode = new ArrayList<String>();
            kode.add("A04");
            kode.add("K05");
            kode.add("C56");
            kode.add("Q07");
            kode.add("B04");
            kode.add("D56");
            kode.add("E04");
            kode.add("F05");
            kode.add("G56");
            kode.add("H04");
            kode.add("I05");
            kode.add("J56");
            kode.add("K04");
            kode.add("L05");
            kode.add("M56");

            System.out.println("DAFTAR PRODUK GUDANG 2");
            System.out.println("========================");
            for (int i = 0; i < produk.size(); i++) {
                System.out.println("Produk : " + produk.get(i));
                System.out.println("Harga : " + harga.get(i));
                System.out.println("Jumlah : " + jumlah.get(i));
                System.out.println("Kode : " + kode.get(i));
                System.out.println("========================");
            }

            System.out.println("MENU HAPUS PRODUK");
            System.out.println("========================");
            System.out.println("");
            System.out.print("MASUKKAN KODE PRODUK YANG AKAN DIHAPUS : ");
            String kode2 = input.readLine();
            for (int i = 0; i < kode.size(); i++) {
                if (kode2.equals(kode.get(i))) {
                    produk.remove(i);
                    harga.remove(i);
                    jumlah.remove(i);
                    kode.remove(i);
                }
            }
            System.out.println("");
            System.out.println("DAFTAR PRODUK GUDANG 2");
            System.out.println("========================");
            System.out.println("");
            for (int i = 0; i < produk.size(); i++) {
                System.out.println("Produk : " + produk.get(i));
                System.out.println("Harga : " + harga.get(i));
                System.out.println("Jumlah : " + jumlah.get(i));
                System.out.println("Kode : " + kode.get(i));
                System.out.println("========================");
            }
        }

        public static void beliproduk(){

            ArrayList<String> produk = new ArrayList<String>();
            produk.add("Chitato Barbeque");
            produk.add("Lays Chips");
            produk.add("Lays Rumput Laut");
            produk.add("Dorittos");
            produk.add("Dorittos Original");
            produk.add("Dorittos Keju");
            produk.add("Dorittos Balado");
            produk.add("Cheetos");
            produk.add("Cheetos Spicy");
            produk.add("Cheetos Keju");
            produk.add("Happy Tos");
            produk.add("Q~Tela");
            produk.add("Pringles");
            produk.add("Pringles Mini");
            produk.add("Pringles Sour Cream");

            ArrayList<Integer> harga = new ArrayList<Integer>();
            harga.add(8000);
            harga.add(6000);
            harga.add(7000);
            harga.add(10000);
            harga.add(8000);
            harga.add(9000); 
            harga.add(5000);
            harga.add(11000);
            harga.add(13000); 
            harga.add(7000); 
            harga.add(8000);
            harga.add(9000);
            harga.add(10000);
            harga.add(11000);
            harga.add(6000); 

            ArrayList<Integer> jumlah = new ArrayList<Integer>();
            jumlah.add(6585);
            jumlah.add(8562);
            jumlah.add(5547);
            jumlah.add(5456);
            jumlah.add(7621);
            jumlah.add(9657);
            jumlah.add(2547);
            jumlah.add(8037);
            jumlah.add(9657);
            jumlah.add(8852);
            jumlah.add(9167);
            jumlah.add(7695);
            jumlah.add(6851);
            jumlah.add(5684);
            jumlah.add(7202);

            ArrayList<String> kode = new ArrayList<String>();
            kode.add("A04");
            kode.add("K05");
            kode.add("C56");
            kode.add("Q07");
            kode.add("B04");
            kode.add("D56");
            kode.add("E04");
            kode.add("F05");
            kode.add("G56");
            kode.add("H04");
            kode.add("I05");
            kode.add("J56");
            kode.add("K04");
            kode.add("L05");
            kode.add("M56");

            System.out.println("DAFTAR PRODUK GUDANG 2");
            System.out.println("========================");
            for (int i = 0; i < produk.size(); i++) {
                System.out.println("Produk : " + produk.get(i));
                System.out.println("Harga : " + harga.get(i));
                System.out.println("Jumlah : " + jumlah.get(i));
                System.out.println("Kode : " + kode.get(i));
                System.out.println("========================");
            }

            System.out.println("");
            System.out.println("MENU BELI PRODUK");
            System.out.println("========================");
            System.out.println("");
            System.out.print("MASUKKAN KODE PRODUK YANG AKAN DI BELI : ");
            String kode2 = input.readLine();
            for (int i = 0; i < kode.size(); i++) {
                if (kode2.equals(kode.get(i))) {
                    System.out.println("");
                    System.out.println("RINCIAN PRODUK YANG AKAN DI BELI");
                    System.out.println("========================");
                    System.out.println("Produk : " + produk.get(i));
                    System.out.println("Harga : " + harga.get(i));
                    System.out.println("Jumlah : " + jumlah.get(i));
                    System.out.println("Kode : " + kode.get(i));
                    System.out.println("========================");
                    System.out.println("");
                    System.out.print("MASUKKAN JUMLAH PRODUK YANG AKAN DI BELI : ");
                    int jumlah2 = Integer.parseInt(input.readLine());
                    jumlah.set(i, jumlah.get(i) - jumlah2);
                    System.out.println("");
                    System.out.println("PRODUK YANG ANDA BELI");
                    System.out.println("========================");
                    System.out.println("Produk : " + produk.get(i));
                    System.out.println("Harga : " + harga.get(i));
                    System.out.println("Jumlah : " + jumlah2);
                    System.out.println("Kode : " + kode.get(i));
                    System.out.println("Total Harga : " + harga.get(i) * jumlah2);
                    System.out.println("========================");

                    System.out.println("");
                    System.out.println("DAFTAR PRODUK GUDANG 2");
                    System.out.println("========================");
                    for (int j = 0; j < produk.size(); j++) {
                        System.out.println("Produk : " + produk.get(j));
                        System.out.println("Harga : " + harga.get(j));
                        System.out.println("Jumlah : " + jumlah.get(j));
                        System.out.println("Kode : " + kode.get(j));
                        System.out.println("========================");
                    }
                }
            }
        }
    }
}
