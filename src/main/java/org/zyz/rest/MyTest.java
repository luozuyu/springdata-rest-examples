//package cn.org.zyz.youngcredit;
//
///**
// * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。数组中某些数字是重复的，
// * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
// * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是重复的数字2或者3。
// * Created by fin_tech_2014 on 2017/5/22.
// */
//public class MyTest {
//
//    public static int duplicate(int[] number) {
//        if (number == null || number.length < 1)
//            return -1;
//        //判断输入的是否在[0, number.length-1]之间
//        for (int i : number) {
//            if (i < 0 || i >= number.length)
//                return -1;
//        }
//        for (int i = 0; i < number.length; i++) {
//            //当 numbers[i]与 i 不相同时一直交换
//            while (number[i] != i) {
//                //如果 i 位置与 number[i]位置的数字相同，说明有重复数字
//                if (number[i] == number[number[i]]) {
//                    return number[i];
//                } else {    //如果不同就交换
//                    swap(number, i, number[i]);
//                }
//            }
//        }
//        return -1;
//    }
//
//    public static void swap(int[] data, int i, int j) {
//        int tmp = data[i];
//        data[i] = data[j];
//        data[j] = tmp;
//    }
//
//    public static void main(String[] args) {
//        int[] numbers = {2, 1, 4, 1, 4};
//        System.out.println(duplicate(numbers));
//    }
//
//}
