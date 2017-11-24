// Generated code from Butter Knife. Do not modify!
package com.sun.study.view;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ShareView$$ViewBinder<T extends com.sun.study.view.ShareView> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558722, "field 'ivShareFriend'");
    target.ivShareFriend = finder.castView(view, 2131558722, "field 'ivShareFriend'");
    view = finder.findRequiredView(source, 2131558723, "field 'ivShareWx'");
    target.ivShareWx = finder.castView(view, 2131558723, "field 'ivShareWx'");
    view = finder.findRequiredView(source, 2131558724, "field 'ivShareWeibo'");
    target.ivShareWeibo = finder.castView(view, 2131558724, "field 'ivShareWeibo'");
    view = finder.findRequiredView(source, 2131558725, "field 'ivShareQq'");
    target.ivShareQq = finder.castView(view, 2131558725, "field 'ivShareQq'");
    view = finder.findRequiredView(source, 2131558726, "field 'ivShareQqzone'");
    target.ivShareQqzone = finder.castView(view, 2131558726, "field 'ivShareQqzone'");
    view = finder.findRequiredView(source, 2131558727, "field 'tvShareCancel'");
    target.tvShareCancel = finder.castView(view, 2131558727, "field 'tvShareCancel'");
  }

  @Override public void unbind(T target) {
    target.ivShareFriend = null;
    target.ivShareWx = null;
    target.ivShareWeibo = null;
    target.ivShareQq = null;
    target.ivShareQqzone = null;
    target.tvShareCancel = null;
  }
}
