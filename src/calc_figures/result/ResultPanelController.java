package calc_figures.result;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ResultPanelController {

	@FXML
	private TextField areaResult;
	
	@FXML
	private TextField circutResult;

	public void setAreaResult(TextField areaResult) {
		this.areaResult = areaResult;
	}
	public void setCircutResult(TextField circutResult) {
		this.circutResult = circutResult;
	}
	public TextField getAreaResult() {
		return areaResult;
	}
	public TextField getCircutResult() {
		return circutResult;
	}
	public void setTextToAreaResult(String value) {
		areaResult.setText(value);
	}
	
	public void setTextToCircutResult(String value) {
		circutResult.setText(value);
	}
}
