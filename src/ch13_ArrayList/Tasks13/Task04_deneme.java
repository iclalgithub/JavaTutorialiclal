package ch13_ArrayList.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task04_deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birden fazla isim giriniz");
        String giris = input.nextLine().toLowerCase();

        ArrayList<String> arr = new ArrayList<>(Arrays.asList(giris.split(",")));
        System.out.println("arr = " + arr);

        // Remove names containing 'a'
        ArrayList<String> namesToRemove = new ArrayList<>();
        for (String name : arr) {
            if (name.contains("a")) {
                namesToRemove.add(name);
            }
        }
        arr.removeAll(namesToRemove);

        System.out.println(arr);
    }
}