import javax.swing.JOptionPane;

public class INTENSEWeather {
	public static void main(String[] args) {
		String T = JOptionPane.showInputDialog("What is the Temp.? (in Fareignhieght)#spielling");
		if (T.equals("?")) {
			JOptionPane.showMessageDialog(null, "Good Luck!");
		} else {

			int q = Integer.parseInt(T);
			if (q < 0) {
				JOptionPane.showMessageDialog(null, "Don't turn into a popsickle!");
			} else if (q < 40) {
				JOptionPane.showMessageDialog(null, "Wear a jacket!");
			} else if (q < 90) {
				JOptionPane.showMessageDialog(null, "The weather is not that bad.");
			} else if (q >= 90) {
				JOptionPane.showMessageDialog(null, "Don't forget the sunscreen!");
			}
		}

	}
}
