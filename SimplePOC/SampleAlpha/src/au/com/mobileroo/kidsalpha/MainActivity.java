package au.com.mobileroo.kidsalpha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void learnUpperCase(View view) {
		Intent intent = new Intent(this, LearnUpperCaseActivity.class);
		startActivity(intent);
	}

	public void learnLowerCase(View view) {
		Intent intent = new Intent(this, LearnLowerCaseActivity.class);
		startActivity(intent);

	}

	public void matchCaseGame(View view) {
		Intent intent = new Intent(this, MatchCaseGameActivity.class);
		startActivity(intent);

	}

	public void guessAlphabet(View view) {
		Intent intent = new Intent(this, GuessAlphabetActivity.class);
		startActivity(intent);

	}

	public void settings(View view) {
		Intent intent = new Intent(this, SettingsActivity.class);
		startActivity(intent);

	}

}
