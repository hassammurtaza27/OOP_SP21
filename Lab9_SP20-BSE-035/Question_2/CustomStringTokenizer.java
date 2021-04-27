import java.util.StringTokenizer;

public class CustomStringTokenizer extends StringTokenizer {
    private String str;

    public CustomStringTokenizer(String str) {
        super(str);
        this.str = str;
    }

    @Override
    public int countTokens() {
        int count = 0;
        String[] str1 = str.split(" ");
        for (String s : str1) {
            count++;
            for (int j = 0; j < s.length(); j++) {
                if (Character.isDigit(s.charAt(j))) {
                    count--;
                    break;
                }

            }
        }

        return count;
    }
}
