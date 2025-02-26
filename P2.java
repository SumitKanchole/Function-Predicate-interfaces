// 2nd questions of predicate>>>>>>
import java.util.function.*;
class P2 {
    public static void main(String[] args) {
        Predicate <String> p = str->{
            String reverse="";
            for(int i=str.length()-1; i>=0; i--){
                reverse+= str.charAt(i);
            }
            if(str.toLowerCase().equals(reverse.toLowerCase())){
            return true;
         }
         return false;
        };

        System.out.println(p.test("madamji"));
    }
}
