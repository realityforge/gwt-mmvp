package org.realityforge.gwt.mmvp.ioc;

import org.realityforge.gwt.gin.AbstractGinModule;
import org.realityforge.gwt.mmvp.Presenter;
import org.realityforge.gwt.mmvp.View;

public abstract class AbstractMvpGinModule
  extends AbstractGinModule
{
  protected final <P extends Presenter, V extends View<P>, U extends V, A extends P>
  void bindPresenter( final Class<P> presenter,
                      final Class<A> presenterImplementation,
                      final Class<V> view,
                      final Class<U> ui )
  {
    bindPresenter( presenter, presenterImplementation, view, ui, ScopeType.EAGER_SINGLETON );
  }

  protected final <P extends Presenter, V extends View<P>, U extends V, A extends P>
  void bindPresenter( final Class<P> presenter,
                      final Class<A> presenterImplementation,
                      final Class<V> view,
                      final Class<U> ui,
                      final ScopeType scopeType )
  {
    bindService( view, ui, scopeType );
    bindService( presenter, presenterImplementation, scopeType );
  }
}
