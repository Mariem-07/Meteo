import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Ce tuto traite l'utilisation des fragments sous ANDROID. Pour d'avantage
 * d'informations : somranimariem8@gmail.com
 * 
 * @author Mariem SOMRANI
 * 
 */
public class PrevisionActivity extends FragmentActivity {
	public static final String MSG_EXTRAS = "MSG_EXTRAS";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_prevision);
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			String msg = extras.getString(MSG_EXTRAS);
			PrevisionFragment fragment = (PrevisionFragment) getSupportFragmentManager()
					.findFragmentById(R.id.prevision_fragment);
			fragment.setMsg(msg);
		}
	}

	// @Override
	// public boolean onCreateOptionsMenu(Menu menu) {
	// // Inflate the menu; this adds items to the action bar if it is present.
	// getMenuInflater().inflate(R.menu.activity_list_pays, menu);
	// return true;
	// }

}
