package com.xworkz.amazon.dao;

public class ArrayAmazonCartDAO implements AmazonCartDAO
{
	 private CartDTO[] dtos= new CartDTO[100];;
     private int counter;

    @Override
	public boolean save(CartDTO cartDTO) 
	{
		System.out.println("invoked save");
		return false;
	}

	@Override
	public CartDTO findByName(String name) 
	{
		System.out.println("invoked find my name");
		return null;
	}
	public void saveCart(CartDTO cartDTO, int i) {
		System.out.println("save cartDTOs dto and int cost:".concat(cartDTO.getName()));
		if (i >= 0 && this.counter < this.dtos.length && this.counter >= 0 && dtos != null) {
			this.dtos[this.counter++] = cartDTO;
			System.out.println("create cartDTOs dto and int cost:".concat(String.valueOf(i)));
		} else {
			System.out.println("Cannot create the cartDTOs :".concat(String.valueOf(this.counter)));
		}
	}

	public void saveCart(CartDTO cartDTOs1) {
		System.out.println("invoked saveCart ");

		if (this.counter < this.dtos.length && this.counter >= 0) {
			this.dtos[this.counter++] = cartDTOs1;

		} else {
			System.out.println("Cannot saveCart the dtos :".concat(String.valueOf(this.counter)));
		}
	}

	@Override
	public void displayAllCartDetails() 
	{
		System.out.println("invoked displayAllCartDetails ");
	}
}
