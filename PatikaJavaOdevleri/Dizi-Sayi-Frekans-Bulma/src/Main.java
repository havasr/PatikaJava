public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 30, 30, 5, 20};

        int[] duplicates = new int[list.length];
        boolean isDuplicate = false;
        int dupIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int dup : duplicates) {
                if (list[i] == dup) {
                    isDuplicate = true;
                }
            }
            if (!isDuplicate){
            int duplicateNum = 0;
            boolean isAdded = false;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    if (!isAdded) {
                        duplicates[dupIndex] = list[i];
                        dupIndex++;
                        isAdded = true;
                    }
                    duplicateNum++;
                }
            }
            System.out.println(list[i] + "number is repeated " + duplicateNum + " times.");
            }isDuplicate = false;
        }
    }
}