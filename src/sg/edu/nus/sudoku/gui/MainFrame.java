/**
 * 
 */
package sg.edu.nus.sudoku.gui;

import java.awt.HeadlessException;

import javax.swing.JFrame;

/**
 * The main GUI class that draws the window, and loads all components,
 * e.g. JButtons, JTextFields, and the custom Cell component. This is where
 * all the LookAndFeel and Fonts should be set. By convention, a JFrame
 * usually contains a <tt>contentPane</tt> which is usually retrieved via
 * <tt>frame.getContentPane()</tt>. Subsequently, any sub JPanels added
 * should be instantiated and its properties set in separate methods. This
 * goes for ANY components generated. This way, anyone reading the code simply
 * has to go to the getComponentVariableName in order to view its properties.
 * To make the code neater, you can create a new class that <tt>extends 
 * JPanel</tt>. This way, the <tt>MainFrame</tt> class will not be cluttered
 * up with excessive methods. 
 * @author Your Name Here
 *
 */
public class MainFrame extends JFrame {

	/**
	 * @throws HeadlessException
	 */
	public MainFrame() throws HeadlessException {
		// TODO Auto-generated constructor stub
	}

}
