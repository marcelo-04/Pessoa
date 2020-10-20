package com.cursojdev.classesauxiliares.modulo10;

import com.cursojdev.interfaces.modulo10.PermitirAcesso;

public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

}
