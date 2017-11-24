// Generated code from Butter Knife. Do not modify!
package com.sun.study.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AmapActivity$$ViewBinder<T extends com.sun.study.ui.activity.AmapActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558534, "field 'mapView'");
    target.mapView = finder.castView(view, 2131558534, "field 'mapView'");
    view = finder.findRequiredView(source, 2131558535, "field 'floatingSearchView'");
    target.floatingSearchView = finder.castView(view, 2131558535, "field 'floatingSearchView'");
  }

  @Override public void unbind(T target) {
    target.mapView = null;
    target.floatingSearchView = null;
  }
}
