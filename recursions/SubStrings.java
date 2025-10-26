public class SubStrings {
    public static int substring(String str,int si,int ei){
        if (si>ei) {
            return 0;
        }

        int total_subs = substring(str, si+1, ei)+substring(str, si, ei-1)-substring(str, si+1, ei-1);

        if (str.charAt(si) == str.charAt(ei)) {
            total_subs++;
        }

        return total_subs;

    }

    public static void main(String[] args) {
        String str ="aba";
        int l = str.length()-1;
        System.out.println(substring(str, 0, l));
    }
}
