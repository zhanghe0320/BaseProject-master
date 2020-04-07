package org.zzk.example.data;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum DataManager_Factory implements Factory<DataManager> {
  INSTANCE;

  @Override
  public DataManager get() {
    return new DataManager();
  }

  public static Factory<DataManager> create() {
    return INSTANCE;
  }
}
