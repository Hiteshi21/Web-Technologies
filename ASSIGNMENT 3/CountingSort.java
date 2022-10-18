package Assignment3;

public class CountingSort {

    public static void countingSort(int[] arr)
    {
        int []freq=new int[21];
        for(int i=0;i< arr.length;i++)
        {
            freq[arr[i]]++;
        }
        int index=0;
        for(int i=0;i< freq.length;i++)
        {
            while(freq[i]!=0)
            {
                arr[index]=i;
                index++;
                freq[i]--;
            }

        }
    }

    public static void main(String arg[])
    {
        int[] arr={7,19,4,6,0,4,10};
        countingSort(arr);

           for(int i=0;i<arr.length;i++)
           {
               System.out.print(arr[i]+" ");
           }
    }

}
