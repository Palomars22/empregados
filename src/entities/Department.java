package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private int payDay;

	private List<Employee> employees = new ArrayList<>();
	private Address address;

	

	public Department(String name, int payDay, Address address, List<Employee> employees) {
		super();
		this.name = name;
		this.payDay = payDay;
		this.address = address;
		this.employees = employees;
	}

	public Department() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	public double payroll() {
		double total=0;
	for (Employee employee : employees) {
	double sum=employee.getSalary();
		total+=sum;
	}
	return total;
	}

	@Override
	public String toString() {
		
		StringBuilder sb=new StringBuilder();
		sb.append("FOLHA DE PAGAMENTO"+"\n");
		sb.append("Departamento Vendas : "+payroll()+"\n");
		sb.append("Pagamento realizado no dia  : "+payDay+"\n");
		sb.append("Funcionarios : \n");
		sb.append(employees.toString());
		sb.append("\n");
		sb.append("Para dúvidas favor entrar em contato: "+address.getEmail());
		
		return sb.toString();
	}
	
}
