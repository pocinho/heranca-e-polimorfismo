/**
 * @author Paulo Pocinho
 * @since 09-03-2017
 */

public class Aviao extends Transporte {
	private int numeroDeMotores;
	private double horasDeVoo;
	private int numeroDePoroes;

	@Override
	public void andar() {
		setKmPercorridos(getKmPercorridos() + 100);
	}

	public int getNumeroDeMotores() {
		return numeroDeMotores;
	}

	public void setNumeroDeMotores(int numeroDeMotores) {
		this.numeroDeMotores = numeroDeMotores;
	}

	public double getHorasDeVoo() {
		return horasDeVoo;
	}

	public void setHorasDeVoo(double horasDeVoo) {
		this.horasDeVoo = horasDeVoo;
	}

	public int getNumeroDePoroes() {
		return numeroDePoroes;
	}

	public void setNumeroDePoroes(int numeroDePoroes) {
		this.numeroDePoroes = numeroDePoroes;
	}

	@Override
	public String toString() {
		return "Aviao: Marca - " + getMarca() + ", Lugares - " + getNumeroDeLugares() + ", Cor - " + getCor() + ", KM Percorridos - " + getKmPercorridos() + ", Motores - " + numeroDeMotores + ", Horas de Voo - " + horasDeVoo + ", Poroes - "
				+ numeroDePoroes;
	}

	public Aviao(String marca, int numeroDeLugares, String cor, int kmPercorridos, int numeroDeMotores, double horasDeVoo, int numeroDePoroes) {
		super(marca, numeroDeLugares, cor, kmPercorridos);
		this.numeroDeMotores = numeroDeMotores;
		this.horasDeVoo = horasDeVoo;
		this.numeroDePoroes = numeroDePoroes;
	}

}
