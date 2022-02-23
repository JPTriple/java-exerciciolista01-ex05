package ex05;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();

	}

	private void start() {
		String[] carros = {"Civic", "Gol", "Palio", "Uno"};
		
		try {
			for (int i = 0; i < carros.length; i++) {
				String nomeDoCarro = carros[i];
				System.out.println("Nome do Carro: " + nomeDoCarro);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		carros[1] = "L200";
		System.out.println("----------");
		
		for(String carro : carros) {
			System.out.println("Nome do carro: " + carro);
		}
		System.out.println("----------");
		
		
	}

}
