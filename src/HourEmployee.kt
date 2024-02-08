class HourEmployee(name: String, id: Int, private val hoursWorkedPerMonth: Int, private val fee: Double) : Employee(name, id) {

    override fun calculateSalary(): Double = hoursWorkedPerMonth * fee
}