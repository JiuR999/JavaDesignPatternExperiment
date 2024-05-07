package cn.swust.lab2.question3;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        int[] data = {2, 3, 5, 6, 2, 1, 8, 6};
        AlgorithmAdapter algorithmAdapter = new AlgorithmAdapter(new QuickSort(),
                new BinarySearch());

        algorithmAdapter.sort(data);
        System.out.println("排序后的数据:" + Arrays.toString(data));

        System.out.println("查找第一个6的位置");
        System.out.println("第一个6的位置是:" + algorithmAdapter.search(data,6));
    }
}
