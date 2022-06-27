package LeetCode;

import java.util.Scanner;
/*
public class SortedArray {
    public static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int length){
        int[] array = new int[length];

        System.out.println("Enter " + length + " elements");
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    // write code
    public static void printArray(int[] array){

        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int temp;

        for (int i = 0; i < array.length - 1; i++ ){
            for (int j = i + 1; j < array.length; j++){

                if (array[j] < array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int[] bubbleSort(int[] array){
        int length = array.length;
        int midIndex = length / 2;

        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[length - midIndex];

        for (int i = 0; i < leftHalf.length; i++){
            leftHalf[i] = array[i];
        }

        for (int i = midIndex; i < rightHalf.length; i++){
            rightHalf[i - midIndex] = array[i];
        }

        bubbleSort(leftHalf);
        bubbleSort(rightHalf);

        //merge
        return merge(array,leftHalf, rightHalf);
    }

    public static int[] merge(int[] array, int[] leftArray, int[] rightArray){
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int l = 0, r = 0, j = 0;

        while (l < leftSize && r < rightSize){

            if(leftArray[l] <= rightArray[r]){
                array[j] = leftArray[l];
                l++;
            }
            else {
                array[j] = rightArray[r];
                r++;
            }
            j++;

            while(l < leftSize){
                array[j] = leftArray[l];
                l++;
                j++;
            }

            while(r < rightSize){
                array[j] = rightArray[r];
                j++;
                r++;
            }
        }
        return array;
    }

    public static int[] merge(int[] array, int length){

        int midIndex = length / 2;

        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[length - midIndex];

        for (int i = 0; i < leftHalf.length; i++){
            leftHalf[i] = array[i];
        }

        int currIndex = midIndex;
        for (int i = 0; i < rightHalf.length; i++){
            rightHalf[i] = array[currIndex];
            currIndex++;
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        int left = 0, right = 0, main = 0;

        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;


        while(left < leftLength && right < rightLength){

            if(leftHalf[left] <= rightHalf[right]){
                array[main] = leftHalf[left];
                left++;
            }
            if (rightHalf[right] < leftHalf[left]) {
                array[main] = rightHalf[right];
                right++;
            }
            main++;
        }

        while (left < leftLength){
            array[main] = leftHalf[left];
            left++;
            main++;
        }

        while (right < rightLength){
            array[main] = rightHalf[right];
            right++;
            main++;
        }

        return array;
    }



public static int[] mergeSort(int[] array){
    int length = array.length;
    int midIndex = length / 2;


}


    public static void main(String[] args){
        int[] array = {5,2,3,1,6,7,4};

        int[] sorted = mergeSort(array);



        for (int i = 0; i < sorted.length; i++){
            System.out.print(sorted[i] + " ");
        }

    }
}

 */
