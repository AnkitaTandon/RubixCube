/*
 * The CubieColor class defines the set of colors and their respective directions that can be held
 * by an individual cubie.
 */

public class CubieColor {

	private char color;
	private char dir; //Direction of color
	
	public CubieColor(char ncolor, char ndir) {
		color = ncolor;
		dir = ndir;
	}
	
	/**
	 * @return The color associated with this direction of the cubie
	 */
	public char getColor() {
		return color;
	}
	
	/**
	 * @return The direction associated with this color of the cubie
	 */
	public char getDir() {
		return dir;
	}
	
	/**
	 * Changes the direction of the color to the parameter
	 * @param ndir the new direction
	 */
	public void setDir(char ndir) {
		dir = ndir;
	}
	
	/**
	 * Sets the color to the parameter
	 * @param ncolor the new color
	 */
	public void setColor(char ncolor) {
		color = ncolor;
	}
	
}
