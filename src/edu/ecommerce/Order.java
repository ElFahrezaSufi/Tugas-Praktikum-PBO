package edu.ecommerce;

public class Order {
	private String orderId;
	private String customerName;
	private double total;

	public Order(String orderId, String customerName) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.total = 0;
	}

	public String getOrderId() {
		return orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getTotal() {
		return total;
	}

	public class OrderItem {
		private String productName;
		private double price;
		private int quantity;

		public OrderItem(String productName, double price, int quantity) {
			this.productName = productName;
			this.price = price;
			this.quantity = quantity;
		}

		public String getProductName() {
			return productName;
		}

		public double getPrice() {
			return price;
		}

		public int getQuantity() {
			return quantity;
		}

		public double getSubtotal() {
			return this.price * this.quantity;
		}
	}

	public double hitungTotal(OrderItem[] items) {
		double totalPesanan = 0;

		for (int i = 0; i < items.length; i++) {
			totalPesanan += items[i].getSubtotal();
		}

		this.total = totalPesanan;
		return this.total;
	}

	public void tampilkanRincian(OrderItem[] items) {
		System.out.println("=== RINCIAN PESANAN ===");
		System.out.println("Order ID: " + this.orderId);
		System.out.println("Customer: " + this.customerName);
		System.out.println();

		for (int i = 0; i < items.length; i++) {
			System.out.println("Item ke-" + (i + 1));
			System.out.println("Produk: " + items[i].getProductName());
			System.out.printf("Harga: Rp.%.2f\n", items[i].getPrice());
			System.out.println("Jumlah: " + items[i].getQuantity());
			System.out.printf("Subtotal: Rp.%.2f\n", items[i].getSubtotal());
			System.out.println();
		}

		System.out.printf("Total Harga Pesanan: Rp.%.2f\n", this.total);
	}
}
