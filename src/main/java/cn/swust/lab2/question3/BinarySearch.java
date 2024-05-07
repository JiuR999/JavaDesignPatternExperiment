package cn.swust.lab2.question3;

public class BinarySearch {
    public int binarySearch(int[] data, int target) {
        // 实现二分查找算法
        int left = 0;
        int right = data.length - 1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if(data[mid] == target){
                return mid;
            } else if(data[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}