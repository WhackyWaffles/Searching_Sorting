package sortering;

import models.Product;

import java.util.ArrayList;

public class BubbleSort {

//    BubbleSort af Arrays

    //    BubbleSort med Int[]
    public static void bubbleSortIntArray(int[] arrayToSort) {
        for (int outerIndex = 0; outerIndex < arrayToSort.length; outerIndex++) {
            for (int innerIndex = 0; innerIndex < arrayToSort.length - 1 - outerIndex; innerIndex++) {
                if (arrayToSort[innerIndex] > arrayToSort[innerIndex + 1]) {
                    int temp = arrayToSort[innerIndex];
                    arrayToSort[innerIndex] = arrayToSort[innerIndex + 1];
                    arrayToSort[innerIndex + 1] = temp;
                }
            }
        }
    }

    //    BubbleSort med String[]
    public static void bubbleSortStringArray(String[] arrayToSort) {
        for (int outerIndex = 0; outerIndex < arrayToSort.length; outerIndex++) {
            for (int innerIndex = 0; innerIndex < arrayToSort.length - 1 - outerIndex; innerIndex++) {
                if (arrayToSort[innerIndex].compareToIgnoreCase(arrayToSort[innerIndex + 1]) > 0) {
                    String temp = arrayToSort[innerIndex];
                    arrayToSort[innerIndex] = arrayToSort[innerIndex + 1];
                    arrayToSort[innerIndex + 1] = temp;
                }
            }
        }
    }



//    BubbleSort af ArrayLists

    //    BubbleSort med ArrayList af Objekter med tilgængelige Int variable
    public static void bubbleSortArrayListWithInt(ArrayList<Product> arrayToSort) {
        for (int outerIndex = 0; outerIndex < arrayToSort.size(); outerIndex++) {
            for (int innerIndex = 0; innerIndex < arrayToSort.size() - 1 - outerIndex; innerIndex++) {
                if (arrayToSort.get(innerIndex).getInt() > arrayToSort.get(innerIndex + 1).getInt()) {
                    Product temp = arrayToSort.get(innerIndex);
                    arrayToSort.set(innerIndex + 1, arrayToSort.get(innerIndex));
                    arrayToSort.set(innerIndex, temp);
                }
            }
        }
    }

    //    BubbleSort med ArrayList af Objekter med tilgængelige String variable
    public static void bubbleSortArrayListWithNames(ArrayList<Product> arrayToSort) {
        for (int outerIndex = 0; outerIndex < arrayToSort.size(); outerIndex++) {
            for (int innerIndex = 0; innerIndex < arrayToSort.size() - 1 - outerIndex; innerIndex++) {
                if (arrayToSort.get(innerIndex).getName().compareToIgnoreCase(arrayToSort.get(innerIndex + 1).getName()) > 0) {
                    Product temp = arrayToSort.get(innerIndex);
                    arrayToSort.set(innerIndex + 1, arrayToSort.get(innerIndex));
                    arrayToSort.set(innerIndex, temp);
                }
            }
        }
    }


}
