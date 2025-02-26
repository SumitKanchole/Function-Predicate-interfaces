// 1st question >>>>>> 
import java.util.function.*;
class P1 {
    public static void main(String[] args) {
        Predicate <String> p = email->{if(email.contains("@") && email.endsWith(".com")){
            return true;
         }
         return false;
        };

        System.out.println(p.test("kancholesumit@gmail.com"));
    }
}
