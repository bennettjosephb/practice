package com.gwt.sample.client.content;

import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwt.sample.client.place.NameTokens;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.google.inject.Inject;
import com.google.gwt.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.gwt.sample.client.content.ContentContainerPresenter;

public class ManageCoverLetterPresenter
		extends
		Presenter<ManageCoverLetterPresenter.MyView, ManageCoverLetterPresenter.MyProxy> {

	public interface MyView extends View {
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.coverletter)
	public interface MyProxy extends ProxyPlace<ManageCoverLetterPresenter> {
	}

	@Inject
	public ManageCoverLetterPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, ContentContainerPresenter.MAIN_CONTENT_SLOT,
				this);
	}

	@Override
	protected void onBind() {
		super.onBind();
	}

	@Override
	protected void onHide() {
		super.onHide();
	}

	@Override
	protected void onReset() {
		super.onReset();
	}

	@Override
	protected void onReveal() {
		super.onReveal();
	}

	@Override
	protected void onUnbind() {
		super.onUnbind();
	}
}
