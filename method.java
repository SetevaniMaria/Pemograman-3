
package bukualamat;

import java.util.ArrayList;
import java.util.Scanner;

public class method {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    Boolean jalankan = true;
    ArrayList<Bukualamat> buku = new ArrayList<>();

    while (jalankan) {

     System.out.println("Buku Alamat STMIK 'AMIKBANDUNG'");
          System.out.println("Dibawah ini panduan menggunakan menu yang akan di jalankan :-)");
          System.out.println("1.Memasukkan data jika anda belum menginput data anda pada system "
                  + "\n2.Melihat data yang sudah ada"
                  + "\n3.Mengedit data yang sudah anda input"
                  + "\n4.Menghapus data"
                  + "\n5.Keluar dari System");
          System.out.print("Masukkan nomor menu yang akan anda pilih :");
      
    int pilihan;

    try {
        pilihan = Integer.parseInt(input.nextLine());
    } catch (NumberFormatException nfe) {
        pilihan = 0;}
        input = new Scanner(System.in);
        switch (pilihan) {
        case 1:System.out.println("\nMenu Tambah Data");
        Boolean inputlagi = true;
         while (inputlagi) {
           Bukualamat entri = new Bukualamat();
            System.out.print("Masukkan Nama : ");
           String nama = input.nextLine();
            entri.setNama(nama);
            System.out.print("Masukkan Alamat : ");
           String alamat = input.nextLine();
            entri.setAlamat(alamat);
            System.out.print("Masukkan No.Telepon : ");
           String nomortelepon = input.nextLine();
            entri.setNotlp(nomortelepon);
            System.out.print("Masukkan Email : ");
           String email = input.nextLine();
            entri.setEmail(email);
            buku.add(entri);
        System.out.print("Apakah Anda akan memasukkan data lagi??(Y/T) : ");
        String terus = input.nextLine().toUpperCase();
        if (!terus.equals("Y")) {
        inputlagi = false;
}
}       break;
        case 2:System.out.println("\nMenu Pembaharuan Data");
               System.out.println("No \t Nama \t\t\t Alamat \t\t\t No. Telepon \t\t Email");
           for (int i = 0; i < buku.size(); i++) {
               Bukualamat a = buku.get(i);
            System.out.print((i + 1) + "\t");
        a.print();}
        System.out.print("\nMasukkan nomor entri yang ingin diubah : ");
        int nomoredit;
       try {   
         nomoredit = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException nfe) {
            nomoredit = 0;
}
        try {
            if (nomoredit > 0) {
                Bukualamat a = buku.get(nomoredit - 1);
                Boolean selesai = false;
            while (!selesai) {
            a.seluruh();
            System.out.println("\nMau apa yang ingin diubah?");
            System.out.println("1. Nama"
                    + "\n2.Alamat"
                    + "\n3.No.Telepon"
                    + "\n4.Email"
                    + "\n5.selesai");
            System.out.print("\nPilih (1-5) : ");
        int pilihedit;
            try {
                pilihedit = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException nfe) {
                    pilihedit = 0;
}
           switch (pilihedit) {
            case 1:System.out.print("Masukkan nama: ");
            a.setNama(input.nextLine());
            case 2:System.out.print("Masukkan alamat: ");
            a.setAlamat(input.nextLine());break;
            case 3:System.out.print("Masukkan nomor telepon: ");
            a.setNotlp(input.nextLine());break;
            case 4:System.out.print("Masukkan alamat: ");
            a.setEmail(input.nextLine());break;
            case 5:System.out.println("\nData Telah diubah");
                        selesai = true;break;
        default:System.out.println("\nMasukkan angka pada menu.");break;
        }
        }
        } else {
        System.out.println("\nNomor Tidak ditemukan");
           }
        } catch (Exception e) {
        System.out.println("\nNomor tidak ditemukan");}break;
        case 3:System.out.println("\nMenu Hapus Data");
        System.out.println("No \t Nama \t\t\t Alamat \t\t\t No. Telepon \t\t Email");
        for (int i = 0; i < buku.size(); i++) {

        Bukualamat a = buku.get(i);
        System.out.print((i + 1) + "\t");
        a.print();
}
        System.out.print("Masukkan nomor entri yang ingin dihapus : ");
        int nohps;
        try {
        nohps= Integer.parseInt(input.nextLine());
        } catch (NumberFormatException nfe) {
        nohps = 0;
}
        try {

        if (nohps > 0) {

        buku.remove(nohps - 1);

        System.out.println("\nData telah terhapus");

        } else {
            System.out.println("\nNomor tak terdeteksi");
}
            
            } catch (Exception e) {
               System.out.println("\nNomor tak terdeteksi");}break;
        case 4:System.out.println("No \t Nama \t\t\t Alamat \t\t\t No. Telepon \t\t Email");
                for (int i = 0; i < buku.size(); i++) {
                Bukualamat a = buku.get(i);
                System.out.print((i + 1) + "\t");
                a.print();}break;
        case 5: jalankan = false;break;

    default:System.out.println("\nMasukkan No yang terdapat pada menu");break;

}

}

}


}


    
    
