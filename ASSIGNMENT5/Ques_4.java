package ASSIGNMENT_5;


// Ans:
// "YES" the following code snippet will run and the output
// will be 24 as "a" is a static variable and at creation of
// each object it's value is incremented in the constructor
// and when obj3.m1() is called it is incremented one more time.

public class Ques_4 {
    static int a = 20;
    Ques_4() {
        a++;
    }
    void m1() {
        a++;
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        Ques_4 obj = new Ques_4();
        Ques_4 obj2 = new Ques_4();
        Ques_4 obj3 = new Ques_4();
        obj3.m1();
    }
}
