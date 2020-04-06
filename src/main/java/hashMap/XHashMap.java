package hashMap;

import java.util.NoSuchElementException;

// it will be able to keep only 128 elements
public class XHashMap {
  private final int size;
  private final int[] k;
  private final String[] v;

  public XHashMap(int size) {
    this.size = size;
    this.k = new int[size];
    this.v = new String[size];
  }

  private int index(int key) {
    return key % size;
  }

  public void put(int key, String data) {
    // 10 % 128 -> 10
    // 138 % 128 -> 10
    int idx = index(key);
    if (k[idx] != 0) {
      idx++; // idea, what if idx+1 already occupied ?????
      //throw new RuntimeException("Cell already occupied");
    }
    k[idx] = key;
    v[idx] = data;
  }

  public String get(int key) {
    int idx = index(key);
    if (k[idx] == 0) throw new NoSuchElementException();
    if (k[idx] == key) {
      return v[idx];
    } else {
      return v[idx+1];
    }

  }
}
