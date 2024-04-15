import java.util.List;
import java.util.stream.IntStream;

public interface PositionInterface {
	/** Allowed piece movements */
	public static enum Movements {
		Forward,
		Backwards,
		Left,
		Right,
	    ForwardRight,
	    ForwardLeft,
	    BackwardsRight,
	    BackwardsLeft,
	    LShape
	}
	
	/** Moves the piece forward by increasing its position by n   */
	public void moveForward(int steps);
	/** Moves the piece backwards by decreasing its position by n */
	public void moveBackwards(int steps);
	/** Moves the piece left by increasing its position by n */
	public void moveLeft(int steps);
	/** Moves the piece right by increasing its position by n */
	public void moveRight(int steps);
	/** Moves the piece diagonally by increasing its position by n */
	public void moveDiagonally(int steps, Movements dir);
	/** Calculates the span of a vector given the direction of the vector and the span domain */
	public List<int[]> computeVectorSpan(IntStream domain, Movements spanDir);
}
