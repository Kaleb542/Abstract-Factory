
public abstract class CommissionPayrollFactory extends PayrollFactory {
	public CommissionPayrollFactory() {
		System.out.println("Creating a commission payroll factory...");
	}

	double createPayroll(double commissionRate, int amountSales) {
		double payroll = 0;
		payroll = amountSales * commissionRate;
		return payroll;
	}

	void deletePayroll(double payroll) {
		payroll = Double.NaN;
	}
}
