import java.sql.SQLOutput;
import java.util.*;

/*
Crear un programa en Java que realice lo siguiente:

Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
Utilizar un objeto HashMap para almacenar los pares de palabras.
Escoger al azar 5 palabras en español del mini diccionario.
Pedir al usuario que teclee la traducción al inglés de cada una de las palabras y comprobará si son correctas.
 */

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> diccionario = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String palabra;
        int puntuacion = 0;

        diccionario.put("Hola", "Hello");
        diccionario.put("Adios", "GoodBye");
        diccionario.put("Como estas", "How are you");
        diccionario.put("Si", "Yes");
        diccionario.put("Dar", "Give");
        diccionario.put("Olvidar", "Forget");
        diccionario.put("Triste", "Sad");
        diccionario.put("Feliz", "Happy");
        diccionario.put("Soleado", "Sunny");
        diccionario.put("Azul", "Blue");
        diccionario.put("Rojo", "Red");
        diccionario.put("Negro", "Black");
        diccionario.put("Amarillo", "Yellow");
        diccionario.put("Caliente", "Hot");
        diccionario.put("Helado", "Ice Cream");
        diccionario.put("Almohada", "Pillow");
        diccionario.put("Recamara", "Bedroom");
        diccionario.put("Jardin", "Garden");
        diccionario.put("Lunes", "Monday");
        diccionario.put("Musica", "Music");

        List<String> claves = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(claves);

        String palabra1 = claves.get(0);
        System.out.println("Traduzca la siguiente palabra: " + palabra1);
        palabra = scanner.nextLine();
        if(palabra.equalsIgnoreCase(diccionario.get(palabra1))){
            System.out.println("En hora buena");
            puntuacion++;
            palabra = "";
        }else{
            System.out.println("Has fallado la palabra es: " + diccionario.get(palabra1));
        }

        String palabra2 = claves.get(1);
        System.out.println("Traduzca la siguiente palabra: " + palabra2);
        palabra = scanner.nextLine();
        if(palabra.equalsIgnoreCase(diccionario.get(palabra2))){
            System.out.println("En hora buena");
            puntuacion++;
            palabra = "";
        }else{
            System.out.println("Has fallado la palabra es: " + diccionario.get(palabra2));
        }

        String palabra3 = claves.get(2);
        System.out.println("Traduzca la siguiente palabra: " + palabra3);
        palabra = scanner.nextLine();
        if(palabra.equalsIgnoreCase(diccionario.get(palabra3))){
            System.out.println("En hora buena");
            puntuacion++;
            palabra = "";
        }else{
            System.out.println("Has fallado la palabra es: " + diccionario.get(palabra3));
        }

        String palabra4 = claves.get(3);
        System.out.println("Traduzca la siguiente palabra: " + palabra4);
        palabra = scanner.nextLine();
        if(palabra.equalsIgnoreCase(diccionario.get(palabra4))){
            System.out.println("En hora buena");
            puntuacion++;
            palabra = "";
        }else{
            System.out.println("Has fallado la palabra es: " + diccionario.get(palabra4));
        }

        String palabra5 = claves.get(4);
        System.out.println("Traduzca la siguiente palabra: " + palabra5);
        palabra = scanner.nextLine();
        if(palabra.equalsIgnoreCase(diccionario.get(palabra5))){
            System.out.println("En hora buena");
            puntuacion++;
            palabra = "";
        }else{
            System.out.println("Has fallado la palabra es: " + diccionario.get(palabra5));
        }

        System.out.println("Has acertado: " + puntuacion + " de 5");

    }// main

} // class