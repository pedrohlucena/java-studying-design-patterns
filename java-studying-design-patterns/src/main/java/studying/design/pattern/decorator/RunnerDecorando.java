package studying.design.pattern.decorator;

import studying.design.pattern.decorator.model.Carro;
import studying.design.pattern.decorator.model.CarroBasico;
import studying.design.pattern.decorator.model.CarroEsportivo;
import studying.design.pattern.decorator.model.CarroLuxo;
import studying.design.pattern.decorator.model.CarroSuv;

public class RunnerDecorando {

	public static void main(String[] args) {

		Carro carroBasico = new CarroBasico();
		carroBasico.assemble();
		System.out.println();
		System.out.println(" --------------------------------- ");
		
		
		Carro carroEsportivo = new CarroEsportivo( new CarroBasico() );
		carroEsportivo.assemble();
		System.out.println();
		System.out.println(" --------------------------------- ");
		
		
		Carro carroSUV = new CarroSuv( new CarroBasico());
		carroSUV.assemble();
		System.out.println();
		System.out.println(" --------------------------------- ");
		
		Carro carroSUVEsportiva = new CarroSuv( new CarroEsportivo( new CarroBasico() ) );
		carroSUVEsportiva.assemble();
		System.out.println();
		System.out.println(" --------------------------------- ");
		
		
		Carro carroSUVEsportivaLuxo = new CarroLuxo( new CarroSuv( new CarroEsportivo(new CarroBasico())));
		carroSUVEsportivaLuxo.assemble();
		System.out.println();
		System.out.println(" --------------------------------- ");
	}
}
