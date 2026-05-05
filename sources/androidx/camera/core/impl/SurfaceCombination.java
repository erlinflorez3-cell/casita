package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SurfaceCombination {
    private final List<SurfaceConfig> mSurfaceConfigList = new ArrayList();

    private static void generateArrangements(List<int[]> list, int i2, int[] iArr, int i3) {
        if (i3 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = 0;
            while (true) {
                if (i5 < i3) {
                    if (i4 == iArr[i5]) {
                        break;
                    } else {
                        i5++;
                    }
                } else {
                    iArr[i3] = i4;
                    generateArrangements(list, i2, iArr, i3 + 1);
                    break;
                }
            }
        }
    }

    public boolean addSurfaceConfig(SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.add(surfaceConfig);
    }

    public boolean removeSurfaceConfig(SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.remove(surfaceConfig);
    }

    public List<SurfaceConfig> getSurfaceConfigList() {
        return this.mSurfaceConfigList;
    }

    public List<SurfaceConfig> getOrderedSupportedSurfaceConfigList(List<SurfaceConfig> list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.mSurfaceConfigList.size()) {
            return null;
        }
        List<int[]> elementsArrangements = getElementsArrangements(this.mSurfaceConfigList.size());
        SurfaceConfig[] surfaceConfigArr = new SurfaceConfig[list.size()];
        for (int[] iArr : elementsArrangements) {
            int i2 = 1;
            for (int i3 = 0; i3 < this.mSurfaceConfigList.size(); i3++) {
                if (iArr[i3] < list.size()) {
                    boolean zIsSupported = this.mSurfaceConfigList.get(i3).isSupported(list.get(iArr[i3]));
                    i2 = (i2 + (zIsSupported ? 1 : 0)) - (i2 | (zIsSupported ? 1 : 0)) != 1 ? 0 : 1;
                    if (i2 == 0) {
                        break;
                    }
                    surfaceConfigArr[iArr[i3]] = this.mSurfaceConfigList.get(i3);
                }
            }
            if (i2 != 0) {
                return Arrays.asList(surfaceConfigArr);
            }
        }
        return null;
    }

    private List<int[]> getElementsArrangements(int i2) {
        ArrayList arrayList = new ArrayList();
        generateArrangements(arrayList, i2, new int[i2], 0);
        return arrayList;
    }
}
