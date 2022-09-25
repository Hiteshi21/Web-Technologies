public class Q2MinOfThree {
    public static void main(String[] args){

//        Q2. Write the main() method of the MinOfThree class that determines which of the
//            three numbers is the smallest number, and displays that number using if-else statement.

        int a=5,b=2,c=10;
        if(a<b)
        {
            if(a<c)
                System.out.println("smallest number is:"+a);
            else
                System.out.println("smallest number is:"+c);
        }
        else {
            if(b<c)
                System.out.println("smallest number is:"+b);
            else
                System.out.println("smallest number is:"+c);
        }
    }
}
