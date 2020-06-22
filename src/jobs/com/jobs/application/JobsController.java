package jobs.com.jobs.application;

import jobs.com.jobs.domain.AbsStaffMember;
import jobs.com.jobs.domain.Employee;
import jobs.com.jobs.domain.Volunteer;
import jobs.com.jobs.persistence.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class JobsController {

	private EmployeeRepository repository;
	
	public JobsController(){
		repository = new EmployeeRepository();
	}

	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee boss = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(boss);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(boss);
	}

	public void createVolunteer(String name, String address, String phone, String description) throws Exception {
		Volunteer boss = new Volunteer(name, address, phone, description);
		repository.addMember(boss);
	}

	public void payAllEmployeers() {
		repository.getAllMembers().forEach( (employeer) -> {
			employeer.pay();
		});
	
	}

	public List<AbsStaffMember> getAllEmployees() {
		List<AbsStaffMember> members = new ArrayList<>();
		repository.getAllMembers().forEach( (member) -> {
			members.add(member);
		});
		return members;
	}
	
}
