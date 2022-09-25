public class Q1IncreaseScore {
    public static void main(String[] args) {

//        Q1. . Suppose that score is a variable of type double. Write the java statement that
//        increases the score by 5 marks if score is between 80 and 90.

        double score = 80.6;

        if (score > 80 && score < 90){
            score += 5;
        }

        System.out.println("score:" + score);
    }

    }
