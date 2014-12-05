package com.toraysoft.xiami;

import android.content.Context;

import com.xiami.sdk.XiamiSDK;

public class XiamiHelper {

	static XiamiHelper instance;

    public static final String KEY = "cb8840f9f4337a741ae9978543504a1b";
    public static final String SECRET = "dc722e9d865e892814301f61fdac3d6b";

	XiamiSDK mXiamiSDK;

	private XiamiHelper(Context context, String key, String secret) {
		mXiamiSDK = new XiamiSDK(context, key, secret);
	}

	public static XiamiHelper get(Context context) {
		if (instance == null) {
			instance = new XiamiHelper(context, KEY, SECRET);
		}
		return instance;
	}

	public static XiamiHelper get(Context context, String key, String secret) {
		if (instance == null) {
			instance = new XiamiHelper(context, key, secret);
		}
		return instance;
	}

	public XiamiSDK getXiamiSDK() {
		return mXiamiSDK;
	}
}
