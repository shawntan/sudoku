package sg.edu.nus.sudoku.gui;

import javax.swing.JFormattedTextField;

import sg.edu.nus.sudoku.model.ValueDisplayInterface;
/**
 * Due to the needs of each of the cells of our Sudoku game, I think we need
 * to extend the existing <tt>JFormattedTextField</tt> to suit our needs.
 * The reason I created the <tt>ValueDisplayInterface</tt> was to allow the
 * <tt>SudokuCell</tt> to be able to access the <tt>.setText()</tt> method.
 * This way, SudokuCell will not be tightly bound to the Cell class and 
 * everything inside the <tt>sg.edu.us.sudoku.model</tt> could be used for more
 * than just this application. Theoretically, we could create a CLI-based, or 
 * Web-based version of the same game.<br/>
 * <br/>
 * Points for reusability and extensibility!
 * @author Your Name Here
 *
 */
public class Cell extends JFormattedTextField implements ValueDisplayInterface {
	
}
