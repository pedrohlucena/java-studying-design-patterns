package studying.design.pattern.builder;

import java.util.Date;

public class InvestmentFund {
	private int cvmCode;
	private String fundName;
	private Date operationDate;
	private double minValue;
	private double maxValue;
	private int redemptionDate;
	private double administrationFee;
	private double custodyFee;
	private boolean closedFund;
	private String chiefEconomist;

	public static class Builder {
		// Required
		private int code;
		private String name;
		
		private Date operationDate;
		private double minValue;
		private double maxValue;
		private int redemptionDate;
		private double administrationFee;
		private double custodyFee;
		private boolean closedFund;
		private String chiefEconomist;

		public Builder(int code, String name) {
			this.code = code;
			this.name = name;
		}

		public Builder operationDate(Date operationDate) {
			this.operationDate = operationDate;
			return this;
		}

		public Builder minValue(double minValue) {
			this.minValue = minValue;
			return this;
		}

		public Builder maxValue(double maxValue) {
			this.maxValue = maxValue;
			return this;
		}

		public Builder redemptionDate(int redemptionDate) {
			this.redemptionDate = redemptionDate;
			return this;
		}

		public Builder administrationFee(double administrationFee) {
			this.administrationFee = administrationFee;
			return this;
		}

		public Builder custodyFee(double custodyFee) {
			this.custodyFee = custodyFee;
			return this;
		}

		public Builder closed() {
			this.closedFund = true;
			return this;
		}

		public Builder open() {
			this.closedFund = false;
			return this;
		}

		public Builder chiefEconomist(String chiefEconomist) {
			this.chiefEconomist = chiefEconomist;
			return this;
		}

		public InvestmentFund build() {
			return new InvestmentFund(this);
		}

	}

	private InvestmentFund(Builder builder) {
		this.cvmCode = builder.code;
		this.fundName = builder.name;
		this.operationDate = builder.operationDate;
		this.minValue = builder.maxValue;
		this.maxValue = builder.maxValue;
		this.redemptionDate = builder.redemptionDate;
		this.administrationFee = builder.administrationFee;
		this.custodyFee = builder.custodyFee;
		this.closedFund = builder.closedFund;
		this.chiefEconomist = builder.chiefEconomist;
	}
}