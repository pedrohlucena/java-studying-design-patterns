package observable.composite.strategy.combo.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import observable.composite.strategy.combo.model.Tax;
import observable.composite.strategy.combo.view.TaxScreen;

public class TaxController implements ActionListener {
	private Tax model;
	private TaxScreen screen;

	@Override
	public void actionPerformed(ActionEvent arg0) {
		model.calculateTax(
			screen.getValue()
		);
	}
	
	public TaxController(Tax model, TaxScreen screen) {
		this.model = model;
		this.screen = screen;
	}
}
