package studying.design.pattern.decorator.model;

public class CarroLuxo extends CarroDecorator {

	public CarroLuxo(Carro c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println(" + Adicionando os detalhes de Luxo ");
	}
}
