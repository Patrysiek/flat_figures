package calc_figures;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

import calc_figures.figures.IFigureCalculate;
import calc_figures.figures.Rectangle;
import calc_figures.figures.Square;
import calc_figures.result.ResultPanelController;
import calc_figures.square.ValueGiver;
import calc_figures.square.ValueListener;

public class Controller implements ValueListener {

	@FXML
	private BorderPane rootPane;
	@FXML
	private Pane contentPane;
	private ResultPanelController resultPanelController;

	IFigureCalculate calculator;

	public void prepareSquarePanel() throws Exception {
		calculator = new Square();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("square/squarePanel.fxml"));
		setContentofContentPane(loader);
		registerValueGiver(loader.getController());
		prepareResultPanel();
	}

	public void prepareRectanglePanel() throws Exception {
		calculator = new Rectangle();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("rectangle/rectanglePanel.fxml"));
		setContentofContentPane(loader);
		registerValueGiver(loader.getController());
		prepareResultPanel();

	}

	private void prepareResultPanel() throws IOException {
		if (resultPanelController != null)
			return;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("result/resultPanel.fxml"));
		rootPane.setBottom(loader.load());
		resultPanelController = loader.getController();
	}

	private void registerValueGiver(Object valueGiver) throws Exception {
		if (!(valueGiver instanceof ValueGiver))
			throw new Exception();
		((ValueGiver) valueGiver).registerListener(this);

	}

	private void setContentofContentPane(FXMLLoader loader) throws IOException {
		Parent parent = loader.load();
		rootPane.setCenter(parent);
	}

	@Override
	public void preprocessData(double... values) {
		double area = calculator.calculateArea(values);
		double circut = calculator.calculateCircut(values);
		setValuesToResultPanel(area, circut);
	}

	private void setValuesToResultPanel(double area, double circut) {
		resultPanelController.setTextToAreaResult(Double.toString(area));
		resultPanelController.setTextToCircutResult(Double.toString(circut));
	}
}

