/*
 * Copyright (C) 2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lewa.crazychapter11;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;


public class DesktopApp extends AppWidgetProvider {
	@Override
	public void onUpdate(Context context,AppWidgetManager appWidgetManager,int[] appWidgetIds){
		RemoteViews remoteViews = new RemoteViews(context.getPackageName(),R.layout.desktopapp_layout);
		remoteViews.setImageViewResource(R.id.desk_show, R.drawable.desk_logo);
		ComponentName componentName = new ComponentName(context,DesktopApp.class);
		appWidgetManager.updateAppWidget(componentName, remoteViews);
		
		Log.i("crazy_appwidget","update test widget here !!");
	}
}
