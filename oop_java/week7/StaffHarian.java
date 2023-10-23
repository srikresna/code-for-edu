package oop_java.week7;

public class StaffHarian extends Staff {
    public int jmlJamKerja;

    public StaffHarian() {
    }
    public StaffHarian(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, int jmlJamKerja) {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmlJamKerja = jmlJamKerja;
    }
    public void tampilStaffHarian() {
        System.out.println("==============Data Staff Harian==============");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja\t: " + jmlJamKerja);
        System.out.println("Gaji Bersih\t\t: " + (gaji * jmlJamKerja + lembur - potongan));
    }
}
