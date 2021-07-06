package eg1;

public class Product  implements Comparable<Product>{
	/*Task - 
	 * Repeat the same using Product(id,manufacturername,
	 * productname,
	 * cost,ratings,availbility-yes/no) 
	 */
	//creating instance variables for above fields
	private int pid;
	private String manufacturername;
	private int productid;
	private double pcost;
	private float price;
	private float ratings;
	private String availability;
	public Product(int pid, String manufacturername, int productid, double pcost, float price, float ratings,
			String availability) {
		super();
		this.pid = pid;
		this.manufacturername = manufacturername;
		this.productid = productid;
		this.pcost = pcost;
		this.price = price;
		this.ratings = ratings;
		this.availability = availability;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getManufacturername() {
		return manufacturername;
	}
	public void setManufacturername(String manufacturername) {
		this.manufacturername = manufacturername;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public double getPcost() {
		return pcost;
	}
	public void setPcost(double pcost) {
		this.pcost = pcost;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", manufacturername=" + manufacturername + ", productid=" + productid
				+ ", pcost=" + pcost + ", price=" + price + ", ratings=" + ratings + ", availability=" + availability
				+ "]";
	}
	@Override
	public int compareTo(Product o) {
		String f1 = this.availability;
		String  f2 = o.availability;
		return f2.compareTo(f1);
	}
	
	
	}
