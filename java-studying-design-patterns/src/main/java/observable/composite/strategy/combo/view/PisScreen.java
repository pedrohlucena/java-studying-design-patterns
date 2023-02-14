package observable.composite.strategy.combo.view;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;

public class PisScreen implements TaxScreen, Observer {
	private TextField txtBilledAmount;
	private Button btnCalculate;
	
	public PisScreen() {
		System.out.println("Construtor da View chamado");
		Frame frame = new Frame("Cálculo do PIS MVC e Design Patterns");
		frame.add("North", new Label("Valor Faturado"));

		txtBilledAmount = new TextField();
		frame.add("Center", txtBilledAmount);

		Panel panel = new Panel();
		btnCalculate = new Button("Calcular PIS");
		panel.add(btnCalculate);
		frame.add("South", panel);

		frame.addWindowListener(new CloseListener());
		frame.setSize(200, 150);
		frame.setLocation(100, 100);
		frame.setVisible(true);
	}

	public float getValue() {
		return Float.parseFloat(txtBilledAmount.getText());
	}
	
	public static class CloseListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			System.exit(0);
        }
	}

	@Override
	public void update(Observable objModel, Object modelState) {
		String msg = objModel.getClass() + 
					 "" + 
					 objModel.toString() + 
					 "\n" + 
					 ((Float)modelState).floatValue();

		JOptionPane.showMessageDialog(null, msg);	
	} 
	
	public void addController(ActionListener controller){
		System.out.println("A View adicionou o Controller");
		btnCalculate.addActionListener(controller);	 
	} 
}

//
//public class CalculaPis implements Observer, TelaDeImposto {
//	
//	// Método que possibilita a View enviar a ação de calcular 
//	// para o Controller chamar o Model
//	public void addController(ActionListener controller){
//		System.out.println("A View adicionou o Controller");
//		btnCalcular.addActionListener(controller);	 
//	} 
//	
//	/* update exibe uma mensagem na View contendo: 
//	 * A classe Model 
//	 * O toString sobrescrito 
//	 * O valor do estado, atributo valorDoPis da classe Pis
//	*/
//	
//	// O método update será chamado pelo Model por notifyObservers()
//	public void update(Observable objModel, Object estadoDoModel)   
//     {
//		String msg = objModel.getClass() 
//				+ "
//" + objModel.toString() 
//				+ "\n" + ((Float)estadoDoModel).floatValue();
//		
//		JOptionPane.showMessageDialog(null, msg);	
//      }
//
//}