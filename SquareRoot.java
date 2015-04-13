package therteenmars;

import javax.swing.JOptionPane;

public class SquareRoot {

	public static void main(String[] args) {
		String input;
		double num, sqr;
		try {
			input = JOptionPane
					.showInputDialog("Enter a number to find the square root");
			num = Double.parseDouble(input);

			if (num < 0.0) {
				JOptionPane.showConfirmDialog(null, "Invalid Number");
			} else {
				sqr = Math.sqrt(num);
				JOptionPane.showConfirmDialog(null, sqr, "Answer",
						JOptionPane.OK_CANCEL_OPTION);

			}

		} catch (Exception ex) {
			JOptionPane.showConfirmDialog(null, "Invalid Number");

		} finally {
			JOptionPane.showConfirmDialog(null, "GoodBye");
		}

	}

}
