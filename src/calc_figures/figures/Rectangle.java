package calc_figures.figures;

public class Rectangle implements IFigureCalculate{

	@Override
	public double calculateArea(double... dimensions)  {
		
		return dimensions[0]*dimensions[1];
	}

	@Override
	public double calculateCircut(double... dimensions) {
		return 2*dimensions[0] + 2*dimensions[1];
	}

}
