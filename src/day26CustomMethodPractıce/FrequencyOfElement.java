package day26CustomMethodPractıce;

public class FrequencyOfElement {

    public static void main(String[] args) {
int[]arr={1,2,3,3,4,4,4,5,6,9};
int a=frequencyOfElement(arr,4);
        System.out.println(a);

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

}
