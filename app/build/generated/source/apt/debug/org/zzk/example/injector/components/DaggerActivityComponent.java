package org.zzk.example.injector.components;

import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.zzk.example.data.DataManager_Factory;
import org.zzk.example.injector.modules.ActivityModule;
import org.zzk.example.ui.splash.SplashActivity;
import org.zzk.example.ui.splash.SplashActivity_MembersInjector;
import org.zzk.example.ui.splash.SplashPresenter;
import org.zzk.example.ui.splash.SplashPresenter_Factory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerActivityComponent implements ActivityComponent {
  private Provider<SplashPresenter> splashPresenterProvider;

  private MembersInjector<SplashActivity> splashActivityMembersInjector;

  private DaggerActivityComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.splashPresenterProvider =
        ScopedProvider.create(
            SplashPresenter_Factory.create(
                MembersInjectors.<SplashPresenter>noOp(), DataManager_Factory.create()));

    this.splashActivityMembersInjector =
        SplashActivity_MembersInjector.create(splashPresenterProvider);
  }

  @Override
  public void inject(SplashActivity splashActivity) {
    splashActivityMembersInjector.injectMembers(splashActivity);
  }

  public static final class Builder {
    private AppComponent appComponent;

    private Builder() {}

    public ActivityComponent build() {
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerActivityComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder activityModule(ActivityModule activityModule) {
      Preconditions.checkNotNull(activityModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}
