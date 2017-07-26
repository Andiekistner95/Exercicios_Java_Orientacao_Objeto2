package exercicio2;

import java.text.DecimalFormat;

public class Teste {
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#0.00");
		
		//array do objeto (sem tamanho especifico)
		Boing[] boings = {new Boing(),new Boing()};
		
		Monomotor[] monomotores = {new Monomotor(),new Monomotor(),new Monomotor()};

		Bimotor[] bimotores = {new Bimotor(),new Bimotor()};	
		
		CompanhiaAerea cia1 = new CompanhiaAerea();
		cia1.setBoings(boings);
		cia1.setMonomotores(monomotores);
		cia1.setBimotores(bimotores);
		
		System.out.println("Faturamento total: R$"+df.format(cia1.retornaFaturamentoPassagens()));
		
	}
}