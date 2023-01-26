
public class BookDemo1 {
	private String title;
	private AuthorDemo author;
	private int page;
	
	public BookDemo1(String title,AuthorDemo auth,int page) {
		this.title=title;
		this.author = author;
		this.page = page;
	}
	public BookDemo1(String title,AuthorDemo author) {
		this.title=title;
		this.author = author;
		this.page = 0;
		//this(title,author,0);
	}
	public BookDemo1() {
		// this(null,null,0);
		title = "";
		author = null;
		page = 0;
	} 
	public String getTitle() {
		return title ;
	}
	public AuthorDemo getAuthor() {
		return author;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPage() {
		return page;
	}
	public String toString() {
		return "["+getTitle()+"] has ["+getPage()+"] page write by ["+toString()+" of Author class]";
	}
	
}
