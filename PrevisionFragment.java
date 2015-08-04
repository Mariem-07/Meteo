package com.example.tutometeo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Ce tuto traite l'utilisation des fragments sous ANDROID. Pour d'avantage
 * d'informations : somranimariem8@gmail.com
 * 
 * @author Mariem SOMRANI
 * 
 */
public class PrevisionFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// On commence par charger le contenu du fichier prevision_fragment.xml
		// dans le fragment.
		final View view = inflater.inflate(R.layout.prevision_fragment,
				container, false);
		return view;
	}

	/**
	 * Met à jour le message du TextView contenu dans le fragment
	 */
	public void setMsg(String msg) {
		TextView msgView = (TextView) getActivity().findViewById(
				R.id.prevision_msg);
		msgView.setText(msg);
	}
}
