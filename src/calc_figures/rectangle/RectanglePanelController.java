package calc_figures.rectangle;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import calc_figures.square.ValueGiver;

public class RectanglePanelController extends ValueGiver {

	@FXML
	private TextField rectAInput;
	@FXML
	private TextField rectBInput;

	@FXML
	@Override
	public void transferData() {
		try {
			Double rectangleAI = Double.parseDouble(rectAInput.getText());
			Double rectangleBI = Double.parseDouble(rectBInput.getText());
			giveValues(rectangleAI, rectangleBI);
		} catch (Exception e) {
			System.out.println("You gave wrong number");
		}
	}
}
