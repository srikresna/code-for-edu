
public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
        Employee e[] = { pEmp, iEmp };
        Payable p[] = { pEmp, eBill };
        Employee e2[] = { pEmp, iEmp, eBill };
    }
    // . Perhatikan array e pada baris ke-8, mengapa ia bisa diisi dengan
    // objek-objek dengan tipe yang berbeda, yaitu objek pEmp (objek dari
    // PermanentEmployee) dan objek iEmp (objek dari
    // InternshipEmployee) ?
    // karena kelas PermanentEmployee dan kelas InternshipEmployee merupakan turunan dari kelas Employee sehingga objek pEmp dan objek iEmp dapat diisi ke dalam array e yang bertipe Employee

    // 2. Perhatikan juga baris ke-9, mengapa array p juga biisi dengan objek-objek
    // dengan tipe yang berbeda, yaitu objek pEmp (objek dari
    // PermanentEmployee) dan objek eBill (objek dari
    // ElectricityBilling) ?
    // karena kelas PermanentEmployee dan kelas ElectricityBill implements ke interface Payable sehingga objek pEmp dan objek eBill dapat diisi ke dalam array p yang bertipe Payable


    // 3. Perhatikan baris ke-10, mengapa terjadi error?
    // karena objek eBill merupakan objek dari kelas ElectricityBill yang tidak merupakan turunan dari kelas Employee sehingga objek eBill tidak dapat diisi ke dalam array e yang bertipe Employee
}
