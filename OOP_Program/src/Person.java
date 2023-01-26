
public class Person {
	private String firstname;
	private String lastname;

	public Person() {
		firstname = "";
		lastname = "";
	}

	public Person(String first, String last) {
		setName(first, last);
	}

	public void setName(String first, String last) {
		firstname = first;
		lastname = last;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String toString() {
		return firstname + " " + lastname;
	}
}
