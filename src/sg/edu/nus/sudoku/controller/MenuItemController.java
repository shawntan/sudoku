/**
 * 
 */
package sg.edu.nus.sudoku.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * I'd guess we'll all want a menu beside our sudoku "board" in the GUI,
 * so this class governs any of the actions performed on the menu.
 * I was thinking of creating a method that reflectively calls the action
 * method based on the text on the button. This will allow anyone assigned to
 * do the menu buttons to simply add the button, add this object as its action
 * listener, and create a new method here, say <tt>btnRestartGame</tt> if the
 * button text is "Restart Game".
 * 
 * @author shawn
 *
 */
public class MenuItemController implements ActionListener {

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
