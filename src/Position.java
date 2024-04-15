import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Position implements PositionInterface{

	/**
	 * This are the class state variables that describe
	 * the position on an object in space
	 * */
	private int x;
	private int y;
	
	/**
	 * This is the class constructor we need to know
	 * the initial state of the position class
	 * @x initial x position
	 * @y initial y position
	 * */
	public Position(int x, int y) {
		this.setPosition(new int[] {x,y});
	}
	
	/**
	 * Sets the position give then x and y coordinate
	 * */
	public void setPosition(int[] cordinate) {
		this.setX(cordinate[0]);
		this.setY(cordinate[1]);
	}
	
	private int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}

	private int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

	/**
	 * Move the piece forward by n steps
	 * */
	@Override
	public void moveForward(int steps) {
		setPosition(this.computeForward(steps));
	}
	
	 /**
	  * Computes the new position given the number of steps to give
	  * */
	private int[] computeForward(int steps) {
		int yCordinate =  this.getY() + steps;
		int[] cordinate = {this.getX(), yCordinate};
		return cordinate;
	};

	@Override
	public void moveBackwards(int steps) {
		this.setPosition(this.computeBackwards(steps));
	}

	private int[] computeBackwards(int steps) {
		int yCordinate =  this.getY() - steps;
		int[] cordinate = {this.getX(), yCordinate};
		return cordinate;
	};
	
	@Override
	public void moveLeft(int steps) {
		this.setPosition(this.computeLeft(steps));
	}

	private int[] computeLeft(int steps) {
		int xCordinate =  this.getX() - steps;
		int[] cordinate = {xCordinate, this.getY()};
		return cordinate;
	};
	
	@Override
	public void moveRight(int steps) {
		this.setPosition(this.computeRight(steps));
	}
	
	private int[] computeRight(int steps) {
		int xCordinate =  this.getX() + steps;
		int[] cordinate = {xCordinate, this.getY()};
		return cordinate;
	};

	// Computes the coordinate of the diagonal movements ...
	private int[] computeForwardRight(int steps) {
		int[] forwardStep = this.computeForward(steps);
		int[] rightStep = this.computeRight(steps);
		int[] compoundStep = {rightStep[0], forwardStep[1]};
		return compoundStep;
	}
	
	private int[] computeForwardLeft(int steps) {
		int[] forwardStep = this.computeForward(steps);
		int[] leftStep = this.computeLeft(steps);
		int[] compoundStep = {leftStep[0], forwardStep[1]};
		return compoundStep;
	}
	
	private int[] computeBackwardsRight(int steps) {
		int[] backwardsStep = this.computeBackwards(steps);
		int[] rightStep = this.computeRight(steps);
		int[] compoundStep = {rightStep[0], backwardsStep[1]};
		return compoundStep;
	}
	
	private int[] computeBackwardsLeft(int steps) {
		int[] backwardsStep = this.computeBackwards(steps);
		int[] leftStep = this.computeLeft(steps);
		int[] compoundStep = {leftStep[0], backwardsStep[1]};
		return compoundStep;
	}
	
	/**
	 * Moves the piece diagonally given the direction
	 * and the amount of steps to give
	 * */
	public void moveDiagonally(int steps, Movements dir) {
		switch(dir) {
			case ForwardRight:
				int[] forwardRightStep = computeForwardRight(steps);
				this.setPosition(forwardRightStep);
				break;
			case ForwardLeft:
				int[] forwardLeftStep = computeForwardRight(steps);
				this.setPosition(forwardLeftStep);
				break;
			case BackwardsRight:
				int[] backwardsRightStep = this.computeBackwardsRight(steps);
				this.setPosition(backwardsRightStep);
				break;
			case BackwardsLeft:
				int[] backwardsLeftStep = this.computeBackwardsLeft(steps);
				this.setPosition(backwardsLeftStep);
				break;
		default:
			break;
		}
	}

	/**
	 * Computes the span of a vector in the given direction and in the given
	 * domain. For instance span the vector [1,1] from 1-5 returns
	 * [1,1], [2,2], [3,3], [4,4], [5,5] all which belong to the span of [1,1]
	 * A vector belongs to the span of other is w = a*v where a is a constant
	 * */
	public List<int[]> computeVectorSpan(IntStream domain, Movements spanDir) {
		List<int[]> vectorSpan =  new ArrayList<int[]>();
		// Create the array or position base on the direction
		switch(spanDir) {
			case Forward:
				domain.forEach(a -> vectorSpan.add(this.computeForward(a)));
				break;
			case Backwards:
				domain.forEach(a -> vectorSpan.add(this.computeBackwards(a)));
				break;
			case Left:
				domain.forEach(a -> vectorSpan.add(this.computeLeft(a)));
				break;
			case Right:
				domain.forEach(a -> vectorSpan.add(this.computeRight(a)));
				break;
			case ForwardLeft:
				domain.forEach(a -> vectorSpan.add(this.computeForwardLeft(a)));
				break;
			case ForwardRight:
				domain.forEach(a -> vectorSpan.add(this.computeForwardRight(a)));
				break;
			case BackwardsLeft:
				domain.forEach(a -> vectorSpan.add(this.computeBackwardsLeft(a)));
				break;
			case BackwardsRight:
				domain.forEach(a -> vectorSpan.add(this.computeBackwardsRight(a)));
				break;
			//!TODO: Add the span for the L-Shape movement
			default:
				break;
		}
		
		return vectorSpan;
	}

}
