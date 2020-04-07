package org.zzk.example.ui.splash;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.zzk.example.data.DataManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SplashPresenter_Factory implements Factory<SplashPresenter> {
  private final MembersInjector<SplashPresenter> splashPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  public SplashPresenter_Factory(
      MembersInjector<SplashPresenter> splashPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    assert splashPresenterMembersInjector != null;
    this.splashPresenterMembersInjector = splashPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public SplashPresenter get() {
    return MembersInjectors.injectMembers(
        splashPresenterMembersInjector, new SplashPresenter(dataManagerProvider.get()));
  }

  public static Factory<SplashPresenter> create(
      MembersInjector<SplashPresenter> splashPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    return new SplashPresenter_Factory(splashPresenterMembersInjector, dataManagerProvider);
  }
}
