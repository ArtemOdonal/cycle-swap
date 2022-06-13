package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
       if (array.length != 0) {
           int x = array[array.length - 1], i;
           for (i = array.length - 1; i > 0; i--)
               array[i] = array[i - 1];
           array[0] = x;
       }

    }

    static void cycleSwap(int[] array, int shift) {

       if (array.length != 0){
           if (shift > array.length) {
               shift = shift % array.length;
           }
           int[] tempArray = new int[array.length];
           System.arraycopy(array, array.length - shift, tempArray, 0, shift);

           for (int i = 0; i < array.length - shift; i++) {
               tempArray[shift + i] = array[i];
           }
           System.arraycopy(tempArray, 0, array, 0, tempArray.length);
       }

    }
}
