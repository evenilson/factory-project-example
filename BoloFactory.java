public class BoloFactory {
	
	public Bolo fazerBolo(String tipo){		
		Bolo bolo = null;	

		if(tipo.equals("C")){
			return new BoloDeLaranja();
		}else if(tipo.equals("L")){
			return new BoloDeLaranja();
		}else return null;
	}
	
}