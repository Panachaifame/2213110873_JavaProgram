
public class TimeLauncher {

	public static void main(String[] args) {
		//Test Constructor and toString()
		//Constructor whit paramiter
		Time t1 = new Time(1,2,3);
		System.out.print(+1);//call toString() method
		//Default Constructor
		Time t2 = new Time();
		System.out.println(t2);//call toString() method
		
		
		//test Setters and Getter
		t1.setHour(4);
		t1.setMinute(5);
		t1.setSecond(6);
		System.out.println("\n"+t1);
		System.out.println("hour is: "+t1.getHour());
		System.out.println("minute is: "+t1.getMinute());
		System.out.println("second is: "+t1.getSecond());
		//test settime
		t1.setTime(58, 59, 23);
		System.out.println("\n"+t1);
	}
}
