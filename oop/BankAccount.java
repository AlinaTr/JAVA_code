package oop;

public class BankAccount {
    // program files = definim logica unui cont bancar
    // oop = object oriented programming
    // poo = programare orientata pe obiecte

    // o clasa = este un  tip nou
    // este definitia unui concept
    // reteta la paste carbonara, ADN-ul uman
    // ex: clasa Car

    // un obiect = instanta unei clase (implementarea clasei)
    // un obiect - paste carbonara
    // ex: obiect de tip Car, pot sa am cate obiecte de tip car vreau

    // fields = proprietati = atribute
    // variabile
    // ex: culoare, marca, model, consum, pret, esteOprita

    // metode - actiuni ce pot fi facute de obiecte
    // functii
    // ex: accelereaza(), franeaza(), deschide usa(), vopsire()

    // proprietati, atribute, fields
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 7777;
    int incercari_activare = 0;


    // constructor = are rolul de a impune date de start
    // ca si * din formulare, required fields

    public BankAccount(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }

    // metode = sunt actiunile clasei
    public void interogare_sold() {
        System.out.println("Titular " + this.titularCont);
        System.out.println("IBAN " + this.iban);
        System.out.println("Sold " + this.sold);
        System.out.println("Activ " + this.activ);
        System.out.println("Nr de incercari gresite " + this.incercari_activare);
        System.out.println("================================");
    }

    public void accountActivation(int pinUtilizator) {
        // modifica activ in True doar daca pinul e corect
        System.out.println("Buna " + this.titularCont);
        if (pinUtilizator == this.pin) {
            System.out.println("Card activat cu success");
            this.activ = true;
        } else {
            System.out.println("PIN gresit");
            this.incercari_activare++; // incrementeaza
        }
    }
    public void aliemntareCont(double suma_depusa) {
        // la ce aveam in cont (this.sold) se mai adauga suma depusa
        this.sold = this.sold + suma_depusa;
        System.out.println("Buna " + this.titularCont);
        System.out.println("Ati depus cu succes suma de " + suma_depusa + ". Aveti in cont suma de: " + this.sold);
    }

    public void debitareCont(double suma_cheltuita) {
        System.out.println("Buna " + this.titularCont);
        // pot sa cheltuiesc doar ce am
        // daca suma cheltiuita este <= sold
        if (suma_cheltuita <= this.sold) {
            // dispar banii din cont
            this.sold = this.sold - suma_cheltuita;
            System.out.println("Ai cheltuit " + suma_cheltuita);
            System.out.println("Mai ai " + this.sold);
        } else {
            System.out.println("Fonduri insuficiente!");
        }


    }
}
