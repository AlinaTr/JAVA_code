import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        /*
        Flow controls- if else
        evalueaza conditii si bifurca cod in functie de rezultat
        */

        System.out.println("turn on radio");
        // if I like the song, I turn up the volume
        boolean nice_song = true;
        if (nice_song == true) {
            System.out.println("turn up the volume");
            System.out.println("I start to sing");
        }
        System.out.println("turn off radio");

        // if else
        int nr = 4;
        if (nr % 2== 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }

        if (nr > 0) {
            System.out.println("pozitiv");
        } else {
            System.out.println("negativ");
        }
// if, else if, else
        // luam date de la tastatura
        Scanner sc = new Scanner(System.in);
//        System.out.println("Introdu ora: ");
//        int ora = sc.nextInt();
//        if (ora < 0) {
//            System.out.println("ora invalida!");
//        } else if (ora <= 11) {
//            System.out.println("neata!");
//        } else if (ora <= 18) {
//            System.out.println("buna ziua!");
//        } else if (ora <= 21) {
//        System.out.println("buna seara!");
//        } else if (ora <= 24) {
//            System.out.println("noapte buna!");
//        } else {
//            System.out.println("ora invalida!");
//        }

        // flow control
        // switch - se foloseste cand stim valorile posibile

        System.out.println("alege optiunea");
        int optiunea = sc.nextInt();
        switch (optiunea) {
            case 0:
                System.out.println("meniu anterior");
                break;
            case 1:
                System.out.println("ro");
                break;
            case 2:
                System.out.println("engleza");
                 break;
            default:
                System.out.println("optiune invalida");
        }
    }
}
