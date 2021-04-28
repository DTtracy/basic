package Arrary_Hash;

public class test {
    public static void main(String[] args) {
        int[] array={1,2,3};
        int max=0;
        int x=0;
        for (int i = 0; i <array.length-1 ; i++) {
            max=array[i+1]>array[i]?array[i+1]:array[i];
            x=array[i+1]>array[i]?i+1:i;
        }
        System.out.println("最大值为"+max+",最大值下标为"+x);
    }
}
