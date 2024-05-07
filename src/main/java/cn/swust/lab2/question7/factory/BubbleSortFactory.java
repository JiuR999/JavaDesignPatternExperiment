package cn.swust.lab2.question7.factory;

import cn.swust.lab2.question7.BubbleSort;
import cn.swust.lab2.question7.Sort;

public class BubbleSortFactory extends SortAlgoFactory{
    @Override
    public Sort createSortAlgo() {
        return new BubbleSort();
    }
}
