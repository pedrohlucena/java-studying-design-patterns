package studying.design.pattern.decorator.model;

public class CarroEsportivo extends CarroDecorator {

	public CarroEsportivo(Carro c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.print(" + Adicionando os detalhes de um Esportivo ");
	}
	
	
}
