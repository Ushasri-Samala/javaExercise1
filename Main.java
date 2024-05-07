package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String ch="Spartans3.0";
        char ch1[]=ch.toCharArray();
        toUpperCase(ch1);
    }
    public static void toUpperCase(char check[])
    {
        String str="";
        for (int i = 0; i < check.length; ++i) {
            if(Character.isLowerCase(check[i])&& Character.isAlphabetic(check[i]))
            {
                check[i]=(char) (check[i]-32);
            }
            str+=check[i];
        }
        System.out.println(str);
        }
    }
