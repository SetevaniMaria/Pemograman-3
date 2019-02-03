
package mobil;

public class Mobil {
   
 boolean statuskendaraan;
 int kecepatanmin;
 int kecepatanmax;
 int lajukendaraan;
 int Gigi;

    public Mobil(boolean statuskendaraan, int kecepatanmin, int kecepatanmax, int lajukendaraan, int gantigigi) {
        this.statuskendaraan = statuskendaraan;
        this.kecepatanmin = kecepatanmin;
        this.kecepatanmax = kecepatanmax;
        this.lajukendaraan = lajukendaraan;
        this.Gigi = Gigi;
    }

    public boolean isStatuskendaraan() {
        return statuskendaraan;
    }

    public void setStatuskendaraan(boolean statuskendaraan) {
        this.statuskendaraan = statuskendaraan;
    }

    public int getKecepatanmin() {
        return kecepatanmin;
    }

    public void setKecepatanmin(int kecepatanmin) {
        this.kecepatanmin = kecepatanmin;
    }

    public int getKecepatanmax() {
        return kecepatanmax;
    }

    public void setKecepatanmax(int kecepatanmax) {
        this.kecepatanmax = kecepatanmax;
    }

    public int getLajukendaraan() {
        return lajukendaraan;
    }

    public void setLajukendaraan(int lajukendaraan) {
        this.lajukendaraan = lajukendaraan;
    }

    public int getGigi() {
        return Gigi;
    }

    public void setGigi(int gantigigi) {
        this.Gigi = gantigigi;
    }
    public void Start (){
        if (! this.isStatuskendaraan ()){
        this.statuskendaraan = true ; 
            System.out.println("\n mesin mobil dinyalakan. ");
        }else {
            this.statuskendaraan = true;
            System.out.println("\n mobil dalam kondisi menyala. ");
        }   
}
    public void stop (){
        if (this.isStatuskendaraan () && this.getKecepatanmin()== 0){
            this.statuskendaraan = false;
            System.out.println(" laju mobil dihentikan.");
        }else if (this.isStatuskendaraan()&& this.getKecepatanmin()!= 0){
            System.out.println("\n laju mobil di perlambat");
        }else {
            System.out.println("\n nyalakan kembali mesin anda");
        }
    }
    public void rem (){
        this.setKecepatanmin(this.getKecepatanmin()/2);
        System.out.println("kecepatan mobil :"+ this.getKecepatanmin() + "km/jam");
    }
    public void GantiGigi (int Gigi){
        this.Gigi = Gigi;
        switch (Gigi ){
            case 0 :
            this.lajukendaraan = 0; break;
            case 1:
            this.lajukendaraan = 1; break;
            case 2 :
            this.lajukendaraan = 2; break;
            case 3 :
            this.lajukendaraan = 3; break;
            case 4 :
            this.lajukendaraan = 4; break;
            case 5 :
            this.lajukendaraan = 5; break;
        }
        System.out.println("Mobil kini berada pada Gigi : " + this.getGigi() );
        System.out.println("\nkecepatan mobil kini : " + this.getLajukendaraan()+"Km/jam");
        
    }
    public void gas(){
        if (this.getKecepatanmax()< this.getKecepatanmin() + this.getLajukendaraan()){
            if (this.getKecepatanmax()< this.getKecepatanmin() + this.getLajukendaraan()){
                this.setKecepatanmin(this.getKecepatanmax());
            }else { 
                this.setKecepatanmin(this.getKecepatanmin() + this.getLajukendaraan());
            }
            }else { 
            System.out.println("Mobil dalam kecepatan Maksimum");
            
        }
        System.out.println("Laju kendaraam saat ini : " +this.getKecepatanmin() + "km/jam");
            }} 
            
   
    
