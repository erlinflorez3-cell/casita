package androidx.profileinstaller;

import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
class DexProfileData {
    final String apkName;
    int classSetSize;
    int[] classes;
    final long dexChecksum;
    final String dexName;
    final int hotMethodRegionSize;
    long mTypeIdCount;
    final TreeMap<Integer, Integer> methods;
    final int numMethodIds;

    DexProfileData(String str, String str2, long j2, long j3, int i2, int i3, int i4, int[] iArr, TreeMap<Integer, Integer> treeMap) {
        this.apkName = str;
        this.dexName = str2;
        this.dexChecksum = j2;
        this.mTypeIdCount = j3;
        this.classSetSize = i2;
        this.hotMethodRegionSize = i3;
        this.numMethodIds = i4;
        this.classes = iArr;
        this.methods = treeMap;
    }
}
