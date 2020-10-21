package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTester {
    public static void main(String[] args) {    // ...args) throws Exception {  wäre eine quick and dirty-Variante um "File not Found" abzufangen, statt einen try-catch-Block zu schreiben
        try{
            BufferedReader bf = new BufferedReader(new FileReader("daten.dat"));
        } catch (FileNotFoundException fnf){
            // ...
        }
    }
}
