package org.homework.client;

import static org.junit.Assert.assertTrue;

import org.homework.model.Administrador;
import org.homework.model.Autorizacao;
import org.junit.Test;

public class ModelTest {

	@Test
	public void testParaUtilizarDependenciaModel() {

		Administrador administrador = new Administrador(1, "Augusto", "augusto@email.com", "123", Autorizacao.FULL);

		assertTrue(administrador.getSenha().equals("123"));
	}

}
