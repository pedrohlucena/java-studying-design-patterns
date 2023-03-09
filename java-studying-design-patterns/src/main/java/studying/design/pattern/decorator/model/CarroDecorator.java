package studying.design.pattern.decorator.model;

public abstract class CarroDecorator implements Carro {

	protected Carro carro;
	
	public CarroDecorator(Carro c) {
		this.carro = c;
	}
	
	@Override
	public void assemble() {
		this.carro.assemble();
	}

}
