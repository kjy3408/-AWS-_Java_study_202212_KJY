package KJY_공장;

import lombok.Data;

@Data
public abstract class Furniture {

	private String productName;
	private String color;
	private String Code;
	
	@Override
	public String toString() {
		return "Furniture [productName=" + productName + ", color=" + color + ", Code=" + Code + "]";
	}
	
	
}
