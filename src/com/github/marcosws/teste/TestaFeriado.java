package com.github.marcosws.teste;



public class TestaFeriado {

	public static void main(String[] args) {
		
		
		testFunc(2022, 6, 16);
		testFunc(2026, 6, 4);
		testFunc(2026, 5, 31);
		
		testFunc(2040, 2, 13);
		testFunc(2040, 2, 14);
		testFunc(2040, 2, 15);
		testFunc(2040, 2, 16);
		
		testFunc(2021, 4, 2);
		testFunc(2022, 4, 15);
		testFunc(2023, 4, 7);
		testFunc(2024, 3, 29);
		testFunc(2025, 4, 18);
		testFunc(2026, 4, 3);
		testFunc(2027, 3, 26);
		testFunc(2028, 4, 14);
		testFunc(2029, 3, 30);
		testFunc(2030, 4, 19);
		testFunc(2031, 4, 11);
		testFunc(2032, 3, 26);
		testFunc(2033, 4, 15);
		testFunc(2034, 4, 7);
		testFunc(2035, 3, 23);
		testFunc(2036, 4, 11);
	
		testFunc(2021, 4, 21);
		testFunc(2021, 11, 1);
		testFunc(2021, 11, 2);
		testFunc(2021, 11, 3);
		testFunc(2021, 11, 14);
		testFunc(2021, 11, 15);
		testFunc(2021, 11, 16);
		
	}
	
	public static void testFunc(int ano, int mes, int dia) {
		
     /*   LocalDate localDate = LocalDate.of(ano, mes, dia);
        LocalTime localTime = LocalTime.now();
        LocalDateTime DateTimeBase = LocalDateTime.of(localDate, localTime);
		if(Util.data.verificarFeriado(DateTimeBase)) {
			System.out.println("Data:[" + dia + "/" + mes + "/" + ano + "] Esta data é Feriado | Dia da Semana: " + DateTimeBase.getDayOfWeek());
		}
		else {
			System.out.println("Data:[" + dia + "/" + mes + "/" + ano + "] Dia Normal | Dia da Semana: " + DateTimeBase.getDayOfWeek());
		}*/
		
	}

}
