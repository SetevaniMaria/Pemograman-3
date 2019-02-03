
package bukualamat;

public class Bukualamat {
    private String nama;
    private String alamat;
    private String notlp;
    private String email;
   

    public Bukualamat(String nama, String alamat, String notlp, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.notlp = notlp;
        this.email = email;
        
        
    }

   public Bukualamat() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNotlp() {
        return notlp;
    }

    public void setNotlp(String notlp) {
        this.notlp = notlp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void seluruh (){
        System.out.println("Nama : " +this.getNama());
        System.out.println("Alamat : "+ this.getAlamat());
        System.out.println("No.Telepon : "+ this.getNotlp());
        System.out.println("Email :"+ this.getEmail());
    }
    public void print(){
        System.out.println(this.getNama() + "\t\t" + this.getAlamat()+"\t\t"+ this.getNotlp()+"\t\t"+ this.getEmail());
        
    }
  
    }
    
