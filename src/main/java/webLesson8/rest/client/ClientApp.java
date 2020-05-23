package webLesson8.rest.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lesson42w09.rest.entity.Book;

import javax.ws.rs.HttpMethod;
import javax.ws.rs.core.MediaType;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class ClientApp {

  private static Optional<String> mkHttpGet(String address)  {
    try {
      URL url = new URL(address);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod(HttpMethod.GET);
      try (InputStream is = conn.getInputStream()) {
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        return Optional.of(br.lines().collect(Collectors.joining("\n")));
      } catch (IOException x) {
        return Optional.empty();
      }
    } catch (IOException e) {
      return Optional.empty();
    }
  }

  private static void mkHttpPost(String address) {
    try {
      URL url = new URL(address);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod(HttpMethod.POST);
      conn.setRequestProperty("Content-type", MediaType.APPLICATION_JSON);
      conn.setRequestProperty("Accept", MediaType.APPLICATION_JSON);
      conn.setDoOutput(true);
      Book b = new Book(5, "JavaScript", "BigBen", Arrays.asList("z", "x", "c"));
      ObjectMapper mapper = new ObjectMapper();
      byte[] bytes = mapper.writeValueAsBytes(b);
      try (OutputStream os = conn.getOutputStream()) {
        os.write(bytes);
      }
      try (InputStream is = conn.getInputStream()) {
      } catch (IOException x) {
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void get_example() {
    String address_get = "http://localhost:8081/shop/books/1";
    Optional<String> response = mkHttpGet(address_get);
//    System.out.println(response);

    ObjectMapper mapper = new ObjectMapper();
    Optional<Book> book = response.flatMap(body -> {
      try {
        return Optional.of(mapper.readValue(body, Book.class));
      } catch (JsonProcessingException e) {
        return Optional.empty();
      }
    });
    System.out.println(book);
  }

  public static void post_example() {
    String address_post = "http://localhost:8081/shop/books";
    mkHttpPost(address_post);
  }

  public static void main(String[] args) {
//    get_example();
    post_example();
  }

}
