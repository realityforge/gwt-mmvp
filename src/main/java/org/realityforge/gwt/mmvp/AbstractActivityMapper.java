package org.realityforge.gwt.mmvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import java.util.HashMap;
import java.util.function.Supplier;
import javax.inject.Provider;

/**
 * Abstract ActivityMapper to simplify binding activity mappers to places.
 *
 * Strongly inspired by the SimpleActivityMapper in the ginmvp project.
 */
public abstract class AbstractActivityMapper
  implements ActivityMapper
{
  private final HashMap<Class<? extends Place>, Supplier<? extends ActivityPresenter>> _suppliers = new HashMap<>();

  private Activity _currentActivity;

  @Override
  public Activity getActivity( final Place place )
  {
    if ( null != _currentActivity && _currentActivity instanceof PlaceAware )
    {
      if ( ( (PlaceAware) _currentActivity ).atPlace( place ) )
      {
        return _currentActivity;
      }
      _currentActivity = null;
    }
    final Supplier<? extends ActivityPresenter> supplier = _suppliers.get( place.getClass() );
    if ( null != supplier )
    {
      final ActivityPresenter presenter = supplier.get();
      final Activity activity = presenter.getActivity();
      if ( activity instanceof PlaceAware )
      {
        final boolean changed = ( (PlaceAware) activity ).atPlace( place );
        assert changed;
      }
      _currentActivity = activity;
      return activity;
    }
    return null;
  }

  protected final <P extends Place, A extends ActivityPresenter>
  void registerProvider( final Class<P> placeClass, final Supplier<A> supplier )
  {
    _suppliers.put( placeClass, supplier );
  }
}
