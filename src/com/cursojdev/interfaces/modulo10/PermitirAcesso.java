package com.cursojdev.interfaces.modulo10;
/*
 * Essa interface ser� o nosso contrato de autentica��o.
 */
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);
	public boolean autenticar();

}
