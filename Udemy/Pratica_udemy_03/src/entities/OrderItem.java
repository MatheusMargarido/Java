package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	private Product produto;

	public OrderItem() {

	}

	public OrderItem(Integer quantity, Double price, Product produto) {
		this.quantity = quantity;
		this.price = price;
		this.produto = produto;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduto() {
		return produto;
	}

	public double subTotal() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return produto.getName() + ", $" + String.format("%.2f", price) + ", Quantity: " + quantity + ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}

}
