package com.my.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the implementation of {@link FooBarService}.
 */
@Service
public class FooBarServiceImpl implements FooBarService {

  @Autowired
  private NumberStore numberStore;

  // TODO
//  @Override
//  public String getNumberValue(int i) {
//  }
//
//  @Override
//  public List<String> getNumberValues(int start, int end) {
//    ArrayList<String> list = new ArrayList<>();
//    for (int i = start; i < end + 1; i++) {
//      list.add(getNumberValue(i));
//    }
//    return list;
//  }
//
//  @Override
//  public String setNumberValue(int i, String value) {
//    return value == null ? numberStore.remove(i) : numberStore.set(i, value);
//  }
//
//  @Override
//  public String resetNumberValue(int i) {
//    return numberStore.remove(i);
//  }
}
