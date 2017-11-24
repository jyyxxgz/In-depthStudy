// Generated code from Butter Knife. Do not modify!
package com.sun.study.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CustomViewFragment$$ViewBinder<T extends com.sun.study.ui.fragment.CustomViewFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558627, "field 'tvShoppingView'");
    target.tvShoppingView = finder.castView(view, 2131558627, "field 'tvShoppingView'");
    view = finder.findRequiredView(source, 2131558628, "field 'tvDialog'");
    target.tvDialog = finder.castView(view, 2131558628, "field 'tvDialog'");
  }

  @Override public void unbind(T target) {
    target.tvShoppingView = null;
    target.tvDialog = null;
  }
}
