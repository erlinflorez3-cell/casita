package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.Binds;
import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.inject.Named;
import javax.inject.Singleton;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Xg;

/* JADX INFO: loaded from: classes3.dex */
@Module
public abstract class EventStoreModule {
    @Provides
    @InterfaceC1492Gx
    @Named("CB><H:U;:XH<IB")
    static String dbName() {
        return "com.google.android.datatransport.events";
    }

    @InterfaceC1492Gx
    @Named("@25>5<;VF:G@")
    @Provides
    @Singleton
    static String packageName(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd(".<3B@;7\u00028EEL>HO\n MMTFZW", (short) (FB.Xd() ^ 27739))).getMethod(Xg.qd("LK[8JMVMTS=Q^W", (short) (C1580rY.Xd() ^ (-31890)), (short) (C1580rY.Xd() ^ (-13105))), new Class[0]);
        try {
            method.setAccessible(true);
            return (String) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Provides
    @InterfaceC1492Gx
    @Named("C4:8A6UM=KMDKK")
    static int schemaVersion() {
        return SchemaManager.SCHEMA_VERSION;
    }

    @Provides
    static EventStoreConfig storeConfig() {
        return EventStoreConfig.DEFAULT;
    }

    @Binds
    abstract ClientHealthMetricsStore clientHealthMetricsStore(SQLiteEventStore sQLiteEventStore);

    @Binds
    abstract EventStore eventStore(SQLiteEventStore sQLiteEventStore);

    @Binds
    abstract SynchronizationGuard synchronizationGuard(SQLiteEventStore sQLiteEventStore);
}
