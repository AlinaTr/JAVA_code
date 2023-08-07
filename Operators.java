/*
Operators:
Arithmetic operators: +, -, *, /, %
Comparison operators: < >, ==, !=. >=, <=
Logical operators: &&, ||, ! (not: se inverseaza raspunsul)
*/

public class Operators {
    public static void main(String[] args) {
        int a = 3; // o declarare && initializare
        int b = 5;
        a = b; // suprascriere

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(10 % b);
        System.out.println(11 % b);

        System.out.println(12 > b); // true
        System.out.println(5 > b); // false
        System.out.println(5 >= b); // true
        System.out.println(a - 1 >= b); // false
        System.out.println(a != b); // false
        System.out.println(a == b); // true

        System.out.println(7 > b && 8 > b); // 7 > 5? and 8 > 5? => true
        System.out.println(7 > b && 3 > b); // 7 > 5? and 3 > 5? => false
        System.out.println(7 > b || 3 > b); // 7 > 5? or 3 > 5? => true
        System.out.println(7 > b && (8 > b || 3 > b)); // 7 > 5? and 8 > 5 or 3 > 5? => true
        System.out.println(7 > b && (2 > b || 3 > b)); // true && false => false
        System.out.println(7 > b || (2 > b || 3 > b)); // true || false => true
        System.out.println(!(7>b)); // false

    }
}
