package n;

import android.os.Build;
import com.dynatrace.android.agent.Global;
import io.sentry.protocol.Device;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class abundant extends gregarious {
    public abundant() {
        Set of = SetsKt.setOf((Object[]) new String[]{"000000000000000", "e21833235b6eef10", "012345678912345"});
        Set of2 = SetsKt.setOf("310260000000000");
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"com.google.android.launcher.layouts.genymotion", "com.bluestacks", "com.bignox.app", "com.vphone.launcher"});
        String strB = i1.pair.b();
        String str = Build.MODEL;
        str = str == null ? "" : str;
        String strA = i1.pair.a();
        String str2 = Build.PRODUCT;
        str2 = str2 == null ? "" : str2;
        String str3 = Build.BOARD;
        str3 = str3 == null ? "" : str3;
        String str4 = Build.BRAND;
        String str5 = str4 != null ? str4 : "";
        g0.apparatus apparatusVar = g0.apparatus.f19656b;
        g0.taste tasteVar = new g0.taste(strB, apparatusVar, "Genymobile", StringsKt.contains$default((CharSequence) strB, (CharSequence) "Genymobile", false, 2, (Object) null));
        g0.taste tasteVar2 = new g0.taste(strB, apparatusVar, "Genymotion", StringsKt.contains$default((CharSequence) strB, (CharSequence) "Genymotion", false, 2, (Object) null));
        g0.taste tasteVar3 = new g0.taste(str, apparatusVar, "sdk_gphone_", StringsKt.contains$default((CharSequence) str, (CharSequence) "sdk_gphone_", false, 2, (Object) null));
        Locale locale = Locale.ROOT;
        g0.taste tasteVar4 = new g0.taste(str.toLowerCase(locale), apparatusVar, "droid4x", StringsKt.contains$default((CharSequence) str.toLowerCase(locale), (CharSequence) "droid4x", false, 2, (Object) null));
        g0.taste tasteVar5 = new g0.taste(str, apparatusVar, "google_sdk", StringsKt.contains$default((CharSequence) str, (CharSequence) "google_sdk", false, 2, (Object) null));
        g0.taste tasteVar6 = new g0.taste(str, apparatusVar, "Emulator", StringsKt.contains$default((CharSequence) str, (CharSequence) "Emulator", false, 2, (Object) null));
        g0.taste tasteVar7 = new g0.taste(str, apparatusVar, "Android SDK built for x86", StringsKt.contains$default((CharSequence) str, (CharSequence) "Android SDK built for x86", false, 2, (Object) null));
        g0.taste tasteVar8 = new g0.taste(strA, apparatusVar, "goldfish", StringsKt.contains$default((CharSequence) strA, (CharSequence) "goldfish", false, 2, (Object) null));
        g0.taste tasteVar9 = new g0.taste(strA, apparatusVar, "ranchu", StringsKt.contains$default((CharSequence) strA, (CharSequence) "ranchu", false, 2, (Object) null));
        g0.apparatus apparatusVar2 = g0.apparatus.f19657c;
        g0.taste tasteVar10 = new g0.taste(strA, apparatusVar2, "vbox86", Intrinsics.areEqual(strA, "vbox86"));
        g0.taste tasteVar11 = new g0.taste(strA.toLowerCase(locale), apparatusVar, "nox", StringsKt.contains$default((CharSequence) strA.toLowerCase(locale), (CharSequence) "nox", false, 2, (Object) null));
        g0.taste tasteVar12 = new g0.taste(str2.toLowerCase(locale), apparatusVar, "emulator", StringsKt.contains$default((CharSequence) str2.toLowerCase(locale), (CharSequence) "emulator", false, 2, (Object) null));
        g0.taste tasteVar13 = new g0.taste(str2.toLowerCase(locale), apparatusVar, Device.JsonKeys.SIMULATOR, StringsKt.contains$default((CharSequence) str2.toLowerCase(locale), (CharSequence) Device.JsonKeys.SIMULATOR, false, 2, (Object) null));
        g0.taste tasteVar14 = new g0.taste(str2, apparatusVar2, "sdk", Intrinsics.areEqual(str2, "sdk"));
        g0.taste tasteVar15 = new g0.taste(str2, apparatusVar, "google_sdk", StringsKt.contains$default((CharSequence) str2, (CharSequence) "google_sdk", false, 2, (Object) null));
        g0.taste tasteVar16 = new g0.taste(str2, apparatusVar, "google_sdk", StringsKt.contains$default((CharSequence) str2, (CharSequence) "google_sdk", false, 2, (Object) null));
        g0.taste tasteVar17 = new g0.taste(str2, apparatusVar, "sdk_x86", StringsKt.contains$default((CharSequence) str2, (CharSequence) "sdk_x86", false, 2, (Object) null));
        g0.taste tasteVar18 = new g0.taste(str2, apparatusVar, "vbox86p", StringsKt.contains$default((CharSequence) str2, (CharSequence) "vbox86p", false, 2, (Object) null));
        g0.taste tasteVar19 = new g0.taste(str2.toLowerCase(locale), apparatusVar, "nox", StringsKt.contains$default((CharSequence) str2.toLowerCase(locale), (CharSequence) "nox", false, 2, (Object) null));
        g0.taste tasteVar20 = new g0.taste(str3.toLowerCase(locale), apparatusVar, "nox", StringsKt.contains$default((CharSequence) str3.toLowerCase(locale), (CharSequence) "nox", false, 2, (Object) null));
        g0.taste tasteVar21 = new g0.taste(str3.toLowerCase(locale), apparatusVar, "goldfish", StringsKt.contains$default((CharSequence) str3.toLowerCase(locale), (CharSequence) "goldfish", false, 2, (Object) null));
        String str6 = Build.DEVICE;
        super(of, of2, listListOf, CollectionsKt.listOf((Object[]) new g0.taste[]{tasteVar, tasteVar2, tasteVar3, tasteVar4, tasteVar5, tasteVar6, tasteVar7, tasteVar8, tasteVar9, tasteVar10, tasteVar11, tasteVar12, tasteVar13, tasteVar14, tasteVar15, tasteVar16, tasteVar17, tasteVar18, tasteVar19, tasteVar20, tasteVar21, new g0.taste(str5 + Global.SEMICOLON + str6, g0.apparatus.f19658d, "generic;generic", StringsKt.startsWith$default(str5, "generic", false, 2, (Object) null) && StringsKt.startsWith$default(str6, "generic", false, 2, (Object) null))}), CollectionsKt.listOf((Object[]) new String[]{"/dev/socket/genyd", "/dev/socket/baseband_genyd", "/dev/socket/qemud", "/dev/qemu_pipe", "ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc", "fstab.andy", "ueventd.andy.rc", "fstab.nox", "init.nox.rc", "ueventd.nox.rc"}), CollectionsKt.listOf((Object[]) new File[]{new File("/proc/tty/drivers"), new File("/proc/cpuinfo")}), SetsKt.setOf((Object[]) new String[]{"wlan0", "tunl0", "eth0"}));
    }
}
