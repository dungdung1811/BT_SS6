package BT.bt3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new  int[10000];
        for (int i = 0; i < numbers.length;i++){
            numbers[i] = (int)(Math.random() * 10000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        slecsionSort(numbers);
        stopWatch.stop();
        System.out.println(Arrays.toString(numbers));

        System.out.println( stopWatch.getElapsed());

    }
    public static void  slecsionSort(int [] number){
        for (int i = 0; i < number.length-1; i++){
            for (int j = i+1; j < number.length; j++  ){
                if (number[i] > number[j]){
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
    }
}
