package org.zzk.example.injector.components;

import dagger.MembersInjector;
import dagger.internal.Preconditions;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import org.zzk.example.MyApp;
import org.zzk.example.MyApp_MembersInjector;
import org.zzk.example.components.okhttp.OkHttpHelper;
import org.zzk.example.data.api.gank.GankService;
import org.zzk.example.data.api.meitu.MeituService;
import org.zzk.example.injector.modules.ApiModule;
import org.zzk.example.injector.modules.ApiModule_ProvideGankServiceFactory;
import org.zzk.example.injector.modules.ApiModule_ProvideMeituServiceFactory;
import org.zzk.example.injector.modules.AppModule;
import org.zzk.example.injector.modules.AppModule_ProvideApiOkHttpClientFactory;
import org.zzk.example.injector.modules.AppModule_ProvideOkHttpClientFactory;
import org.zzk.example.injector.modules.AppModule_ProvideOkHttpHelperFactory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<OkHttpClient> provideApiOkHttpClientProvider;

  private Provider<OkHttpClient> provideOkHttpClientProvider;

  private Provider<OkHttpHelper> provideOkHttpHelperProvider;

  private Provider<GankService> provideGankServiceProvider;

  private Provider<MeituService> provideMeituServiceProvider;

  private MembersInjector<MyApp> myAppMembersInjector;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideApiOkHttpClientProvider =
        ScopedProvider.create(AppModule_ProvideApiOkHttpClientFactory.create(builder.appModule));

    this.provideOkHttpClientProvider =
        ScopedProvider.create(
            AppModule_ProvideOkHttpClientFactory.create(
                builder.appModule, provideApiOkHttpClientProvider));

    this.provideOkHttpHelperProvider =
        ScopedProvider.create(
            AppModule_ProvideOkHttpHelperFactory.create(
                builder.appModule, provideOkHttpClientProvider));

    this.provideGankServiceProvider =
        ScopedProvider.create(
            ApiModule_ProvideGankServiceFactory.create(
                builder.apiModule, provideOkHttpClientProvider));

    this.provideMeituServiceProvider =
        ScopedProvider.create(
            ApiModule_ProvideMeituServiceFactory.create(
                builder.apiModule, provideOkHttpClientProvider));

    this.myAppMembersInjector = MyApp_MembersInjector.create(provideOkHttpClientProvider);
  }

  @Override
  public OkHttpHelper getOkHttpHelper() {
    return provideOkHttpHelperProvider.get();
  }

  @Override
  public GankService getGankService() {
    return provideGankServiceProvider.get();
  }

  @Override
  public MeituService getMeituService() {
    return provideMeituServiceProvider.get();
  }

  @Override
  public void inject(MyApp mApplication) {
    myAppMembersInjector.injectMembers(mApplication);
  }

  public static final class Builder {
    private AppModule appModule;

    private ApiModule apiModule;

    private Builder() {}

    public AppComponent build() {
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      if (apiModule == null) {
        this.apiModule = new ApiModule();
      }
      return new DaggerAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder apiModule(ApiModule apiModule) {
      this.apiModule = Preconditions.checkNotNull(apiModule);
      return this;
    }
  }
}
