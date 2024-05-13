package Main3;

public class Main3 {
    public static void main(String[] args) {
        
        char array[] = {'J', 'A', 'C', 'K', 'E'};
        
        bubbleSort(array);
        
        for (char c : array) {
            System.out.print(c);
        }
    }
    
    public static void bubbleSort(char array[]) {
        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

    

    
   