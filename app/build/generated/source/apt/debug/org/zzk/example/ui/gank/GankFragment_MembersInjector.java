package org.zzk.example.ui.gank;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GankFragment_MembersInjector implements MembersInjector<GankFragment> {
  private final Provider<GankPresenter> mPresenterProvider;

  public GankFragment_MembersInjector(Provider<GankPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<GankFragment> create(Provider<GankPresenter> mPresenterProvider) {
    return new GankFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(GankFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    org.zzk.example.ui.base.BaseFragment_MembersInjector.injectMPresenter(
        instance, mPresenterProvider);
  }
}
