package calc_figures.figures;

public class Circle implements IFigureCalculate{

	@Override
	public double calculateArea(double... dimensions)   {
		
		return dimensions[0]*Math.pow(Math.PI,2);
	}

	@Override
	public double calculateCircut(double... dimensions) {
		
		return 2*Math.PI*dimensions[0];
	}

}
