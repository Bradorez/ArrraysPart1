import java.util.Scanner;

public class Main
{
    //######## Part 2.1 #########
    public static int[] input_array(int length)
    {
        Scanner scan = new Scanner(System.in);
        int[] a = new int [length];
        System.out.println("please print array's values");
        for (int i = 0; i < length; i++)
        {
            System.out.println("print element number " + (i + 1));
            a[i] = scan.nextInt();
        }
        return a;
    }
    //######## Part 2.2 #########
    public static int[] create_array(int length)
    {
        int[] arr = new  int[length];
        for (int i = 0; i < length; i++)
        {
            arr[i] = (int)(Math.round(Math.random() * Math.random() * 100));
        }
        return arr;
    }
    //######## Part 2.3 #########
    public static void array_print(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    //###########
    public static int array_sum(int[] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum+=array[i];
        }
        return sum;
    }

    public static int largest_value_IN_array(int[] array)
    {
        int sum = -999;
        for (int i = 0; i < array.length; i++)
        {
            if (sum<array[i])
            {
                sum = array[i];
            }
        }
        return sum;
    }
    static void bubbleSort(int[] arr)
    {
        int buf = 0;
        for(int i=0; i < arr.length; i++)
        {
            System.out.println("Outer loop iteration " + (i + 1));
            array_print(arr);
            for(int j=1; j < (arr.length-i); j++)
            {
                if(arr[j-1] > arr[j])
                {
                    buf = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = buf;
                }
                System.out.println("Inner loop iteration " + (j + 1));
                array_print(arr);

            }
        }

    }
    public static void strange_function() //
    {
        int length = -1;
        int[] array;
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to type a length of array? if yes,print y or Y");
        String answer = scan.nextLine();
        answer = answer.toUpperCase();
        if (answer.equals("Y"))
        {
            System.out.println("Print length!");
            length = scan.nextInt();
            System.out.println("Do you want to type array's elements? if yes,print y or Y");
            answer = scan.nextLine();
            answer = scan.nextLine();
            answer = answer.toUpperCase();
            if (answer.equals("Y"))
            {
                array = input_array(length);
            }
            else
            {
                array = create_array(length);
            }

        }
        else
        {
            length = 10;
            array = create_array(length);
        }
        array_print(array);
        bubbleSort(array);
        array_print(array);
        System.out.println("do you want to repeat?");
        answer = scan.nextLine();
        answer = scan.nextLine();
        answer = answer.toUpperCase();
        if (answer.equals("Y"))
        {
            strange_function();
        }



    }

    public static void main(String[] args)
    {
        strange_function();


    }
}