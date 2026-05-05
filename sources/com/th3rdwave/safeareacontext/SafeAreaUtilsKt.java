package com.th3rdwave.safeareacontext;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?3\\{V\u008cjU@\u000e\u001azd(i$\nCiVJ\u00020\u000bgN\u0016j\u0007Zh\u000f[\u0011\u001c\u0015'o\\Mcxu\u0012=5\toWC[uU;vsd\nP608\u0012\u0005/\u001dpH(\u0007\tJc\u000e(/nujV\u001bM\u001d\u001a@\t\u0005!\u0019.jof8^k\f?_'\u0011iZNUbv}e\u001bT]?\u000f\r`L0p;C\u0017=S1\nҡ_I"}, d2 = {"5dc\u0013e(FS", "\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~F}\u001eFC", "@n^AI0>e", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5dc\u001fb6ME\u001d\byh>`\u0012=e\u000f6YJ\t\"\u0013V", "\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~9|\"7Q\u001f<MRIA", "5dc\u001fb6ME\u001d\byh>`\u0012=e\u000f6YJ\t\"\u0013VL\nJv", "5dc\u001fb6ME\u001d\byh>`\u0012=e\u000f6YJ\t\"\u0013VW", "5dc\u001fb6ME\u001d\byh>`\u0012=e\u000f6YJ\t\"\u0013V\\", "5dc T->/&~vB5\u000b\t>s", "@dP0gsGO(\u0003\f^s\u000b\u00050eG$\t@|^\u0015Qx\u001d<\n4/f}'7i$."}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SafeAreaUtilsKt {
    public static final Rect getFrame(ViewGroup rootView, View view) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() == null) {
            return null;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getDrawingRect(rect);
        try {
            rootView.offsetDescendantRectToMyCoords(view, rect);
            return new Rect(rect.left, rect.top, view.getWidth(), view.getHeight());
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static final EdgeInsets getRootWindowInsetsCompat(View view) {
        return Build.VERSION.SDK_INT >= 30 ? getRootWindowInsetsCompatR(view) : getRootWindowInsetsCompatM(view);
    }

    private static final EdgeInsets getRootWindowInsetsCompatBase(View view) {
        view.getWindowVisibleDisplayFrame(new android.graphics.Rect());
        return new EdgeInsets(r5.top, view.getWidth() - r5.right, view.getHeight() - r5.bottom, r5.left);
    }

    private static final EdgeInsets getRootWindowInsetsCompatM(View view) {
        if (view.getRootWindowInsets() == null) {
            return null;
        }
        return new EdgeInsets(r5.getSystemWindowInsetTop(), r5.getSystemWindowInsetRight(), Math.min(r5.getSystemWindowInsetBottom(), r5.getStableInsetBottom()), r5.getSystemWindowInsetLeft());
    }

    private static final EdgeInsets getRootWindowInsetsCompatR(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        int iStatusBars = WindowInsets.Type.statusBars();
        int iDisplayCutout = WindowInsets.Type.displayCutout();
        if (rootWindowInsets.getInsets((-1) - (((-1) - (((iStatusBars + iDisplayCutout) - (iStatusBars & iDisplayCutout)) | WindowInsets.Type.navigationBars())) & ((-1) - WindowInsets.Type.captionBar()))) == null) {
            return null;
        }
        return new EdgeInsets(r5.top, r5.right, r5.bottom, r5.left);
    }

    public static final EdgeInsets getSafeAreaInsets(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getHeight() == 0) {
            return null;
        }
        View rootView = view.getRootView();
        Intrinsics.checkNotNull(rootView);
        EdgeInsets rootWindowInsetsCompat = getRootWindowInsetsCompat(rootView);
        if (rootWindowInsetsCompat == null) {
            return null;
        }
        float width = rootView.getWidth();
        float height = rootView.getHeight();
        view.getGlobalVisibleRect(new android.graphics.Rect());
        return new EdgeInsets(Math.max(rootWindowInsetsCompat.getTop() - r7.top, 0.0f), Math.max(Math.min((r7.left + view.getWidth()) - width, 0.0f) + rootWindowInsetsCompat.getRight(), 0.0f), Math.max(Math.min((r7.top + view.getHeight()) - height, 0.0f) + rootWindowInsetsCompat.getBottom(), 0.0f), Math.max(rootWindowInsetsCompat.getLeft() - r7.left, 0.0f));
    }
}
