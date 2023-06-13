package logicalprograms;

public class EvenWordCounter {
    public static int countEvenWords(String sentence) {
        String[] words = sentence.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.length() % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String sentence = "This is an example sentence with some even and odd words";
        int evenWordCount = countEvenWords(sentence);
        System.out.println(evenWordCount);  // Output: 5
    }
}

