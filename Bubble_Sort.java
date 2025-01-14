public class Bubble_Sort {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        for(int turn =1; turn < numbers.length; turn++){
            for(int i = 0; i < numbers.length-turn; i++){
                if (numbers[i] > numbers[i++]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i++];
                    numbers[i++] = temp;
                }
            }
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + ",");
        }
    }
}