package oop_java.week7;

public class Staff extends Karyawan{
    public int lembur, potongan;

    public Staff() {
    }
    public Staff(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {
        this.lembur = lembur;
        this.potongan = potongan;
    }
    public void tampilDataStaff() {
        super.tampilDataKaryawan();
        System.out.println("Lembur\t\t: " + lembur);
        System.out.println("Potongan\t: " + potongan);
        System.out.println("Total Gaji\t: " + (super.gaji + lembur - potongan));
    }
}
