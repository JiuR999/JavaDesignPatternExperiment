package org.example.lab2.question7.factory;

import org.example.lab2.question7.InsertionSort;
import org.example.lab2.question7.Sort;

public class InsertSortFactory extends SortAlgoFactory{
    @Override
    public Sort createSortAlgo() {
        return new InsertionSort();
    }
}
