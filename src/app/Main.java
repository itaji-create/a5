package app;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      	Gerente ge = new Gerente();
		ge.setNome("gerente");
		ge.setSalario(1000.00);
		ge.setDepartamento("vendas");
		ge.exibirGerente();
		
	}

}
