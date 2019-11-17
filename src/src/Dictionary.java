/**
 * @program: six
 * @description: 继承父类Book
 * @author: Lillian
 * @create: 2019-11-17 17:13
 **/
public class Dictionary {
    private  int definitions;

    public Dictionary(){
    }
    public Dictionary(Book book,int definitions){
        super(book.getBookId(),book.getBookName()book.getPages());
        this.definitions = definitions;
    }

    public Dictionary(String bookId,String bookName,int pages,int definitions){
        super(bookId,bookName,pages);
        this.definitions = definitions;
    }
    public  int getDefinitions(){
        return  definitions;
    }
    public void setDefinitions(int definitions){
        this.definitions = definitions;
    }
    public String getBookId(){
        return DefaultValue.DICTIONARY_SKU + super.getBookId();
    }
}
