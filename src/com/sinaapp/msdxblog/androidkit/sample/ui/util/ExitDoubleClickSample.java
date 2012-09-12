/*
 * @(#)DoubleclickExitSample.java		       Project:com.sinaapp.msdxblog.andoridkit.sample
 * Date:2012-9-12
 *
 * Copyright (c) 2011 CFuture09, Institute of Software, 
 * Guangdong Ocean University, Zhanjiang, GuangDong, China.
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sinaapp.msdxblog.androidkit.sample.ui.util;

import com.sinaapp.msdxblog.androidkit.ui.util.ExitDoubleClick;

import android.app.Activity;
import android.view.KeyEvent;

/**
 * @author Geek_Soledad (66704238@51uc.com)
 */
public class ExitDoubleClickSample extends Activity{

	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if(keyCode == KeyEvent.KEYCODE_BACK) {
			ExitDoubleClick.getInstance(this).doDoubleClick(1500, "1500毫秒内再按一次退出");
			return true;
		} 
		return super.onKeyDown(keyCode, event);
	}
}
