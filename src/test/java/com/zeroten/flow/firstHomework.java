package com.zeroten.flow;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

public class firstHomework {

    @Test
    public void testTest() {
        int a = 1233333333;
        String b = a + "";
        String c = b.substring(2);
        System.out.println(b.toCharArray()[0] + "----" + (b.toCharArray()[0]) instanceof String);
        System.out.println(Integer.parseInt(b.substring(0, 1)));
        System.out.println(Integer.parseInt("01" + "02"));
    }

    //吸血鬼数字是指位数为偶数的数字，可以由一对数字相乘而得到，而这对数字各包含乘积的一半位数的数字，其中从最初的数字中选取的数字可以任意排序。
    /*
    例子:
        以两个0结尾的数字是不允许的，例如，下列数字都是“吸血鬼”数字：
        1260 = 21 * 60 　1827 = 21 * 87 　2187 = 27 * 81
        4位数的吸血鬼数有7个：
        1260, 1395, 1435, 1530, 1827, 2187, 6880

    * 使用程序计算出所有4位数的吸血鬼数字
    */
    @Test
    public void vampireNumber() {
        long start = System.nanoTime();
        for (int i = 1000; i < 10000; i++) {
            String str = i + "";
            String[] arr = {str.substring(0, 1), str.substring(1, 2), str.substring(2, 3), str.substring(3, 4)};
            String[] groupArr1 = {arr[0], arr[1]};
            String[] groupArr2 = {arr[0], arr[2]};
            String[] groupArr3 = {arr[0], arr[3]};
            // 计算每一种组合
            // 1). 1,2 组合; 3,4组合
            int num1 = Integer.parseInt(arr[0] + arr[1]);
            int groupNum1 = Integer.parseInt(arr[2] + arr[3]);

            int num2 = Integer.parseInt(arr[0] + arr[1]);
            int groupNum2 = Integer.parseInt(arr[3] + arr[2]);

            int num3 = Integer.parseInt(arr[1] + arr[0]);
            int groupNum3 = Integer.parseInt(arr[3] + arr[2]);

            int num4 = Integer.parseInt(arr[1] + arr[0]);
            int groupNum4 = Integer.parseInt(arr[2] + arr[3]);

            // 2). 1,3 组合; 2,4组合
            int num5 = Integer.parseInt(arr[0] + arr[2]);
            int groupNum5 = Integer.parseInt(arr[1] + arr[3]);

            int num6 = Integer.parseInt(arr[0] + arr[2]);
            int groupNum6 = Integer.parseInt(arr[3] + arr[1]);

            int num7 = Integer.parseInt(arr[2] + arr[0]);
            int groupNum7 = Integer.parseInt(arr[3] + arr[1]);

            int num8 = Integer.parseInt(arr[2] + arr[0]);
            int groupNum8 = Integer.parseInt(arr[1] + arr[3]);


            // 2). 1,4 组合; 2,3组合
            int num9 = Integer.parseInt(arr[0] + arr[3]);
            int groupNum9 = Integer.parseInt(arr[1] + arr[2]);

            int num10 = Integer.parseInt(arr[0] + arr[3]);
            int groupNum10 = Integer.parseInt(arr[2] + arr[1]);

            int num11 = Integer.parseInt(arr[3] + arr[0]);
            int groupNum11 = Integer.parseInt(arr[2] + arr[1]);

            int num12 = Integer.parseInt(arr[3] + arr[0]);
            int groupNum12 = Integer.parseInt(arr[1] + arr[2]);
            if (num1 * groupNum1 == i) {
                System.out.println("找到吸血鬼数字:" + i + " = " + num1 + " * " + groupNum1);
            }
            if (num2 * groupNum2 == i) {
                System.out.println("找到吸血鬼数字:" + i + " = " + num2 + " * " + groupNum2);
            }
            if (num3 * groupNum3 == i) {
                System.out.println("找到吸血鬼数字:" + i + " = " + num3 + " * " + groupNum3);
            }
            if (num4 * groupNum4 == i) {
                System.out.println("找到吸血鬼数字:" + i + " = " + num4 + " * " + groupNum4);
            }
            if (num5 * groupNum5 == i) {
                System.out.println("找到吸血鬼数字:" + i + " = " + num5 + " * " + groupNum5);
            }
            if (num6 * groupNum6 == i) {
                System.out.println("找到吸血鬼数字:" + i + " = " + num6 + " * " + groupNum6);
            }
            if (num7 * groupNum7 == i) {
                System.out.println("找到吸血鬼数字:" + i + " = " + num7 + " * " + groupNum7);
            }
            if (num8 * groupNum8 == i) {
                System.out.println("找到吸血鬼数字:" + i + " = " + num8 + " * " + groupNum8);
            }
            if (num9 * groupNum9 == i) {
                System.out.println("找到吸血鬼数字:" + i + " = " + num9 + " * " + groupNum9);
            }
            if (num10 * groupNum10 == i) {
                System.out.println("找到吸血鬼数字:" + i + " = " + num10 + " * " + groupNum10);
            }
            if (num11 * groupNum11 == i) {
                System.out.println("找到吸血鬼数字:" + i + " = " + num11 + " * " + groupNum11);
            }
            if (num12 * groupNum12 == i) {
                System.out.println("找到吸血鬼数字:" + i + " = " + num12 + " * " + groupNum12);
            }
        }

        long end = System.nanoTime();
        System.out.println(end);
        System.out.println("方法所用时间：" + (end - start)+"\n");
    }
}
