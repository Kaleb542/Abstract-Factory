
public abstract class SalaryPayrollFactory extends PayrollFactory {
	public SalaryPayrollFactory() {
		System.out.println("Creating a salary payroll factory...");
	}

	double createPayroll(double salary) {
		return salary;
	}

	void deletePayroll(double payroll) {
		payroll = Double.NaN;
	}
}
