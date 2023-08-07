import java.util.HashMap;
import java.util.Map;


public class Maps {
    public static void main(String[] args) {
        // map = reprezentare date in sistem cheie:valoare
        // ex: Gigel are nota 10, Costel are nota 9
        // unordered (neordonate)

        //  declaram un map
        Map<String,Integer> note_elevi=new HashMap<>();

        // adaugam elemente
        note_elevi.put("Gigel", 10);
        note_elevi.put("Costel", 9);
        note_elevi.put("Ana", 10);

        // aflu notele
        System.out.println("Ana are nota " + note_elevi.get("Ana"));

        // suprascriere- actualizam valori
        note_elevi.replace("Costel", 10);
        System.out.println("Costel si-a marit nota la " + note_elevi.get("Costel"));

        // aflam dimensiunea
        System.out.println(note_elevi.size());

        //stergem valori
        note_elevi.remove("Gigel");
        System.out.println(note_elevi.size());
        System.out.println(note_elevi.get("Gigel")); // null

        // declaram si initializam cu valori
        Map<String,Integer> luni=new HashMap<>()
        {{
            put("Jan",1);
            put("Feb",2);
            put("March",3);
        }};
        System.out.println(luni);
    }
}

