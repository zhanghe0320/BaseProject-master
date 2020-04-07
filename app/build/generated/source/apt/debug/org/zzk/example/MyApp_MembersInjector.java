package org.zzk.example;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyApp_MembersInjector implements MembersInjector<MyApp> {
  private final Provider<OkHttpClient> mOkHttpClientProvider;

  public MyApp_MembersInjector(Provider<OkHttpClient> mOkHttpClientProvider) {
    assert mOkHttpClientProvider != null;
    this.mOkHttpClientProvider = mOkHttpClientProvider;
  }

  public static MembersInjector<MyApp> create(Provider<OkHttpClient> mOkHttpClientProvider) {
    return new MyApp_MembersInjector(mOkHttpClientProvider);
  }

  @Override
  public void injectMembers(MyApp instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mOkHttpClient = mOkHttpClientProvider.get();
  }

  public static void injectMOkHttpClient(
      MyApp instance, Provider<OkHttpClient> mOkHttpClientProvider) {
    instance.mOkHttpClient = mOkHttpClientProvider.get();
  }
}
