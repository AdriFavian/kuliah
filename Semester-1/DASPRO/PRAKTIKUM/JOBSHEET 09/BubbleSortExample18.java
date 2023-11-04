public class BubbleSortExample18 {
    public static void main(String[] args) {
        int[] intData = {34, 18, 87, 72, 32, 54, 43};
        int temp = 0;

        for (int i = 0; i < intData.length - 1; i++) {
            for (int j = 1; j < intData.length - i; j++) {
                if (intData[j-1] < intData[j]) { // diganti <
                    // Swap elements
                    temp = intData[j];
                    intData[j] = intData[j - 1];
                    intData[j - 1] = temp;
                }
            }
        }

        System.out.println("Hasil pengurutan (descending): ");
        for (int i = 0; i < intData.length; i++) {
            System.out.println(intData[i]);
        }
    }
}
