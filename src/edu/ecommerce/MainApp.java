package edu.ecommerce;

public class MainApp {
	public static void main(String[] args) {
		Order order = new Order("001", "Andi");

		Order.OrderItem item1 = order.new OrderItem("Keyboard", 200000, 2);
		Order.OrderItem item2 = order.new OrderItem("Mouse", 150000, 2);
		Order.OrderItem item3 = order.new OrderItem("Headset", 250000, 1);

		Order.OrderItem[] items = {item1, item2, item3};

		order.hitungTotal(items);
		order.tampilkanRincian(items);
	}
}
