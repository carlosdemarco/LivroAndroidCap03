package br.livro.android.cap3;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Exemplo do LogCat.
 * 
 * Abra o LogCat View e crie um filtro para "ID"
 * 
 * @author ricardo
 * 
 */
public class Exemplo5 extends Activity {
	private static final String CATEGORIA = "livro";

	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);

		setContentView(R.layout.main);

		// Verbose
		Log.v(CATEGORIA, "log de verbose");

		// Debug
		Log.d(CATEGORIA, "log de debug");

		// Info
		Log.i(CATEGORIA, "log de info");

		// Warn
		Log.w(CATEGORIA, "log de alerta");

		// Error
		Log.e(CATEGORIA, "log de erro", new RuntimeException("teste de erro"));
	}
}
