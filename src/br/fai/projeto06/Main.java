package br.fai.projeto06;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.Start();

	}

	private void Start() {

		String[] Vrumvrum = new String[]{"civic", "gol", "uno", "palio"};
		
		for(int i=0;i<4;i++)
		{
			System.out.println(Vrumvrum[i]);
		}
		
		Vrumvrum[1] = "l200";
		
		for(int i=0;i<4;i++)
		{
			System.out.println(Vrumvrum[i]);
		}
		int tamanho = Vrumvrum.length + 1;
		String[] Vrumvrumvrum = new String[tamanho];
		
		for(int i=0;i<Vrumvrum.length;i++)
		{
			Vrumvrumvrum[i] = Vrumvrum[i];
		}
		Vrumvrumvrum[4] = "gol";
		for(int i=0;i<tamanho;i++)
		{
			System.out.println(Vrumvrumvrum[i]);
		}
	}

}
