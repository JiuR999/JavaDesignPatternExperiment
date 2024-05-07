package org.example.lab2.question7;

import org.example.lab2.question7.factory.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        int[] data = new int[]{7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,5, 2, 9, 1, 5, 6, 3, 8, 4, 7,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,5, 2, 9, 1, 5, 6, 3, 8, 4, 7,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,5, 2, 9, 1, 5, 6, 3, 8, 4, 7,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,5, 2, 9, 1, 5, 6, 3, 8, 4, 7,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,5, 2, 9, 1, 5, 6, 3, 8, 4, 7,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,5, 2, 9, 1, 5, 6, 3, 8, 4, 7,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,5, 2, 9, 1, 5, 6, 3, 8, 4, 7,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,5, 2, 9, 1, 5, 6, 3, 8, 4, 7,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,5, 2, 9, 1, 5, 6, 3, 8, 4, 7,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,5, 2, 9, 1, 5, 6, 3, 8, 4, 7,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,5, 2, 9, 1, 5, 6, 3, 8, 4, 7,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,5, 2, 9, 1, 5, 6, 3, 8, 4, 7,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,5, 2, 9, 1, 5, 6, 3, 8, 4, 7,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,
                7,5,4,2,3,9,5,6,4,2,8,7,2,5,4,3,2,1,6,5, 2, 9, 1, 5, 6, 3, 8, 4, 7};
        SortAlgoFactory factory = new BubbleSortFactory();
        List<SortAlgoFactory> factories = Arrays.asList(new BubbleSortFactory(),new SelectionSortFactory(),
                new InsertSortFactory(), new QuickSortFactory());

        for (SortAlgoFactory algoFactory : factories) {
            Sort sort = algoFactory.createSortAlgo();
            Sort proxy = (Sort) ProxyFactory.getProxy(sort);
            proxy.sort(data);
        }
    }
}