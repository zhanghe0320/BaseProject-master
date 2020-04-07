package org.zzk.example.injector.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import org.zzk.example.data.api.meitu.MeituService;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApiModule_ProvideMeituServiceFactory implements Factory<MeituService> {
  private final ApiModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public ApiModule_ProvideMeituServiceFactory(
      ApiModule module, Provider<OkHttpClient> okHttpClientProvider) {
    assert module != null;
    this.module = module;
    assert okHttpClientProvider != null;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public MeituService get() {
    return Preconditions.checkNotNull(
        module.provideMeituService(okHttpClientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MeituService> create(
      ApiModule module, Provider<OkHttpClient> okHttpClientProvider) {
    return new ApiModule_ProvideMeituServiceFactory(module, okHttpClientProvider);
  }
}
