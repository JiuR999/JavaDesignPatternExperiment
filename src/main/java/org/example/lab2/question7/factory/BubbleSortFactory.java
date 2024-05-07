package org.example.lab2.question7.factory;

import org.example.lab2.question7.BubbleSort;
import org.example.lab2.question7.Sort;

public class BubbleSortFactory extends SortAlgoFactory{
    @Override
    public Sort createSortAlgo() {
        return new BubbleSort();
    }
}
