package sg.edu.nus.sudoku.model;

import java.util.LinkedList;

import sg.edu.nus.sudoku.gui.Cell;

/**
 * The <tt>SudokuCell</tt> class is used as the backend representation of the
 * cells present in any sudoku game. The difference between <tt>SudokuCell</tt>
 * and the <tt>Cell</tt> class is its scope of work. The responsibility of
 * the <tt>SudokuCell</tt> is to check if any value assigned to it fits in with
 * its <tt>SudokuConstraint</tt>s and either returns false or spits out an
 * Exception if it is unable to do so. The <tt>Cell</tt>'s job is simply to 
 * display values and to take them in. I would suggest strongly that whoever 
 * writes anything within this code <b>NOT</b> reference any GUI component
 * directly, but rather, expose it using the <tt>ValueDisplayInterface</tt>.
 * <br/>
 * Points for OO-ness!
 * @author shawn
 *
 */
public class SudokuCell {

	private Cell cell;
	private SudokuValue value;
	private LinkedList<SudokuValue> availableValues;
	private SudokuConstraint[] constraints;
	private boolean isGiven;
	/**
	 * @param cell
	 * @param value
	 * @param constraints
	 */
	public SudokuCell(Cell cell, String value, SudokuConstraint[] constraints) {
		super();
		this.cell = cell;
		this.value = SudokuValue.valueOf(value);
		this.constraints = constraints;
	}
	

	/**
	 * @return the value
	 */
	public SudokuValue getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = SudokuValue.valueOf(value);
	}
	
	public void setValue(SudokuValue value) {
		this.value = value;
	}
	/**
	 * @return the cell
	 */
	public Cell getCell() {
		return cell;
	}
	/**
	 * @return the availableValues
	 */
	public LinkedList<SudokuValue> getAvailableValues() {
		return availableValues;
	}
	/**
	 * @return the constraints
	 */
	public SudokuConstraint[] getConstraints() {
		return constraints;
	}
	/**
	 * @return the isGiven
	 */
	public boolean isGiven() {
		return isGiven;
	}
	
	private void updateAvailableValues() {
		
	}
}
