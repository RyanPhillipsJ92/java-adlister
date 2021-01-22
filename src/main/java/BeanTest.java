import models.Album;
import models.Author;
import models.Employee;
import models.Quote;

import java.time.Year;
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
        author.setIdNo(8675309);

        Quote quote= new Quote();

        quote.setContent("Close only matters in horseshoes and hand grenades");
        quote.setIdNo(8675309);

        System.out.println(album.getArtist());
        System.out.println(author.getLastName());
        System.out.println(quote.getContent());

    }

}
