object ReceitaFederal {
    fun calcularImposto(salario:Double): Double {
        val aliquota = when {
            (salario >= 0 && salario <= 1320.00) -> 0.075
            (salario >= 1320.01 && salario <= 2571.29) -> 0.09
            (salario >= 2571.30 && salario <= 3856.94) -> 0.12
            (salario >= 3856.95 && salario <= 7507.49) -> 0.14
            (salario >= 7507.50 && salario <= 12856.50) -> 0.145
            (salario >= 12856.51 && salario <= 25712.99) -> 0.165
            (salario >= 25713.00 && salario <= 50140.33) -> 0.19
            else -> 0.22
        }
        return aliquota * salario
    }
}

fun main() {
    val valorSalario = readLine()!!.toDouble();
    val valorBeneficios = readLine()!!.toDouble();

    val valorImposto = ReceitaFederal.calcularImposto(valorSalario);
    val saida = valorSalario - valorImposto + valorBeneficios;

    printIn(String.format("%.2f",saida));
    }