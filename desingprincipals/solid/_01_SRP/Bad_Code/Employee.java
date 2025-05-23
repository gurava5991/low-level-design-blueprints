package desingprincipals.solid._01_SRP.Bad_Code;

class Employee {
    private String name;
    private String email;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Responsibility 1: business logic
    public void calculateSalary() {
        System.out.println("Salary calculated...");
    }

    // Responsibility 2: data persistence
    public void saveToDatabase() {
        System.out.println("Employee saved to DB...");
    }

    // Responsibility 3: email notification
    public void sendWelcomeEmail() {
        System.out.println("Welcome email sent to " + email);
    }
}

/*❌ What’s Wrong?
Class is doing 3 things:
Business logic (calculateSalary)
Database logic (saveToDatabase)
Email logic (sendWelcomeEmail)
If any of these changes (e.g., DB tech, email format), the class must change => SRP violated.*/

