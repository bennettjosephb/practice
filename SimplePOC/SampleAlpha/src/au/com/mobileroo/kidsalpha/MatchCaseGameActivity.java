package au.com.mobileroo.kidsalpha;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MatchCaseGameActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_match_case_game);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.match_case_game, menu);
		return true;
	}

}
