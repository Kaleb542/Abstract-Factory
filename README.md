# Abstract-Factory-for-Payroll
This code presents an abstract factory for creating different types of payroll. There are three classes that inherit from the `PayrollFactory` abstract class: `CommissionPayrollFactory`, `HourlyPayrollFactory`, and `SalaryPayrollFactory`. Each one of them represents a specific type of payroll calculation.

## PayrollFactory
The `PayrollFactory` class is an abstract class that serves as a base for the other classes in the hierarchy. It contains a constructor that prints a message indicating that a payroll factory is being created. This class also defines two abstract methods:

- `createPayroll()`: this method is responsible for creating the payroll, but it doesn't define how the calculation should be done. It's up to the subclasses to implement this method.
- `deletePayroll()`: this method is responsible for deleting the payroll, but it doesn't define how the deletion should be done. Again, it's up to the subclasses to implement this method.

## CommissionPayrollFactory
The `CommissionPayrollFactory` class is a subclass of `PayrollFactory` and represents a factory for creating commission-based payrolls. It has a constructor that prints a message indicating that a commission payroll factory is being created.

This class implements the `createPayroll()` method, which takes two parameters: `commissionRate` and `amountSales`. The method calculates the payroll based on the commission rate and the amount of sales made. The formula used is `amountSales * commissionRate`. The `deletePayroll()` method is also implemented and simply sets the payroll to `Double.NaN`.

## HourlyPayrollFactory
The `HourlyPayrollFactory` class is another subclass of `PayrollFactory` and represents a factory for creating hourly-based payrolls. It has a constructor that prints a message indicating that an hourly payroll factory is being created.

This class implements the `createPayroll()` method, which takes two parameters: `hoursWorked` and `hourlyRate`. The method calculates the payroll based on the number of hours worked and the hourly rate. The formula used is `hoursWorked * hourlyRate`. The `deletePayroll()` method is also implemented and simply sets the payroll to `Double.NaN`.

## SalaryPayrollFactory
The `SalaryPayrollFactory` class is the last subclass of `PayrollFactory`and represents a factory for creating salary-based payrolls. It has a constructor that prints a message indicating that a salary payroll factory is being created.

This class implements the `createPayroll()` method, which takes one parameter: `salary`. The method simply returns the value of the salary. The `deletePayroll()` method is also implemented and simply sets the payroll to `Double.NaN`.

## Usage
To use this code, you can create an instance of one of the subclasses and call the createPayroll() method to calculate the payroll. You can then call the deletePayroll() method to delete the payroll.

For example:<br>
`CommissionPayrollFactory commissionPayrollFactory = new CommissionPayrollFactory();
double payroll = commissionPayrollFactory.createPayroll(0.05, 1000);
System.out.println("Payroll: " + payroll);
commissionPayrollFactory.deletePayroll(payroll);`

This will create a commission payroll factory, calculate the payroll based on a commission rate of 0.05 and sales of 10000, print the result, and delete the payroll.
