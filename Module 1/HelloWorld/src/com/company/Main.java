package com.company;
import java.util.Scanner;
import java.io.File;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
    }
        }


/*
    public static int[] getArrayInput(int size, Scanner scanner) {
        int[] inputarray = new int[size];
        for (int i = 0; i < size; i++) {
            inputarray[i] = scanner.nextInt();
        }
        return inputarray;
    }

    public static int[] mergeBothInDescendingOrder(int a[], int b[])
    {
        int i = 0, j = 0, k = 0;
        int[] c = new int[a.length+b.length];
        // Traverse both array
        while (i<a.length && j <b.length)
        {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (a[i] > b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }

        // Store remaining elements of first array
        while (i < a.length)
            c[k++] = a[i++];

        // Store remaining elements of second array
        while (j < b.length)
            c[k++] = b[j++];
        return c;
    }
}
/*
    public static int[] sort(int[] randomNumbers) {
        return mergeSort(randomNumbers, 0, randomNumbers.length - 1);
    }

    public static int[] mergeSort(int[] numbers, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergeSort(numbers, first, mid);
            mergeSort(numbers, mid + 1, last);

            merge(numbers, first, mid, last);
        }

        return numbers;
    }

    private static int[] merge(int[] numb, int start, int mid, int end) {
        int left = start; //inital index of first subarray
        int right = mid + 1; // initial index of second subarray
        int k = 0; // initial index of merged array
        int[] temp = new int[numb.length];
        while (left <= mid && right <= end) {
            if (numb[left] >= numb[right]) {
                temp[k] = numb[left];
                k++;
                left++;
            } else {
                temp[k] = numb[right];
                k++;
                right++;
            }
        }
        // Copy the remaining elements on left half , if there are any
        while (left <= mid) {
            temp[k] = numb[left];
            k++;
            left++;
        }
        // Copy the remaining elements on right half , if there are any
        while (right <= end) {
            temp[k] = numb[right];
            k++;
            right++;
        }
        // Copy the remaining elements from array t back the numbers array
        left = start;
        k = 0;
        while (left <= end) {
            numb[left] = temp[k];
            left++;
            k++;
        }
        return numb;

    }
}
/*
    public static int evenSum(int n) {
        if (n <= 1)
            return 0;

        else if (n % 2 == 0)
            return (n + evenSum(n - 1));
        else
            return evenSum(n - 1);
    }

    private static int evenSum1(int n) {
        return (n / 2) * (1 + n / 2);
    }

    public static int func( int n) {
        if (n == 1)
            return 0;
        else
            return 1 + func(n/2);
    }

    public static void factorial1(int n) {

        int factorial = 1;
        int index = 1;
        for (int i = 0; i <= Math.pow(n, n); i++) {
            if (i == factorial * index) {
                factorial = i;
                index += 1;
                if (index == n + 1) {
                    System.out.println(factorial);
                    break;
                }
            }
        }
    }

    public static void factorial2(int n) {
        int[] factorials = new int[n + 1];
        Arrays.fill(factorials, 1);
        for (int i = 0; i <= n - 1; i++) {
            factorials[i + 1] = (i + 1) * factorials[i];
        }
        System.out.println(factorials[n]);
    }

    public static void fun(int x){
        if(x>0){
            fun(x-1);
            System.out.print(x-1+" ");
            fun(x-1);
        }
    }

    public static int fun1(int a) {
        if (a % 2 == 1)
            return a++;
        else
            return fun1(fun1(a - 1));
    }

    public static int  fun2(int a, int b) {
        if (b == 0)
            return 0;
        if (b % 2 == 0)
            return fun2(a + a, b / 2);
        return fun2(a + a, b / 2) + a;
    }

    public static int fun3(int a) {
        if (a > 100)
            return a - 10;
        return fun3(fun3(a + 11));
    }
}
/*
    class Student {
        public int rollno;
        public String name;
        public double cgpa;

        public Student(int rollno, String name, double cgpa) {
            this.rollno = rollno;
            this.name = name;
            this.cgpa = cgpa;
        }

        // Declare constructor of 'Student' class here
        public void displayProfile() {
            System.out.println(rollno + " " + name + " " + cgpa);
        }

        public double findPercentage() {
            double percent = cgpa * 10;
            return percent;
        }
    }
*/
   /* static void fun2() throws IOException {
        fun3();
        System.out.print("D");
    }

    static void fun3() throws IOException {
        throw new IOException();
    }
    /*
    class Institute{
        private final String name;
        private final List<Student> students = new ArrayList<Student>();
        public int numberOfStudents = 1;

        public Institute(String name) {
            // complete this constructor
            this.name = name;
            // Instruction:
            // Set the instance variable name to the parameter variable name
        }

        public void addStudent(Student s) {
            // complete this method here
            students.add(s);
            // Instruction:
            // add student s to the instance variable: ArrayList<Student> students
        }

        public void addStudent(Student[] array) {
            // complete this method here
            for(Student a : array)
                students.add(a);
            // instruction:
            // add all the students in the Student[] array to
            // the instance variable: ArrayList<Student> students
        }

        public String toString() {
            // complete this method

            // Instruction:
            // 1. Loop through all the students stored in the instance variable: ArrayList<Student> students and return a String that contains the each name and roll number of each student
            // 2. An example String to be returned should look like:
            //    "Christ Academy: Vigyan 1, Vedanshi 2, Jahnvi 3, Abhiraj 4, "// notice the extra comma and space at the end
            System.out.print(name+": ");
            for(Student a: students)
                System.out.print(a.toString());
        }


    }

    class Student {
        private final String name;
        private final int rollNumber;
        private final Institute institute;

        public Student(String n, Institute institute) {
            this.name = n;
            this.institute = institute;
            this.rollNumber = this.institute.numberOfStudents++;
        }

        public String toString() {
            return this.name + " " + this.rollNumber;
        }
    }
    // Method to find the third maximum integer in the array
    static void thirdMaxInteger(int[] arr) {
        // Write your code here
        if(arr.length < 3)
        {
            System.out.println("The array doesn't have a third maximum element");
            return;
        }
        if(arr.length>0)
        {
            int firstMax = arr[0], secondMax = Integer.MIN_VALUE,
                    thirdMax = Integer.MIN_VALUE;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > firstMax) {
                    thirdMax = secondMax;
                    secondMax = firstMax;
                    firstMax = arr[i];
                }
                else if ((arr[i] > secondMax) && (arr[i]!=firstMax) ) {
                    thirdMax = secondMax;
                    secondMax = arr[i];
                }
                else if ((arr[i] > thirdMax) && (arr[i]!=firstMax) && (arr[i]!=secondMax)) {
                    thirdMax = arr[i];
                }
            }
            if(thirdMax != Integer.MIN_VALUE)
                System.out.println(thirdMax);
            else
                System.out.println("The array doesn't have a third maximum element");
            return;
        }

    }

    // Method to reverse the array
    static void moveZerosToEnd(int[] arr) {
        // Write your code here
        int count = 0;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];
        while (count < arr.length)
            arr[count++] = 0;

    }
 /*   public static void printList(List<Float> arr) {
        ListIterator<Float> it = arr.ListIterator(arr.size());
        while(it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }*/
 /*
    public static void printStudentList(LinkedList<Student> students) {
          for(Student s : students) {
             System.out.println(s.getDetails());
     //   System.out.println(students.get(1).getDetails());
           }
    }
}

class Student {
    private final String name;
    private final int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getDetails() {
        return
                "name = " + this.name + '\n' +
                        "roll number = " + this.rollNumber + '\n';
    }


    public static void printArray(ArrayList<Float> r) {

        //Complete the method declaration here
        for(Float elements: r)
        {
            System.out.println(elements);
        }
    }
    static void search(int[] arr, int k) {
        // Write your code
        for (int i : arr) {
            if (i == k)
                System.out.println("true");
            return;
        }
        System.out.println("false");
        return;
    }*/



