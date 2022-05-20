package io.github.xhrg.basic.core.net;

public interface Request {

	String getHeader(String key);

	String getRemoteAddr();
}
