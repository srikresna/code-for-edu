public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
        ow.pay(eBill); // pay for electricity bill
        System.out.println("-------------------------------");

        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        ow.pay(pEmp); // pay for permanent employee
        System.out.println("-------------------------------");

        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEmp); // show permanent employee info
        System.out.println("-------------------------------");
        ow.showMyEmployee(iEmp); // show internship employee info

        ow.pay(iEmp); // pay for internship employee
    }

    // 1. Perhatikan class Tester4 baris ke-7 dan baris ke-11, mengapa
    // pemanggilan ow.pay(eBill) dan ow.pay(pEmp) bisa dilakukan,
    // padahal jika diperhatikan method pay() yang ada di dalam class Owner
    // memiliki argument/parameter bertipe Payable?
    // Jika diperhatikan lebih detil eBill merupakan objek dari
    // ElectricityBill dan pEmp merupakan objek dari
    // PermanentEmployee?
    
    // 2. Jadi apakah tujuan membuat argument bertipe Payable pada method
    // pay() yang ada di dalam class Owner?


    // Coba pada baris terakhir method main() yang ada di dalam class
    // Tester4 ditambahkan perintah ow.pay(iEmp); Mengapa terjadi error?


    // 4. Perhatikan class Owner, diperlukan untuk apakah sintaks p
    // instanceof ElectricityBill pada baris ke-6 ?
    // Sintaks p instanceof ElectricityBill pada baris ke-6 diperlukan untuk mengecek apakah objek yang diisi ke dalam variabel p merupakan objek dari kelas ElectricityBill atau bukan 

    // 5. Perhatikan kembali class Owner baris ke-7, untuk apakah casting objek
    // disana (ElectricityBill eb = (ElectricityBill) p)
    // diperlukan ? Mengapa objek p yang bertipe Payable harus di-casting ke
    // dalam objek eb yang bertipe ElectricityBill ?
    // Casting objek disana diperlukan agar variabel eb dapat mengakses method 

}
