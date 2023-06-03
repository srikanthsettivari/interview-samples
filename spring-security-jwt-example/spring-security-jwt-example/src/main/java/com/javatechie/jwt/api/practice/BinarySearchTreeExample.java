package com.javatechie.jwt.api.practice;

public class BinarySearchTreeExample {
    public static void main(String args[]) {
        int arr[] = { 9, 7, 3, 10, 43, 12, 78};
        System.out.println(binarySearch(arr, 3,43,10));
    }
    public static int binarySearch(int arr[], int low, int high, int key) {
        int mid = (low + high) / 2;

        while (low <= high) {
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] == key) {
                return mid;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }

        if (low > high) {
            return -1;
        }

        return -1;
    }
}
