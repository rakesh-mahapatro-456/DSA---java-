public class LengthOfString {
    public static int length(String str,int i){
       
        if (i == str.length()) {
            return 0;
        }
       
        char currchar = str.charAt(i);
        int count = 0;
        if (currchar == ' ') {
            count++;
        }
        if (currchar >= 'a' && currchar <= 'z') {
            count ++;
        }
        
        return count+length(str, i+1);
    }

    public static void main(String[] args) {
        String str = "Rakesh Mahapatro";
        System.out.println(length(str, 0));
    }
}
