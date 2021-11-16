public class Cliente{
	public static void main (String[] args){
		Scanner ler = new Scanner(System.in);
		
		BoloFactory rf = new BoloFactory();
		Bolo bolo = null;

		System.out.println("Qual Bolo você quer? (K / P)");
		if(ler.hasNextLine()){
			String tipo = ler.nextLine();
			Bolo = rf.fazerBolo(tipo);
		}

		if(Bolo != null){
			executar(Bolo);
		} else System.out.println("Digite K ou P...");
	}

	public static void executar(Bolo bolo){
		bolo.comer();
	}	

}