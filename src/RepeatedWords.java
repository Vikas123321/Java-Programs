public class RepeatedWords {
    public static void main(String[] args) {
        String text = "hello world hello Java hello world Java";

        // Convert the text to lowercase and split into words
        String[] words = text.toLowerCase().split("\\s+");
        // Array to keep track of counted words
        boolean[] isCounted = new boolean[words.length];
        System.out.println("Repeated Words and Their Counts:");
        // Loop through each word
        for (int i = 0; i < words.length; i++) {
            if (!isCounted[i]) {
                int count = 1;
                // Compare with other words
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                        isCounted[j] = true; // Mark word as counted
                    }
                }
                // Print only repeated words
                if (count > 1) {
                    System.out.println(words[i] + ": " + count);
                }
            }
        }
    }
}
