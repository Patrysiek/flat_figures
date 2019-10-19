package calc_figures.figures;

public class Square implements IFigureCalculate{

	@Override
	public double calculateArea(double... dimensions)  {
		return dimensions[0]*dimensions[0];
	}

	@Override
	public double calculateCircut(double... dimensions) {
		
		return 4*dimensions[0];
	}

}
