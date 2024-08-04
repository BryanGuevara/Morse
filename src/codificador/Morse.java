package codificador;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Morse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] morseCode = {
            {"A", ".-"}, {"B", "-..."}, {"C", "-.-."}, {"D", "-.."}, {"E", "."},
            {"F", "..-."}, {"G", "--."}, {"H", "...."}, {"I", ".."}, {"J", ".---"},
            {"K", "-.-"}, {"L", ".-.."}, {"M", "--"}, {"N", "-."}, {"O", "---"},
            {"P", ".--."}, {"Q", "--.-"}, {"R", ".-."}, {"S", "..."}, {"T", "-"},
            {"U", "..-"}, {"V", "...-"}, {"W", ".--"}, {"X", "-..-"}, {"Y", "-.--"},
            {"Z", "--.."}, {"0", "-----"}, {"1", ".----"}, {"2", "..---"}, {"3", "...--"},
            {"4", "....-"}, {"5", "....."}, {"6", "-...."}, {"7", "--..."}, {"8", "---.."},
            {"9", "----."}, {".", ".-.-.-"}, {",", "--..--"}, {"?", "..--.."}, {"'", ".----."},
            {"!", "-.-.--"}, {"/", "-..-."}, {"(", "-.--."}, {")", "-.--.-"}, {"&", ".-..."},
            {";", "-.-.-."}, {":", "---..."}, {"=", "-...-"}, {"+", ".-.-."}, {"-", "-....-"},
            {"_", "..--.-"}, {"\"", ".-..-."}, {"@", ".--.-"}
        };

        Map<String, String> morseMap = new HashMap<>();
        for (String[] pair : morseCode) {
            morseMap.put(pair[0], pair[1]);
        }

        System.out.println("=================================================== <[Entrada]> ==================================================");
        System.out.print("Escriba la palabra a convertir: ");
        String frase = scan.nextLine();

        System.out.println("=================================================== <[Codificacion]> ===============================================");

        for (int i = 0; i < frase.length(); i++) {
            char character = frase.charAt(i);
            String charString = Character.toString(character).toUpperCase();

            if (morseMap.containsKey(charString)) {
                System.out.print(morseMap.get(charString));
            } else if (charString.equals(" ")) {
                System.out.print("/");
            }
        }
        System.out.println("");
        System.out.println("==================================================================================================================");
    }
}
