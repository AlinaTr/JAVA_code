public class Functions {

    // functie = logica delimitata care poate fi refolsita
    // nu putem folosi spatii in nume
    // nu putem defini o functie in alta functie (nu putem instala Firefox in Chrome)

    // o functie simpla care ne printeaza ceva pe ecran si nu returneaza nimic
    // nu are parametri
    public static void printGreeting() {
        System.out.println("Buna ziua! Bine ati venit!");
    }
    // o functie simpla care nsaluta clientul in fucntie de numele lui
    // nu ne da nici un raspuns
    //  are nevoie de parametri
    public static void printGreetingByName(String nume, String prenume) {
        System.out.println("Buna ziua " + nume + " " + prenume);
    }

    // o functie simpla care calculeaza media a 3 numere
    //  ne da  un raspuns - suma nr va avea return
    // ce tip de date va avea raspunsul? 3+5=8
    //  are nevoie de parametri
    public static double mediaNr(double a, double b, double c) {
        double media = (a + b + c )/ 3;
        return media;
    }

    // o functie simpla care ne da valoarea lui pi
    //  ne da  un raspuns? - da
    // ce tip de date va avea raspunsul? double
    //  are nevoie de parametri? nu

    public static double pivalue() {
        // contsnata = variabila care nu poate fi suprascrisa
        final double PI = 3.14;
        return PI;
    }

    public static void main(String[] args) {
        // intra client 1
        printGreeting();// se apeleaza functia

        // intra client 2
        printGreeting();

        // apelam o functoe cu param, ofering argumente
        printGreetingByName("Sinpetrean", "Andy");
        printGreetingByName("Sinpetrean", "Crina");
        printGreetingByName("Sinpetrean", "Ares");

        System.out.println( mediaNr(3, 3, 4));
        double media1 = mediaNr(31213, 213213, 312213);
        double media2 = mediaNr(35, 234, 3125);
        double media3 = mediaNr(33, 11, 43);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        System.out.println(pivalue());
        System.out.println(pivalue());
        System.out.println(pivalue());
    }
}
