package ASSIGNMENT_5;

//output will be : 10
//because the static blocks are implemented at compile time.

public class Ques_5 {
    final static int x;

    static {
        x = 10;
    }
    public static void main(String[] args) {
        System.out.println(x);
    }
}

