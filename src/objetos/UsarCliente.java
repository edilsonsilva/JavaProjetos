package objetos;

import classes.Cliente;

public class UsarCliente {

	public static void main(String[] args) {
		//Vamos instanciar a classe Cliente gerando o 
		//objeto cli
		Cliente cli = new Cliente();
		cli.setNome("Rodrigo Sampaio");
		cli.setEmail("rodrigo.sp@gmail.com");
		cli.setCpf("1245151515");
		cli.setIdade(23);
		System.out.println(cli.cadastrar());

	}
}
