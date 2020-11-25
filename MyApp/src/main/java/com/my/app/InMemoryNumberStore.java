package com.my.app;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

@Repository
public class InMemoryNumberStore implements NumberStore {

  private Map<Integer, String> store = new ConcurrentHashMap<>();

  @Override
  public String get(int i) {
    return store.get(i);
  }

  @Override
  public String set(int i, String value) {
    Assert.notNull(value);
    return store.put(i, value);
  }

  @Override
  public String remove(int i) {
    return store.remove(i);
  }
}
