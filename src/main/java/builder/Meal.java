package builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private List<Item> items = new ArrayList();
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public float getCost() {
		float cost = 0.0f;
		cost = (float) items.stream().filter(e -> e.price() > 0).mapToDouble(Item::price).sum();
		return cost;
	}
	
	public void showItems() {
		for (Item item : items) {
			System.out.println("Item: " + item.name());
			System.out.println(", Packing: " + item.packing().packing());
			System.out.println(", Price: " + item.price());
		}
	}

}
