// Generated code from Butter Knife. Do not modify!
package com.sun.study.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MapFragment$$ViewBinder<T extends com.sun.study.ui.fragment.MapFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558652, "field 'tvAmap'");
    target.tvAmap = finder.castView(view, 2131558652, "field 'tvAmap'");
    view = finder.findRequiredView(source, 2131558653, "field 'tvBaidumap'");
    target.tvBaidumap = finder.castView(view, 2131558653, "field 'tvBaidumap'");
  }

  @Override public void unbind(T target) {
    target.tvAmap = null;
    target.tvBaidumap = null;
  }
}
