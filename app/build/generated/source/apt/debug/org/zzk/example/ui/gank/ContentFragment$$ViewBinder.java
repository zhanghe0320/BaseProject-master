// Generated code from Butter Knife. Do not modify!
package org.zzk.example.ui.gank;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ContentFragment$$ViewBinder<T extends org.zzk.example.ui.gank.ContentFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558568, "field 'mViewpager'");
    target.mViewpager = finder.castView(view, 2131558568, "field 'mViewpager'");
    view = finder.findRequiredView(source, 2131558567, "field 'mTablayout'");
    target.mTablayout = finder.castView(view, 2131558567, "field 'mTablayout'");
  }

  @Override public void unbind(T target) {
    target.mViewpager = null;
    target.mTablayout = null;
  }
}
