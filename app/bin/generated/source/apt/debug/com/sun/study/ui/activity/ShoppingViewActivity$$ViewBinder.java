// Generated code from Butter Knife. Do not modify!
package com.sun.study.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ShoppingViewActivity$$ViewBinder<T extends com.sun.study.ui.activity.ShoppingViewActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558567, "field 'cvChoice1'");
    target.cvChoice1 = finder.castView(view, 2131558567, "field 'cvChoice1'");
    view = finder.findRequiredView(source, 2131558568, "field 'cvChoice2'");
    target.cvChoice2 = finder.castView(view, 2131558568, "field 'cvChoice2'");
    view = finder.findRequiredView(source, 2131558569, "field 'cvChoice3'");
    target.cvChoice3 = finder.castView(view, 2131558569, "field 'cvChoice3'");
    view = finder.findRequiredView(source, 2131558611, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131558611, "field 'toolbar'");
  }

  @Override public void unbind(T target) {
    target.cvChoice1 = null;
    target.cvChoice2 = null;
    target.cvChoice3 = null;
    target.toolbar = null;
  }
}
