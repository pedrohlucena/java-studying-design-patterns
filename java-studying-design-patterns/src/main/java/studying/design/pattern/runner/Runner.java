package studying.design.pattern.runner;

import studying.design.pattern.builder.InvestmentFund;

public class Runner {

	public static void main(String[] args) {
		
		InvestmentFund fund1 = new InvestmentFund.Builder(43001, "Fiap 1 RF")
					.open()
					.redemptionDate(30)
					.chiefEconomist("Pedro Lucena")
					.administrationFee(2)
					.build();
		
		InvestmentFund fund2 = new InvestmentFund.Builder(43002, "Fiap 2 LCA")
					.closed()
					.build();
		
		System.out.println(fund1);
		System.out.println(fund2);
		
	}

}
