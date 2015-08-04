package com.example.tutometeo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Ce tuto traite l'utilisation des fragments sous ANDROID. Pour d'avantage
 * d'informations : f.ferjani.farouk@gmail.com
 * 
 * @author Farouk FERJANI
 * 
 */
public class ListPaysActivity extends FragmentActivity implements
		OnPaysSelected {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_pays);
	}

	public void paysSelect(String region) {
		//On récupère le fragment PrevisionFragment
		PrevisionFragment fragment = (PrevisionFragment) getSupportFragmentManager()
				.findFragmentById(R.id.prevision_fragment);
		//Si le fragment est déjà à l'écran on le met à jour (tablette), si non on démarre une nouvelle activité (Smartphone). 
		if ((fragment != null) && fragment.isInLayout()) {
			fragment.setMsg("Prévision de " + region
					+ " dans un fragment mis à jour");
		} else {
			Intent intent = new Intent(this, PrevisionActivity.class);
			intent.putExtra(PrevisionActivity.MSG_EXTRAS, "Prévision de "
					+ region + " dans une nouvelle activité");
			startActivity(intent);
		}
	}

}
