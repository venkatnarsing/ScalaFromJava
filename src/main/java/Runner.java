
import org.apache.spark.unsafe.types.UTF8String;

import com.app.model.Book;
import com.app.storage.BookStorage;

import com.app.service.ScalaClass;


public class Runner {
    public static void main(String[] args) {
        /*BookStorage storage = new BookStorage();
        storage.getBooks().stream().forEach((Book b) -> System.out.println(b));*/
        
        ScalaClass scalaClass = new ScalaClass(true);
        System.out.println(scalaClass.plus(1, 1));
        
        System.out.println(scalaClass.minus(1, 1));
        
        UTF8String s1 = UTF8String.fromString("cook");
		UTF8String s2 = UTF8String.fromString("book");
        System.out.println("Levin:"+scalaClass.levenshteinDistance2(s1, s2));
        
        System.out.println("Jaro:"+scalaClass.jaroWinklerDistanceDistance(s1.toString(), s2.toString()));
    }
}
