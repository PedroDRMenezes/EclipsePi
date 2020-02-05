package br.com.SafePet.Back.security;

import javax.xml.bind.DatatypeConverter;

import br.com.SafePet.Back.model.Usuario;

public class Autenticador {
	
	private static final String PREFIXO = "SaFePeT|;";

	public static String generateToken(Usuario usuario) {
		String str = PREFIXO + usuario.toString();
		System.out.println("GERANDO... "+str);
		String token = DatatypeConverter.printHexBinary(str.getBytes());
		return token;
	}
	
	public static boolean isValid (String token) {
		byte[] vetor = DatatypeConverter.parseHexBinary(token);
		String novaString = new String (vetor);
		if(novaString.startsWith(PREFIXO)) {
			return true;
		}
		else {
			return false;
		}		
	}
	
	public static Usuario getUserFromToken(String token) {
		String decode = new String(DatatypeConverter.parseHexBinary(token));
		
		System.out.println("Recebido = "+decode);
		String partes[] = decode.split(";");
		Usuario u = new Usuario();
		u.setId(Integer.parseInt(partes[1]));
		u.setNome(partes[2]);
		u.setEmail(partes[3]);
		return u;
	}

}
