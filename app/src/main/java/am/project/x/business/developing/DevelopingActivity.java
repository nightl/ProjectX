/*
 * Copyright (C) 2018 AlexMofer
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
package am.project.x.business.developing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import am.project.x.R;
import am.project.x.base.BaseActivity;
import am.project.x.business.developing.display.DisplayRecyclerView;
import androidx.annotation.Nullable;

/**
 * 正在开发
 */
public class DevelopingActivity extends BaseActivity {

    public static void start(Context context) {
        context.startActivity(new Intent(context, DevelopingActivity.class));
    }

    private final DisplayAdapter mAdapter = new DisplayAdapter();
    private DisplayRecyclerView mVContent;

    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_developing;
    }

    @Override
    protected void initializeActivity(@Nullable Bundle savedInstanceState) {
        setSupportActionBar(R.id.developing_toolbar);
        mVContent = findViewById(R.id.display_rv_content);
        mVContent.setAdapter(mAdapter);
    }
}
