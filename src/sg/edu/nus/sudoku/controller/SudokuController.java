package sg.edu.nus.sudoku.controller;

import sg.edu.nus.sudoku.model.SudokuCell;
import sg.edu.nus.sudoku.model.SudokuConstraint;
/**
 * This is essentially the "brain" of the entire game. It governs anything
 * that concerns the entire sudoku "board": Loading of a new game, initialising 
 * <tt>SudokuCell</tt>s and assigning them to the appropriate <tt>Cell</tt>
 * and <tt>SudokuConstraint</tt>
 * <br/>
 * Unlike the <tt>SudokuCell</tt> class, I haven't fully thought out the
 * attributes required for this class yet. So its incomplete.
 * @author shawn
 *
 */
public class SudokuController {
	private SudokuConstraint[] rowconstraints;
	private SudokuConstraint[] columnconstraints;
	private SudokuConstraint[] squareconstraints;
	private SudokuCell[] cells;
	
}
