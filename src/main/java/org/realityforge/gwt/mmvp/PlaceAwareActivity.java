package org.realityforge.gwt.mmvp;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.realityforge.gwt.mmvp.ActivityPresenter;
import org.realityforge.gwt.mmvp.MvpActivity;
import org.realityforge.gwt.mmvp.PlaceAware;
import org.realityforge.gwt.mmvp.View;

public abstract class PlaceAwareActivity<P extends ActivityPresenter, V extends View<P>, PL extends Place>
  extends MvpActivity<P, V>
  implements PlaceAware
{
  @Nonnull
  private final PlaceController _placeController;
  @Nullable
  private PL _place;

  protected PlaceAwareActivity( @Nonnull final V view, @Nonnull final PlaceController placeController )
  {
    super( view );
    _placeController = Objects.requireNonNull( placeController );
  }

  @SuppressWarnings( "unchecked" )
  @Override
  public void start( final AcceptsOneWidget acceptsOneWidget, final EventBus eventBus )
  {
    _place = (PL) getPlaceController().getWhere();
    super.start( acceptsOneWidget, eventBus );
  }

  @Override
  public <PLACE extends Place> boolean atPlace( final PLACE place )
  {
    return Objects.equals( place, _place );
  }

  @Nonnull
  protected final PL place()
  {
    assert null != _place;
    return _place;
  }

  @Nonnull
  protected final PlaceController getPlaceController()
  {
    return _placeController;
  }
}
