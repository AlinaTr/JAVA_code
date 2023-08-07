public class WhileLoop {
    public static void main(String[] args) {
        // while-loop
        // zona de cod care se repeta atata timp cat o conditie este adevarata

        // masina merge cat timp are benzina
        int litri_benzina = 10;
        while (litri_benzina > 0) { // 10, 9, 8, 7 etc.
            // acceleram
            System.out.println("Vruum Vruum!");
            //scadem benzina
            litri_benzina = litri_benzina-1; // 2
            // aprindem beculetul cand avem <= 3 litri
            if (litri_benzina <= 3) {
                System.out.println("Se aprinde becul rosu!");
            }
        }
        System.out.println("STOP! Nu mai avem benzina");
    }
}
