@FunctionalInterface
interface Square<T>{
    T calculate(T x);
}

//@FunctionalInterface
//interface Map<K,V,U> {
 // map()
//}

class Pair<K,V>{
 private final K key;
 private final V value;
 
 public Pair(K key, V value){
   this.key = key;
   this.value = value;
 }
 
 public K getKey(){
   return key;
 }
 public V getValue(){
   return value;
 }
}
 
class Client{
    public static void main(String args[]){
        Integer a = 5;
        Square<Integer> square = (x)->x*x;
        int ans = square.calculate(a);
        System.out.println(ans);
        
        Square<Double> dSquare = (v)-> v*v;
        
        double dRes = dSquare.calculate(3.6);
        
        System.out.println(dRes);
    }
}