package observable.composite.strategy.combo.model;

import java.util.Observable;

public class PISTax extends Observable implements Tax {
	private float ALIQUOT = 0.6f;
	
	private float pisValue;

	@Override
	public void calculateTax(float value) {
		setChanged();
		pisValue = value * ALIQUOT;
		notifyObservers(pisValue);
	}

	public float getPisValue() {
		return pisValue;
	}
	
	public float getAliquot() {
		return ALIQUOT;
	}
	
	@Override
	public String toString() {
		return "Pis [ALIQUOTA=" + ALIQUOT 
               + ", valorDoPis=" + ALIQUOT + "]";
	}
}