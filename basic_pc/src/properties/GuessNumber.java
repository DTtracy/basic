package properties;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void start(){
        Random r = new Random();
        int number = r.nextInt(100)+1;



        while (true) {
            System.out.println("请输入你要猜的数字:");
            Scanner sc = new Scanner(System.in);
            int GuessNumber = sc.nextInt();
            if (GuessNumber > number) {
                System.out.println("你猜的数字" + GuessNumber + "大了");
            } else if (GuessNumber < number) {
                System.out.println("你猜的数字" + GuessNumber + "小了");
            } else if (GuessNumber == number) {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
    }
}
