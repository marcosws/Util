package com.github.marcosws.teste;

import static com.github.marcosws.util.GeradorValidador.*;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println(mascaraCpfCnpj(gerarCpf()));
		System.out.println(mascaraCpfCnpj(gerarCnpj()));
		
	}

}
