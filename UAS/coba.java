import java.util.Scanner;
import java.util.Random;

public class coba{
    //variabel global
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);
    static int pilihMenuUtama, pilihMenuKirimBarang, pilihMenuUbahDataHarga, fungsiCekResi;
    static String[][] dataPengguna = new String[2][2];
    static String[] daerah = new String[2];
    static String alamat;
    static double hargaJenis, hargaBerat, hargaLayanan, hargaAsuransi, total, nomor1, nomor2;
    static String[] provinsi = {"None", "Aceh", "Sumatera Utara", "Sumatera Barat", "Riau", "Kepulauan Riau", "jambi", "Sumatera Selatan", "Kepulauan Bangka Belitung", "Bengkulu", "Lampung",
           "DKI Jakarta", "Banten", "Jawa Barat", "Jawa Tengah", "DI Yogyakarta", "Jawa Timur", "Bali", "Nusa Tenggara timur", "Kalimantan Barat",
           "Kalimantan Tengah", "Kalimantan Selatan", "Kalimantan Timur", "Sulawesi Utara", "Gorontalo", "Sulawesi Tengah", "Sulawesi Barat", "Sulawesi Tenggara",
           "Maluku", "Maluku Utara", "Papua Barat", "Papua"};
    static double[] tarif = {0, 35000, 35000, 34000, 34000, 34000, 33000, 32000, 33000, 33000, 32000,
            25000, 25000, 20000, 15000, 15000, 10000, 20000, 25000, 30000, 35000,
            35000, 30000, 30000, 35000, 35000, 30000, 30000, 28000, 25000, 25000,
            35000, 35000, 35000, 30000};

    //fungsi
    static void menuKirimBarang(){
        for(int ulangMenuKirimBarang=0;;ulangMenuKirimBarang++){
        System.out.printf("\nMmenu\n1. Input Data\n2. Cek Data\n3. Ubah Data\n4. Kerjakan Proses Pengiriman\n5. Kembali\nSilahkan pilih menu: ");
        pilihMenuKirimBarang = sc.nextInt();
        if(pilihMenuKirimBarang==1){//ke input data kirim barang
            System.out.printf("ok");
        }else if(pilihMenuKirimBarang==2){//ke cek data kirim barang
            System.out.printf("ok");
        }else if(pilihMenuKirimBarang==3){//ke ubah data kirim barang
            System.out.printf("ok");
        }else if(pilihMenuKirimBarang==4){//ke membuat resi
            System.out.printf("ok");
        }else if(pilihMenuKirimBarang==5){//kembali
            break;
        }else{
            System.out.printf("\nInputan anda tidak valid, ulangi dengan memasukkan angka untuk memilih menu!\n");
        }
        }   
    }
    static void menuUbahDataHarga(){}
    static void membuatResi(){}
    static void inputDataKirimBarang(){
        System.out.printf("Masukkan nama pengirim: ");
        dataPengguna[0][0]=sc.nextLine();
        System.out.printf("Masukkan nama penerima: ");
        dataPengguna[1][0]=sc.nextLine();
        System.out.printf("Masukkan nomor telepon pengirim: ");
        dataPengguna[0][1]=sc.nextLine();
        System.out.printf("Masukkan nomor telepon penerima: ");
        dataPengguna[0][1]=sc.nextLine();
    }

    public static void main(String[] args){
        //menu utama

        for(int ulangMenu=0;;ulangMenu++){
        System.out.printf("\nSELAMAT DATANG DI KANTOR EKSPEDISI KAPITALIS CABANG MALANG\nJl. Soekarno Hatta No.9 Malang\nKota     : Kota Malang - Provinsi Jawa Timur - Indonesia\nKode Pos : 65141\nTelepon  : (0341) 404424-404425\n\nOleh     :\nMuhammad Helmi Permana Agung (19) \nMuhammad Rayhan Gibran       (21)\nRama Wijaya                  (23)\n\n");
            System.out.printf("\nMenu\n1. Kirim Barang\n2. Ubah harga\n3. Cetak resi\n4. Keluar\nSilahkan pilih menu : ");
            pilihMenuUtama = sc.nextInt();
        if (pilihMenuUtama==1){//Masuk ke menu kirim barang
            menuKirimBarang();
        }else if(pilihMenuUtama==2){//Masuk ke menu ubah data harga
            menuUbahDataHarga();
        }else if(pilihMenuUtama==3){//Masuk ke membuat resi
            membuatResi();
        }else if(pilihMenuUtama==4){//stop aplikasi
            System.out.printf("Sampai jumpa lagi besok!\n");
            break;
        }else{//tidak valid
            System.out.printf("Angka yang anda masukkan tidak valid, silahkan memilih menu yang tersedia.\n");
        }
        }
    }
}