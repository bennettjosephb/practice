package au.com.mobileroo.kidsalpha;

import static au.com.mobileroo.kidsalpha.KidsAlphaUtil.generateInt;
import static au.com.mobileroo.kidsalpha.KidsAlphaUtil.generateRandomColors;
import static au.com.mobileroo.kidsalpha.KidsAlphaUtil.getIndex;
import static au.com.mobileroo.kidsalpha.KidsAlphaUtil.lowerCaseLetters;
import static au.com.mobileroo.kidsalpha.KidsAlphaUtil.upperCaseLetters;

import java.util.HashSet;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GuessAlphabetActivity extends Activity {

	// public static final int UPPER_CASE_ALPHABET_INITIAL = 65;
	// public static final int UPPER_CASE_ALPHABET_LAST = 90;
	// public static final int UPPER_CASE = 1;
	// public static final int LOWER_CASE = 0;
	// public static final int LOWER_CASE_ALPHABET_INITIAL = 97;
	// public static final int LOWER_CASE_ALPHABET_LAST = 122;
	// public static final int MIN_NUMBER_OF_ANSWERS = 1;
	// public static final int MAX_NUMBER_OF_ANSWERS = 6;

	// private final Random r = new Random();

	private final Context context = this;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guess_alphabet);
		update();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.guess_alphabet, menu);

		return true;
	}

	public void home(View view) {
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}

	/*
	 * public Character getIndex(HashSet<Character> set, int index) { int
	 * iterateIndex = 0; if (set.size() < index) { throw new
	 * IndexOutOfBoundsException(); } for (Character entry : set) { if
	 * (iterateIndex == index) { return entry; } iterateIndex++; } throw new
	 * IndexOutOfBoundsException(); }
	 */
	HashSet<Character> answers = null;
	int answerIndex = 0;

	private void assignValuesToAnswers(HashSet<Character> answers) {

		Object[] characters = answers.toArray();

		int[] colors = generateRandomColors();

		Button button = (Button) findViewById(R.id.button1);
		button.setText(characters[0].toString());
		button.setBackgroundResource(colors[0]);
		button = (Button) findViewById(R.id.button2);
		button.setText(characters[1].toString());
		button.setBackgroundResource(colors[1]);
		button = (Button) findViewById(R.id.button3);
		button.setText(characters[2].toString());
		button.setBackgroundResource(colors[2]);
		button = (Button) findViewById(R.id.button4);
		button.setText(characters[3].toString());
		button.setBackgroundResource(colors[3]);
		button = (Button) findViewById(R.id.button5);
		button.setText(characters[4].toString());
		button.setBackgroundResource(colors[4]);
		button = (Button) findViewById(R.id.button6);
		button.setText(characters[5].toString());
		button.setBackgroundResource(colors[5]);

	}

	private Character finalAnswer = null;

	private void generateQuestion(Character character) {

		Button button = null;
		char characterAscii = character.charValue();

		if (character.equals('a') || character.equals('A')) {

			button = (Button) findViewById(R.id.question1);
			button.setText("?");

			button = (Button) findViewById(R.id.question2);
			button.setText("" + (char) ((int) characterAscii + 1));

			button = (Button) findViewById(R.id.question3);
			button.setText("" + (char) ((int) characterAscii + 2));

		}

		else if (character.equals('z') || character.equals('Z')) {

			button = (Button) findViewById(R.id.question1);
			button.setText("" + (char) ((int) characterAscii - 2));

			button = (Button) findViewById(R.id.question2);
			button.setText("" + (char) ((int) characterAscii - 1));

			button = (Button) findViewById(R.id.question3);
			button.setText("?");
		}

		else {

			button = (Button) findViewById(R.id.question1);
			button.setText("" + (char) ((int) characterAscii - 1));

			button = (Button) findViewById(R.id.question2);
			button.setText("?");

			button = (Button) findViewById(R.id.question3);
			button.setText("" + (char) ((int) characterAscii + 1));
		}

		button = null;

	}

	private void update() {

		switch (generateInt(KidsAlphaConstant.LOWER_CASE,
				KidsAlphaConstant.UPPER_CASE)) {
		case KidsAlphaConstant.LOWER_CASE:

			answers = lowerCaseLetters();
			assignValuesToAnswers(answers);
			answerIndex = generateInt(KidsAlphaConstant.MIN_NUMBER_OF_ANSWERS,
					KidsAlphaConstant.MAX_NUMBER_OF_ANSWERS);

			finalAnswer = getIndex(answers, answerIndex - 1);
			generateQuestion(finalAnswer);

			findViewById(R.id.question);

			break;

		case KidsAlphaConstant.UPPER_CASE:

			answers = upperCaseLetters();
			assignValuesToAnswers(answers);
			answerIndex = generateInt(KidsAlphaConstant.MIN_NUMBER_OF_ANSWERS,
					KidsAlphaConstant.MAX_NUMBER_OF_ANSWERS);
			finalAnswer = getIndex(answers, answerIndex - 1);
			generateQuestion(finalAnswer);

			findViewById(R.id.question);

			break;

		default:

			answers = upperCaseLetters();
			assignValuesToAnswers(answers);
			answerIndex = generateInt(KidsAlphaConstant.MIN_NUMBER_OF_ANSWERS,
					KidsAlphaConstant.MAX_NUMBER_OF_ANSWERS);
			finalAnswer = getIndex(answers, answerIndex - 1);
			generateQuestion(finalAnswer);

			findViewById(R.id.question);

			break;
		}

	}

	/*
	 * private HashSet<Character> upperCaseLetters() {
	 * 
	 * HashSet<Character> characters = new HashSet<Character>();
	 * 
	 * do {
	 * 
	 * characters.add(generateCharacter(
	 * KidsAlphaConstant.UPPER_CASE_ALPHABET_INITIAL,
	 * KidsAlphaConstant.UPPER_CASE_ALPHABET_LAST));
	 * 
	 * } while (characters.size() < KidsAlphaConstant.MAX_NUMBER_OF_ANSWERS);
	 * 
	 * return characters;
	 * 
	 * }
	 * 
	 * private HashSet<Character> lowerCaseLetters() {
	 * 
	 * HashSet<Character> characters = new HashSet<Character>();
	 * 
	 * do {
	 * 
	 * characters.add(generateCharacter(
	 * KidsAlphaConstant.LOWER_CASE_ALPHABET_INITIAL,
	 * KidsAlphaConstant.LOWER_CASE_ALPHABET_LAST));
	 * 
	 * } while (characters.size() < KidsAlphaConstant.MAX_NUMBER_OF_ANSWERS);
	 * 
	 * return characters;
	 * 
	 * }
	 * 
	 * private char generateCharacter(int initialAscii, int lastAscii) {
	 * 
	 * int randomAscii = r.nextInt(lastAscii - initialAscii + 1) + initialAscii;
	 * return (char) randomAscii;
	 * 
	 * }
	 * 
	 * private int generateInt(int initialAscii, int lastAscii) {
	 * 
	 * int randomAscii = r.nextInt(lastAscii - initialAscii + 1) + initialAscii;
	 * return randomAscii;
	 * 
	 * }
	 */
	private void validateAnswer(Button button) {
		if (button.getText().toString().trim()
				.equals(finalAnswer.toString().trim())) {
			Toast.makeText(this, "Great You Are Right!!!", Toast.LENGTH_LONG)
					.show();
			AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
					context);

			// set title
			alertDialogBuilder.setTitle("Your Title");

			// set dialog message
			alertDialogBuilder
					.setMessage("Click yes to exit!")
					.setCancelable(false)
					.setPositiveButton("Yes",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int id) {
									update();
								}
							})
					.setNegativeButton("No",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int id) {
									update();
								}
							});

			// create alert dialog
			AlertDialog alertDialog = alertDialogBuilder.create();

			// show it
			alertDialog.show();

		} else {
			Toast.makeText(this, "Sorry, You Are Not Right!!!",
					Toast.LENGTH_LONG).show();
		}
		// update();
	}

	public void button1Pressed(View view) {
		Button button = (Button) findViewById(R.id.button1);
		validateAnswer(button);
	}

	public void button2Pressed(View view) {
		Button button = (Button) findViewById(R.id.button2);
		validateAnswer(button);
	}

	public void button3Pressed(View view) {
		Button button = (Button) findViewById(R.id.button3);
		validateAnswer(button);
	}

	public void button4Pressed(View view) {
		Button button = (Button) findViewById(R.id.button4);
		validateAnswer(button);
	}

	public void button5Pressed(View view) {
		Button button = (Button) findViewById(R.id.button5);
		validateAnswer(button);
	}

	public void button6Pressed(View view) {
		Button button = (Button) findViewById(R.id.button6);
		validateAnswer(button);
	}

}
