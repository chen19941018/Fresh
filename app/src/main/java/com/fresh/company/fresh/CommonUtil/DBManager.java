package com.fresh.company.fresh.CommonUtil;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by CJH on 2016/8/30.
 */

public class DBManager {
    private DBHelper helper;
    private SQLiteDatabase db;

    public DBManager(Context context) {
        helper = new DBHelper(context);
        //因为getWritableDatabase内部调用了mContext.openOrCreateDatabase(mName, 0, mFactory);
        //所以要确保context已初始化,我们可以把实例化DBManager的步骤放在Activity的onCreate里
        db = helper.getWritableDatabase();
    }


}
