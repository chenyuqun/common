package com.zizaike.core.common.collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 * ClassName: CollectionUtil <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: Effective Java中提到,应该有这样一个创建集合的便利工具类,其作用为类型推导. 在JDK1.7中,增加了砖石语法支持该特性.. <br/>
 * date: 2015年9月8日 下午1:55:00 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.6
 */
public abstract class CollectionUtil {



  /***
   * ArrayList
   * 
   * @return
   */
  public static <T> List<T> newArrayList() {
    return new ArrayList<T>();
  }

  /****
   * ArrayList
   * 
   * @author zhicheng.han
   * @since 2014年5月14日
   *
   * @param initialCapacity
   * @return
   */
  public static <T> List<T> newArrayList(int initialCapacity) {
    return new ArrayList<T>(initialCapacity);
  }

  /****
   * ArrayList
   * 
   * @author zhicheng.han
   * @since 2014年5月14日
   *
   * @param collection
   * @return
   */
  public static <T> List<T> newArrayList(Collection<T> collection) {
    return new ArrayList<T>(collection);
  }


  /****
   * LinkedList
   * 
   * @return
   */
  public static <T> List<T> newLinkedList() {
    return new LinkedList<T>();
  }

  /****
   * LinkedList
   * 
   * @return
   */
  public static <T> List<T> newLinkedList(Collection<T> collection) {
    return new LinkedList<T>(collection);
  }


  /****
   * HashSet
   * 
   * @return
   */
  public static <E> Set<E> newHashSet(int initialCapacity) {
    return new HashSet<E>(initialCapacity);
  }

  /****
   * HashSet
   * 
   * @return
   */
  public static <E> Set<E> newHashSet() {
    return new HashSet<E>();
  }

  /****
   * HashSet
   * 
   * @return
   */
  public static <E> Set<E> newHashSet(Collection<E> collection) {
    return new HashSet<E>(collection);
  }

  /***
   * HashMap
   * 
   * @return
   */
  public static <K, V> Map<K, V> newHashMap() {
    return new HashMap<K, V>();
  }

  /***
   * HashMap
   * 
   * @return
   */
  public static <K, V> Map<K, V> newHashMap(int initialCapacity) {
    return new HashMap<K, V>(initialCapacity);
  }

  /***
   * HashMap
   * 
   * @return
   */
  public static <K, V> Map<K, V> newHashMap(Map<K, V> map) {
    return new HashMap<K, V>(map);
  }


  /****
   * TreeMap
   * 
   * @return
   */
  public static <K, V> Map<K, V> newTreeMap() {
    return new TreeMap<K, V>();
  }

  /****
   * TreeMap
   * 
   * @return
   */
  public static <K, V> Map<K, V> newTreeMap(SortedMap<K, V> map) {
    return new TreeMap<K, V>(map);
  }


  /****
   * ConcurrentHashMap
   * 
   * @return
   */
  public static <K, V> Map<K, V> newConcurrentHashMap() {
    return new ConcurrentHashMap<K, V>();
  }

  /****
   * ConcurrentHashMap
   * 
   * @return
   */
  public static <K, V> Map<K, V> newConcurrentHashMap(int initialCapacity) {
    return new ConcurrentHashMap<K, V>(initialCapacity);
  }

  /****
   * ConcurrentHashMap
   * 
   * @return
   */
  public static <K, V> Map<K, V> newConcurrentHashMap(Map<K, V> map) {
    return new ConcurrentHashMap<K, V>(map);
  }

}
