public class stringCompression {
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            int count = 1;

            // Count consecutive characters
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
            i++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbbcc";
        System.out.println(compress(str)); 
        // Output: "a3b3c2"

        // Integer a = 12;
        // String b = a.toString();
    }
}
