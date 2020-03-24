package warmup22;

public class GCDApp {
  int gcd(int a, int b) {
    int k=1;
    while ((a/k)%2==0 && (b/k)%2==0){
      k++;
    }
    return k;
  }

}
