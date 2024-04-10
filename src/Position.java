import java.util.ArrayList;

public class Position implements PositionInterface{

	// State variables
	private int x;
	private int y;
	
	/**
	 * This is the class constructor we need to know
	 * the starting position
	 * @x this is the initial x position
	 * @y this is the initial y position
	 * */
	public Position(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	/**
	 * This moves along x
	 * */
	public void MoveInX(int steps) {
		this.setX(this.getX() + steps);
	}

	/**
	 * This moves along y
	 * */
	public void MoveInY(int steps) {
		this.setY(this.getY() + steps);
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public ArrayList<int[]> getPositions(int maxSteps, String Direction) {
		switch(Direction) {
			case "forward":
				
				break;
		}
		return null;
	}

	@Override
	public void moveForward(int steps) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveBackwards(int steps) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveLeft(int steps) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveRight(int steps) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveDiagonally(int steps) {
		// TODO Auto-generated method stub
		
	}
}
