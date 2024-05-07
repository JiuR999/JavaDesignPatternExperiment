package cn.swust.lab2.question7.factory;

import cn.swust.lab2.question7.InsertionSort;
import cn.swust.lab2.question7.Sort;

public class InsertSortFactory extends SortAlgoFactory{
    @Override
    public Sort createSortAlgo() {
        return new InsertionSort();
    }
}
