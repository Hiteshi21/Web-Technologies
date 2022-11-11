package ASSIGNMENT_5;

class Mammals{

    public void category(){
        System.out.println("I am mammal");
    }

}

class MarineAnimals{
    public void category(){
        System.out.println("I am a marine animal");
    }

}

//multiple inheritance is not supported in java

//class BlueWhale extends Mammals, MarineAnimals{
//    public void category(){
//        System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
//    }
//}
public class Ques_1 {
    public static void main(String[] args) {
        Mammals mammal = new Mammals();
        MarineAnimals marine = new MarineAnimals();
        //  BlueWhale whale = new BlueWhale();
        mammal.category();
        marine.category();
        // whale.category();
        // Now java compiler cannot decide, which display method it should inherit. Multiple
        // inheritances is not allowed in java whale.super.category() to avoid such scenarios.
    }
}

