package org.realityforge.gwt.mmvp.ioc;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Provides;
import javax.inject.Singleton;

public class MvpComponentsGinModule
  extends AbstractGinModule
{
  @Override
  protected void configure()
  {
  }

  @Provides
  @Singleton
  public final PlaceController getPlaceController( final com.google.web.bindery.event.shared.EventBus eventBus )
  {
    return new PlaceController( eventBus );
  }

  @Provides
  @Singleton
  public final com.google.web.bindery.event.shared.EventBus getSharedEventBus( final EventBus eventBus )
  {
    return eventBus;
  }
}
