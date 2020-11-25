package com.my.app;

/**
 * This store persists FooBar mappings.
 */
public interface NumberStore {

  /**
   * Returns FooBar value.
   *
   * @param i integer key
   * @return FooBar value or null if value doesn't exist
   */
  String get(int i);

  /**
   * Set a FooBar value.
   *
   * @param i integer key
   * @param value a non-null FooBar value
   * @return previous value stored under key i or null
   */
  String set(int i, String value);

  /**
   * Removes a FooBar value
   *
   * @param i integer key
   * @return value previously stored under key i or null
   */
  String remove(int i);
}
