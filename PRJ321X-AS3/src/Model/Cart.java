package Model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<product> item;
	public Cart() {
		item = new ArrayList<>();
	}
//add a new product to cart
	public void add(product ci) {
		for(product x:item) {
			if(ci.getProduct_id()== x.getProduct_id()) {
				x.setNumber(x.getNumber()+1);
				return;
			}
		}
		item.add(ci);
	}
	//remove product from cart
	public void remove(int id) {
		for(product x:item) {
			if(x.getProduct_id()==id) {
				item.remove(x);
				return;
			}
		}
		
	}
	//return total amount of cart
	public double getAmount() {
		double s=0;
	for(product x:item) {
		s+=x.getProduct_price()*x.getNumber();
	}	
	return Math.round(s*100.0)/100.0;
	}
	public List<product> getItems(){
		return item;
	}
}
