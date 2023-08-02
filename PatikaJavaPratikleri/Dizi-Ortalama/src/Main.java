public class Main {
    public static void main(String[] args) {

        int[] list = new int[10];

        double sum = 0.0;
        for (int i = 0; i < list.length ; i++) {
            sum += 1.0/list[i];
        }

        double harmonicAverage = list.length/sum;
        System.out.println(harmonicAverage);


    }
}