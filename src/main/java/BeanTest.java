import models.Album;
import models.Author;
import models.Employee;
import models.Quote;

import java.time.Year;
import java.util.ArrayList;
import java.util.Date;

public class BeanTest {
    public static void main(String[] args) {
       Album album = new Album();
        album.setIdNo(1L);
        album.setArtist("blues brothers");
        album.setName("I dont Know");
        album.setReleaseDate(2021);
        album.setSales(5000000);
        album.setGenre("okay");

        Author author = new Author();
        author.setFirstName("Ryan");
        author.setLastName("Phillips");
        author.setIdNo(1L);


        Quote firstQuote= new Quote();
        firstQuote.setAuthor(author);
        firstQuote.setContent("Close only matters in horseshoes and hand grenades");
        firstQuote.setIdNo(1L);

     Quote secondQuote= new Quote();
     secondQuote.setAuthor(author);
     secondQuote.setContent("blah blah blah");
     secondQuote.setIdNo(2L);

        System.out.println(album.getArtist());
        System.out.println(author.getLastName());
        System.out.println(firstQuote.getContent());
        System.out.println(firstQuote.getAuthor().getFirstName());


     ArrayList<Quote> quotes = new ArrayList<>();
     quotes.add(firstQuote);
     quotes.add(secondQuote);


     for (Quote q: quotes) {
      System.out.println(q.getContent());
      System.out.println(q.getAuthor().getFirstName());
     }
    }

}
