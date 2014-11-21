package com.toraysoft.xiami;

import android.content.Context;

import com.xiami.sdk.XiamiSDK;

public class XiamiUtil {

	static XiamiUtil instance;

    public static final String KEY = "cb8840f9f4337a741ae9978543504a1b";
    public static final String SECRET = "dc722e9d865e892814301f61fdac3d6b";

	XiamiSDK mXiamiSDK;

	private XiamiUtil(Context context) {
		mXiamiSDK = new XiamiSDK(context, KEY, SECRET);
	}

	public static XiamiUtil get(Context context) {
		if (instance == null) {
			instance = new XiamiUtil(context);
		}
		return instance;
	}

	public XiamiSDK getXiamiSDK() {
		return mXiamiSDK;
	}
}
