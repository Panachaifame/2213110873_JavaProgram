
public class AuthorDemo {
	private String name;
	private String email;
	
	public AuthorDemo(String name,String email) {
		this.name=name;
		this.email=email;
	}
	public AuthorDemo() {
		this(null,null);
	}
	public String getname() {
		return this.name;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getemail() {
		return this.email;
	}
	public String toString() {
		return getname()+"("+getemail()+")";
	}
	
}
