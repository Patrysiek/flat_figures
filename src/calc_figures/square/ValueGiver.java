package calc_figures.square;

public abstract class ValueGiver {
	ValueListener listener;

	protected void giveValues(double... values) throws EmptyListenerException {
		if (listener == null)
			throw new EmptyListenerException();
		listener.preprocessData(values);
	}

	protected abstract void transferData();
	public void registerListener(ValueListener listener) {
		this.listener = listener;
	}
}
