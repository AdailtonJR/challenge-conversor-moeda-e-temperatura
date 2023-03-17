package conversor_challenge_alura;

import javax.swing.JOptionPane;

public class ConversorMoedaETemperatura {

public static void main(String[] args) {
		
		boolean val = false;
		
		while (val == false) {
			String escolha;
			escolha = JOptionPane.showInputDialog(
					"Escolha a Opção:" + "\n1-Converter Moeda " + "\n2-Converter Moeda" + "\n3-Converter Temperatura");

			int opcao;
			opcao = Integer.parseInt(escolha);
			switch (opcao) {
			case 1:
				String moeda;
				moeda = JOptionPane.showInputDialog("Escolha a Moeda para Converter:" + "\n1-Real para Dolar"
						+ "\n2-Real para Euro" + "\n3-Real para Peso Argentino");

				int opcao1;
				opcao1 = Integer.parseInt(moeda);
				switch (opcao1) {
				case 1:
					String valor;
					valor = JOptionPane.showInputDialog("Digite o valor em Reais que quer converter");
					double valorReal = Double.parseDouble(valor);
					final double dolar = 5.20;
					double valorConvertido = valorReal / dolar;
					String msg;
					msg = "o valor em Dolar é " + valorConvertido;
					JOptionPane.showMessageDialog(null, msg);
					
					
					String outraVez;
					outraVez=JOptionPane.showInputDialog("Deseja continuar?" + "\n1- sim "+ "\n2-não");
					
					int noVamente;
					noVamente=Integer.parseInt(outraVez);
					
					if(noVamente == 2) {
						val=true;
						String msg10;
						msg10="Programa Finalizado";
						JOptionPane.showMessageDialog(null, msg10);break;
					}else{val= false;};
					

				case 2:
					String valor1;
					valor1 = JOptionPane.showInputDialog("Digite o valor  em Reais que quer converter");
					double valorReal1 = Double.parseDouble(valor1);
					final double euro = 5.55;
					double valorConvertido1 = valorReal1 / euro;
					String msg1;
					msg1 = "o valor em Euro é " + valorConvertido1;
					JOptionPane.showMessageDialog(null, msg1);
					
					
					String outraVez1;
					outraVez1=JOptionPane.showInputDialog("Deseja continuar?" + "\n1- sim "+ "\n2-não");
					
					int noVamente1;
					noVamente1=Integer.parseInt(outraVez1);
					
					if(noVamente1 == 2) {
						val=true;
						String msg10;
						msg10="Programa Finalizado";
						JOptionPane.showMessageDialog(null, msg10);break;
					}else{val= false;};
				


				case 3:
					String valor2;
					valor = JOptionPane.showInputDialog("Digite o valor  em Reais que quer converter");
					double valorReal2 = Double.parseDouble(valor);
					final double peso = 0.026;
					double valorConvertido2 = valorReal2 / peso;
					String msg2;
					msg2 = "o valor em Peso Argentino  é " + valorConvertido2;
					JOptionPane.showMessageDialog(null, msg2);
					
					
					String outraVez2;
					outraVez2=JOptionPane.showInputDialog("Deseja continuar?" + "\n1- sim "+ "\n2-não");
					
					int noVamente2;
					noVamente2=Integer.parseInt(outraVez2);
					
					if(noVamente2 == 2) {
						val=true;
						String msg10;
						msg10="Programa Finalizado";
						JOptionPane.showMessageDialog(null, msg10);
					}else{val= false;};
						
				}break;
				


			case 2:
				String money;
				money = JOptionPane.showInputDialog("Escolha a Moeda para Converter:" + "\n1-Dolar para Real"
						+ "\n2-Euro para Real" + "\n3-Peso Argentino para Real");
				int opcao2;
				opcao2 = Integer.parseInt(money);

				switch (opcao2) {
				case 1:
					String valor;
					valor = JOptionPane.showInputDialog("Digite o valor em Dolar que quer converter");
					double valorDolar = Double.parseDouble(valor);
					final double real = 0.1915;
					double valorConvertido = valorDolar * real;
					String msg;
					msg = "o valor em Real é " + valorConvertido;
					JOptionPane.showMessageDialog(null, msg);
				
					String outraVez;
					outraVez=JOptionPane.showInputDialog("Deseja continuar?" + "\n1- sim "+ "\n2-não");
					
					int noVamente;
					noVamente=Integer.parseInt(outraVez);
					
					if(noVamente == 2) {
						val=true;
						String msg10;
						msg10="Programa Finalizado";
						JOptionPane.showMessageDialog(null, msg10);break;
					}else{val= false;};
					
				case 2:
					String valor1;
					valor1 = JOptionPane.showInputDialog("Digite o valor em Euro que quer converter");
					double valorEuro = Double.parseDouble(valor1);
					final double real1 = 0.1801;
					double valorConvertido1 = valorEuro * real1;
					String msg1;
					msg1 = "o valor em Real é " + valorConvertido1;
					JOptionPane.showMessageDialog(null, msg1);
					
					
					String outraVez1;
					outraVez1=JOptionPane.showInputDialog("Deseja continuar?" + "\n1- sim "+ "\n2-não");
					
					int noVamente1;
					noVamente1=Integer.parseInt(outraVez1);
					
					if(noVamente1 == 2) {
						val=true;
						String msg10;
						msg10="Programa Finalizado";
						JOptionPane.showMessageDialog(null, msg10);
					}else{val= false;};break;


				case 3:
					String valor2;
					valor2 = JOptionPane.showInputDialog("Digite o valor em Peso Argentino converter");
					double valorPeso = Double.parseDouble(valor2);
					final double real2 = 0.026;
					double valorConvertido2 = valorPeso * real2;
					String msg2;
					msg2 = "o valor em Real é " + valorConvertido2;
					JOptionPane.showMessageDialog(null, msg2);
					
				
					String outraVez2;
					outraVez2=JOptionPane.showInputDialog("Deseja continuar?" + "\n1- sim "+ "\n2-não");
					
					int noVamente2;
					noVamente2=Integer.parseInt(outraVez2);
					
					if(noVamente2 == 2) {
						val= true;
						String msg10;
						msg10="Programa Finalizado";
						JOptionPane.showMessageDialog(null, msg10);
					}else{val= false;}
				}break;

				
		
			case 3:
				String temperatura;
				temperatura = JOptionPane.showInputDialog("Escolha a Temperatura para Converter:"
						+ "\n1- Celsius para Fahrenheit " + "\n2- Celsius para kelvin");
				int opcao3;
				opcao3 = Integer.parseInt(temperatura);

				switch (opcao3) {

				case 1:
					String valor;
					valor = JOptionPane.showInputDialog("Digite a Temperatura em Graus Celsius para converter");
					double valorCelsius = Double.parseDouble(valor);
					final double fahrenheit = valorCelsius * 1.8 + 32;
					double valorConvertido = fahrenheit;
					String msg;
					msg = "A temperatura em Fahrenheit é " + valorConvertido;
					JOptionPane.showMessageDialog(null, msg);
					
					String outraVez;
					outraVez=JOptionPane.showInputDialog("Deseja continuar?" + "\n1- sim "+ "\n2-não");
					
					int noVamente;
					noVamente=Integer.parseInt(outraVez);
					
					if(noVamente == 2) {
						val=true;
						String msg10;
						msg10="Programa Finalizado";
						JOptionPane.showMessageDialog(null, msg10);break;
					}else{val= false;};


				case 2:
					String valor1;
					valor1 = JOptionPane.showInputDialog("Digite a Temperatura em Graus Celsius para converter");
					double valorCelsius1 = Double.parseDouble(valor1);
					final double kelvin = valorCelsius1 + 273;
					double valorConvertido1 = kelvin;
					String msg1;
					msg1 = "A temperatura em Kelvin é " + valorConvertido1;
					JOptionPane.showMessageDialog(null, msg1);val= true;
					
					String outraVez1;
					outraVez1=JOptionPane.showInputDialog("Deseja continuar?" + "\n1- sim "+ "\n2-não");
					
					int noVamente1;
					noVamente1=Integer.parseInt(outraVez1);
				
					if(noVamente1 == 2) {
						val=true;
						String msg10;
						msg10="Programa Finalizado";
						JOptionPane.showMessageDialog(null, msg10);
					}else{val= false;};

				}break;
			default:
				String msg;
				msg = "Opção invalida tente novamente!";
				JOptionPane.showMessageDialog(null, msg);
				val= false;
				

			}
			
		} 

	}
}
