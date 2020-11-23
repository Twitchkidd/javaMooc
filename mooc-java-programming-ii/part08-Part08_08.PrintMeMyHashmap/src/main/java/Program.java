
import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        /*
         * public static void printKeys(HashMap<String,String> hashmap), prints all the
         * keys in the hashmap given as a parameter. public static void
         * printKeysWhere(HashMap<String,String> hashmap, String text) prints the keys
         * in the hashmap given as a parameter, which contain the string given as a
         * parameter. public static void printValuesOfKeysWhere(HashMap<String,String>
         * hashmap, String text), prints the values in the given hashmap whichs keys
         * contain the given string.
         */
    }

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }

}
