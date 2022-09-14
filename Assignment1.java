class Assignment1 {
    public static void main(String[] args) {
//
//      Q1:  Write a Java program to print addition and subtraction of two integer numbers.
        Integer a=20,b=5;
        Integer sum=a+b;
        System.out.println("sum:"+sum);
        Integer diff=a-b;
        System.out.println("difference:"+diff);


        //  Q2: Write a Java program to print multiplication of two floating point numbers.
        Float x=7.68f,y=1.56f;
        Float mul=x*y;
        System.out.println("multiplication:"+mul);

        //  Q3:Write a Java program to compute quotient and remainder and print it.
        int p=10,q=3;
        int quo=p/q;
        int rem=p%q;
        System.out.println("quotient:"+quo);
        System.out.println("remainder:"+rem);

        // Q4: Write a Java program to swap the values of integer number with using temporary variable
        //      and without using temporary variable

        //using temporary variable
        int v1=10,v2=5;
        System.out.println("variable1 before swapping:"+v1);
        System.out.println("variable2 before swapping:"+v2);
        int temp;
        temp=v1;
        v1=v2;
        v2=temp;
        System.out.println("variable1 after swapping:"+v1);
        System.out.println("variable2 after swapping:"+v2);

        //without using temporary variable
        int a1=2,a2=5;
        System.out.println("variable1 before swapping:"+a1);
        System.out.println("variable2 before swapping:"+a2);
        a1=a1+a2;
        a2=a1-a2;
        a1=a1-a2;
        System.out.println("variable1 after swapping:"+a1);
        System.out.println("variable2 after swapping:"+a2);









    }
}

