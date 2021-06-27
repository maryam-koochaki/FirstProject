import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter score:");
        int score = s.nextInt();
        if(score < 10){
            System.out.println("Failed");
        }else {
            System.out.println("Pass");
        }
    }
}

