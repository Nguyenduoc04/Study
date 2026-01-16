package lession14;

public class homework1 {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 5, 4};
        insertionSort(array);
    }
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
            for(int k = 0; k < array.length; k++){
                System.out.print(array[k] + " ");
            }
            System.out.println();
        }
    }
}
