package br.com.projetoquestoesconcurso;

import br.com.projetoquestoesconcurso.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Questoes extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_questoes);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
	 	getMenuInflater().inflate(R.menu.questoes, menu);
		return true;
	}

	
	
	
}
