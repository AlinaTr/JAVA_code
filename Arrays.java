public class Arrays {
    public static void main(String[] args) {
        // declarare si initializare cand stim valorile
        String[] elevi = {"Gigel", "Costel", "Mari", "Ela", "Ada"};
        int[] numere = {1, 33, 81, 99, 201};
        // contine mai multe elemente de acelasi tip
        // accesam elementele prin index, care incepe de la 0
        // are o dimensiune fixa
        // are proprietatea lenght care ne da dimensiunea array-ului

        System.out.println(elevi[2]); // Mari
        // System.out.println(elevi[11]); // eroare: Index 11 out of bounds for length 5
        elevi[2] = "Sebi";// suprascriere
        System.out.println(elevi[2]);
        System.out.println(elevi.length);

        // putem sa ne jucam cu valorile din spate
        System.out.println(elevi[0] + " " + elevi[1]);
        System.out.println(elevi.length + 5); // => 10

        // sa printam tot tompul ultimul element indiferent de marime
        System.out.println(elevi[elevi.length - 1]);

        // declarare si alocare de memorie (fara initializare)
        int[] note = new int[5]; // 0,0, 0,0, 0
        System.out.println(note[1]);
        note[0] = 10;
        note[1] = 9;
    }
}
