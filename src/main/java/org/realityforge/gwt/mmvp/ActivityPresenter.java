package org.realityforge.gwt.mmvp;

import com.google.gwt.activity.shared.Activity;
import javax.annotation.Nonnull;

public interface ActivityPresenter
  extends Presenter
{
  @Nonnull
  Activity getActivity();
}
