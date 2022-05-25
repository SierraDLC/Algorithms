import java.util.Arrays;
public class Count {
    public static void main(String[] args) {
        String Letters = "edsab";
        
        System.out.println("In lexicographical order, string will be " + countSort(Letters));
    }
    public static String countSort (String arr){
        StringBuilder sBuild=new StringBuilder();
        
        char[] charString =arr.toCharArray();
        Arrays.sort(charString);
        
        for(int i=0;i<charString.length;i++){
          
            sBuild.append(charString[i]);
        }
        return sBuild.toString();
    }
}