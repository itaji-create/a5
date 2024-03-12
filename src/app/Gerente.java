package app;

public class Gerente extends Funcionario {

		
		private String departamento;
		
		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		public double calcularBonus() {
		
			return 0.1 * salario;
		}

		public String getDepartamento() {
			return departamento;
		}

		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}
		
		public void exibirGerente() {
			System.out.print("Departamento: " + departamento);
		}
		

}
