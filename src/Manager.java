public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, int thn, int bln, int tgl, int anak, String nama, String nik, boolean jk, boolean m) {
        super(gaji, thn, bln, tgl, anak, nama, nik, jk, m);
        this.departemen = departemen;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (0.10 * getGaji());
    }

    @Override
    public String toString() {
        return super.toString() + "\ndepartemen : " + departemen;
    }
}