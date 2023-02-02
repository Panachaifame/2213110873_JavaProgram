
public class __Product {
	private int unit;
	
	public int getUnit () {
		return unit;
	}
	public void setUnit (int unit) {
		this.unit = unit;
	}
	public int getTotalprice() {
		return 0;
	}
	public String toString() {
		return "You buy "+ getUnit()+ "units ("+getTotalprice()+")";
	}
}
