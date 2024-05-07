package org.example.lab2.question3;

public class AlgorithmAdapter implements DataOperation {

    private QuickSort quickSort;
    private BinarySearch binarySearch;

    public AlgorithmAdapter(QuickSort quickSort, BinarySearch binarySearch) {
        this.quickSort = quickSort;
        this.binarySearch = binarySearch;
    }

    @Override
    public void sort(int[] data) {
        quickSort.quickSort(data,0,data.length-1);
    }

    @Override
    public int search(int[] data, int target) {
        return binarySearch.binarySearch(data, target);
    }
}
