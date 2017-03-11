/**
 * @author Paulo Pocinho
 * @since 09-03-2017
 */

public class GestaoDeTransportes {

	public static void main(String[] args) {

		Transporte[] lista = new Transporte[10];

		lista[0] = new Carro("Porsche", 4, "amarelo", 0, 3, 1600, 120);
		lista[1] = new Mota("Honda", 2, "preto", 0, "sport", "CBR");
		lista[2] = new Aviao("Boeing", 200, "branco", 0, 4, 0, 2);
		lista[3] = new Carro("Ferrari", 4, "vermelho", 0, 3, 2000, 160);
		lista[4] = new Mota("Kawasaki", 2, "preto", 0, "tourer", "125");
		lista[5] = new Aviao("Cessna", 2, "branco", 0, 1, 0, 0);

		for (int i = 0; i < 6; ++i) {
			lista[i].andar();
		}

		for (int i = 0; i < 6; ++i) {
			System.out.println("Indice " + i + ", " + lista[i].getClass() + ", KM Percorridos: " + lista[i].getKmPercorridos() + "\n");
		}
	}

}
