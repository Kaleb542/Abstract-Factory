
public abstract class HourlyPayrollFactory extends PayrollFactory {
	public HourlyPayrollFactory() {
		System.out.println("Creating an hourly payroll factory...");
	}

	double createPayroll(int hoursWorked, double hourlyRate) {
		double payroll = 0;
		payroll = hoursWorked * hourlyRate;
		return payroll;
	}

	void deletePayroll(double payroll) {
		payroll = Double.NaN;
	}
}
