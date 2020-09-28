package com.example.project;

public class CupomFiscal {
	private static final String ENDLN = System.lineSeparator();
	private static boolean isEmpty(String str){
		if(str == null) return true;
		int spaceCount = str.length() - str.replace(".", "").length();
		return (spaceCount == str.length());
	}

	public static String dadosLojaParam(String nomeLoja, String logradouro, int numero, String complemento,
			String bairro, String municipio, String estado, String cep, String telefone, String observacao, String cnpj,
			String inscricaoEstadual) {
			//Implemente aqui
			String num = numero + "";
			if(isEmpty(nomeLoja)){
				throw new RuntimeException("O campo nome da loja é obrigatório");
			}
			if(isEmpty (logradouro)){
				throw new RuntimeException("O campo logradouro do endereço é obrigatório");
			}
			if(numero == 0){
				num = "s/n";
			}
			if(isEmpty(municipio)){
				throw new RuntimeException("O campo município do endereço é obrigatório");
			}
			if (isEmpty(estado)){
				throw new RuntimeException("O campo estado do endereço é obrigatório");
			}
			if (isEmpty(cnpj)){
				throw new RuntimeException("O campo CNPJ da loja é obrigatório");
			}
			if (isEmpty(inscricaoEstadual)){
				throw new RuntimeException("O campo inscrição estadual da loja é obrigatório");
			}
			String part2 = logradouro+ ", " + num;
			if (! isEmpty (complemento)){
				part2 += " " + complemento;
				}
			String part3 = "";
			if (! isEmpty (bairro)){
				part3 += bairro + " - ";
			}
			part3 += municipio +  " - " + estado;
			
			String part4 = "";
			if (! isEmpty (cep)){
				part4 = "CEP:" + cep;
				}
			if (! isEmpty (telefone)){
				if (! isEmpty (part4)){
					part4 += " ";
				}
				part4 += "Tel " + telefone;
				}
			if (! isEmpty(part4)){
				part4 += ENDLN;
				}
			String part5 = "";
			if (! isEmpty (observacao)){
				part5 += observacao;
				}
	
			String output = nomeLoja + ENDLN;
			output += part2 + ENDLN;
			output += part3 + ENDLN;
			output += part4;
			output += part5 + ENDLN;
			output += "CNPJ: " + cnpj + ENDLN;
			output += "IE: " + inscricaoEstadual +ENDLN;

		return output;
	}

}
