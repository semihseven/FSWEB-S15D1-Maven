package org.example.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Grocery {

    public static ArrayList<String> groceryList = new ArrayList<String>();

    public void startGrocery() {
        Scanner scanner = new Scanner(System.in);
        boolean appRunning = true;




        while (appRunning) {

            System.out.println("Sepetiniz için bir komut giriniz.");
            System.out.println("[0] Çıkış yap");
            System.out.println("[1] Ürün ekle");
            System.out.println("[2] Ürün çıkar");

            int user = scanner.nextInt();
            scanner.nextLine();

            switch (user) {
                case 0:
                    System.out.println("Çıkış yapılıyor.");
                    appRunning = false;
                    break;
                case 1:
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    String input2 = scanner.nextLine();
                    addItems(input2);
                    printSorted();
                    break;
                case 2:
                    System.out.println("Çıkarılmasını istediğiniz elemanları giriniz.");
                    String input = scanner.nextLine();
                    removeItems(input);
                    printSorted();
                    break;
                default:
                    System.out.println("Hatalı tuşlama");
            }
        }
    }

    public static void addItems(String input) {
        String[] items = input.split(",");

        for(String item:items){
            if (!checkItemIsInList(item)) {
                groceryList.add(item);
            }
        }
        Collections.sort(groceryList);
    }

    public static void removeItems(String input) {
        String[] items = input.split(",");
        for(String item:items){
            if (checkItemIsInList(item)) {
                groceryList.remove(item);
            }
        }
        Collections.sort(groceryList);
    }

    public static boolean checkItemIsInList(String product) {
        return groceryList.contains(product);
    }

    public static void printSorted(){
        Collections.sort(groceryList);
        System.out.println("Grocery list: " + groceryList);
    }


}



