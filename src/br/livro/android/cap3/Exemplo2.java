package br.livro.android.cap3;

import android.app.Activity;
import android.os.Bundle;

/**
 * Exemplo de layout pela API Java
 * 
 * @author ricardo
 * 
 */
public class Exemplo2 extends Activity {
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		
		setContentView(R.layout.layout_exemplo2);

		// Solicita ao Android para abrir o TextView
//		TextView view = new TextView(this);
//		view.setText("Exemplo de Texto no Android");
//		setContentView(view);
	}
}