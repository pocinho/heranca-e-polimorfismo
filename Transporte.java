/**
 * @author Paulo Pocinho
 * @since 09-03-2017
 */

public class Transporte {
	private String marca;
	private int numeroDeLugares;
	private String cor;
	private int kmPercorridos;

	public void andar() {
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNumeroDeLugares() {
		return numeroDeLugares;
	}

	public void setNumeroDeLugares(int numeroDeLugares) {
		this.numeroDeLugares = numeroDeLugares;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getKmPercorridos() {
		return kmPercorridos;
	}

	public void setKmPercorridos(int kmPercorridos) {
		this.kmPercorridos = kmPercorridos;
	}

	@Override
	public String toString() {
		return "Transporte [marca=" + marca + ", numeroDeLugares=" + numeroDeLugares + ", cor=" + cor + ", kmPercorridos=" + kmPercorridos + "]";
	}

	public Transporte(String marca, int numeroDeLugares, String cor, int kmPercorridos) {
		this.marca = marca;
		this.numeroDeLugares = numeroDeLugares;
		this.cor = cor;
		this.kmPercorridos = kmPercorridos;
	}

}
