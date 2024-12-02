package classes;

public class Fornecedor {
	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	
	public String cadastro() {
		String msg = "Fornecedor Cadastrado";
		return msg;
	}
	
//	public Boolean cadastrou() {
//		Boolean rs = true;
//		return rs;
//	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
