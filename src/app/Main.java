package app;

import models.Product;
import sortering.BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static final int[] pricesIntArray = new int[5];
    private static final String[] namesStringArray = new String[5];
    private static final ArrayList<Product> arrayListObjectsWithIntVariable = new ArrayList<>();
    private static final ArrayList<Product> arrayListObjectsWithNameVariable = new ArrayList<>();

    public static void main(String[] args) {
        initStorage();
        System.out.println("BubbleSort of Int[]:");
        BubbleSort.bubbleSortIntArray(pricesIntArray);
        System.out.println(Arrays.toString(pricesIntArray));
        System.out.println();
        System.out.println("BubbleSort of String[]:");
        BubbleSort.bubbleSortStringArray(namesStringArray);
        System.out.println(Arrays.toString(namesStringArray));
        System.out.println();
        System.out.println("BubbleSort of ArrayList<Product> with int variable, according to int variable:");
        BubbleSort.bubbleSortArrayListWithInt(arrayListObjectsWithIntVariable);
        for (int i = 0; i < arrayListObjectsWithIntVariable.size(); i++) {
            if (i < 1) {
                System.out.print(arrayListObjectsWithIntVariable.get(i).getInt());
            } else {
                System.out.print(", " + arrayListObjectsWithIntVariable.get(i).getInt());
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("BubbleSort of ArrayList<Product> with name, in alphabetical order:");
        BubbleSort.bubbleSortArrayListWithNames(arrayListObjectsWithNameVariable);
        for (int i = 0; i < arrayListObjectsWithNameVariable.size(); i++) {
            if (i < 1) {
                System.out.print(arrayListObjectsWithNameVariable.get(i).getName());
            } else {
                System.out.print(", " + arrayListObjectsWithNameVariable.get(i).getName());
            }
        }
        System.out.println();
    }

    public static void initStorage() {
//        Making objects
        Product aProdukt = new Product("aProdukt", 100);
        Product bProdukt = new Product("bProdukt", 200);
        Product cProdukt = new Product("cProdukt", 300);
        Product dProdukt = new Product("dProdukt", 400);
        Product eProdukt = new Product("eProdukt", 500);

//        Prices set into an int[]
        pricesIntArray[0] = aProdukt.getInt();
        pricesIntArray[1] = bProdukt.getInt();
        pricesIntArray[2] = cProdukt.getInt();
        pricesIntArray[3] = dProdukt.getInt();
        pricesIntArray[4] = eProdukt.getInt();

//        Names set into a String[]
        namesStringArray[0] = aProdukt.getName();
        namesStringArray[1] = bProdukt.getName();
        namesStringArray[2] = cProdukt.getName();
        namesStringArray[3] = dProdukt.getName();
        namesStringArray[4] = eProdukt.getName();

//        Prices set into an ArrayList<Product> with int variable
        arrayListObjectsWithIntVariable.add(aProdukt);
        arrayListObjectsWithIntVariable.add(bProdukt);
        arrayListObjectsWithIntVariable.add(cProdukt);
        arrayListObjectsWithIntVariable.add(dProdukt);
        arrayListObjectsWithIntVariable.add(eProdukt);

//        Prices set into an ArrayList<Product> with String variable
        arrayListObjectsWithNameVariable.add(aProdukt);
        arrayListObjectsWithNameVariable.add(bProdukt);
        arrayListObjectsWithNameVariable.add(cProdukt);
        arrayListObjectsWithNameVariable.add(dProdukt);
        arrayListObjectsWithNameVariable.add(eProdukt);

    }
}
