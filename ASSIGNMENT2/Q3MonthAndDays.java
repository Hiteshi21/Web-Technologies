public class Q3MonthAndDays {
    public static void main(String[] args){

//        Q3. Consider the index of the month (let say 1 for January). Write a java program to
//        print the name of the month and number of days in the month. Use Switch Case.

        int Month=3;

        switch(Month)
        {
            case 1:
                System.out.println("January:31");
                break;
            case 2:
                System.out.println("February:30");
                break;
            case 3:
                System.out.println("March:31");
                break;
            case 4:
                System.out.println("April:30");
                break;
            case 5:
                System.out.println("May:31");
                break;
            case 6:
                System.out.println("June:30");
                break;
            case 7:
                System.out.println("July:31");
                break;
            case 8:
                System.out.println("August:31");
                break;
            case 9:
                System.out.println("September:30");
                break;
            case 10:
                System.out.println("October:31");
                break;
            case 11:
                System.out.println("November:30");
                break;
            case 12:
                System.out.println("December:31");
                break;
        }
    }
}
