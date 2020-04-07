package org.zzk.example.injector.components;

import android.app.Activity;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.zzk.example.data.api.gank.GankApi;
import org.zzk.example.data.api.gank.GankApi_Factory;
import org.zzk.example.data.api.gank.GankService;
import org.zzk.example.data.api.meitu.MeituApi;
import org.zzk.example.data.api.meitu.MeituApi_Factory;
import org.zzk.example.data.api.meitu.MeituService;
import org.zzk.example.injector.modules.FragmentModule;
import org.zzk.example.injector.modules.FragmentModule_ProvideActivityFactory;
import org.zzk.example.ui.gank.GankFragment;
import org.zzk.example.ui.gank.GankFragment_MembersInjector;
import org.zzk.example.ui.gank.GankPresenter;
import org.zzk.example.ui.gank.GankPresenter_Factory;
import org.zzk.example.ui.meitu.MeituListFragment;
import org.zzk.example.ui.meitu.MeituListFragment_MembersInjector;
import org.zzk.example.ui.meitu.MeituListPresenter;
import org.zzk.example.ui.meitu.MeituListPresenter_Factory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerFragmentComponent implements FragmentComponent {
  private Provider<Activity> provideActivityProvider;

  private Provider<GankService> getGankServiceProvider;

  private Provider<GankApi> gankApiProvider;

  private Provider<GankPresenter> gankPresenterProvider;

  private MembersInjector<GankFragment> gankFragmentMembersInjector;

  private Provider<MeituService> getMeituServiceProvider;

  private Provider<MeituApi> meituApiProvider;

  private Provider<MeituListPresenter> meituListPresenterProvider;

  private MembersInjector<MeituListFragment> meituListFragmentMembersInjector;

  private DaggerFragmentComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideActivityProvider =
        ScopedProvider.create(FragmentModule_ProvideActivityFactory.create(builder.fragmentModule));

    this.getGankServiceProvider =
        new Factory<GankService>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public GankService get() {
            return Preconditions.checkNotNull(
                appComponent.getGankService(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.gankApiProvider = GankApi_Factory.create(getGankServiceProvider);

    this.gankPresenterProvider =
        ScopedProvider.create(
            GankPresenter_Factory.create(MembersInjectors.<GankPresenter>noOp(), gankApiProvider));

    this.gankFragmentMembersInjector = GankFragment_MembersInjector.create(gankPresenterProvider);

    this.getMeituServiceProvider =
        new Factory<MeituService>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public MeituService get() {
            return Preconditions.checkNotNull(
                appComponent.getMeituService(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.meituApiProvider = MeituApi_Factory.create(getMeituServiceProvider);

    this.meituListPresenterProvider =
        ScopedProvider.create(
            MeituListPresenter_Factory.create(
                MembersInjectors.<MeituListPresenter>noOp(), meituApiProvider));

    this.meituListFragmentMembersInjector =
        MeituListFragment_MembersInjector.create(meituListPresenterProvider);
  }

  @Override
  public Activity getActivity() {
    return provideActivityProvider.get();
  }

  @Override
  public void inject(GankFragment gankFragment) {
    gankFragmentMembersInjector.injectMembers(gankFragment);
  }

  @Override
  public void inject(MeituListFragment meituListFragment) {
    meituListFragmentMembersInjector.injectMembers(meituListFragment);
  }

  public static final class Builder {
    private FragmentModule fragmentModule;

    private AppComponent appComponent;

    private Builder() {}

    public FragmentComponent build() {
      if (fragmentModule == null) {
        throw new IllegalStateException(FragmentModule.class.getCanonicalName() + " must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerFragmentComponent(this);
    }

    public Builder fragmentModule(FragmentModule fragmentModule) {
      this.fragmentModule = Preconditions.checkNotNull(fragmentModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}
