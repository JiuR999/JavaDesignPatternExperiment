package cn.swust.lab2.question7;

public class SelectionSort implements Sort{
    @Override
    public void sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i+1; j < data.length; j++) {
                int flag = i;
                if(data[j] < data[flag]){
                    flag = j;
                }
                int tmp = data[flag];
                data[flag] = data[i];
                data[i] = tmp;
            }
        }
    }
}
