
package mobil;
import java.util.Scanner;
public class perjalananmobil {
    public static Boolean jalan = true;
    private static int pilihan;
    private static int gigi;
    
    public static void main(String[] args) {
     Scanner s = new Scanner (System.in);
     
     Mobil aktivitasMobil = new Mobil (false, 0, 180, 5, 0);
     
     aktivitasMobil.setKecepatanmax(300);
     while (jalan){
         System.out.println("Selamat Datang Di Menu Mobil");
         System.out.println("1.Starter Mobil"
                 + "\n2.Gas Mobil"
                 + "\n3.Ganti gigi Mobil"
                 + "\n4.Rem Mobil"
                 + "\n5.Stop Mobil"
                 + "\n6.Keluar dari menu mobil ini");
         System.out.println("Apa yang anda pilih ??");
         try {
             pilihan = s.nextInt();
         }catch (Exception e){
             pilihan = 0;
             jalan = false;
         }
         switch (pilihan){
             case 1 : aktivitasMobil.Start();break;
             case 2 : aktivitasMobil.gas();break;
             case 3 : System.out.println("Mobil Ganti gigi ke gigi (1/2/3/4/5):");
                try {
                    gigi = s.nextInt();
                    if (gigi >=0 && gigi <=5){
                        aktivitasMobil.GantiGigi(gigi);}
                    }catch (NumberFormatException nfe){
                        System.out.println("Gigi yang anda masukkan salah menu gigi ada di angka 1 sampai 5");
                    }break;
             case 4 : aktivitasMobil.rem();break;
             case 5 : aktivitasMobil.stop();break;
             case 6 : jalan = false;break;
             default : System.out.println("Pilihan yang anda pilih salah");break;
                }
                     
         }
     }
    }
    

