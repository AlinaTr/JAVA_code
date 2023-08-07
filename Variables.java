public class Variables {
    public static void main(String[] args) {
        // declare and initialization
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

        // strongly typed =  we must specify the type of data

        System.out.println("I have purchased a car: " + marcaMasina);
        System.out.println("Model is: " + modelMasina);

        // suprascriere
        modelMasina = "XC 60 facelift";

        System.out.println("I have purchased a car: " + marcaMasina);
        System.out.println("Model is: " + modelMasina);

        // declare
        String ownerLastName;
        String ownerFirstName;
        // initialize
        ownerFirstName= "Andy";
        ownerLastName = "Sinpetrean";
        int age = 34;
        // concatenation
        System.out.println(ownerFirstName + " " + ownerLastName + " cu varsta de " + age);
    }
}
