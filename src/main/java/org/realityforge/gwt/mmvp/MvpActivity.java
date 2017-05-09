package org.realityforge.gwt.mmvp;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import javax.annotation.Nonnull;

public abstract class MvpActivity<P extends ActivityPresenter, V extends View<P>>
  extends AbstractActivity
  implements ActivityPresenter
{
  @Nonnull
  protected abstract V getView();

  @SuppressWarnings( "unchecked" )
  @Override
  public void start( final AcceptsOneWidget acceptsOneWidget, final EventBus eventBus )
  {
    final V view = getView();
    view.bind( (P) this );
    acceptsOneWidget.setWidget( view.asWidget() );
  }

  @Nonnull
  @Override
  public Activity getActivity()
  {
    return this;
  }
}
