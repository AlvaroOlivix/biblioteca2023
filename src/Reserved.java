import java.util.ArrayList;

public class Reserved {
    private String code;
    private String loanDate;
    private String returnDate;
    private String User;
    private ArrayList<Book> books;
    private User user;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getUser() {
        return User;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUser(String user) {
        User = user;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
