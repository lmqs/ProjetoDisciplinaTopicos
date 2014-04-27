package br.com.projetoquestoesconcurso;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class GeracaoProvas extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_geracao_provas);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.geracao_provas, menu);
		return true;
	}

}
