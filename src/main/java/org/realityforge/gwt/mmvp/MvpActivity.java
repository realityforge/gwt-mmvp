package org.realityforge.gwt.mmvp;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import java.util.Objects;
import javax.annotation.Nonnull;

public abstract class MvpActivity<P extends ActivityPresenter, V extends View<P>>
  extends AbstractActivity
  implements ActivityPresenter
{
  private final V _view;

  public MvpActivity( @Nonnull final V view )
  {
    _view = Objects.requireNonNull( view );
  }

  @Nonnull
  protected final V getView()
  {
    return _view;
  }

  @SuppressWarnings( "unchecked" )
  @Override
  public void start( final AcceptsOneWidget acceptsOneWidget, final EventBus eventBus )
  {
    final V view = getView();
    view.bind( (P) this );
    acceptsOneWidget.setWidget( view.asWidget() );
    onStart();
  }

  protected void onStart()
  {
  }

  @Nonnull
  @Override
  public final Activity getActivity()
  {
    return this;
  }
}
