package net.classroom.javaBasics;

/**
 * Introduction to arrays
 * @author Peter Geertsema
 */
public class Arrays {
    public static void main(String[] args) {
        //create a new array of integers of size 6
        int[] arr = new int[6];
        //arrays are zero-based indexed, just like strings
        arr[0] = 5;
        arr[1] = 16;
        arr[2] = -6;
        arr[3] = 14;
        arr[4] = 15;
        arr[5] = 17;
        //now set the 3, 4, and 5 indices to an integer


        //print the third element (index 2) of the array
        System.out.println("Third element: " + arr[2]);

        //now, using a for loop, print out every element of arr to the console
 for(int i =0; i < 6; i++) {
    System.out.println("this is the " + i + "th array value : " + arr[i]);

        }
    }
}
