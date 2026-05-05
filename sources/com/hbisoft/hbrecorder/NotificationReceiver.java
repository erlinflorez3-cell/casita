package com.hbisoft.hbrecorder;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.OY;

/* JADX INFO: loaded from: classes7.dex */
public class NotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        Object[] objArr = {new Intent(context, (Class<?>) ScreenRecordService.class)};
        Method method = Class.forName(EO.Od("\u007f_c\u0016\u0015dy\\YGJ(dum\u0003u\u0016^\u001ab/z", (short) (OY.Xd() ^ 28822))).getMethod(C1593ug.zd("qsoqUhv{ojm", (short) (C1633zX.Xd() ^ (-10917)), (short) (C1633zX.Xd() ^ (-29978))), Class.forName(C1561oA.Qd("codqmf`)]hfk[ch!;_dT\\a", (short) (C1580rY.Xd() ^ (-3389)))));
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
