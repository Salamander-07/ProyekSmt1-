import java.util.Scanner;
import java.util.Random;

public class coba{
    //variabel global
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);
    static int pilihMenuUtama, pilihMenuKirimBarang, pilihMenuUbahDataHarga, pilihMenuUbahDataBarang, fungsiCekResi, indeksProvinsi, indeksTarif, indeksPilihProvinsiKirimBarang, indeksPilihProvinsi, indeksPilihTarif, number;
    static int pilihJenisBarang,  pilihJenisLayanan, pilihAsuransi;
    static String[][] dataPengguna = new String[2][2];
    static String[] daerah = new String[5];
    static String alamat;
    static double hargaJenisBarang, beratBarang, hargaBeratBarang, hargaJenisLayanan, hargaAsuransi, total, nomor1, nomor2;
    static String[] jenisBarang = {"None", "Barang Berharga", "Barang Medioker"};
    static String[] jenisLayanan = {"None", "Hemat", "Reguler", "Kilat"};
    static String[] jenisAsuransi = {"None", "Ya", "Tidak"};
    static String[] provinsi = {"None", "Aceh", "Sumatera Utara", "Sumatera Barat", "Riau", "Kepulauan Riau", "jambi", "Sumatera Selatan", "Kepulauan Bangka Belitung", "Bengkulu", "Lampung",
           "DKI Jakarta", "Banten", "Jawa Barat", "Jawa Tengah", "DI Yogyakarta", "Jawa Timur", "Bali", "Nusa Tenggara timur", "Kalimantan Barat",
           "Kalimantan Tengah", "Kalimantan Selatan", "Kalimantan Timur", "Sulawesi Utara", "Gorontalo", "Sulawesi Tengah", "Sulawesi Barat", "Sulawesi Tenggara",
           "Maluku", "Maluku Utara", "Papua Barat", "Papua"};
    static double[] tarif = {0, 35000, 35000, 34000, 34000, 34000, 33000, 32000, 33000, 33000, 32000,
            25000, 25000, 20000, 15000, 15000, 10000, 20000, 25000, 30000, 35000,
            35000, 30000, 30000, 35000, 35000, 30000, 30000, 28000, 25000, 25000,
            35000, 35000, 35000, 30000};

    
    //fungsi

    static void angkaRandom(){ //membuat angka random untuk resi
        for(int ulangRandom=0;;ulangRandom++){
            number=random.nextInt();
            if(number<24651 && number>85645){continue;}
            else if(number>=24651 && number<=85645){break;}
        }
    }
    static double hitungTotal(double ha, double hjb, double hjl, double hbb, double tap){//hitung harga
        total=(ha+hjb+hjl+hbb+tap)*110/100;
        return total;
    }
    
    static void menuKirimBarang(){ //untuk kirim barang
        for(int ulangMenuKirimBarang=0;;ulangMenuKirimBarang++){
        System.out.printf("\nMenu\n1. Input Data\n2. Cek Data\n3. Ubah Data\n4. Kerjakan Proses Pengiriman\n5. Kembali\nSilahkan pilih menu: ");
        pilihMenuKirimBarang = sc.nextInt();
        if(pilihMenuKirimBarang==1){//ke input data kirim barang
            inputDataKirimBarang();
        }else if(pilihMenuKirimBarang==2){//ke cek data kirim barang
            cekDataKirimBarang();
        }else if(pilihMenuKirimBarang==3){//ke ubah data kirim barang
            ubahDataBarang();
        }else if(pilihMenuKirimBarang==4){//ke membuat resi
            prosesKirimBarang();
        }else if(pilihMenuKirimBarang==5){//kembali
            break;
        }else{
            System.out.printf("\nInputan anda tidak valid, ulangi dengan memasukkan angka untuk memilih menu!\n");
        }
        }   
    }
    static void membuatResi(){//untuk cek resi
        System.out.printf("\n\n-------------------------------------------------- Resi anda --------------------------------------------------");
        System.out.printf("\nNomor Resi     : %s%d",daerah[4],number);
        cekDataKirimBarang();
        System.out.printf("\nharga total yang harus dibayar + PPN 10 persen : Rp. %.1f\n",hitungTotal(hargaAsuransi,hargaJenisBarang,hargaJenisLayanan,hargaBeratBarang,tarif[indeksPilihProvinsiKirimBarang]));
        System.out.printf("-------------------------------------------------------------------------------------------------------------------\n\n");
    }
    static void menuUbahDataHarga(){//untuk ubah data
    }


    //untuk \ kirim barang \ input data kirim barang \
    static void inputDataKirimBarang(){
        //input nama dan nomer telepon
        inputDataKirimBarangPengirimPenerima();
        //input alamat penerima
        inputDataKirimBarangAlamat();
        //input jenis pengiriman
        inputDataKirimBarangJenisPengiriman();
    }
    //untuk \ kirim barang \ input data kirim barang \ pengirim/penerima
    static void inputDataKirimBarangPengirimPenerima(){
        System.out.printf("Masukkan nama pengirim: ");
        dataPengguna[0][0]=sc.nextLine();
        dataPengguna[0][0]=sc.nextLine();
        System.out.printf("Masukkan nama penerima: ");
        dataPengguna[1][0]=sc.nextLine();
        System.out.printf("Masukkan nomor telepon pengirim: ");
        dataPengguna[0][1]=sc.nextLine();
        System.out.printf("Masukkan nomor telepon penerima: ");
        dataPengguna[1][1]=sc.nextLine();
    }
    //untuk \ kirim barang \ input data kirim barang \ alamat
    static void inputDataKirimBarangAlamat(){
        for(int ulangInputData=0;;ulangInputData++){
            for(indeksProvinsi=1; indeksProvinsi<provinsi.length; indeksProvinsi++){
                System.out.printf("%d %s\n",indeksProvinsi,provinsi[indeksProvinsi]);
            }

            System.out.printf("Pilih provinsi yang dituju untuk pengiriman barang: ");
            indeksPilihProvinsiKirimBarang = sc.nextInt();
            if(indeksPilihProvinsiKirimBarang>=1 && indeksPilihProvinsiKirimBarang<provinsi.length){
                break;
            }else{
                System.out.printf("\nSilahkan ulangi dengan angka yang valid!\n");
            }
        }    
        daerah[0]=provinsi[indeksPilihProvinsiKirimBarang];
        System.out.printf("Masukkan kabupaten/kota penerima: ");
        daerah[1]=sc.nextLine();
        daerah[1]=sc.nextLine();
        System.out.printf("Masukkan kecamatan penerima: ");
        daerah[2]=sc.nextLine();
        System.out.printf("Masukkan alamat tambahan (jalan, desa, apartment, dsb.) penerima: ");
        daerah[3]=sc.nextLine();
        System.out.printf("Masukkan kode pos penerima: ");
        daerah[4]=sc.nextLine();
        
    }
    //untuk \ kirim barang \ input data kirim barang \ jenis pengiriman
    static void inputDataKirimBarangJenisPengiriman(){
        for(int ulangJenisBarang=0;;ulangJenisBarang++){
            System.out.printf("\nBerikut jenis barang:\n1. Barang berharga\n2. Barang medioker\nPilih jenis barang yang dikirim: ");
            pilihJenisBarang=sc.nextInt();
            if(pilihJenisBarang==1){hargaJenisBarang=50000; break;}
            else if(pilihJenisBarang==2){hargaJenisBarang=20000; break;}
            else{System.out.printf("\nPilih antara 1 atau 2!\n");}
        }
        for(int ulangBeratBarang=0;;ulangBeratBarang++){
            System.out.printf("\nMasukkan berat barang (dalam kg): ");
            beratBarang=sc.nextDouble();
            if(beratBarang>=0 && beratBarang<5){hargaBeratBarang=10000; break;}
            else if(beratBarang>=5 && beratBarang<=10){hargaBeratBarang=15000; break;}
            else if(beratBarang>10){hargaBeratBarang=25000; break;}
            else{System.out.printf("\nMasukkan berat barang dalam kg!!\n");}
        }
        for(int ulangJenisLayanan=0;;ulangJenisLayanan++){
            System.out.printf("\nSilahkan pilih jenis Layanan \n1. Hemat\n2. Regular\n3. Kilat \nSilahkan pilih menu : ");
            pilihJenisLayanan=sc.nextInt();
            if(pilihJenisLayanan==1){hargaJenisLayanan=10000; break;}
            else if(pilihJenisLayanan==2){hargaJenisLayanan=15000; break;}
            else if(pilihJenisLayanan==3){hargaJenisLayanan=30000; break;}
            else{System.out.print("\nPilih antara 1-3!\n");}
        }
        for(int ulangAsuransi=0;;ulangAsuransi++){
            System.out.printf("\nApakah anda ingin menggunakan asuransi?\n1. Ya\t2. Tidak\n(1/2):");
            pilihAsuransi=sc.nextInt();
            if(pilihAsuransi==1){hargaAsuransi=10000; break;}
            else if(pilihAsuransi==2){hargaAsuransi=0; break;}
            else{System.out.printf("\nPilih antara 1 atau 2!\n");}
        }
    }
    //untuk \ kirim barang \ cek data kirim barang \
    static void cekDataKirimBarang(){
        System.out.printf("\nNama Pengirim\t: %s\n",dataPengguna[0][0]);
        System.out.printf("\nNomor Pengirim\t: %s\n",dataPengguna[0][1]);
        System.out.printf("\nNama Penerima\t: %s\n",dataPengguna[1][0]);
        System.out.printf("\nNomor Penerima\t: %s\n",dataPengguna[1][1]);
        System.out.printf("\nAlamat Penerima\t: %s, %s, %s, %s, %s\n",daerah[3],daerah[2],daerah[1],daerah[0],daerah[4]);
        System.out.printf("\nJenis Barang\t: %s (%f)\n",jenisBarang[pilihJenisBarang],hargaJenisBarang);
        System.out.printf("\nBerat Barang\t: %f kg (%f)\n",beratBarang,hargaBeratBarang);
        System.out.printf("\nJenis Layanan\t: %s (%f)\n",jenisLayanan[pilihJenisLayanan],hargaJenisLayanan);
        System.out.printf("\nAsuransi \t: %s (%f)\n",jenisAsuransi[pilihAsuransi],hargaAsuransi);
    }
    //untuk \ kirim barang \ ubah data kirim barang \
    static void ubahDataBarang(){
        for(int ulangUbahDataBarang=0;;ulangUbahDataBarang++){
        System.out.printf("\n1. Nama\n2. Alamat\n3. Jenis Pengiriman\n4. Kembali\nPilih yang akan diubah: ");
        pilihMenuUbahDataBarang=sc.nextInt();
        if(pilihMenuUbahDataBarang==1){inputDataKirimBarangPengirimPenerima();break;}
        else if(pilihMenuUbahDataBarang==2){inputDataKirimBarangAlamat();break;}
        else if(pilihMenuUbahDataBarang==3){inputDataKirimBarangJenisPengiriman();break;}
        else if(pilihMenuUbahDataBarang==4){break;}
        else{System.out.printf("Pilih menu antara 1-4!");}
        }
    }
    //untuk \ kirim barang \ proses kirim barang(resi) \
    static void prosesKirimBarang(){
        System.out.printf("\nPermintaan anda telah diproses, berikut adalah resi anda\n\n");
        membuatResi();
    }





    //main
    public static void main(String[] args){
        //menu utama
        angkaRandom();
        for(int ulangMenu=0;;ulangMenu++){
        System.out.printf("\nSELAMAT DATANG DI KANTOR EKSPEDISI KAPITALIS CABANG MALANG\nJl. Soekarno Hatta No.9 Malang\nKota     : Kota Malang - Provinsi Jawa Timur - Indonesia\nKode Pos : 65141\nTelepon  : (0341) 404424-404425\n\nOleh     :\nMuhammad Helmi Permana Agung (19) \nMuhammad Rayhan Gibran       (21)\nRama Wijaya                  (23)\n\n");
            System.out.printf("\nMenu\n1. Kirim Barang\n2. Lihat Resi\n3. Ubah Harga\n4. Keluar\nSilahkan pilih menu : ");
            pilihMenuUtama = sc.nextInt();
        if (pilihMenuUtama==1){//Masuk ke menu kirim barang
            menuKirimBarang();
        }else if(pilihMenuUtama==2){//Masuk ke membuat resi
            membuatResi();
        }else if(pilihMenuUtama==3){//Masuk ke menu ubah data harga
            menuUbahDataHarga();
        }else if(pilihMenuUtama==4){//stop aplikasi
            System.out.printf("\nSampai jumpa lagi besok!\n\n");
            break;
        }else{//tidak valid
            System.out.printf("Angka yang anda masukkan tidak valid, silahkan memilih menu yang tersedia.\n");
        }
        }
    }
}