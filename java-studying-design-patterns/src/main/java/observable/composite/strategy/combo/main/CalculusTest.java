package observable.composite.strategy.combo.main;

import observable.composite.strategy.combo.controller.TaxController;
import observable.composite.strategy.combo.model.PISTax;
import observable.composite.strategy.combo.view.PisScreen;

public class CalculusTest {
	public static void main(String[] args) {
		PISTax model = new PISTax();
		PisScreen screen = new PisScreen();
		TaxController controller = new TaxController(model, screen);
		
		model.addObserver(screen);
		screen.addController(controller);
	}
}