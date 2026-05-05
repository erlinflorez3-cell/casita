package androidx.camera.core.processing;

import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class TargetUtils {
    public static int getNumberOfTargets(int i2) {
        int i3 = 0;
        while (i2 != 0) {
            i3 += 1 & i2;
            i2 >>= 1;
        }
        return i3;
    }

    public static boolean isSuperset(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    private TargetUtils() {
    }

    public static void checkSupportedTargets(Collection<Integer> collection, int i2) {
        Preconditions.checkArgument(collection.contains(Integer.valueOf(i2)), String.format(Locale.US, "Effects target %s is not in the supported list %s.", getHumanReadableName(i2), getHumanReadableNames(collection)));
    }

    private static String getHumanReadableNames(Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(getHumanReadableName(it.next().intValue()));
        }
        return "[" + String.join(", ", arrayList) + "]";
    }

    public static String getHumanReadableName(int i2) {
        ArrayList arrayList = new ArrayList();
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i2 + 1) - (1 | i2) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i2 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join("|", arrayList);
    }
}
