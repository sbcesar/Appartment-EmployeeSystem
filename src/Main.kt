fun main() {
    val department = Department("Sport Management Department")

    department.addEmployee(HourEmployee("Antonio",1234,160,10.0))
    department.addEmployee(PermanentEmployee("Cesar",5678,4000.0,10))

    println("Información de empleados:")
    department.employees.forEach { employee ->
        val formattedId = "%04d".format(employee.id)
        val formattedSalary = "%.2f".format(employee.calculateSalary())
        println("${employee.name} con ID-$formattedId tiene un salario de $formattedSalary€ al mes.")
    }
}