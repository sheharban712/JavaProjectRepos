package aggregation;

public class Book {
	String bookName,pDate;
	int noOfCopies;
	Author au;
	public Book(String bookName,String pDate,int noOfCopies,Author au)
	{
		this.bookName=bookName;
		this.pDate=pDate;
		this.noOfCopies=noOfCopies;
		this.au=au;
	
	}
	public void display()
	{
		System.out.println("Book Name :"+bookName);
		System.out.println("Published Date :"+pDate);
		System.out.println("No Of Copies :"+noOfCopies);
		System.out.println("Author Name :"+au.name);
		System.out.println("Author's nick name :"+au.nickname);
		System.out.println("Bio :"+au.bio);
		
	}

	public static void main(String[] args) {
		Author ath=new Author("JK Rowling","JK","British Author");
		 Book bk=new Book("Harry Potter","20/12/2012",1000,ath);
		 bk.display();

	}

}
