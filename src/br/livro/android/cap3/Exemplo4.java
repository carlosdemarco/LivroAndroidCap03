package br.livro.android.cap3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Exemplo simples de listener ao clicar em um botão
 * 
 * @author ricardo
 * 
 */
public class Exemplo4 extends Activity {
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);

		// abre a tela.xml
		setContentView(R.layout.layout_exemplo4_listener);

		// Busca o TextView pelo id
		final EditText textNome = (EditText) findViewById(R.id.campoNome);
		final TextView textResultado = (TextView) findViewById(R.id.campoResultado);

		Button button = (Button) findViewById(R.id.botaoOk);
		// Informa o listener...
		button.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				String nome = textNome.getText().toString();

				// atualiza o texto
				textResultado.setText("Obrigado " + nome);
			}
		});
	}
}
