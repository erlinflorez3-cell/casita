package com.facebook.react.devsupport;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.util.RNLog;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0L͜P.`S2şs{B0c$wDCU(\u0007*\tUOm˧\u0005Ϻ\u000b\u000bq\u000eF!\tn:Imx\f\u0013Ƥ6B}A{[}DQ`#>5$@+Py3\u000b`>\u0011\u0016\u0005\u0006[K:\u001avT9@`\u0019e\u0005H\u001aLRh\u0007,i\u007fNdV3q\u000351\u0012\u0002B|5&DES\u001bVl';~(2{LE5-%\u0002\u0004]ѻ]ύ\u0007?yܵUv5*CK\nVd\\Vϯ!ۣS\reövj\u0013Vx\u000e=*}i\"ַ\u001a߭{z\u0004Ȟʆ\b\u001f"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~@\b\"\u0014w)\rQ?Bu6\f%ub5\u0005c\u000bN}'IH],2", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW*\u000726U{ \u0016m\u001d.O?Jk\n", "2de h7I]&\u000ebZ5x\u000b/r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&VqD\u0012m9]^#PHP,i(", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u007f\u0017(U\u007f\u0019G\u00012D#\u0002)Fm#/IA;y}|\u0015yOI\u0012n6[\u0006\u000fCUJ.\\_H\u0001\u0005", "2hP9b.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~@\b\"\u0014w)\rQ?Bu6s", "@dP0g\u0019H](o~^>", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "1qT.g,\u001c]\"\u000ezg;m\r/w", "", "/o_\u0018X@", "", "2dbAe6R1#\b\n^5\fy3e\u0012", "6hS2", "7r2<a;>\\(o~^>i\t+d\u0014", "", "7rB5b>B\\\u001b", "Ag^D", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class LogBoxDialogSurfaceDelegate implements SurfaceDelegate {
    private final DevSupportManager devSupportManager;
    private LogBoxDialog dialog;
    private View reactRootView;

    public LogBoxDialogSurfaceDelegate(DevSupportManager devSupportManager) {
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        this.devSupportManager = devSupportManager;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void createContentView(String appKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Assertions.assertCondition(Intrinsics.areEqual(appKey, "LogBox"), "This surface manager can only create LogBox React application");
        View viewCreateRootView = this.devSupportManager.createRootView("LogBox");
        this.reactRootView = viewCreateRootView;
        if (viewCreateRootView == null) {
            RNLog.e("Unable to launch logbox because react was unable to create the root view");
        }
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void destroyContentView() {
        View view = this.reactRootView;
        if (view != null) {
            this.devSupportManager.destroyRootView(view);
            this.reactRootView = null;
        }
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void hide() {
        LogBoxDialog logBoxDialog;
        if (isShowing() && (logBoxDialog = this.dialog) != null) {
            logBoxDialog.dismiss();
        }
        View view = this.reactRootView;
        ViewGroup viewGroup = (ViewGroup) (view != null ? view.getParent() : null);
        if (viewGroup != null) {
            viewGroup.removeView(this.reactRootView);
        }
        this.dialog = null;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public boolean isContentViewReady() {
        return this.reactRootView != null;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public boolean isShowing() {
        LogBoxDialog logBoxDialog = this.dialog;
        if (logBoxDialog != null) {
            return logBoxDialog.isShowing();
        }
        return false;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void show() {
        if (isShowing() || !isContentViewReady()) {
            return;
        }
        Activity currentActivity = this.devSupportManager.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            RNLog.e("Unable to launch logbox because react activity is not available, here is the error that logbox would've displayed: ");
            return;
        }
        LogBoxDialog logBoxDialog = new LogBoxDialog(currentActivity, this.reactRootView);
        this.dialog = logBoxDialog;
        logBoxDialog.setCancelable(false);
        logBoxDialog.show();
    }
}
