// Generated code from Butter Knife. Do not modify!
package com.sun.study.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SplashActivity$$ViewBinder<T extends com.sun.study.ui.activity.SplashActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558570, "field 'svgView'");
    target.svgView = finder.castView(view, 2131558570, "field 'svgView'");
    view = finder.findRequiredView(source, 2131558571, "field 'tvTitle'");
    target.tvTitle = finder.castView(view, 2131558571, "field 'tvTitle'");
  }

  @Override public void unbind(T target) {
    target.svgView = null;
    target.tvTitle = null;
  }
}
