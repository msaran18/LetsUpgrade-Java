package saran;
import java.util.Scanner;

public class player {
	
	Scanner sc=new Scanner(System.in);
    String Name;
    int score=0;

    public void GetDetails()
    {
        System.out.println("Enter Your Name");
        Name=sc.next();
    }

}
