package com.github.marcosws.util.gerador;

import static com.github.marcosws.util.Util.*;

public class Gerador {
	
	/**
	 * Gerador CPF Válido
	 * Método para gerar numero de CPF Válido.
	 * @author Marcos
	 * @return String - Numero do CPF Gerado.
	 */
	public String gerarCpf(){
		
		String numeroCpf = gerarNumeros(9);
		int[] pesoMultiplicador1 = {10, 9, 8, 7, 6, 5, 4, 3, 2};
		int[] pesoMultiplicador2 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
		int somaTotal = 0;
		int resto = 0;

		for(int i = 0; i < numeroCpf.length(); i++)
			 somaTotal += Integer.parseInt(String.valueOf(numeroCpf.charAt(i))) * pesoMultiplicador1[i];
		do{
			resto = somaTotal % 11;
			if(resto < 2)
				numeroCpf = numeroCpf.concat("0");
			else
				numeroCpf = numeroCpf.concat(String.valueOf((11 - resto)));
			somaTotal = 0;
			if(numeroCpf.length() == 11) break;
			for(int i = 0; i < numeroCpf.length(); i++)
				 somaTotal += Integer.parseInt(String.valueOf(numeroCpf.charAt(i))) * pesoMultiplicador2[i];
		}
		while(true);
		
		return numeroCpf;
	}
	/**
	 * Gerador CNPJ Válido
	 * @author Marcos
	 * @return
	 */
	public String gerarCnpj(){
		
		String numeroCnpj = gerarNumeros(8).concat("0001");
		int[] pesoMultiplicador1 = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
		int[] pesoMultiplicador2 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
		int somaTotal = 0;
		int resto = 0;
		
		for(int i = 0; i < numeroCnpj.length(); i++)
			 somaTotal += Integer.parseInt(String.valueOf(numeroCnpj.charAt(i))) * pesoMultiplicador1[i];
		
		do{
			resto = somaTotal % 11;
			if(resto < 2)
				numeroCnpj = numeroCnpj.concat("0");
			else
				numeroCnpj = numeroCnpj.concat(String.valueOf((11 - resto)));
			somaTotal = 0;
			if(numeroCnpj.length() == 14) break;
			for(int i = 0; i < numeroCnpj.length(); i++)
				 somaTotal += Integer.parseInt(String.valueOf(numeroCnpj.charAt(i))) * pesoMultiplicador2[i];
		}
		while(true);
		
		return numeroCnpj;
	}
	

	


}
