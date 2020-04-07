package org.zzk.example.ui.gank;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.zzk.example.data.api.gank.GankApi;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GankPresenter_Factory implements Factory<GankPresenter> {
  private final MembersInjector<GankPresenter> gankPresenterMembersInjector;

  private final Provider<GankApi> gankApiProvider;

  public GankPresenter_Factory(
      MembersInjector<GankPresenter> gankPresenterMembersInjector,
      Provider<GankApi> gankApiProvider) {
    assert gankPresenterMembersInjector != null;
    this.gankPresenterMembersInjector = gankPresenterMembersInjector;
    assert gankApiProvider != null;
    this.gankApiProvider = gankApiProvider;
  }

  @Override
  public GankPresenter get() {
    return MembersInjectors.injectMembers(
        gankPresenterMembersInjector, new GankPresenter(gankApiProvider.get()));
  }

  public static Factory<GankPresenter> create(
      MembersInjector<GankPresenter> gankPresenterMembersInjector,
      Provider<GankApi> gankApiProvider) {
    return new GankPresenter_Factory(gankPresenterMembersInjector, gankApiProvider);
  }
}
