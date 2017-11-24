// Generated code from Butter Knife. Do not modify!
package com.sun.study.ui.activity.rxjava;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RxJava1Activity$$ViewBinder<T extends com.sun.study.ui.activity.rxjava.RxJava1Activity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558611, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131558611, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131558566, "field 'tvContent'");
    target.tvContent = finder.castView(view, 2131558566, "field 'tvContent'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.tvContent = null;
  }
}
