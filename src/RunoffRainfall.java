import java.util.Scanner;

public class RunoffRainfall {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please provide dimension 1 for the roof");
        int userInputRoof1=sc.nextInt();
        System.out.println("Please provide dimension 2 for the roof");
        int userInputRoof2=sc.nextInt();
        int roofD1=userInputRoof1*12;
        int roofD2=userInputRoof2*12;
        System.out.println("Please enter the number of inches of rain: ");
        int userInputRain = sc.nextInt();
        double cubicWater= roofD1*roofD2*userInputRain;
        double numOfGallons=cubicWater/231;
        System.out.println("The number of gallons is equal to " +numOfGallons);
    }
}



