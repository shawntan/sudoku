/**
 * 
 */
package sg.edu.nus.sudoku.model;

import java.util.LinkedList;

import sg.edu.nus.sudoku.controller.SudokuController;

/**
 * It is my opinion that in algorithmically solving a sudoku puzzle, all the
 * modelled cell need not know its x,y position inside the 9X9 square. But
 * each cell, however belongs 2 3 different constraints, 1 row, 1 column, and
 * 1 3X3 square. Notice that each of these contsraints has 9 cells.
 * <br/>
 * This class is an object model of the constraints that the cells belong to.
 * Each sudoku game, controlled by <tt>SudokuController</tt> has 27 constraints,
 * and each constraint has 9 <tt>SudokuCell</tt>s
 * <br/>
 * The reason there are <tt>availableValues</tt> attributes in both Cell and
 * constraint is because this would allow the model to be able to give hints
 * to the player, and at the same time, simplifying the process of solving 
 * the sudoku (if we ever get to that point). Without it, we would need to
 * re-compute the "allowed values" every time we need it.
 * 
 * @see <a href="http://theory.tifr.res.in/~sgupta/sudoku/algo.html">The mathematics of Su Doku</a>
 * @author shawn
 *
 */
public class SudokuConstraint {
	private SudokuController controller;
	private SudokuCell[] sudokucells;
	private LinkedList<SudokuValue> availableValues;
	
}
