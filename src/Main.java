import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();
        int val = rnd.nextInt(100) + 1;
        int[] dataPoints = new int[99];
        int sum = 0;


        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = val;
            val = rnd.nextInt(100) + 1;
            System.out.print(dataPoints[i] + " | ");
        }

        for (int counter = 0; counter<dataPoints.length; counter++)
        {
            sum+=dataPoints[counter];
        }
        System.out.println("\nThe sum of this data set is " + sum + ".");
        double average = sum / 100;
        System.out.println("\nThe average of this data set is " + average + ".");
    }
}
