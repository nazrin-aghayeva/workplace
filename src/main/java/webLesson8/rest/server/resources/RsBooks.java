package webLesson8.rest.server.resources;

import lesson42w09.rest.entity.Book;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Path("books")
public class RsBooks {

  private final Map<Integer, Book> books = new HashMap<Integer, Book>() {{
    put(1, new Book(1, "Java", "Jim", Arrays.asList("a", "b", "c")));
    put(2, new Book(2, "Scala", "John", Arrays.asList("d")));
    put(3, new Book(2, "Haskell", "Jeremy", Arrays.asList("e", "f")));
  }};

  /**
   * http://localhost:8081/shop/books
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response books_all() {
    return Response
        .status(200)
        .entity(books.values())
        .build();
  }

  /**
   * http://localhost:8081/shop/books/1
   * http://localhost:8081/shop/books/2
   * http://localhost:8081/shop/books/3
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/{id}")
  public Response book_one(@PathParam("id") int book_id
//  , @CookieParam("myName")Cookie cookie
  ) {
    return Response
        .status(200)
        .entity(books.get(book_id))
        .build();
  }

  /**
   * http://localhost:8081/shop/books
   * postman !
   */
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public Response book_post(Book book) {
    System.out.printf("I've got this book: %s\n", book);
    return Response
        .status(201)
        .build();
  }

  /**
   * http://localhost:8081/shop/books/form
   * postman !
   * a=5
   * b=Hello
   */
  @POST
  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
  @Path("form")
  public Response book_post(@QueryParam("a") int a, @QueryParam("b") String b) {
    System.out.println("Handler int, string");
    System.out.printf("a=%s\n",a);
    System.out.printf("b=%s\n",b);
    return Response
        .status(200)
        .build();
  }

}
