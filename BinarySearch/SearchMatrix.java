package BinarySearch;

public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int rows = matrix.length;
        if(rows == 0) return false;
        int cols = matrix[0].length;
        int right = rows*cols - 1;
        int midIdx, midElement;
        while(left<=right){
            midIdx = left+(right-left)/2;
            midElement = matrix[midIdx/cols][midIdx%cols];
            if(target == midElement) return true;
            else if(target>midElement) left = midIdx+1;
            else right = midIdx-1;
        }
        return false;
    }
}
