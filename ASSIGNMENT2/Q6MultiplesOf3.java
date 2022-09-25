public class Q6MultiplesOf3 {
    public static void main(String[] args) {
//        Q6. Write a do-while loop that will print out all the multiples of 3 from 3 to 36, that
//        is: 3 6 9 12 15 18 21 24 27 30 33 36.

        int idx=3;
        do {
            System.out.print(idx+" ");
            idx+=3;
        }while(idx<=36);

    }
}
