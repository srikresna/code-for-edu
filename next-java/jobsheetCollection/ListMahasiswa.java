package jobsheetCollection;

import java.util.*;

public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.forEach((mhs) -> {
            System.out.println(mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (mahasiswas.get(i).nim.equals(nim)) {
                return i;
            }
        }
        return -1;
    }

    int binarySearch(String nim) {
        Mahasiswa key = new Mahasiswa(nim, "", "");
        return Collections.binarySearch(mahasiswas, key, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa m1, Mahasiswa m2) {
                return m1.nim.compareTo(m2.nim);
            }
        });
    }

    public void sortingAscending() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa m1, Mahasiswa m2) {
                return m1.nim.compareTo(m2.nim);
            }
        });
    }

    public void sortingDescending() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa m1, Mahasiswa m2) {
                return m2.nim.compareTo(m1.nim);
            }
        });
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);

        lm.tampil();

        lm.update(lm.binarySearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
}
