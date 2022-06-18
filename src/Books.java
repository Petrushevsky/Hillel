import java.util.Objects;

public class Books {
    //поля нашего класса скрыты
    private final String bookName;
    private final String bookAuthor;
    private final Integer bookYear;
    private final String bookType;

    //через конструктор передаем значения полям
    public Books(String bookName, String bookAuthor, String bookType, Integer bookYear) {
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
        this.bookType = bookType;
        this.bookYear = bookYear;
    }

    @Override
    public boolean equals(Object o) {
        //сравниваем объекты
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        //сравниваем все поля
        return bookYear == books.bookYear && bookName.equals(books.bookName) && bookAuthor.equals(books.bookAuthor) && bookType.equals(books.bookType);
    }

    @Override
    public int hashCode() {
        //хеши
        return Objects.hash(bookName, bookAuthor, bookType, bookYear);
    }

    public String toString() {
        //выводим красиво в строку
        return "Имя книги: " + bookName + " Автор книги:  " + bookAuthor + " тип произведения: " + bookType + " год выпуска " + bookYear;

    }


}
