public class array_lab4 {

    public static void main(String[] args) {
        String[] words = {"sun", "moon", "stars", "galaxy"};
        String longestWord = "";
        int maxLength = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                longestWord = words[i];
            }
        }
        System.out.println("The longest word is: " + longestWord);
    }
}