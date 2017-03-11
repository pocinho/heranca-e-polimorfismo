/**
 * @author Paulo Pocinho
 * @since 09-03-2017
 */

public class Carro extends Transporte {
	private int numeroDePortas;
	private int cilindrada;
	private int cavalos;

	@Override
	public void andar() {
		setKmPercorridos(getKmPercorridos() + 5);
	}

	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getCavalos() {
		return cavalos;
	}

	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
	}

	@Override
	public String toString() {
		return "Carro: Marca - " + getMarca() + ", Lugares - " + getNumeroDeLugares() + ", Cor - " + getCor() + ", KM Percorridos - " + getKmPercorridos() + ", Portas - " + numeroDePortas + ", Cilindrada - " + cilindrada + ", Cavalos - "
				+ cavalos;
	}

	public Carro(String marca, int numeroDeLugares, String cor, int kmPercorridos, int numeroDePortas, int cilindrada, int cavalos) {
		super(marca, numeroDeLugares, cor, kmPercorridos);
		this.numeroDePortas = numeroDePortas;
		this.cilindrada = cilindrada;
		this.cavalos = cavalos;
	}

}
