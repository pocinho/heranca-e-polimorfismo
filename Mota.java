/**
 * @author Paulo Pocinho
 * @since 09-03-2017
 */

public class Mota extends Transporte {
	private String tipo;
	private String modelo;

	@Override
	public void andar() {
		setKmPercorridos(getKmPercorridos() + 1);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Mota: Marca - " + getMarca() + ", Lugares - " + getNumeroDeLugares() + ", Cor - " + getCor() + ", KM Percorridos - " + getKmPercorridos() + ", Tipo - " + tipo + ", Modelo - " + modelo;
	}

	public Mota(String marca, int numeroDeLugares, String cor, int kmPercorridos, String tipo, String modelo) {
		super(marca, numeroDeLugares, cor, kmPercorridos);
		this.tipo = tipo;
		this.modelo = modelo;
	}

}
