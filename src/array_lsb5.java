public class array_lsb5 {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cat", "orange"};
        String shortestWord = words[0];  
        int minLength = shortestWord.length();
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < minLength) {
                minLength = words[i].length();
                shortestWord = words[i];
            }
        }
        System.out.println("The shortest word is: " + shortestWord);
    }   
}
