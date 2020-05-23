package stepProject2.lombok;

import lombok.SneakyThrows;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SneakyApp {
  public static void main1(String[] args) {
    List<Integer> data = Arrays.asList(1, 2, 3);
    try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File("1.txt")))) {
      data.forEach(d -> new Consumer<Integer>() {
        @Override
        public void accept(Integer integer) {
          try {
            bw.write(integer);
          } catch (IOException e) {
            throw new RuntimeException(e);
          }
        }
      });
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    List<Integer> data = Arrays.asList(1, 2, 3);
    try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File("1.txt")))) {
      data.forEach(d -> new Consumer<Integer>() {
        @SneakyThrows
        @Override
        public void accept(Integer integer) {
          try {
            bw.write(integer);
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
      });
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
