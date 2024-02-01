public class BinarySearch {
    public static int binarySearch(int[] arr, int start, int end, int key){
        int mid = (start+end)/2; 
        if (arr[mid] == key) return mid; 
        if (arr[mid] > key) binarySearch(arr, start, mid-1, key); 
        if (arr[mid] < key) binarySearch(arr, mid+1, end, key);
        return -1; 
    }
    public static void main(String[] args) {

    }
}
