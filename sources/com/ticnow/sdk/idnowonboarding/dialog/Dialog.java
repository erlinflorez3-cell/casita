package com.ticnow.sdk.idnowonboarding.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.dynatrace.android.callback.Callback;
import java.util.Timer;
import java.util.TimerTask;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`_2\u000fq|<$q$yCAX\"}8\tWȞm̮n`ҙ;C=\u0005V}p,֒Yxk\u0012WfPpW3{qm?nwN\u000761P<*\t\u000f\u001fBH>|+IY\u0013*2VohZ=S\u0013#*\bT\u001f/&\rm\\@`ns9]+K(PO?_^~}\u0013TW?\u000f\r`L/p;C\u001a=S1\r\u0003aM\nWsS\u0004\u0017/W1W|o8n~B\u001d[U\u001bg\u000b(r\u0004\u007fh<-9Z{Mf\rV\u0004CX\u001b=\u001c\u000e4)x4;\u001d~\n$2#v\u0004D^\u0007vB.\u0001\u0012<%,\u00185A8In\u0002gI\"f9\u0012\u0004;&S\u0007|.sV$_C#\u0005}_?iBSG|\u0016\nC{\u0013\td\u0018)28w\u0006=\f)0-$egi)/|\u001aJZf%\u0017Älf"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#|$3t 0\u0017\"?g;(\u0017>", "", "u(E", "Ag^D", "", "4qP4`,Gb\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.DAy)3o\u0016;#", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "Bhc9X", "", ";db@T.>", "0tcAb5-S,\u000e", "=m29\\*D:\u001d\r\n^5|\u0016", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feI^\u001e\u001bEut@\u000545b}-\r", "/bR2c;\u001bc(\u000e\u0005g\u001b|\u001c>", "=m00V,Ibv\u0006~\\2c\r=t\u007f1{M", "1`]0X3\u001bc(\u000e\u0005g\u001b|\u001c>", "=m2.a*>Z\u007f\u0003\tm,\u0006\t<", "=m36f4Ba'e~l;|\u0012/r", "\u001a`]1e6BRb|\u0005g;|\u0012>/^,wG\u000b\u0019zP~\u000eIw!3Y<\n@L\u001a<UGIy\u001b\"#waB\u0007p\u0002", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class Dialog {
    public static final Dialog INSTANCE = new Dialog();

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.dialog.Dialog$show$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0013\u001d̉=!4i\bӵLc\u0003\u0004IيX\nǞH\u00078ܥBw5e3?>D}H\\S\u001a>ƈo}"}, d2 = {"1n\\{g0<\\#\u0011Dl+\u0003R3d\t2\u000eJ\n\u0014!C|\r@\u007f'~X\u0002\u001c>w\u0018w,G7r> SvdC\u0019\"w", "\u001aiPCTuNb\u001d\u0006DM0\u0005\t<T{6\u0002\u0016", "@t]", "", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class AnonymousClass1 extends TimerTask {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $buttonText;
        final /* synthetic */ FragmentManager $fragmentManager;
        final /* synthetic */ String $message;
        final /* synthetic */ String $title;

        AnonymousClass1(Activity activity, String str, String str2, String str3, FragmentManager fragmentManager) {
            this.$activity = activity;
            this.$title = str;
            this.$message = str2;
            this.$buttonText = str3;
            this.$fragmentManager = fragmentManager;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.$activity.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.dialog.Dialog$show$1$run$1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        String str = this.this$0.$title;
                        if (str == null) {
                            Intrinsics.throwNpe();
                        }
                        String str2 = this.this$0.$message;
                        if (str2 == null) {
                            Intrinsics.throwNpe();
                        }
                        String str3 = this.this$0.$buttonText;
                        if (str3 == null) {
                            Intrinsics.throwNpe();
                        }
                        SimpleOptionDialog simpleOptionDialog = new SimpleOptionDialog(str, str2, str3, new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.dialog.Dialog$show$1$run$1$d$1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Callback.onClick_enter(view);
                                try {
                                } finally {
                                    Callback.onClick_exit();
                                }
                            }
                        });
                        FragmentManager fragmentManager = this.this$0.$fragmentManager;
                        if (fragmentManager == null) {
                            Intrinsics.throwNpe();
                        }
                        simpleOptionDialog.show(fragmentManager, "Tag");
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.dialog.Dialog$show$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0013\u001d̉=!4i\bӵLc\u0003\u0004IيX\nǞH\u00078ܥBw5e3?>D}H\\S\u001a>ƈo}"}, d2 = {"1n\\{g0<\\#\u0011Dl+\u0003R3d\t2\u000eJ\n\u0014!C|\r@\u007f'~X\u0002\u001c>w\u0018w,G7r> SvdC\u0019\"x", "\u001aiPCTuNb\u001d\u0006DM0\u0005\t<T{6\u0002\u0016", "@t]", "", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class AnonymousClass2 extends TimerTask {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $buttonText;
        final /* synthetic */ FragmentManager $fragmentManager;
        final /* synthetic */ String $message;
        final /* synthetic */ View.OnClickListener $onClickListener;
        final /* synthetic */ String $title;

        AnonymousClass2(Activity activity, String str, String str2, String str3, View.OnClickListener onClickListener, FragmentManager fragmentManager) {
            this.$activity = activity;
            this.$title = str;
            this.$message = str2;
            this.$buttonText = str3;
            this.$onClickListener = onClickListener;
            this.$fragmentManager = fragmentManager;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.$activity.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.dialog.Dialog$show$2$run$1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        String str = this.this$0.$title;
                        if (str == null) {
                            Intrinsics.throwNpe();
                        }
                        String str2 = this.this$0.$message;
                        if (str2 == null) {
                            Intrinsics.throwNpe();
                        }
                        String str3 = this.this$0.$buttonText;
                        if (str3 == null) {
                            Intrinsics.throwNpe();
                        }
                        View.OnClickListener onClickListener = this.this$0.$onClickListener;
                        if (onClickListener == null) {
                            Intrinsics.throwNpe();
                        }
                        SimpleOptionDialog simpleOptionDialog = new SimpleOptionDialog(str, str2, str3, onClickListener);
                        FragmentManager fragmentManager = this.this$0.$fragmentManager;
                        if (fragmentManager == null) {
                            Intrinsics.throwNpe();
                        }
                        simpleOptionDialog.show(fragmentManager, "Tag");
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.dialog.Dialog$show$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0013\u001d̉=!4i\bӵLc\u0003\u0004IيX\nǞH\u00078ܥBw5e3?>D}H\\S\u001a>ƈo}"}, d2 = {"1n\\{g0<\\#\u0011Dl+\u0003R3d\t2\u000eJ\n\u0014!C|\r@\u007f'~X\u0002\u001c>w\u0018w,G7r> SvdC\u0019\"y", "\u001aiPCTuNb\u001d\u0006DM0\u0005\t<T{6\u0002\u0016", "@t]", "", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class AnonymousClass3 extends TimerTask {
        final /* synthetic */ String $acceptButtonText;
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $cancelButtonText;
        final /* synthetic */ FragmentManager $fragmentManager;
        final /* synthetic */ String $message;
        final /* synthetic */ View.OnClickListener $onAcceptClickListener;
        final /* synthetic */ View.OnClickListener $onCancelListener;
        final /* synthetic */ DialogInterface.OnDismissListener $onDismissListener;
        final /* synthetic */ String $title;

        AnonymousClass3(Activity activity, String str, String str2, String str3, String str4, View.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener, View.OnClickListener onClickListener2, FragmentManager fragmentManager) {
            this.$activity = activity;
            this.$title = str;
            this.$message = str2;
            this.$acceptButtonText = str3;
            this.$cancelButtonText = str4;
            this.$onAcceptClickListener = onClickListener;
            this.$onDismissListener = onDismissListener;
            this.$onCancelListener = onClickListener2;
            this.$fragmentManager = fragmentManager;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.$activity.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.dialog.Dialog$show$3$run$1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        String str = this.this$0.$title;
                        if (str == null) {
                            Intrinsics.throwNpe();
                        }
                        String str2 = this.this$0.$message;
                        if (str2 == null) {
                            Intrinsics.throwNpe();
                        }
                        String str3 = this.this$0.$acceptButtonText;
                        if (str3 == null) {
                            Intrinsics.throwNpe();
                        }
                        String str4 = this.this$0.$cancelButtonText;
                        if (str4 == null) {
                            Intrinsics.throwNpe();
                        }
                        View.OnClickListener onClickListener = this.this$0.$onAcceptClickListener;
                        if (onClickListener == null) {
                            Intrinsics.throwNpe();
                        }
                        DialogInterface.OnDismissListener onDismissListener = this.this$0.$onDismissListener;
                        if (onDismissListener == null) {
                            Intrinsics.throwNpe();
                        }
                        View.OnClickListener onClickListener2 = this.this$0.$onCancelListener;
                        if (onClickListener2 == null) {
                            Intrinsics.throwNpe();
                        }
                        MultipleOptionDialog multipleOptionDialog = new MultipleOptionDialog(str, str2, str3, str4, onClickListener, onDismissListener, onClickListener2);
                        FragmentManager fragmentManager = this.this$0.$fragmentManager;
                        if (fragmentManager == null) {
                            Intrinsics.throwNpe();
                        }
                        multipleOptionDialog.show(fragmentManager, "Tag");
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private Dialog() {
    }

    public final void show(FragmentManager fragmentManager, Activity activity, String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        new Timer().schedule(new AnonymousClass1(activity, str, str2, str3, fragmentManager), 200L);
    }

    public final void show(FragmentManager fragmentManager, Activity activity, String str, String str2, String str3, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        new Timer().schedule(new AnonymousClass2(activity, str, str2, str3, onClickListener, fragmentManager), 200L);
    }

    public final void show(FragmentManager fragmentManager, Activity activity, String str, String str2, String str3, View.OnClickListener onClickListener, String str4, View.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        new Timer().schedule(new AnonymousClass3(activity, str, str2, str3, str4, onClickListener, onDismissListener, onClickListener2, fragmentManager), 200L);
    }
}
