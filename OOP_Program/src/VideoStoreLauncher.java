
public class VideoStoreLauncher {

	public static void main(String[] args) {
		Video vid1 = new Video();
		vid1.setTitle("The Godfather");

		vid1.addRating(3);
		vid1.addRating(2);
		vid1.addRating(5);

		System.out.print(vid1.getTitle() + " :" + vid1.getRating());

		vid1.checkOut();
		getStatus(vid1);//สามารถได้เพราะอยู่ในclassเดียวกัน
		vid1.returnStore();
		getStatus(vid1);
	}

	public static void getStatus(Video v) {
		if (v.isCheckOut()) {
			System.out.print("\'" + v.getTitle() + "\'is checked out.");
		} else {
			System.out.print("\'" + v.getTitle() + "\' is on the shelves.");
		}
	}

}
