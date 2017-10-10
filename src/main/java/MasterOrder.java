import java.util.ArrayList;

public class MasterOrder {

	ArrayList<CookieOrder> orders = new ArrayList<CookieOrder>();
	
	
	public void addOrder(CookieOrder order) {
		orders.add(order);
	}
	
	public int getTotalBoxes() {
		int totalBoxes = 0;
		for(CookieOrder order : orders) {
			totalBoxes += order.getNumBoxes();
		}
		
		return totalBoxes;
	}
	
	public void removeVariety(String variety) {
	
		for(int i = orders.size()-1; i>=0; i--) {
			if(orders.get(i).getVariety().equals(variety)) {
				orders.remove(i);
			}
		}
		
	}
	
	public int getSize() {
		return orders.size();
	}
	
	public void showOrder() {
		for(CookieOrder order: orders) {
			System.out.println(order);
		}
	}
	
}
