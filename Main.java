package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "spartans3.0";
       System.out.println(toUpperCase(s));
       System.out.println(tc1SingleCharacter());

        System.out.println(tc3EmptyString());
        System.out.println(tc4WithOneLowerCase());
        System.out.println(tc5WithOneUpperCase());
        System.out.println(tc6SpecialCharacters());
        System.out.println(tc7CharWithNUmber());
        System.out.println(tc8Numbers());
        System.out.println(tc9NumberCharacterSpecialChar());
        System.out.println(tc10CharSpacesAndNumbers());
        System.out.println(tc2Negative());
    }

    public static String toUpperCase(String s) {
        char check[] = s.toCharArray();
        String str = "";
        for (int i = 0; i < check.length; ++i) {
            if (Character.isLowerCase(check[i]) && Character.isAlphabetic(check[i])) {
                check[i] = (char) (check[i] - 32);
            }
            str += check[i];
        }
        return str;
    }

    public static boolean tc1SingleCharacter() {
        String input  = "a";
        String expected = "A";
        String res = toUpperCase(input);
        if(res.equals(expected)) {
            return true;
        }
        else{
            return false;
        }

    }

    public static boolean tc2Negative() {
        String input = null;
        String expected = null;
        String res = toUpperCase(input);
        if(res.equals(expected)) {
            return true;
        }
        else{
            return false;
        }

    }

    public static boolean tc3EmptyString() {
        String input = "";
        String expected = "";
        String res = toUpperCase(input);
        if(res.equals(expected)) {
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean tc4WithOneLowerCase() {
        String input = "sPARTANS";
        String expected = "SPARTANS";
        String res = toUpperCase(input);
        if(res.equals(expected)) {
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean tc5WithOneUpperCase() {
        String input = "Spartans";
        String expected = "SPARTANS";
        String res = toUpperCase(input);
        if(res.equals(expected)) {
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean tc6SpecialCharacters() {
        String input = "/*";
        String expected = "/*";
        String res = toUpperCase(input);
        if(res.equals(expected)) {
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean tc7CharWithNUmber() {
        String input = "spartans3.0";
        String expected = "SPARTANS3.0";
        String res = toUpperCase(input);
        if(res.equals(expected)) {
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean tc8Numbers() {
        String input = "2803";
        String expected = "2803";
        String res = toUpperCase(input);
        if(res.equals(expected)) {
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean tc9NumberCharacterSpecialChar() {
        String input = "SparTans@3.0";
        String expected = "SPARTANS@3.0";
        String res = toUpperCase(input);
        if(res.equals(expected)) {
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean tc10CharSpacesAndNumbers() {
        String input = "  spartans3.0  ";
        String expected = "  SPARTANS3.0  ";
        String res = toUpperCase(input);
        if(res.equals(expected)) {
            return true;
        }
        else{
            return false;
        }
    }

}
