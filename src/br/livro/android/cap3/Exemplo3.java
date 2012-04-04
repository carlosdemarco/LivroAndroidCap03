package br.livro.android.cap3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Exemplo que demonstra o <ImageView>
 * 
 * A primeira imagem é definida no XML, a segunda é defindia com o método
 * setImageResource(R.drawable.smile2);
 * 
 * @author ricardo
 * 
 */
public class Exemplo3 extends Activity {
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);

		// Abre a tela layout_exemplo3.xml
		setContentView(R.layout.layout_exemplo3);

		// Busca a ImageView pelo id
		ImageView img2 = (ImageView) findViewById(R.id.imagem2);

		img2.setImageResource(R.drawable.smile2);
	}
}
