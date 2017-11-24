// Generated code from Butter Knife. Do not modify!
package com.sun.study.view;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ChoiceView$$ViewBinder<T extends com.sun.study.view.ChoiceView> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558730, "field 'ivMinus'");
    target.ivMinus = finder.castView(view, 2131558730, "field 'ivMinus'");
    view = finder.findRequiredView(source, 2131558729, "field 'rlMinus'");
    target.rlMinus = finder.castView(view, 2131558729, "field 'rlMinus'");
    view = finder.findRequiredView(source, 2131558732, "field 'ivPlus'");
    target.ivPlus = finder.castView(view, 2131558732, "field 'ivPlus'");
    view = finder.findRequiredView(source, 2131558731, "field 'rlPlus'");
    target.rlPlus = finder.castView(view, 2131558731, "field 'rlPlus'");
    view = finder.findRequiredView(source, 2131558733, "field 'tvCount'");
    target.tvCount = finder.castView(view, 2131558733, "field 'tvCount'");
    view = finder.findRequiredView(source, 2131558734, "field 'tvKitchenInfo'");
    target.tvKitchenInfo = finder.castView(view, 2131558734, "field 'tvKitchenInfo'");
  }

  @Override public void unbind(T target) {
    target.ivMinus = null;
    target.rlMinus = null;
    target.ivPlus = null;
    target.rlPlus = null;
    target.tvCount = null;
    target.tvKitchenInfo = null;
  }
}
