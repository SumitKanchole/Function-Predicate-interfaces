// 2nd question of function interface>>
import java.util.function.Function;
class F2 {
    public static void main(String[] args) {
      Function <String,String> f = a->{ 
          String rev="";
          for(int i=a.length()-1; i>=0; i--){
              rev += a.charAt(i);
          }
          return rev;
      };

       System.out.println(f.apply("sumit kanchole"));
    }
}
