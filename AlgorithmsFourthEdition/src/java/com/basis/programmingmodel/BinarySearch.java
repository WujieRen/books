package com.basis.programmingmodel;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by renwujie on 2018/05/11 at 16:13
 *
 * 著名、高效且广泛应用的二分查找
 */
public class BinarySearch {
    /**
     * 我觉得思考这种问题本质的方法不能从举个例子去一步一步走这个角度去想。
     * 这样当再次遇到时还是不会。
     * 我觉得抓住几个点会好一些：
     *  1.共有几种条件，当出发每种条件时应该做出什么反应；
     *  2.执行逻辑的终点是什么？即什么情况下继续逻辑，什么情况下结束逻辑；
     *  3.最后每种逻辑的结果是什么样子。
     * @param key
     * @param value
     * @return
     */
    public static int index(int key, int[] value) {
        int start = 0;
        int end = value.length-1;
        while(start <= end) {
            int median = start + (end - start)/2;
            if(key < value[median])
                end = median - 1;
            else if(key > value[median])
                start = median + 1;
            else return median;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        /**
         * 这儿的思路是：
         *  第一个数字是数组大小——size
         *  然后创建一个size大小的数组，把生下来的数字放进去
         *  最后一个数字是要查找的数字——key
         */
        int size = in.nextInt();
        int[] intArray = new int[size];
        for(int i = 0; i < size; i++) {
            intArray[i] = in.nextInt();
        }
        Arrays.sort(intArray);

        int key = in.nextInt();

        System.out.println(index(key, intArray));
    }
}
