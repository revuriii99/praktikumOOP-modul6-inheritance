public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public double getTunjangan(){
        if(menikah){
            return jenisKelamin ? 25.0 : 20.0;
        } else {
            return 15.0;
        }
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    public String toString(){
        return "Nama: " + nama + "\nNIK: " + nik + "\nJenis Kelamin" + (jenisKelamin ? "Pria" : "Wanita") + "\npendapatan: " + getPendapatan();
    }

    public void setNama(String nama) { this.nama = nama; }
    public String getNama() { return nama; }
    public void setJenisKelamin(boolean jk) { this.jenisKelamin = jk; }
    public boolean isJenisKelamin() { return jenisKelamin; }
    public void setNik(String nik) { this.nik = nik; }
    public String getNik() { return nik; }
    public void setMenikah(boolean menikah) { this.menikah = menikah; }
    public boolean isMenikah() { return menikah; }
}
