package com.gwt.sample.client.login.createaccount;

import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.TextBox;
import com.gwt.sample.client.common.util.IntegerBoxUtil;
import com.gwt.sample.client.common.util.ListBoxUtil;
import com.gwt.sample.client.common.util.SuggestBoxUtil;
import com.gwt.sample.client.common.util.TextBoxUtil;

public class CreateAccountHelper {

	public static boolean checkWidget(TextBox textbox, Label label, String message) {
		if (TextBoxUtil.isEmpty(textbox)) {
			label.setText(message);
			textbox.addStyleName("form-error");
			return false;
		} else {
			label.setText("");
			textbox.removeStyleName("form-error");
			return true;

		}
	}

	public static boolean checkWidget(IntegerBox integebox, Label label,
			String message) {
		if (IntegerBoxUtil.isEmpty(integebox)) {
			label.setText(message);
			return false;
		} else {
			label.setText("");
			return true;
		}
	}

	public static boolean checkWidget(SuggestBox suggestbox, Label label,
			String message) {
		if (SuggestBoxUtil.isEmpty(suggestbox)) {
			label.setText(message);
			return false;
		} else {
			label.setText("");
			return true;
		}
	}

	public static boolean checkWidget(ListBox listbox, Label label, String message) {
		if (!ListBoxUtil.isSelected(listbox)) {
			label.setText(message);
			return false;
		} else {
			label.setText("");
			return true;
		}
	}

	public static boolean checkFirstName(TextBox textbox, Label label) {
		return checkWidget(textbox, label, "Error");

	}

	public static boolean checkName(Boolean firstNameTextBoxEntered,
			Boolean lastNameTextBoxEntered, TextBox firstName,
			TextBox lastName, Label label) {
		if (firstNameTextBoxEntered) {
			return checkWidget(firstName, label, "Error");
		}
		if (lastNameTextBoxEntered && label.getText().trim().equals("")) {
			return checkWidget(lastName, label, "Error");
		}
		return true;
	}

	public static boolean checkLastName(TextBox textbox, Label label) {
		return checkWidget(textbox, label, "Error");
	}

	public static boolean checkUsername(TextBox textbox, Label label) {
		return checkWidget(textbox, label, "Error");
	}

	public static boolean checkPassword(TextBox textbox, Label label) {
		return checkWidget(textbox, label, "Error");
	}

	public static boolean checkConfirmPassword(TextBox textbox, Label label) {
		return checkWidget(textbox, label, "Error");
	}

	public static boolean checkLocation(SuggestBox suggestbox, Label label) {
		return checkWidget(suggestbox, label, "Error");
	}

	public static boolean checkPhoneNumber(TextBox textbox, Label label) {
		return checkWidget(textbox, label, "Error");
	}

	public static boolean checkDateBD(IntegerBox integerbox, Label label) {
		return checkWidget(integerbox, label, "Error");
	}

	public static boolean checkMonthBD(ListBox listbox, Label label) {
		return checkWidget(listbox, label, "Error");
	}

	public static boolean checkYearBD(IntegerBox textbox, Label label) {
		return checkWidget(textbox, label, "Error");
	}

	public static boolean checkGender(ListBox listbox, Label label) {
		return checkWidget(listbox, label, "Error");
	}

	private void passwordEquals(TextBox password, TextBox confirmPassword,
			Label label, String message) {
		// getView().getPassword().getText()
		// .equals(getView().getConfirmPassword().getText());
		// label.setText(message);
	}

}
