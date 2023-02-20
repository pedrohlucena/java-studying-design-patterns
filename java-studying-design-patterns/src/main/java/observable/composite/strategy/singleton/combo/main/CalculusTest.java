package observable.composite.strategy.singleton.combo.main;

import observable.composite.strategy.singleton.combo.controller.TaxController;
import observable.composite.strategy.singleton.combo.model.PISTax;
import observable.composite.strategy.singleton.combo.view.PisScreen;

public class CalculusTest {
	public static void main(String[] args) {
		PISTax model = new PISTax();
		PisScreen screen = new PisScreen();
		TaxController controller = new TaxController(model, screen);
		
		model.addObserver(screen);
		screen.addController(controller);
	}
}