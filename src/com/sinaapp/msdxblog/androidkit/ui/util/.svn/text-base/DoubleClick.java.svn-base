/*
 * @(#)DoubleClick.java		       Project:com.sinaapp.msdxblog.androidkit
 * Date:2012-3-20
 *
 * Copyright (c) 2011 CFuture09, Institute of Software, 
 * Guangdong Ocean University, Zhanjiang, GuangDong, China.
 * All rights reserved.
 */
package com.sinaapp.msdxblog.androidkit.ui.util;

import com.sinaapp.msdxblog.androidkit.thread.HandlerFactory;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.widget.Toast;

/**
 * @author Geek_Soledad (66704238@51uc.com)
 */
public abstract class DoubleClick {
	protected Context mContext;
	private boolean willDo;
	private Handler mTaskHandler = null;
	private Runnable task = new Runnable() {
		@Override
		public void run() {
			willDo = false;
		}
	};

	/**
	 * 构造方法，创建线程并初始化Context对象。
	 * 
	 * @param context
	 */
	public DoubleClick(Context context) {
		mContext = context;
		mTaskHandler = HandlerFactory
				.getNewHandlerInOtherThread("task_handler");
	}

	/**
	 * 当某个动作要双击才执行时，调用此方法。
	 * 
	 * @param delayTime
	 *            判断双击的时间。
	 * @param msg
	 *            当第一次点击时，弹出的提示信息。如果为null，则不作提示。
	 */
	public void doDoubleClick(int delayTime, String msg) {
		if (willDo) {
			doOnDoubleClick();
		} else {
			keepInDelayTime(delayTime);
			showMsgInToast(delayTime, msg);
		}
	}

	/**
	 * 当某个动作要双击才执行时，调用此方法。
	 * 
	 * @param delayTime
	 *            判断双击的时间。
	 * @param msg
	 *            当第一次点击时，弹出的提示信息。如果为null，则不作提示。
	 */
	public void doDoubleClick(int delayTime, int msgResid) {
		if (willDo) {
			doOnDoubleClick();
		} else {
			keepInDelayTime(delayTime);
			showMsgInToast(delayTime, msgResid);
		}
	}

	/**
	 * 在双击之后执行的事情。
	 */
	abstract protected void doOnDoubleClick();

	/**
	 * 判断是否双击。
	 * 
	 * @param delayTime
	 *            是否双击的判断时间。
	 */
	final private void keepInDelayTime(int delayTime) {
		willDo = true;
		mTaskHandler.postDelayed(task, delayTime);
	}

	/**
	 * 显示提示信息。
	 * 
	 * @param msg
	 *            要显示的信息。
	 */
	private void showMsgInToast(int delayTime, String msg) {
		if (msg != null) {
			Toast.makeText(mContext, msg, delayTime).show();
		}
	}

	/**
	 * 显示提示信息。
	 * 
	 * @param msg
	 *            要显示的信息。
	 */
	private void showMsgInToast(int delayTime, int msgResid) {
		Toast.makeText(mContext, msgResid, delayTime).show();
	}
}
