package act7;

public class Pez implements Nadador{
	
	private String tipoPescado;
	
	public Pez(String tipoPescado) {
		this.tipoPescado = tipoPescado;
	}

	@Override
	public void nadar() {
		System.out.println(tipoPescado + " esta  nadando");
	}
	
}
