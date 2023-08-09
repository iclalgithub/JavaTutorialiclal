package ch24_Encapsulation.task24.task03;

public class Book_kullanicigirisiisteyerek {
   private String  bookName;
   private String  authorName;

    public Book_kullanicigirisiisteyerek() {
    }

    public Book_kullanicigirisiisteyerek(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

//   public String getBookName() {
//       return bookName;
//   }

//   public void setBookName(String bookName) {
//       this.bookName = bookName;
//   }

//   public String getAuthorName() {
//       return authorName;
//   }

//    public void setAuthorName(String authorName) {
//        this.authorName = authorName;
//    }

    @Override
    public String toString() {
        return
                '"'+"Book name is " + bookName  +
                " and Author is " + authorName +
                '"';
    }


}
