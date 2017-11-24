// Generated code from Butter Knife. Do not modify!
package com.sun.study.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RetrofitActivity$$ViewBinder<T extends com.sun.study.ui.activity.RetrofitActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558611, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131558611, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131558564, "field 'etNum'");
    target.etNum = finder.castView(view, 2131558564, "field 'etNum'");
    view = finder.findRequiredView(source, 2131558565, "field 'tvResult'");
    target.tvResult = finder.castView(view, 2131558565, "field 'tvResult'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.etNum = null;
    target.tvResult = null;
  }
}
