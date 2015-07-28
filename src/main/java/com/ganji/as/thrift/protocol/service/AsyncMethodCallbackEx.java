/**
 * 
 */
package com.ganji.as.thrift.protocol.service;

import org.apache.thrift.async.AsyncMethodCallback;

/**
 * @author yikangfeng
 * @date   2015年7月23日 
 */
public interface AsyncMethodCallbackEx<REP> extends AsyncMethodCallback<REP>{
      REP getResponse();
      Throwable getException();
}
