package observable.composite.strategy.singleton.combo.model;

import java.util.Observable;

import observable.composite.strategy.singleton.combo.config.singleton.ConfigSingleton;

public class PISTax extends Observable implements Tax {
	private float aliquot;
	
	private float pisValue;
	
	public PISTax() {
		aliquot = Float.parseFloat(
			ConfigSingleton.getInstance().getProperty("aliquot")
		);
	}

	@Override
	public void calculateTax(float value) {
		setChanged();
		pisValue = value * aliquot;
		notifyObservers(pisValue);
	}

	public float getPisValue() {
		return pisValue;
	}
	
	public float getAliquot() {
		return aliquot;
	}
	
	@Override
	public String toString() {
		return "Pis [ALIQUOTA=" + aliquot 
               + ", valorDoPis=" + aliquot + "]";
	}
}