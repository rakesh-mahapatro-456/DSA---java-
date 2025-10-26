public class Subsets {
    // public static void printSubsets(String str,int i,StringBuilder sub){
    //     //base case
    //     if (i==str.length()) {
    //         System.out.println(sub);
    //         return;
    //     }

    //     //recursion
    //     // yes choice
    //     sub.append(str.charAt(i));
    //     printSubsets(str, i+1,sub);

    //     //no choice
    //     // printSubsets(str, i+1, sub);


    //     // "No" choice - exclude str.charAt(i)
    //     sub.deleteCharAt(sub.length() - 1); // Backtrack: undo the "yes" choice
    //     printSubsets(str, i + 1, sub);
    // }

    public static void printSubsets(String str,int i,String sub){
        //base case
        if (i==str.length()) {
            System.out.println(sub);
            return;
        }

        //recursion
        // yes choice
        printSubsets(str, i+1,sub+str.charAt(i));

        //no choice
        printSubsets(str, i+1, sub);
    }
    

    public static void main(String[] args) {
        String str = "aabc";
        printSubsets(str, 0," ");

    }
}
