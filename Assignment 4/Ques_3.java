package Assignment4;

public class Ques_3 {

    private static double number;
    public  Ques_3 ( )
    {
        number = 110.0d;// number
    }

    public boolean isZero ( ) //method to check whether number is zero or not
    {
        return number == 0.0;
    }
    public boolean isPositive ( )//method to check whether number is positive or not
    {
        return number > 0.0;
    }
    public boolean isNegative ( )//method to check whether number is negative or not
    {
        return number < 0.0;
    }
    public boolean isodd( )//method to check whether number is odd or not
    {
        return number % 2 != 0.0;
    }
    public boolean isEven ( )//method to check whether number is even or not
    {
        return number % 2 == 0.0;
    }
    public boolean isPrime ( )//method to check whether number is prime or not
    {
        int i, last_num;

        double a;
        boolean flag;
        a = Math.sqrt(number);
        last_num = (int)a;
        flag = true;
        for (i=2; i<last_num; i++)
        {
            if (number != i)
            {
                if( number % i ==0)
                {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
    public boolean isAmstrong ( )//method to check whether number is amstrong or not
    {
        return number == 0.0;
    }
    public double getFactorial ( )//method to get factorial of number
    {
        double d=1;
        for(int i = 1; i < number; i++)
            d *=i;
        return d;
    }
    public double getSqrt ( )//method to get square root of number
    {
        double d;
        d = (double) number;
        d= Math.sqrt(d);
        return d;
    }
    public double getReverse ( )//method to get reverse of number
    {
        double d =0;
        double temp;
        int db = (int) number;
        while (db >9)
        {
            temp = db %10;
            d = d * 10 + temp;
            db = db /10;
        }
        d = d * 10 + db;
        return d;
    }
    public double sumDigits( )//method to get sum of digits of number
    {
        double d=0;
        int n = (int) number;
        while( n >9)
        {
            d += n % 10;
            n = n /10;
        }
        d += n;
        return d;
    }
    public void dispBinary ( )//method to display binary of number
    {
        System.out.println("ByteValue :" + Long.toBinaryString((long) number));
    }
    public static void main(String[] args) {

        Ques_3 number = new Ques_3();
        System.out.println(" The given number is : " + Ques_3.number);
        number.dispBinary();
        System.out.println ("isZero: " + number.isZero() );
        System.out.println ("isPositive: " + number.isPositive());
        System.out.println ("isNegative: " + number.isNegative() );
        System.out.println ("isOdd: " + number.isodd());
        System.out.println ("isEven: " + number.isEven());
        System.out.println ("isPrime: " +number.isPrime());
        System.out.println ("isAmstrong: " +number.isAmstrong());
        System.out.println ("getFactorial: " + number.getFactorial());
        System.out.println ("getSqrt: " + number.getSqrt( ));
        System.out.println("getReverse:  " + number.getReverse());
        System.out.println ("sumDigits: " + number.sumDigits( ));

    }
}
