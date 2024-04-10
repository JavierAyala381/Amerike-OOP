import java.util.ArrayList;

public interface PositionInterface {
	public void MoveInX(int steps);
	public void MoveInY(int steps);
	public ArrayList<int[]> getPositions(int maxSteps, String Direction);
	// This moves to the front n steps
	public void moveForward(int steps);
	// This moves to the back n steps
	public void moveBackwards(int steps);
	// This moves to the left n steps
	public void moveLeft(int steps);
	// This moves to the right n steps
	public void moveRight(int steps);
	// This moves diagonally
	public void moveDiagonally(int steps);
}
