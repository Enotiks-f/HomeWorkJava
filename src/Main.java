public class Main {
    public static void main(String[] args) {
        //TASK1
        System.out.println("\nTASK1\n");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        float[] weightFlout = new float[3];
        weightFlout[0] = 1.57f;
        weightFlout[1] = 7.654f;
        weightFlout[2] = 9.986f;

        int[] freeWeight = {1, 5, 89, 43, 232, 2};

        //TASK2
        System.out.println("\nTASK2\n");
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < weightFlout.length; i++) {
            System.out.print(weightFlout[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < freeWeight.length; i++) {
            System.out.print(freeWeight[i] + " ");
        }

        //TASK3
        System.out.println("\nTASK3\n");
        for (int i = weight.length-1; i >= 0; i--) {
            System.out.print(weight[i] + " ");
        }
        System.out.println();
        for (int i = weightFlout.length-1; i >= 0; i--) {
            System.out.print(weightFlout[i] + " ");
        }
        System.out.println();
        for (int i = freeWeight.length-1; i >= 0; i--) {
            System.out.print(freeWeight[i] + " ");
        }
        //TASK4
        System.out.println("\nTASK4\n");
        int[] arr = {1, 3, 4, 5, 23, 7, 8 , 13, 43, 22, 50};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}