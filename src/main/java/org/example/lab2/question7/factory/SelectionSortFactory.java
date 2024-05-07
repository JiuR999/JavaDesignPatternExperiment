package org.example.lab2.question7.factory;

import org.example.lab2.question7.SelectionSort;
import org.example.lab2.question7.Sort;

public class SelectionSortFactory extends SortAlgoFactory{
    @Override
    public Sort createSortAlgo() {
        return new SelectionSort();
    }
}
