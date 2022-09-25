public class Q5Powers {
    public static void main(String[] args) {

//        Q5. You are to write a program that generates the second, third, and fourth powers
//        of a list of whole numbers from 1 to n.

        int n=5;
        int[][] arr;
        System.out.println("n n^2 n^3 n^4");
        for(int i=1;i<=n;i++)
        {
            int k=i;
            int j=1;
            while(j<=4)
            {
                System.out.print(k+" ");
                k=k*i;
                j++;
            }
            System.out.println();
        }
    }
}
