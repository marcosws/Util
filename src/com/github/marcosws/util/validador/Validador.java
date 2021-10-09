package com.github.marcosws.util.validador;

public class Validador {
	
	/**
	 * @author Marcos
	 * @param cpf
	 * @return
	 */
	public boolean validarCpf(String cpf) {
		
		cpf = cpf.replaceAll("[^0-9]", "");
		if(cpf.length() != 11)
			return false;
		
		int[] pesoMultiplicador1 = {10, 9, 8, 7, 6, 5, 4, 3, 2};
		int[] pesoMultiplicador2 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
		int somaTotal = 0;
		int resto = 0;
		String cpfParc = cpf.substring(0, 9);
		
		for(int i = 0; i < 9; i++)
			somaTotal += Integer.parseInt(String.valueOf(cpfParc.charAt(i))) * pesoMultiplicador1[i];
			
		do {
			resto = somaTotal % 11;
			if(resto < 2)
				cpfParc += "0";
			else
				cpfParc += String.valueOf((11 - resto));
			somaTotal = 0;
			if(cpfParc.length() >= 11) break;
			for(int i = 0; i < 10; i++)
				somaTotal += Integer.parseInt(String.valueOf(cpfParc.charAt(i))) * pesoMultiplicador2[i];
		}
		while(true);
		
		if(cpfParc.substring(9).equals(cpf.substring(9)))
			return true;
		
		return false;
	}
	/**
	 * @author Marcos
	 * @param cnpj
	 * @return
	 */
	public boolean validarCnpj(String cnpj) {
		
		cnpj = cnpj.replaceAll("[^0-9]", "");
		if(cnpj.length() != 14)
			return false;
		
		int[] pesoMultiplicador1 = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
		int[] pesoMultiplicador2 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
		int somaTotal = 0;
		int resto = 0;
		String cnpjParc = cnpj.substring(0, 12);
		
		for(int i = 0; i < 12; i++)
			somaTotal += Integer.parseInt(String.valueOf(cnpjParc.charAt(i))) * pesoMultiplicador1[i];
		
		do {
			resto = somaTotal % 11;
			if(resto < 2)
				cnpjParc += "0";
			else
				cnpjParc += String.valueOf((11 - resto));
			somaTotal = 0;
			if(cnpjParc.length() >= 14) break;
			for(int i = 0; i < 13; i++)
				somaTotal += Integer.parseInt(String.valueOf(cnpjParc.charAt(i))) * pesoMultiplicador2[i];
		}
		while(true);
		
		if(cnpjParc.substring(12).equals(cnpj.substring(12)))
			return true;
		
		return false;
	}

}
