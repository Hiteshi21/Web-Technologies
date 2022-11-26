package ASSIGNMENT6.QUES_3;


import ASSIGNMENT6.QUES_3.CALCULATOR;

public class Main extends CALCULATOR {
    public Main(Object a, Object b) {
        super(a, b);
    }

    public static void addition(CALCULATOR a){
        try{
            if (!(a.first).getClass().getSimpleName().equals("Integer") || !(a.second).getClass().getSimpleName().equals("Integer")){
                throw new NumberFormatException("Input should be Integer");
            }else{
                System.out.println((int)(a.first)+ (int)(a.second));
            }}
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
    public static void subtraction(CALCULATOR a){
        try{
            if (!(a.first).getClass().getSimpleName().equals("Integer") || !(a.second).getClass().getSimpleName().equals("Integer")){
                throw new NumberFormatException("Input should be Integer");
            }else{
                System.out.println((int)(a.first)- (int)(a.second));
            }}
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
    public static void multiplication(CALCULATOR a){
        try{
            if (!(a.first).getClass().getSimpleName().equals("Integer") || !(a.second).getClass().getSimpleName().equals("Integer")){
                throw new NumberFormatException("Input should be Integer");
            }else{
                System.out.println((int)(a.first)*(int)(a.second));
            }}
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
    public static void division(CALCULATOR a){
        try{
            if (!(a.first).getClass().getSimpleName().equals("Integer") || !(a.second).getClass().getSimpleName().equals("Integer")){
                throw new NumberFormatException("Input should be Integer");
            }else
                try{
                    System.out.println(((int)a.first)/((int)a.second));
                }catch (Exception e){
                    System.out.println("Divide by 0 is not possible!");
                }
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        CALCULATOR obj1 = new CALCULATOR(10, 49);
        CALCULATOR obj2 = new CALCULATOR(14, new double[]{45.9, 49});
        CALCULATOR obj3 = new CALCULATOR(true, 49);
        CALCULATOR obj4 = new CALCULATOR(19, 0);
        addition(obj1);
        subtraction(obj2);
        multiplication(obj3);
        division(obj4);
    }

}
