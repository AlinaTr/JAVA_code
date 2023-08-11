package oop;

public class BankAccountMain {
    public static void main(String[] args) {
        // desktop = definim logica unui program files

        // initializam obiecte de tip ContBancar
        // instante ale clasei ContBancar
        BankAccount cont1 = new BankAccount("Andy S", "RO001");
        BankAccount cont2 = new BankAccount("Crina S", "RO002");

        // apelam metoda description
//        cont1.description();
//        cont2.description();

        //activam conturile
        cont1.accountActivation(7777);
        cont2.accountActivation(3333);
        cont2.accountActivation(4444);
        cont2.accountActivation(7777);

        // alimentam contul
        cont1.aliemntareCont(300.50);
        cont2.aliemntareCont(700);
        cont2.aliemntareCont(300);

        // negative testing: cheltuim mai mult decat avem
        cont1.debitareCont(500); // nu se poate. Ma astept sa am 300.50 => pass

        // positive cu suma exacta
        cont1.debitareCont(300.50); // => 0 pass

        // postive de 2x
        cont2.debitareCont(100);
        cont2.debitareCont(200);// da => 700 pass

        cont1.interogare_sold();
        cont2.interogare_sold();
    }
}
