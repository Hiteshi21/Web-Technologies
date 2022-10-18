package Assignment3;

import java.util.Arrays;

public class SortStrings {

    public static String sortString(String s)
    {
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
         String ans=new String(arr);
        return ans;
    }

    public static void sortArrayOfStrings(String[] arr)
    {
        Arrays.sort(arr);
    }

    public static void main(String arg[])
    {
        String[] arr={"Hello","hi","bye","Hiteshi","garg"};

        sortArrayOfStrings(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        String str="Hiteshi";
        System.out.println(sortString(str));

    }

}
