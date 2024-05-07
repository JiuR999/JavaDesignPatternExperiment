package cn.swust.lab2.question7.factory;

import cn.swust.lab2.question7.QuickSort;
import cn.swust.lab2.question7.Sort;

public class QuickSortFactory extends SortAlgoFactory{
    @Override
    public Sort createSortAlgo() {
        return new QuickSort();
    }
}
