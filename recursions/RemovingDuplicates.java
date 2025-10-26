public class RemovingDuplicates {
    public static void removeDuplicatesString(String str,StringBuilder newstr,boolean[] map,int i){
            if (i == str.length()) {
                System.out.println(newstr);
                return ;
            }
    
            char currchar = str.charAt(i);
    
            if (map[currchar-'a'] == true) {
                removeDuplicatesString(str, newstr, map, i+1);
            }
            else{
                map[currchar-'a'] = true;
                removeDuplicatesString(str, newstr.append(currchar), map, i+1);
            }
    }



    public static void main(String[] args) {
        String str = "apna college" ;
        removeDuplicatesString(str, new StringBuilder(""), new boolean[26], 0);
    }




}




// public class RemovingDuplicates {
//     public static void removeDuplicatesString(String str, StringBuilder newstr, boolean[] map, int i) {
//         // Base case: if we have processed all characters
//         if (i == str.length()) {
//             System.out.println(newstr);
//             return;
//         }
    
//         char currchar = str.charAt(i);
    
//         // Check if the character is a lowercase letter
//         if (currchar >= 'a' && currchar <= 'z') {
//             // If already encountered, skip it
//             if (map[currchar - 'a']) {
//                 removeDuplicatesString(str, newstr, map, i + 1);
//             } else {
//                 // Mark the character as encountered and append it to the result
//                 map[currchar - 'a'] = true;
//                 removeDuplicatesString(str, new StringBuilder(newstr).append(currchar), map, i + 1);
//             }
//         } else {
//             // If not a lowercase letter, append as is
//             removeDuplicatesString(str, new StringBuilder(newstr).append(currchar), map, i + 1);
//         }
//     }
    
//     public static void main(String[] args) {
//         String str = "apna college";
//         removeDuplicatesString(str, new StringBuilder(), new boolean[26], 0);
//     }
    

// }


