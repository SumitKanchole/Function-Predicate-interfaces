// 1st question of function interface
import java.util.function.Function;
class F1 {
    public static void main(String[] args) {
      Function <Double,Double> f = a-> a*0.621;

       System.out.println(f.apply(1.0)+" miles");
    }
}
