
class Gerente extends Funcionario {
	
	public void cobraEntrega() {
		System.out.println("Est� pronto?");
	}

	public double getBonificacao() {
		return this.salario * 1.4 + 1000;
	}
}
