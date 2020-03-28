package warmup24;

public class IsPalindrome {
  boolean check(int n) {
    int remain = 0;
    int sum = 0;
    int tempor = n;
    while (n >0) {
      remain = n % 10;
      sum = (sum * 10) + remain;
      n /= 10;
    }
    return tempor == sum;
  }
  }
