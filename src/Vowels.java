import javax.swing.JOptionPane;

public class Vowels {
	public static void main(String[] args) {
		for (int i = 0; i < 43; i++) {

			String IIAV = JOptionPane.showInputDialog("Tell me a sentence, or you will be punished!");
			String q = IIAV.toLowerCase();
			boolean CA = q.contains("a");
			boolean CE = q.contains("e");
			boolean CI = q.contains("i");
			boolean CO = q.contains("o");
			boolean CU = q.contains("u");
			boolean CY = q.contains("y");
			if (CY || CA || CI || CO || CE || CU) {
				JOptionPane.showMessageDialog(null, "DeRe iS A VowEl!");
			} else {
				JOptionPane.showMessageDialog(null, "DErE Is No VoWel!");
			}
		}

	}
}
