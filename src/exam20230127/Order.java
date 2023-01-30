package exam20230127;

public class Order {
	private int orderId;
	private String productName;
	private String consumerName;
	private int price;
	private int stock;
	
	public Order(int orderId, String productName, String consumerName, int price, int stock) { //전체생성자 필수.
		this.orderId = orderId;
		this.productName = productName;
		this.consumerName = consumerName;
		this.price = price;
		this.stock = stock;		
	}
		
	public void showOrderInfo() {
		System.out.println(toString());
	}
	
	public static OrderBuilder builder() {
		return new OrderBuilder();
	}
	
	public static class OrderBuilder {															//Order와 똑같은 멤버변수를 갖는다.
		private int orderId;
		private String productName;
		private String consumerName;
		private int price;
		private int stock;
		
		public OrderBuilder orderId(int orderId) {												
			this.orderId = orderId;
			return this;
		}
		
		public OrderBuilder productName(String productName) {
			this.productName = productName;
			return this;
		}
		
		public OrderBuilder consumerName(String consumerName) {
			this.consumerName = consumerName;
			return this;
		}
		
		public OrderBuilder price(int price) {
			this.price = price;
			return this;
		}
		
		public OrderBuilder stock(int stock) {
			this.stock = stock;
			return this;
		}
		
		public Order build() {																	// 최종적으로 Order를 생성자를 리턴(Order class 생성)해주는 메소드가 필수로 필요.
			return new Order(orderId, productName, consumerName, price, stock);					//OrderBuilder class에 있는 멤버변수들을 가지고 생성함.
		}
	
	}
	@Override
	public String toString() {
		return "주문번호: " + orderId + "\n상품명: "+ productName + "\n구매자: " + consumerName
				+ "\n가격: " + price + "\n수량: " + stock;
	}
	
}
