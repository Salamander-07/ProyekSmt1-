import java.util.Scanner;
import java.util.Random;

public class MyClass {

public static void main(String args[]) {
Random random = new Random();
double hargajenis = 0, hargaberat = 0, hargalayanan = 0, hargaasuransi = 0, total = 0,nomor1,nomor2;
String nama1, nama2, daerah2, daerah3,alamat;
Scanner input = new Scanner(System.in);
long[] tarif = 
    {0, 35000, 35000, 34000, 34000, 34000, 33000, 32000, 33000, 33000, 32000,
        25000, 25000, 20000, 15000, 15000, 10000, 20000, 25000, 30000, 35000,
        35000, 30000, 30000, 35000, 35000, 30000, 30000, 28000, 25000, 25000,
        35000, 35000, 35000, 30000};
String[] provinsi = 
    {"None", "Aceh", "Sumatera Utara", "Sumatera Barat", "Riau", "Kepulauan Riau", "jambi", "Sumatera Selatan", "Kepulauan Bangka Belitung", "Bengkulu", "Lampung",
           "DKI Jakarta", "Banten", "Jawa Barat", "Jawa Tengah", "DI Yogyakarta", "Jawa Timur", "Bali",  " Nusa Tenggara Barat", "Nusa Tenggara timur", "Kalimantan Barat",
           "Kalimantan Tengah", "Kalimantan Selatan", "Kalimantan Timur", "Kalimantan Utara", "Sulawesi Utara", "Gorontalo", "Sulawesi Tengah", "Sulawesi Barat", "Sulawesi Selatan", "Sulawesi Tenggara",
           "Maluku", "Maluku Utara", "Papua Barat", "Papua"};
int number = random.nextInt(1000) + 1;
System.out.printf("♥♥♥ SELAMAT DATANG DI KANTOR EKSPEDISI KAPITALIS CABANG MALANG ♥♥♥\nJl. Soekarno Hatta No.9 Malang\nKota     : Kota Malang - Provinsi Jawa Timur - Indonesia\nKode Pos : 65141\nTelepon  : (0341) 404424-404425\n\nOleh     :\nMuhammad Helmi Permana Agung (19) \nMuhammad Rayhan Gibran       (21)\nRama Wijaya                  (23)\n\n");
for(int awal=0; ; awal++){
    System.out.printf("\nMenu\n1. Mengirim Barang\n2. Cek Harga Pengiriman\n3. Keluar\nSilahkan pilih menu : ");
    int pil1 = input.nextInt();
    if(pil1 == 1){
        System.out.printf("\nSilahkan masukkan nama pengirim          : ");
        input.nextLine();
        nama1 = input.nextLine();
        System.out.printf("\nSilahkan masukkan nomor telepon pengirim : ");
        nomor1 = input.nextDouble();
        System.out.printf("\nSilahkan masukkan nama penerima          : ");
        input.nextLine();
        nama2 = input.nextLine();
        System.out.printf("\nSilahkan masukkan nomor telepon penerima : ");
        nomor2 = input.nextDouble();
        System.out.println("Provinsi : ");
        System.out.printf("1. Aceh                       18. Nusa Tenggara Barat\n2. Sumatera Utara             19. Nusa Tenggara Timur\n3. Sumatera Barat             20. Kalimantan Barat \n4. Riau                       21. Kalimantan Tengah\n5. Kepulauan Riau             22. Kalimantan Selatan\n6. Jambi                      23. Kalimantan Timur\n7. Sumatera Selatan           24. Kalimantan Utara\n8. Kepulauan Bangka Belitung  25. Sulawesi Utara \n9. Bengkulu                   26. Gorontalo\n10. Lampung                   27. Sulawesi Tengah\n11. DKI Jakarta               28. Sulawesi Barat\n12. Banten                    29. Sulawesi Selatan\n13. Jawa Barat                30. Sulawesi Tenggara\n14. Jawa Tengah               31. Maluku\n15. DI Yogyakarta             32. Maluku Utara\n16. Jawa Timur                33. Papua Barat\n17. Bali                      34. Papua");
        System.out.printf("\nSilahkan Pilih Provinsi Tujuan           : ");
        int daerah1 = input.nextInt();
        System.out.printf("\nSilahkan masukkan kab/kota penerima      : ");
        input.nextLine();
        daerah2 = input.nextLine();
        System.out.printf("\nSilahkan masukkan kecamatan penerima     : ");
        daerah3 = input.nextLine();
        System.out.printf("\nSilahkan masukkan kodepos  penerima      : ");
        int kodepos = input.nextInt();
        System.out.printf("\nSilahkan masukkan alamat lengkap         : ");
        input.nextLine();
        alamat = input.nextLine();
        
        System.out.printf("\n1. Barang berharga \n2. Barang medioker \nSilahkan pilih jenis barang : ");
        int jenisbarang = input.nextInt();
        if (jenisbarang == 1)
            hargajenis = 50000;
        else if (jenisbarang == 2)
            hargajenis = 20000;
        System.out.printf("\nSilahkan masukkan berat barang (kg) : ");
        int berat = input.nextInt();
        if (berat<=5)
        hargaberat = 10000;
        if ( berat>5 && berat<=10 )
        hargaberat = 15000;
        else if ( berat>10 )
        hargaberat = 25000;
        System.out.printf("\nSilahkan pilih jenis Layanan \n1. Hemat\n2. Regular\n3. Kilat \nSilahkan pilih menu : ");
        int pil2 = input.nextInt();
        if(pil2 == 1){
        hargalayanan = 10000;
        }
        else if(pil2 == 2){
        hargalayanan = 15000;
        }
        else if(pil2 == 3){
        hargalayanan =  30000;
        }
        System.out.printf("\nApakah anda ingin menggunakan asuransi \n1. Ya (10000) \n2. Tidak\nSilahkan pilih : ");
        int pil3 = input.nextInt();
        if(pil3 == 1){
        hargaasuransi = 10000;
        }
        else if(pil3 == 2){
        hargaasuransi = 0;
        }
        total = (hargajenis + hargalayanan + hargaasuransi + hargaberat + tarif[daerah1])*110/100;
        
        System.out.printf("\n\n-------------------------------------------------- Resi anda --------------------------------------------------");
        System.out.printf("\nharga total yang harus dibayar + PPN 10 persen : Rp. %.1f\n",total);
        System.out.println("Nomor Resi     : " + kodepos + number + provinsi[daerah1]);
        System.out.println("Nama Pengirim  : " + nama1);
        System.out.println("Nama Penerima  : " + nama2);
        System.out.printf("Alamat Lengkap : %s, Kecamatan %s, Kab/Kota %s, Provinsi %s\n",alamat,daerah3,daerah2,provinsi[daerah1]);
        System.out.printf("-------------------------------------------------------------------------------------------------------------------\n\n");
    }else if(pil1==2){
        System.out.println("\nBerikut List Harga Ekpedisi Kapitalis : ");
        System.out.printf("\n\nJenis Barang   : \n1. Berharga         : Rp.50.000\n2. Medioker / Biasa : Rp.20.000");
        System.out.printf("\n\nBerat Barang   : \n1. <=5Kg  : Rp.10.000\n2. 6-10Kg : Rp.15.000\n3. >11Kg  : Rp.25.000");
        System.out.printf("\n\nJenis Layanan  : \n1. Hemat   : Rp.10.000\n2. Regular : Rp.15.000\n3. Kilat   : Rp.30.000");
        System.out.printf("\n\nHarga Asuransi : \n1. Asuransi : Rp.10.000");
        for(int i = 0 ; ;i++){
        System.out.printf("\n\n1. Aceh                       18. Nusa Tenggara Barat\n2. Sumatera Utara             19. Nusa Tenggara Timur\n3. Sumatera Barat             20. Kalimantan Barat \n4. Riau                       21. Kalimantan Tengah\n5. Kepulauan Riau             22. Kalimantan Selatan\n6. Jambi                      23. Kalimantan Timur\n7. Sumatera Selatan           24. Kalimantan Utara\n8. Kepulauan Bangka Belitung  25. Sulawesi Utara \n9. Bengkulu                   26. Gorontalo\n10. Lampung                   27. Sulawesi Tengah\n11. DKI Jakarta               28. Sulawesi Barat\n12. Banten                    29. Sulawesi Selatan\n13. Jawa Barat                30. Sulawesi Tenggara\n14. Jawa Tengah               31. Maluku\n15. DI Yogyakarta             32. Maluku Utara\n16. Jawa Timur                33. Papua Barat\n17. Bali                      34. Papua");
        System.out.printf("\n\nSilahkan Pilih Provinsi (0. Kembali ke menu Utama) : ");
        int cekharga = input.nextInt();
        if (cekharga == 0 ){
            break;
        }
        System.out.printf("\nHarga Tujuan Provinsi %s : Rp. %d\n", provinsi[cekharga], tarif[cekharga]);
        }
    }else if(pil1==3){
        System.out.printf("\n♥♥♥ TERIMA KASIH TELAH MENGGUNAKAN LAYANAN KAMI ♥♥♥");
        break;
        
    } else {
      System.out.println("Maaf anda salah memasukkan nomor, pilih angka 1 atau 2");
    }
    
}
    }

}