package day22;

public class Book {
String bookname;
String Author;
int noofcopies;
double price;

public Book(String bookname, String author, int noofcopies, double price) {
	super();
	this.bookname = bookname;
	Author = author;
	this.noofcopies = noofcopies;
	this.price = price;
}
@Override
public String toString() {
	return "Book [bookname=" + bookname + ", Author=" + Author + ", noofcopies=" + noofcopies + ", price=" + price
			+ "]";
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
public int getNoofcopies() {
	return noofcopies;
}
public void setNoofcopies(int noofcopies) {
	this.noofcopies = noofcopies;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}


