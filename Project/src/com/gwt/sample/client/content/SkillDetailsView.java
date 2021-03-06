package com.gwt.sample.client.content;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;

public class SkillDetailsView extends ViewImpl implements
		SkillDetailsPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, SkillDetailsView> {
	}

	@Inject
	public SkillDetailsView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
	@UiField Button addSkill;
	@UiField FlowPanel listSkill;
}
