public class VariableArgs {

    public static void main(String[] args) {

        printNumbers(1, 2, 3, 4, 23, 1, 6); // varArgs

        differentTypes("Karla", 2, 4, 5, 6);
        differentTypes("Luis", 2, 4, 2 ,89, 35, 6);

        printStrings("AS", "WW", "XX", "TT");

    }


    // varArgs receive any number of parameters
    // declare as type... this indicates it will create an array followed by the name of the array
    static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // it is permitted to pass, any parameter before the varArgs, but it must be at the beggining
    // the rest of the parameters will be considered as varArgs
    static void differentTypes(String name, int... numbers) {
        System.out.println(name);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }


    // also with other types
    private static void printStrings(String... stringsVarArgs) {
        for (String letters : stringsVarArgs) {
            System.out.print(letters + " ");
        }
        System.out.println();
    }

}
