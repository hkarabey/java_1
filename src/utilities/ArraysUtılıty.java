package utilities;

import java.util.Arrays;

public class ArraysUtılıty {


    //print each integer of an ınteger array in seperate lines
    public static void printEach(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            System.out.println(n);
        }
    }

    //print each double of an double array in seperate lines
    public static void printEach(double[] array) {
        for (int i = 0; i < array.length; i++) {
            double n = array[i];
            System.out.println(n);
        }
    }

    //print each String of an String array in seperate lines
    public static void printEach(String[] array) {
        for (int i = 0; i < array.length; i++) {
            String n = array[i];
            System.out.println(n);
        }
    }

    //print each char of an char array in seperate lines
    public static void printEach(char[] array) {
        for (int i = 0; i < array.length; i++) {
            char n = array[i];
            System.out.println(n);
        }
    }

    //return max number for int array
    public static int maxNumberr(int[] array) {
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    //return max number for double array
    public static double maxNumberr(double[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    //return min number for int array
    public static int minNumber(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    //return min number for double array
    public static double minNumber(double[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    //check if integer element is contaıns.return boolean
    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                result = true;
            }

        }
        return result;
    }

    //check if double element is contaıns.return boolean
    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                result = true;
            }

        }
        return result;
    }

    //check if char element is contaıns.return boolean
    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                result = true;
            }

        }
        return result;
    }

    //check if String element is contaıns.return boolean
    public static boolean contains(String[] array, String element) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(element)) {
                result = true;
            }

        }
        return result;
    }

    //add the given element to retuns a new array
    public static int[] addElements(int[]arr, int element){
        int[] newArray=new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i]=arr[i];
        }newArray[newArray.length-1]=element;
        return newArray;
    }

    //add the given element to retuns a new array
    public static double[] addElements(double[]arr, double element){
        double[] newArray=new double[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i]=arr[i];
        }newArray[newArray.length-1]=element;
        return newArray;
    }

    //add the given element to retuns a new array
    public static String[] addElements(String[]arr, String element){
        String [] newArray=new String[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i]=arr[i];
        }newArray[newArray.length-1]=element;
        return newArray;
    }

    //add the given element to retuns a new array
    public static char[] addElements(char[]arr, char element){
        char[] newArray=new char[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i]=arr[i];
        }newArray[newArray.length-1]=element;
        return newArray;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[]arr,int elements){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==elements){
                count++;
            }

        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[]arr,double elements){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==elements){
                count++;
            }

        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[]arr,String elements){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(elements)){
                count++;
            }

        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[]arr,char elements){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==elements){
                count++;
            }

        }
        return count;
    }

    //returns the unique elements of the array as a array
    public static int[] unique(int[] arr) {
        int[] result = {};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if (count == 1) {
                result = ArraysUtılıty.addElements(result, arr[i]);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a array
    public static double[] unique(double[] arr) {
        double[] result = {};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if (count == 1) {
                result = ArraysUtılıty.addElements(result, arr[i]);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a array
    public static char[] unique(char[]arr){
        char[] result={};
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }

            }
            if (count==1){
                result=ArraysUtılıty.addElements(result,arr[i]);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a array
    public static String[] unique(String[]arr){
        String[] result={};
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }

            }
            if (count==1){
                result=ArraysUtılıty.addElements(result,arr[i]);
            }
        }
        return result;
    }

    //remove elements from array to NEW ARRAY
    public static int[] removeElements(int[]arr,int elements){

        if(elements<=0||elements> arr.length-1){
            System.out.println("invalid index");
            System.exit(0);
        }
        int[]newArray=new int[arr.length-1];
        int j=0;
        for (int i = 0; i < arr.length; i++) {

            if (elements==i){
                continue;
            }
            newArray[j]=arr[i];
            j++;
        }
        return newArray;
    }

    //remove elements from array to NEW ARRAY
    public static double[] removeElements(double[]arr,int elements){

        if(elements<=0||elements> arr.length-1){
            System.out.println("invalid index");
            System.exit(0);
        }
        double[]newArray=new double[arr.length-1];
        int j=0;
        for (int i = 0; i < arr.length; i++) {

            if (elements==i){
                continue;
            }
            newArray[j]=arr[i];
            j++;
        }
        return newArray;
    }

    //remove elements from array to NEW ARRAY
    public static String[] removeElements(String[]arr,int elements){

        if(elements<=0||elements> arr.length-1){
            System.out.println("invalid index");
            System.exit(0);
        }
        String[]newArray=new String[arr.length-1];
        int j=0;
        for (int i = 0; i < arr.length; i++) {

            if (elements==i){
                continue;
            }
            newArray[j]=arr[i];
            j++;
        }
        return newArray;
    }

    //remove elements from array to NEW ARRAY
    public static char[] removeElements(char[]arr,int elements){

        if(elements<=0||elements> arr.length-1){
            System.out.println("invalid index");
            System.exit(0);
        }
        char[]newArray=new char[arr.length-1];
        int j=0;
        for (int i = 0; i < arr.length; i++) {

            if (elements==i){
                continue;
            }
            newArray[j]=arr[i];
            j++;
        }
        return newArray;
    }

    //merge the given two arrays and return new array
    public static int[] mergeArray(int[]arr1,int[]arr2){
        int[]newArray= new int[arr1.length+arr2.length];
        int j=0;
        for (int i = 0; i < arr1.length; i++) {
            newArray[j]=arr1[i];
            j++;
        }
        for (int i = 0; i < arr2.length; i++) {
            newArray[j]=arr2[i];
            j++;
        }

        return newArray;
    }

    //merge the given two arrays and return new array
    public static double[] mergeArray(double[]arr1,double[]arr2){
        double[]newArray= new double[arr1.length+arr2.length];
        int j=0;
        for (int i = 0; i < arr1.length; i++) {
            newArray[j]=arr1[i];
            j++;
        }
        for (int i = 0; i < arr2.length; i++) {
            newArray[j]=arr2[i];
            j++;
        }

        return newArray;
    }

    //merge the given two arrays and return new array
    public static String[] mergeArray(String[]arr1,String[]arr2){
        String[]newArray= new String[arr1.length+arr2.length];
        int j=0;
        for (int i = 0; i < arr1.length; i++) {
            newArray[j]=arr1[i];
            j++;
        }
        for (int i = 0; i < arr2.length; i++) {
            newArray[j]=arr2[i];
            j++;
        }

        return newArray;
    }

    //merge the given two arrays and return new array
    public static char[] mergeArray(char[]arr1,char[]arr2){
        char[]newArray= new char[arr1.length+arr2.length];
        int j=0;
        for (int i = 0; i < arr1.length; i++) {
            newArray[j]=arr1[i];
            j++;
        }
        for (int i = 0; i < arr2.length; i++) {
            newArray[j]=arr2[i];
            j++;
        }

        return newArray;
    }

    //reverse array to array
    public static int[] reverse ( int[] arr){
        int[] newArray = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            newArray[j++] = arr[i];

        }
        return newArray;
    }

    //reverse array to array
    public static double[] reverse ( double[] arr){
        double[] newArray = new double[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            newArray[j++] = arr[i];

        }
        return newArray;
    }

    //reverse array to array
    public static char[] reverse ( char[] arr){
        char[] newArray = new char[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            newArray[j++] = arr[i];

        }
        return newArray;
    }

    //reverse array to array
    public static String[] reverse ( String[] arr){
        String[] newArray = new String[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            newArray[j++] = arr[i];

        }
        return newArray;
    }

    //replace only one element
    public static int[] replace(int[] arr, int index, int element) {

        int[] newArray = new int[arr.length];

        int j = 0;
        for (int i = 0; i < arr.length; i++, j++) {
            if (index < 0 || index > arr.length) {
                System.exit(0);
            }
            if (i == index) {
                newArray[j] = element;
            } else {
                newArray[j] = arr[i];
            }
        }
        return newArray;
    }

    //replace only one element
    public static double[] replace(double[] arr, int index, double element) {

        double[] newArray = new double[arr.length];

        int j = 0;
        for (int i = 0; i < arr.length; i++, j++) {
            if (index < 0 || index > arr.length) {
                System.exit(0);
            }
            if (i == index) {
                newArray[j] = element;
            } else {
                newArray[j] = arr[i];
            }
        }
        return newArray;
    }

    //replace only one element
    public static char[] replace(char[] arr, int index, char element) {

        char[] newArray = new char[arr.length];

        int j = 0;
        for (int i = 0; i < arr.length; i++, j++) {
            if (index < 0 || index > arr.length) {
                System.exit(0);
            }
            if (i == index) {
                newArray[j] = element;
            } else {
                newArray[j] = arr[i];
            }
        }
        return newArray;
    }

    //replace only one element
    public static String[] replace(String[] arr, int index, String element) {

        String[] newArray = new String[arr.length];

        int j = 0;
        for (int i = 0; i < arr.length; i++, j++) {
            if (index < 0 || index > arr.length) {
                System.exit(0);
            }
            if (i == index) {
                newArray[j]= element;
            } else {
                newArray[j] = arr[i];
            }
        }
        return newArray;
    }

    // replace all elements if elements = choosing elements
    public static int[] replaceAll(int[]arr, int element, int elementNew){

        int[]newArray=new int[arr.length];

        int j=0;
        for (int i = 0; i < arr.length; i++,j++) {
            if (element==arr[i]){
                newArray[j]=elementNew;
            }
            else {newArray[j]=arr[i];
            }
        }
        return newArray;
    }

    // replace all elements if elements = choosing elements
    public static double[] replaceAll(double[]arr, double element, double elementNew){

        double[] newArray=new double[arr.length];

        int j=0;
        for (int i = 0; i < arr.length; i++,j++) {
            if (element==arr[i]){
                newArray[j]=elementNew;
            }
            else {newArray[j]=arr[i];
            }
        }
        return newArray;
    }

    // replace all elements if elements = choosing elements
    public static char[] replaceAll(char[]arr, char element, char elementNew){

        char[]newArray=new char[arr.length];

        int j=0;
        for (int i = 0; i < arr.length; i++,j++) {
            if (element==arr[i]){
                newArray[j]=elementNew;
            }
            else {newArray[j]=arr[i];
            }
        }
        return newArray;
    }

    // replace all elements if elements = choosing elements
    public static String[] replaceAll(String[]arr, String element, String elementNew){

        String[]newArray=new String[arr.length];

        int j=0;
        for (int i = 0; i < arr.length; i++,j++) {
            if (element.equals(arr[i])){
                newArray[j]=elementNew;
            }
            else {newArray[j]=arr[i];
            }
        }
        return newArray;
    }

    //removeDuplicate
    public static int[] removeDuplicates(int[]arr){

        int[] newArray={};

        for (int i = 0; i < arr.length; i++) {

            if (ArraysUtılıty.contains(newArray,arr[i])){
                continue;
            }
            newArray=ArraysUtılıty.addElements(newArray,arr[i]);
        }

        return newArray;
    }

    //removeDuplicate
    public static double[] removeDuplicates(double[]arr){

        double[] newArray={};

        for (int i = 0; i < arr.length; i++) {

            if (ArraysUtılıty.contains(newArray,arr[i])){
                continue;
            }
            newArray=ArraysUtılıty.addElements(newArray,arr[i]);
        }

        return newArray;
    }

    //removeDuplicate
    public static char[] removeDuplicates(char[]arr){

        char[] newArray={};

        for (int i = 0; i < arr.length; i++) {

            if (ArraysUtılıty.contains(newArray,arr[i])){
                continue;
            }
            newArray=ArraysUtılıty.addElements(newArray,arr[i]);
        }

        return newArray;
    }

    //removeDuplicate
    public static String[] removeDuplicates(String[]arr){

        String[] newArray={};

        for (int i = 0; i < arr.length; i++) {

            if (ArraysUtılıty.contains(newArray,arr[i])){
                continue;
            }
            newArray=ArraysUtılıty.addElements(newArray,arr[i]);
        }

        return newArray;
    }



}
