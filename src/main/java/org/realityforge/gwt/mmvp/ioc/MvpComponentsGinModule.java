package org.realityforge.gwt.mmvp.ioc;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.inject.Provides;
import javax.annotation.Nonnull;
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
  public final PlaceHistoryHandler getHistoryHandler( @Nonnull final PlaceController placeController,
                                                      @Nonnull final PlaceHistoryMapper historyMapper,
                                                      @Nonnull final com.google.web.bindery.event.shared.EventBus eventBus,
                                                      @Nonnull final Place place )
  {
    final PlaceHistoryHandler historyHandler = new PlaceHistoryHandler( historyMapper );
    historyHandler.register( placeController, eventBus, place );
    return historyHandler;
  }

  @Provides
  @Singleton
  public final PlaceController getPlaceController( @Nonnull final com.google.web.bindery.event.shared.EventBus eventBus )
  {
    return new PlaceController( eventBus );
  }

  @Provides
  @Singleton
  public final ActivityManager getActivityManager( @Nonnull final ActivityMapper activityMapper, @Nonnull final EventBus eventBus )
  {
    return new ActivityManager( activityMapper, eventBus );
  }

  @Provides
  @Singleton
  public final com.google.web.bindery.event.shared.EventBus getSharedEventBus( @Nonnull final EventBus eventBus )
  {
    return eventBus;
  }
}
