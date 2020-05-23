package stepProject6.res;

import lombok.ToString;

import java.io.*;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReadingResourceApp {

  @ToString
  static class Worker {
    public final int id;
    public final String name;
    public final int age;

    Worker(int id, String name, int age) {
      this.id = id;
      this.name = name;
      this.age = age;
    }

    static Worker from(String id, String name, String age) {
      return new Worker(Integer.parseInt(id), name, Integer.parseInt(age));
    }

    static Worker from(String[] data) {
      return Worker.from(data[0], data[1], data[2]);
    }

    static Worker from(String s) {
      return Worker.from(s.split(";"));
    }

  }

  static String textFile2() {
    String fileName = ReadingResourceApp.class
        .getClassLoader().getResource("data.txt").getFile();
    File file = new File(fileName);
    throw new RuntimeException("should be implemented");
  }

  public Optional<List<Worker>> textFile()  {
    String fileName = this.getClass()
        .getClassLoader().getResource("data.txt").getFile();

    File file = new File(fileName);

    try (BufferedReader br = new BufferedReader(new FileReader(file))) {

      List<Worker> collected = br.lines()
          .map(Worker::from)
          .collect(Collectors.toList());
      return Optional.of(collected);


    } catch (FileNotFoundException e) {
      return Optional.empty();
    } catch (IOException e) {
      return Optional.empty();
    }
  }


  public static void main(String[] args) {
    Optional<List<Worker>> data = new ReadingResourceApp().textFile();
    System.out.println(data);
  }
}
