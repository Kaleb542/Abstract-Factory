
public abstract class PayrollFactory {
	public PayrollFactory() {
		System.out.println("Creating a payroll factory...");
	}

	abstract double createPayroll();

	abstract void deletePayroll();

}
