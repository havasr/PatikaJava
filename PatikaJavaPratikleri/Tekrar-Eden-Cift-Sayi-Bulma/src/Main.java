import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 12, 53, 2, 5, 10, 12, 2, 2, 57, 83};
        int[] duplicate = new int[list.length];
        int duplicateIndex = 0;
        boolean isDuplicate = false;

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                boolean alreadyExists = false;
                for (int k = 0; k < duplicateIndex; k++) {
                    if (list[i] == duplicate[k]) {
                        alreadyExists = true;
                        break;
                    }
                }
                if (!alreadyExists) {
                    duplicate[duplicateIndex] = list[i];
                    duplicateIndex++;
                }
            }
        }

        duplicate = Arrays.copyOf(duplicate, duplicateIndex);

        System.out.println(Arrays.toString(duplicate));
    }
}