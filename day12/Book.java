package day12;

public class Book {
	private String title;
	private String author;
	private double price;
	private int numofcopies;
	Book(String title,String author,double price,int numofcopies){
		this.title=title;
		this.author=author;
		this.price=price;
		this.numofcopies=numofcopies;
		
	}
	public String getTitle() {
		return title;

	
}
	public String getAuthor() {
		return author;

	
}
	public double getPrice() {
		return price;

	
}
	public int getNumofcopies() {
		return numofcopies;

	
}
	public void  setTitle (String title) {
		this.title=title;
		
	}
	public void  setAuthor (String author) {
		this.author=author;
	
	}
	public void  setPrice (double  price) {
		this.price=price;
	
}
	public void  setNumofcopies(int numofcopies) {
		this.numofcopies=numofcopies;
	}
	public String toString() {
		return "Title = "+title+" Author = "+author+" Price = "+price+" Num of copies = "+numofcopies;
	}
}

