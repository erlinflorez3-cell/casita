package io.cobrowse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class RedactionExternalLoader {
    private static Set<RedactionExternalFactory> sImplementationLoaders = null;
    private static final Object sImplementationLoadersLock = new Object();

    interface RedactionExternalFactory {
        RedactionExternal load();
    }

    private RedactionExternalLoader() {
    }

    static void add(RedactionExternalFactory redactionExternalFactory) {
        synchronized (sImplementationLoadersLock) {
            if (sImplementationLoaders == null) {
                sImplementationLoaders = new HashSet();
            }
            if (!sImplementationLoaders.add(redactionExternalFactory)) {
            }
        }
    }

    static List<RedactionExternal> load() {
        ArrayList arrayList;
        synchronized (sImplementationLoadersLock) {
            arrayList = new ArrayList();
            Set<RedactionExternalFactory> set = sImplementationLoaders;
            if (set != null) {
                Iterator<RedactionExternalFactory> it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().load());
                }
            }
        }
        return arrayList;
    }
}
