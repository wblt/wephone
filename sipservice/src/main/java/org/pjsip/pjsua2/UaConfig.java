/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class UaConfig extends PersistentObject {
  private long swigCPtr;

  protected UaConfig(long cPtr, boolean cMemoryOwn) {
    super(pjsua2JNI.UaConfig_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UaConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_UaConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setMaxCalls(long value) {
    pjsua2JNI.UaConfig_maxCalls_set(swigCPtr, this, value);
  }

  public long getMaxCalls() {
    return pjsua2JNI.UaConfig_maxCalls_get(swigCPtr, this);
  }

  public void setThreadCnt(long value) {
    pjsua2JNI.UaConfig_threadCnt_set(swigCPtr, this, value);
  }

  public long getThreadCnt() {
    return pjsua2JNI.UaConfig_threadCnt_get(swigCPtr, this);
  }

  public void setMainThreadOnly(boolean value) {
    pjsua2JNI.UaConfig_mainThreadOnly_set(swigCPtr, this, value);
  }

  public boolean getMainThreadOnly() {
    return pjsua2JNI.UaConfig_mainThreadOnly_get(swigCPtr, this);
  }

  public void setNameserver(StringVector value) {
    pjsua2JNI.UaConfig_nameserver_set(swigCPtr, this, StringVector.getCPtr(value), value);
  }

  public StringVector getNameserver() {
    long cPtr = pjsua2JNI.UaConfig_nameserver_get(swigCPtr, this);
    return (cPtr == 0) ? null : new StringVector(cPtr, false);
  }

  public void setUserAgent(String value) {
    pjsua2JNI.UaConfig_userAgent_set(swigCPtr, this, value);
  }

  public String getUserAgent() {
    return pjsua2JNI.UaConfig_userAgent_get(swigCPtr, this);
  }

  public void setStunServer(StringVector value) {
    pjsua2JNI.UaConfig_stunServer_set(swigCPtr, this, StringVector.getCPtr(value), value);
  }

  public StringVector getStunServer() {
    long cPtr = pjsua2JNI.UaConfig_stunServer_get(swigCPtr, this);
    return (cPtr == 0) ? null : new StringVector(cPtr, false);
  }

  public void setStunTryIpv6(boolean value) {
    pjsua2JNI.UaConfig_stunTryIpv6_set(swigCPtr, this, value);
  }

  public boolean getStunTryIpv6() {
    return pjsua2JNI.UaConfig_stunTryIpv6_get(swigCPtr, this);
  }

  public void setStunIgnoreFailure(boolean value) {
    pjsua2JNI.UaConfig_stunIgnoreFailure_set(swigCPtr, this, value);
  }

  public boolean getStunIgnoreFailure() {
    return pjsua2JNI.UaConfig_stunIgnoreFailure_get(swigCPtr, this);
  }

  public void setNatTypeInSdp(int value) {
    pjsua2JNI.UaConfig_natTypeInSdp_set(swigCPtr, this, value);
  }

  public int getNatTypeInSdp() {
    return pjsua2JNI.UaConfig_natTypeInSdp_get(swigCPtr, this);
  }

  public void setMwiUnsolicitedEnabled(boolean value) {
    pjsua2JNI.UaConfig_mwiUnsolicitedEnabled_set(swigCPtr, this, value);
  }

  public boolean getMwiUnsolicitedEnabled() {
    return pjsua2JNI.UaConfig_mwiUnsolicitedEnabled_get(swigCPtr, this);
  }

  public UaConfig() {
    this(pjsua2JNI.new_UaConfig(), true);
  }

  public void readObject(ContainerNode node) throws java.lang.Exception {
    pjsua2JNI.UaConfig_readObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

  public void writeObject(ContainerNode node) throws java.lang.Exception {
    pjsua2JNI.UaConfig_writeObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

}
