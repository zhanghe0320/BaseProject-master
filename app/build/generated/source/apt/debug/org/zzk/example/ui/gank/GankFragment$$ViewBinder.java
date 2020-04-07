// Generated code from Butter Knife. Do not modify!
package org.zzk.example.ui.gank;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class GankFragment$$ViewBinder<T extends org.zzk.example.ui.gank.GankFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558570, "field 'mRecyclerView'");
    target.mRecyclerView = finder.castView(view, 2131558570, "field 'mRecyclerView'");
    view = finder.findRequiredView(source, 2131558569, "field 'mRefreshView'");
    target.mRefreshView = finder.castView(view, 2131558569, "field 'mRefreshView'");
  }

  @Override public void unbind(T target) {
    target.mRecyclerView = null;
    target.mRefreshView = null;
  }
}
