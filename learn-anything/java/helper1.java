public class helper1{

    int id, noHP, noRek, saldo;
    String alamat, nama;
    float jmlhHutang;
    boolean statusAktif = true;

    public Nasabah (int id,String nama, String alamat, int noHP  ){
        id = id;
        nama = nama;
        alamat = alamat;
        noHP = noHP;

    }
    public int lihatSaldo (){
        if(statusAktif){
             return saldo;
        } else{
            return -1;
        }
    } 

    public int menabung(int deposit){
        if(statusAktif){
            if(deposit > 0){
                saldo += deposit;
            }
            

    }
    
}

public int tarikTunai (int jmlhTarik){
    if(statusAktif){
        if(jmlhTarik > 0 && jmlhTarik <= saldo){
            saldo -= jmlhTarik;
            return saldo;
        } else {
            return -1; // jumlah tarik saldo
        }
    } else{
        return -1; // rekening tidak aktif
    }
}
public void bukaRekening(){
    if(!statusAktif){
        noRek = generateRekeningNumber();
        statusAktif = true;
        
        

    }
}

public int tutupRekening(){
    if (statusAktif){
        noRek = 0;
        saldo = 0;
        jmlhHutang = 0;
        statusAktif = false;


    }

}
public int generateRekeningNumber(){
    return id = 1000;

    }
}