package app;
import java.util.Scanner;

public class Average {

    float totalValue;

    public Average(){

    }

    public void getAverage(){
        int i;
        

        for (i=0; i<3; i++){
            Scanner input = new Scanner(System.in);
            System.out.println("number " + (i+1) + ":");
            float inputValue = input.nextFloat();
            totalValue = totalValue + inputValue;
            
        }

        float average = totalValue / 3;
        System.out.println("Average is: " + average);


    }

}
