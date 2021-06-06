package challenge22;

import java.util.Scanner;
import java.util.Arrays;

public class Challenge22 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        Double n1D[] = new Double[3];


        System.out.println("Enter three numbers: ");
        String n1S = inputs.nextLine();
        n1D[0] = Double.parseDouble(n1S);
        String n2S = inputs.nextLine();
        n1D[1] = Double.parseDouble(n2S);
        String n3S = inputs.nextLine();
        n1D[2] = Double.parseDouble(n3S);;

        if((!n1D[0].equals(n1D[1]))&&(!n1D[0].equals(n1D[2]))&&(!n1D[1].equals(n1D[2])))
        {
            swap(n1D);
            output(n1D);

        }
        else
        {
            System.out.println("Program over.");
        }


    }
    public static void output(Double p[])
    {
        System.out.println("The largest number is " + p[2]);

    }

    public static void swap(Double p[])
    {
        double temp;
        for(int i=0; i<3; i++)
        {
            for(int j=i+1; j<3; j++)
            {
                if(p[i]>p[j])
                {
                    temp = p[i];
                    p[i] = p[j];
                    p[j]=temp;
                }
            }
        }

        /*
        Another alternative
        if(p[0]>=p[1]
        {
            if(p[0]>=p[2])
            {
                System.out.println("The largest number is " + p[0];
            }
            else
            {
                System.out.println("The largest number is " + p[2];
            }
        }
        else
        {
            if(p[1]>p[2]
            {
                System.out.println("The largest number is " + p[1];
            }
            else
            {
                System.out.println("The largest number is " + p[2];
            }
        }
         */
    }
}
