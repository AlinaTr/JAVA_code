import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Lists {
    public static void main(String[] args) {
     // ordered
        // declaram o lista goala
       List<String> fructe = new ArrayList<>();
       // facem importuri
        // au o dimensiune dinamica

        // adugam elemnte in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        // cum se iau elemente
        System.out.println(fructe.get(0)); // mar
//        System.out.println(fructe.get(4)); // eroare

        // cum se afla indexul unui el
        System.out.println(fructe.indexOf("banana")); // => 1

        // este lista goala?
        System.out.println(fructe.isEmpty()); // => false

        // eliminam toate el din lista
//        fructe.clear();

        // scoatem un element
        fructe.remove("mar");

        //aflam dimensiunea listei
        System.out.println(fructe.size()); // => 2 (pt ca am sters mar)

        //listam elementele:
        System.out.println(fructe);


        if (!fructe.isEmpty()) { // daca NU este goala lista
            System.out.println("Avem ce manca");
        } else {
            System.out.println("Nu avem ce manca!");
        }

        // declaram o lista imutabila si o initializam cu valori
        List<Integer> numere = Arrays.asList(new Integer[]{1, 33, 77});
//        numere.add(99); // eroare- nu mai putem adauga
        System.out.println(numere);

        // declaram o lista dinamica
        String[] flowers = {"Ageratum", "Allium", "Poppy", "Catmint"};
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));
        flowerList.add("Rose");
        System.out.println(Arrays.toString(flowerList.toArray()));

        // aflam unde este Poppy
        int poppy_index = flowerList.indexOf("Poppy");
        // stergem ce este in acea pozitie
        flowerList.remove(poppy_index);

        // scoatem in functie de valoare
        flowerList.remove("Catmint");
        System.out.println(Arrays.toString(flowerList.toArray()));
        System.out.println(flowerList);
        // System.out.println(flowers); // [Ljava.lang.String;@15aeb7ab
    }
}

