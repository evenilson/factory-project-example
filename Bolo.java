public abstract class Bolo {

	private String nome;

	public String getName(){
		return nome;
	}

	public void setName(String nome){
		this.nome = nome;
	}
	
	public void comer(){
		System.out.println("Você está comendo um bolo de "+getName());
	}

}