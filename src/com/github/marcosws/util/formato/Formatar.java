package com.github.marcosws.util.formato;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class Formatar {
	
	/**
	 * Formata Mascara de CPF/CNPJ.
	 * @author Marcos
	 * @param numero
	 * @return
	 */
	public String mascaraCpfCnpj(String numero){
		
		try{
			String formato = "";
			if(numero.length() == 11)
				formato = "AAA.AAA.AAA-AA";
			else if(numero.length() == 14)
				formato = "AA.AAA.AAA/AAAA-AA";
			else
				return numero;
			MaskFormatter maskFormatter = new MaskFormatter(formato);
			maskFormatter.setValueContainsLiteralCharacters(false);
			return maskFormatter.valueToString(numero);
		}
		catch(ParseException e){}
		return numero;

	}

}
