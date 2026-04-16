import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahun, int bulan, int hari, int jumlahAnak, String nama, String nik, boolean jk, boolean m) {
        super(nama, jk, nik, m);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, hari);
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        int lamaBekerja = Period.between(tahunMasuk, LocalDate.now()).getYears();
        if (lamaBekerja >= 0 && lamaBekerja <= 5) return 0.05 * gaji;
        if (lamaBekerja > 5 && lamaBekerja <= 10) return 0.10 * gaji;
        if (lamaBekerja > 10) return 0.15 * gaji;
        return 0;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + gaji + getBonus() + (jumlahAnak * 20.0);
    }

    @Override
    public String toString() {
        return super.toString() + "\ntahun masuk : " + tahunMasuk.getDayOfMonth() + " " +
                tahunMasuk.getMonthValue() + " " + tahunMasuk.getYear() +
                "\njumlah anak : " + jumlahAnak + "\ngaji : " + gaji;
    }

    public double getGaji() { return gaji; }
}