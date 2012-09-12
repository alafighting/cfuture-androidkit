/*
 * @(#)IntroActivitySample.java		       Project:com.sinaapp.msdxblog.andoridkit.sample
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
package com.sinaapp.msdxblog.androidkit.sample.ui;

import java.util.List;

import com.sinaapp.msdxblog.androidkit.sample.GameActivity;
import com.sinaapp.msdxblog.androidkit.sample.R;
import com.sinaapp.msdxblog.androidkit.ui.IntroActivity;

/**
 * @author Geek_Soledad (66704238@51uc.com)
 */
public class IntroActivitySample extends IntroActivity{

	@Override
	protected Class<?> nextActivity() {
		return GameActivity.class;
	}

	@Override
	protected void setIntroResources(List<IntroImgResource> arg0) {
		IntroImgResource resource = new IntroImgResource(R.drawable.nav1, 2000, 0.4f);
		arg0.add(resource);
		IntroImgResource resource2 = new IntroImgResource(R.drawable.nav2, 2500, 0.4f);
		arg0.add(resource2);
	}

	
	@Override
	protected void runOnBackground() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		super.runOnBackground();
	}
}
