package io.github.xhrg.basic.core.util;

import java.util.HashMap;
import java.util.Map;

public class MapUtils {

	public static <K, V> Map<K, V> emptyMap() {
		return new HashMap<K, V>();
	}

	public static boolean isEmpty(Map<?, ?> map) {
		return map == null || map.isEmpty();
	}
}
