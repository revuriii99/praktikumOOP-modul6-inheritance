import java.time.LocalDate;

public class Pekerja {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji,LocalDate tahunMasuk,int jumlahAnak){
        this.gaji=gaji;
        this.tahunMasuk=tahunMasuk;
        this.jumlahAnak=jumlahAnak;
    }
}
