package cn.itcast.day07.demo03;

import java.util.Random;

public class DemoRandom2 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);
            System.out.println("The generated number is " + num);
        }
    }
}
