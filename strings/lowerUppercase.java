public class lowerUppercase {
    public static String lower_to_uppercase_String(String str){
        StringBuilder dstr = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        dstr.append(ch);
        for(int i=1;i<str.length();i++){
            if (str.charAt(i) == ' ' && i < str.length()-1 ) {
              dstr.append(str.charAt(i));
              i++;
             dstr.append( Character.toUpperCase(str.charAt(i)));
            }
            else{
                dstr.append(str.charAt(i));
            }

        }

        return dstr.toString(); 

    }


    public static void main(String[] args) {
        String str = "i am atomic" ;
        System.out.println(lower_to_uppercase_String(str));
    }
}
