package com.company;

import java.util.Scanner;

public class Exceptionhandling {

    public static void main(String[] args) throws MyException {

        // Alle Exceptions in Java: https://docstore.mik.ua/orelly/java/exp/figs/je0401.gif

        int a = 5;
        int b = 0;
        String vergleich = "test";
        int ergebnis = 0;
/*
        // Exception abfangen, in diesem Fall eine ArithmeticException:
        try{
            ergebnis = a/b;
            System.out.println(ergebnis);
        } catch(ArithmeticException except) {
            System.out.println(except.getMessage() + " - Fehler");
            System.out.println("Ergebnis: " + except.getCause());
            //except.printStackTrace();
        } finally {
            if (ergebnis == 0) System.out.println("Ergebnis wurde nicht verändert...");  // Wird immer ausgeführt, auch wenn einee Exception aufgetreten ist.
        }
*/

        // Eigene Exception:
        Scanner scan = new Scanner(System.in);
        System.out.print("test-Eingabe: ");
        String eingabe = scan.next();
        if (eingabe.equals(vergleich)){
            System.out.println("Hurra, test-Test bestanden!");
        } else {
            throw new MyException();  // ohne try-Block muss die Methode um "throws MyException" erweitert werden, damit der darin erzeugte Fehler weiter geleitet wird
        }
/*
        //Beispiel mit ArrayIndexOutOfBoundsException:
        int[] myArray = {1,2,3,4,5};
        try{
            System.out.println(myArray[10]);
        } catch(ArrayIndexOutOfBoundsException except) {
            System.out.println(except.getMessage() + " - Fehler");
            System.out.println("Ergebnis: " + except.getCause());
            //except.printStackTrace();
        }

 */
    }
}

