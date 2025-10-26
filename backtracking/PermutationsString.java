public class PermutationsString {

    public static void findPermutation(String str,String newstr){
        //base case
        if (str.length()==0) {
            System.out.println(newstr);
            return;
        }

        //recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            //substring - 'abcde' => if c is taken then ab+de= abde i.e removes elemnet which taken from the string
           String cstr =  str.substring(0, i)+str.substring(i+1);
           findPermutation(cstr, newstr+curr);
        }

        // Time-complexity : O(n*n!)

    }


    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
    
}
