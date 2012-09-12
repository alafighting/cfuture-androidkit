/*
 * @(#)BorderDialog.java		       Project:com.sinaapp.msdxblog.androidkit
 * Date:2012-3-24
 *
 * Copyright (c) 2011 CFuture09, Institute of Software, 
 * Guangdong Ocean University, Zhanjiang, GuangDong, China.
 * All rights reserved.
 */
package com.sinaapp.msdxblog.androidkit.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

/**
 * TODO
 * @author Geek_Soledad (66704238@51uc.com)
 */
class BorderDialog extends Dialog {
	private Context mContext;
	private Button mLeftButton;
	private Button mMidButton;
	private Button mRightButton;
	private boolean hasLeftButton;
	private boolean hasMidButton;
	private boolean hasRightButton;
	// private OnClickListener mLeftListener;
	// private OnClickListener mMidListener;
	// private OnClickListener mRightListener;
	private LinearLayout mButtonsLayout;
	private TextView mTextView;
	private CharSequence mMsg;
	private LinearLayout mRootLayout;
	
	private View contentView;
	/**
	 * 界面是否已经组装好
	 */
	private boolean hasSetup;
	

	public BorderDialog(Context context) {
		super(context);
		mContext = context;

//		String packageName = mContext.getApplicationInfo().packageName;
//		Resources resources = mContext.getResources();
//		String s = resources.getString(resources.getIdentifier("test", "string", packageName));
//		System.out.println(s+"tttt");
		
		mTextView = new TextView(context);
		mTextView.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,
				LayoutParams.FILL_PARENT));

		// Button的参数。
		LayoutParams buttonParams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		buttonParams.weight = 1;
		final int margin = 3;
		buttonParams.topMargin = margin;
		buttonParams.bottomMargin = margin;
		buttonParams.leftMargin = margin;
		buttonParams.rightMargin = 3;
		buttonParams.weight = 1;

		// 左边Button
		mLeftButton = new Button(mContext);
		mLeftButton.setBackgroundColor(Color.BLUE);
		mLeftButton.setTextColor(Color.WHITE);
		mLeftButton.setLayoutParams(buttonParams);

		// 中间Button
		mMidButton = new Button(mContext);
		mMidButton.setBackgroundColor(Color.WHITE);
		mMidButton.setTextColor(Color.BLUE);
		mMidButton.setLayoutParams(buttonParams);

		// 右边Button
		mRightButton = new Button(mContext);
		mRightButton.setBackgroundColor(Color.BLUE);
		mRightButton.setTextColor(Color.WHITE);
		mRightButton.setLayoutParams(buttonParams);
	}

	/**
	 * 设置左边按钮
	 * 
	 * @param text
	 *            文字
	 * @param l
	 *            监听器
	 * @return 返回该对话框
	 */
	public BorderDialog setLeftButton(CharSequence text,
			LinearLayout.OnClickListener l) {
		mLeftButton.setText(text);
		mLeftButton.setOnClickListener(l);
		hasLeftButton = true;
		hasSetup = false;
		return this;
	}

	/**
	 * 设置中间按钮
	 * 
	 * @param text
	 *            文字
	 * @param l
	 *            监听器
	 * @return 返回该对话框
	 */
	public BorderDialog setMidButton(CharSequence text,
			LinearLayout.OnClickListener l) {
		mMidButton.setText(text);
		mMidButton.setOnClickListener(l);
		hasMidButton = true;
		hasSetup = false;
		return this;
	}

	/**
	 * 设置右边按钮
	 * 
	 * @param text
	 *            文字
	 * @param l
	 *            监听器
	 * @return 返回该对话框
	 */
	public BorderDialog setRightButton(CharSequence text,
			LinearLayout.OnClickListener l) {
		mRightButton.setText(text);
		mRightButton.setOnClickListener(l);
		hasRightButton = true;
		hasSetup = false;
		return this;
	}

	/**
	 * 设置要显示的提示内容
	 * 
	 * @param msg
	 *            要显示的提示内容。
	 * @return 返回该对话框
	 */
	public BorderDialog setMessage(CharSequence msg) {
		mMsg = msg;
		mTextView.setText(mMsg);
		hasSetup = false;
		return this;
	}

	@Override
	public void show() {
		if (!hasSetup) {
			create();
		}
		super.show();
	}

	/**
	 * 装载view
	 */
	private BorderDialog create() {
		mRootLayout = new LinearLayout(mContext);
		mRootLayout.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,
				android.view.ViewGroup.LayoutParams.FILL_PARENT));
		mRootLayout.setBackgroundColor(0xC0171717);
		int padding = 10;
		mRootLayout.setPadding(padding, padding, padding, padding);

		// 装载Message
		if (mMsg != null) {
			mRootLayout.addView(mTextView);
		}

		// 组装Button
		// 下面Button所在的Layout。
		mButtonsLayout = new LinearLayout(mContext);
		mButtonsLayout.setOrientation(LinearLayout.HORIZONTAL);
		LayoutParams buttonsLayoutParams = new LayoutParams(
				LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
		mButtonsLayout.setLayoutParams(buttonsLayoutParams);

		if (hasLeftButton) {
			mButtonsLayout.addView(mLeftButton);
		}
		if (hasMidButton) {
			mButtonsLayout.addView(mMidButton);
		}
		if (hasRightButton) {
			mButtonsLayout.addView(mRightButton);
		}

		if (hasLeftButton || hasMidButton || hasRightButton) {
			mRootLayout.addView(mButtonsLayout);
		}
		this.setContentView(mRootLayout);
		hasSetup = true;
		
		return this;
	}

	public View getContentView() {
		return contentView;
	}

	public void setContentView(View contentView) {
		this.contentView = contentView;
	}
}
