package collections.naveen;

public class permutation {

    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }

    static void findPermutations(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rest = str.substring(0, i) + str.substring(i + 1);
            findPermutations(rest, result + ch);
        }
    }
}
