package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
	
		System.out.println("Nome do departamento");
		String name=sc.nextLine();
		System.out.println("Dia do pagamento");
		int day=sc.nextInt();
		System.out.println("Email : ");
		String email=sc.next();
		System.out.println("Telefone : ");
		String phone=sc.next();
		System.out.println("Quantos funcionários tem o departamento?");
		
		
		int qtd=sc.nextInt();
		for (int i = 0; i < qtd; i++) {
			System.out.println("Nome");
			sc.nextLine();
			String name1=sc.nextLine();
			System.out.println("Salário : ");
			double salary=sc.nextDouble();
			Employee e1= new Employee(name1, salary);
			
			list.add(e1);

		}
	
		
		Department dept= new Department(name, day,new Address(email, phone), list);
		/*
		Department dept = new Department("vendas", 10, new Address("vendas@lojatop.com", "9983355"), list);
		Employee e1 = new Employee("joao", 8000);
		Employee e2 = new Employee("maria", 10000);
		list.add(e2);
		list.add(e1);
		*/
		showReport(dept);
		sc.close();
	}

	private static void showReport(Department dept) {
		List<Department> list = new ArrayList<>();
		list.add(dept);
		
		for (Department d : list) {
			System.out.println(d);
		}
	}

}
