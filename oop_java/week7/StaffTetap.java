package oop_java.week7;

public class StaffTetap extends Staff{
    public String golongan;
    public int asuransi;

    public StaffTetap() {
    }

    public StaffTetap(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, String golongan, int asuransi) {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
    public void tampilStaffTetap() {
        System.out.println("==============Data Staff Tetap==============");
        super.tampilDataStaff();
        System.out.println("Golongan\t: " + golongan);
        System.out.println("Jumlah Asuransi\t: " + asuransi);
        System.out.println("Gaji Bersih\t: " + (gaji + lembur - potongan - asuransi));
    }
}
