// Generated code from Butter Knife. Do not modify!
package com.sun.study.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ImageFragment$$ViewBinder<T extends com.sun.study.ui.fragment.ImageFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558647, "field 'tvFresco'");
    target.tvFresco = finder.castView(view, 2131558647, "field 'tvFresco'");
    view = finder.findRequiredView(source, 2131558648, "field 'tvImageLoader'");
    target.tvImageLoader = finder.castView(view, 2131558648, "field 'tvImageLoader'");
  }

  @Override public void unbind(T target) {
    target.tvFresco = null;
    target.tvImageLoader = null;
  }
}
