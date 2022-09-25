public class Q4PopulationIncrease {

    public static void main(String[] args) {

//        Q4. A city of 80,000 peoples is increasing at the rate of 5% annually. When will
//        their population first exceed 150000? Write a java program for it. Use While Loop.
        int population=80000;
        int years=0;
        while(population<150000)
        {
            population+=(population*0.05);
            years++;
        }
        System.out.println("After "+years+" years the population exceeds 150000 ");
    }
}
