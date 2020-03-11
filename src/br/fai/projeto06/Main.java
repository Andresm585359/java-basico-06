package br.fai.projeto06;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.Start();

	}

	private void Start() {

		String[] Vrumvrum = new String[]{"civic", "gol", "uno", "palio"};
	
		for(int i=0;i<4;i++){
			System.out.println(Vrumvrum[i]);
		}
		
		
	}

}
