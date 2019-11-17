import java.util.Dictionary;

/**
 * @program: six
 * @description:
 * @author: Lillian
 * @create: 2019-11-17 16:13
 **/
public class BookManager {
    public static void main(String[] args){
        Dictionary dictionary = new Dictionary("INB001","CookBook",90,9);

        int pages = dictionary.pages;

        dispaly(String.valueOf(pages));
        dispaly(dictionary.getBookName());

        Book book = new Book("INB02","Jame",98);
        Book bookDictionary = new Dictionary(book,11);
        display(book.getBookId());
        display(bookDictionary.getBookId());
    }
    public static void dispaly(String content){
        System.out.println(content);
    }
}
