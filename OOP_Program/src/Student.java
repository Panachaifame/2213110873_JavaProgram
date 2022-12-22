
public class Student {
	// attribute
	private String name;
	private int score;

	// method

	public void setName(String Name) {
		Name = name;
	}

	public String getName() {
		return name;
	}

	public void setScore(int Score) {
		score = Score;
	}

	public int getScore() {
		return score;
	}

	public boolean checkScore() {
		if (score >= 0 && score <= 100) {
			return true;
		}
		return false;
	}

	public boolean isPass() {
		if (score >= 50)
			return true;
		else
			return false;
	}
	public String findGrade(int score) {
		if (score>=80&& score >= 100)return "A";
		else if (score >=75 ) return "B+";
		else if (score >= 70) return "B";
		else if (score >= 65) return "C+";
		else if (score >= 60) return "C";
		else if (score >= 55) return "D+";
		else if (score >= 50) return "D";
		return "F";


	}

}
