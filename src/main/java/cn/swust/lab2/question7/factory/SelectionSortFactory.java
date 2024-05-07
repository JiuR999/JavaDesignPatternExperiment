package cn.swust.lab2.question7.factory;

import cn.swust.lab2.question7.SelectionSort;
import cn.swust.lab2.question7.Sort;

public class SelectionSortFactory extends SortAlgoFactory{
    @Override
    public Sort createSortAlgo() {
        return new SelectionSort();
    }
}
