package calc_figures.square;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SquarePanelController extends ValueGiver {

	@FXML
	private TextField squareSideInput;

	@FXML
	@Override
	public void transferData() {
		double squareSideI = 0;
		try {
			squareSideI = Double.parseDouble(squareSideInput.getText());
			giveValues(squareSideI);
		} catch (Exception e) {
			System.out.println("You gave wrong number");
		}
	}
}
