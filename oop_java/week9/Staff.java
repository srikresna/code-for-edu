package oop_java.week9;

public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur) {
        this.lembur=lembur;
    }

    public int getLembur() {
        return lembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur=gajiLembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji()+lembur*gajiLembur;
    }

    public double getGaji() {
        return super.getGaji()+lembur*gajiLembur;
    }

    public void lihatInfo() {
        System.out.println("Nama: "+super.getNama());
        System.out.println("NIP: "+super.getNip());
        System.out.println("Golongan: "+super.getGolongan());
        System.out.println("Jml Lembur: "+this.lembur);
        System.out.println("Gaji Lembur: "+this.gajiLembur);
        System.out.println("Gaji Total: "+getGaji());
    }

}
