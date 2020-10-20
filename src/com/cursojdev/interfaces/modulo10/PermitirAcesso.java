package com.cursojdev.interfaces.modulo10;
/*
 * Essa interface será o nosso contrato de autenticação.
 */
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);
	public boolean autenticar();

}
