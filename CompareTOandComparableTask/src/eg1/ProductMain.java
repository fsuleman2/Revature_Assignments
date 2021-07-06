package eg1;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ProductMain {

	public static void main(String[] args) {
		
		List<Product> pList = new ArrayList<>();
		pList.add(new Product(101,"Dell",201,50000,54000.2f,4.7f,"yes"));
		pList.add(new Product(102,"Hp",202,40000,44000.2f,4.8f,"no"));
		pList.add(new Product(101,"Dell",203,30000,34000.4f,3.7f,"yes"));
		Collections.sort(pList);
		System.out.println("\n\nPrinting all the Product  based on Price(ascending)");
		printProductList(pList);
	}
	public static void printProductList(List<Product> pList) {
		Iterator<Product> i = pList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
