package br.com.projetoquestoesconcurso;

import java.io.IOException;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import br.com.projetoquestoesconcurso.conexao.Conexao;
import br.com.projetoquestoesconcurso.model.Questao;

public class Questoes extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_questoes);
		SQLiteDatabase db = openOrCreateDatabase("bd_concurso2",
				Context.MODE_PRIVATE, null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.questoes, menu);
		return true;
	}
	//Chama a Intent da Lista das Provas
	public void iniciar(View view) {
		Intent i = new Intent(this, Lista_provas.class);
		startActivity(i);
	}

	
}
