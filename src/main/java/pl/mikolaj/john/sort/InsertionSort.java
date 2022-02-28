package pl.mikolaj.john.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = Utils.generateArray(10);
        System.out.println("Before: ");
        Utils.printArray(numbers);

        insertionSort(numbers);
        System.out.println("After:");
        Utils.printArray(numbers);
    }

    public static void insertionSort(int[] numbers) {
        for(int i = 1; i < numbers.length; i++) {
            int tmp = numbers[i];
            int j;
            for(j = i - 1; j >= 0 && numbers[j] > tmp; j--){
                numbers[j+1] = numbers[j];
            }
            numbers[j+1] = tmp;
        }
    }
}
