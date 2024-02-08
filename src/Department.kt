class Department(val name: String) {

    val employees = mutableListOf<Employee>()

    fun addEmployee(employee: Employee) = employees.add(employee)

    fun calculateTotalSalary(): Double = employees.sumOf { it.calculateSalary() }
}