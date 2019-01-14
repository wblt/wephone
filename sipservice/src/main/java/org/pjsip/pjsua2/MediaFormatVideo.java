/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class MediaFormatVideo extends MediaFormat {
  private long swigCPtr;

  protected MediaFormatVideo(long cPtr, boolean cMemoryOwn) {
    super(pjsua2JNI.MediaFormatVideo_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MediaFormatVideo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_MediaFormatVideo(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setWidth(long value) {
    pjsua2JNI.MediaFormatVideo_width_set(swigCPtr, this, value);
  }

  public long getWidth() {
    return pjsua2JNI.MediaFormatVideo_width_get(swigCPtr, this);
  }

  public void setHeight(long value) {
    pjsua2JNI.MediaFormatVideo_height_set(swigCPtr, this, value);
  }

  public long getHeight() {
    return pjsua2JNI.MediaFormatVideo_height_get(swigCPtr, this);
  }

  public void setFpsNum(int value) {
    pjsua2JNI.MediaFormatVideo_fpsNum_set(swigCPtr, this, value);
  }

  public int getFpsNum() {
    return pjsua2JNI.MediaFormatVideo_fpsNum_get(swigCPtr, this);
  }

  public void setFpsDenum(int value) {
    pjsua2JNI.MediaFormatVideo_fpsDenum_set(swigCPtr, this, value);
  }

  public int getFpsDenum() {
    return pjsua2JNI.MediaFormatVideo_fpsDenum_get(swigCPtr, this);
  }

  public void setAvgBps(long value) {
    pjsua2JNI.MediaFormatVideo_avgBps_set(swigCPtr, this, value);
  }

  public long getAvgBps() {
    return pjsua2JNI.MediaFormatVideo_avgBps_get(swigCPtr, this);
  }

  public void setMaxBps(long value) {
    pjsua2JNI.MediaFormatVideo_maxBps_set(swigCPtr, this, value);
  }

  public long getMaxBps() {
    return pjsua2JNI.MediaFormatVideo_maxBps_get(swigCPtr, this);
  }

  public MediaFormatVideo() {
    this(pjsua2JNI.new_MediaFormatVideo(), true);
  }

}
