package properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("basic_pc\\game.txt");
        prop.load(fr);
        fr.close();

        //通过Properties集合获取到玩游戏的次数
        String count = prop.getProperty("count");
        int number = Integer.parseInt(count);

        //判断是否到3次了
        if(number>=3){
            System.out.println("游戏试玩已经结束，想要继续请充值(www.tenct.com)");
        }else{
            GuessNumber.start();
           //次数+1，重新写回文件，用Properties的store方法实现
            number++;
            prop.setProperty("count",String.valueOf(number));
            FileWriter fw = new FileWriter("basic_pc\\game.txt");
            prop.store(fw,null);
            fw.close();
        }

    }
}
