//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball() {
		super(200,200);			//super(xPos, yPos)
		setXVel(3);
		setYVel(1);
	}
	public Ball(int xPos, int yPos) {
		super(xPos, yPos);
		setXVel(3);
		setYVel(1);
	}
	public Ball(int xPos, int yPos, int wid, int heit) {
		super(xPos, yPos, wid, heit);
		setXVel(3);
		setYVel(1);
	}
	public Ball(int xPos, int yPos, int wid, int heit, Color col) {
		super(xPos, yPos, wid, heit, col);
		setXVel(3);
		setYVel(1);
	}
	public Ball(int xPos, int yPos, int wid, int heit, Color col, int xVel, int yVel) {
		super(xPos, yPos, wid, heit, col);

		setXVel(xVel);
		setYVel(yVel);
	}
   //add the set methods
   public void setXVel(int xVel) {
	   xSpeed = xVel;
   }
   public void setYVel(int yVel) {
	   ySpeed = yVel;
   }

   public void moveAndDraw(Graphics window)
   {
	   Color temp = getColor();
	   System.out.println(temp);
	   //draw a white ball at old ball location
	   setColor(Color.WHITE);
	   draw(window, getColor());
	   
	   //set new positions
	   setPos(getX()+xSpeed, getY()+ySpeed);

	   //draw the ball at its new location
	   setColor(Color.BLACK);
	   
	   draw(window, getColor());
	   
   }
   
	public boolean equals(Object obj)
	{
		Ball pelota = (Ball) obj;

		return super.equals(pelota)
			&& xSpeed == pelota.getXVel() 
			&& ySpeed == pelota.getYVel();
		//x, y, wid, ht, color, xSpd, ySpd all equal
	}   

	//add the get methods
	public int getXVel() {
		return xSpeed;
	}
	public int getYVel() {
		return ySpeed;
	}
   //add a toString() method
	public String toString() {
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor()+"\t"+xSpeed + " " + ySpeed;
	}

}