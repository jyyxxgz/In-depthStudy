// Generated code from Butter Knife. Do not modify!
package com.sun.study.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AnnotationActivity$$ViewBinder<T extends com.sun.study.ui.activity.AnnotationActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558611, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131558611, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131558536, "field 'tvInfo'");
    target.tvInfo = finder.castView(view, 2131558536, "field 'tvInfo'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.tvInfo = null;
  }
}