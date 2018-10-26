import java.util.Scanner;


public class FibonacciSeries {
    public FibonacciSeries fb;
    private int mOne, mTwo, mNthSeries;
    private int mFinalNumber =0;
    private void inputReader() {
        System.out.println("Enter 1st value ");
        Scanner scanner = new Scanner(System.in);
        mOne = scanner.nextInt();
        System.out.println("Enter 2nd Value");
        scanner =new Scanner(System.in);
        mTwo = scanner.nextInt();
        System.out.println("Enter Nth number in Series ");
        scanner =new Scanner(System.in);
        mNthSeries = scanner.nextInt();
    }
    private void calculateNthPositionNumberInTheSeries()
    {
        for(int i=2; i<mNthSeries; ++i)
        {
            mFinalNumber =mOne + mTwo;
            mOne = mTwo;
            mTwo = mFinalNumber;
        }
        System.out.println("The series "+mNthSeries+" position number is : "+mFinalNumber);
        //IF you do not want to ask input multiple times comment below line.
        this.inputReader();
    }
    public static void main(String [] args)
    {
        FibonacciSeries fb = new FibonacciSeries();
        fb.inputReader();
        fb.calculateNthPositionNumberInTheSeries();
    }
}
