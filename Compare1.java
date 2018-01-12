public class Compare1 {
    private String first, second;
    private int len1, len2;
    
    public static String largest(String str1, String str2) {
        if(str1.compareTo(str2)>0) {
            return str1;
        }
        else {
            return str2;
        }
    }
}