package com.github.marcosws.util;

import com.github.marcosws.util.data.Data;
import com.github.marcosws.util.formato.Formatar;
import com.github.marcosws.util.gerador.Gerador;
import com.github.marcosws.util.validador.Validador;

public class Util {
	
	public static final Data data = new Data();
	public static final Formatar formatar = new Formatar();
	public static final Gerador gerador = new Gerador();
	public static final Validador validador = new Validador();

	
	/**
	 * Gerador de numeros aleatórios
	 * @param quantidadeDigitos
	 * @return
	 */
	public static String gerarNumeros(int quantidadeDigitos) {
		String numero = "";
		for(int i = 0; i < quantidadeDigitos; i++)
			numero += String.valueOf(Math.round(Math.random() * 9));
		return numero;
	}
	
	/**
	 * 
	 * @param minimo
	 * @param maximo
	 * @return
	 */
	public static String gerarNumeros(int minimo, int maximo) {
		
		String numero = String.valueOf(Math.round((Math.random() * ((maximo - minimo) + 1)) + minimo));
		String zeros = "";
		for(int i = 0; i < Math.abs((numero.length() - String.valueOf(maximo).length())); i++)
			zeros += "0";
		return zeros.concat(numero);
		
	}
	

}
