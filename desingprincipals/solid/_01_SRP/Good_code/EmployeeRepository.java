package desingprincipals.solid._01_SRP.Good_code;

public class EmployeeRepository {
    public void save(Employee emp) {
        System.out.println("Employee saved to DB: " + emp.getName());
    }
}
