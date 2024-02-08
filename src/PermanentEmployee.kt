class PermanentEmployee(name: String, id: Int, private val baseSalary: Double, private val numPaymentsPerYear: Int) : Employee(name, id) {

    override fun calculateSalary(): Double = baseSalary / numPaymentsPerYear
}