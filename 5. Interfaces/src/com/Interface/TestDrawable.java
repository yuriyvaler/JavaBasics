package com.Interface;

public class TestDrawable
{
	public static void main(String[] args)
	{
// runtime polymorphism		
		Drawable dr = new Circle();
		dr.draw();
//		draw.fillWithRedColor(); wrong
		
		dr = new Square();
		dr.draw();
	}

}
