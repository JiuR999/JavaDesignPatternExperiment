package org.example.lab2.question7.factory;

import org.example.lab2.question7.QuickSort;
import org.example.lab2.question7.Sort;

public class QuickSortFactory extends SortAlgoFactory{
    @Override
    public Sort createSortAlgo() {
        return new QuickSort();
    }
}
