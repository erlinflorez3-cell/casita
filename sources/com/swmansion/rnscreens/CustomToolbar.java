package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.facebook.react.modules.core.ChoreographerCompat;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.ThemedReactContext;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\tnjG9L͜P.hS2şs{B$c$wCCU(\u0004*\tUQm|\u0005Ϻ\u000b\u000bq\u000eF)\tn:Imx\f\u0013\u001f6PqW3{rެ=`\u0003:MN@-Py3\rJ.V\u001d\u000fzqS<\u0016>N\t:\u0001\u001c}\t(\"\u001e>N\u0010N`u_NH\u001blj31\u0015\u0002B|6&BES\u001bYl';\u0003(2{OE7-%\u0002\u0006\u07baVaGšWsC\nv-w7Wzo6\u0007\bjƆ7̠\u0011]z̦-\u0011_i$'YY:֢Rˎ,w\u0003Ԉɇ@\u0018"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011M\u001eJ\u0006/=H\b*>j\u0012;#", "\u001a`]1e6BR,Hvi7z\u00137p{7ER\u0005\u0016\u0019G~W+\u0001/<Vy-\r", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1n]3\\.", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sx.IB;x\u0012(\u001eie;\\", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~g\u0010(3v$2WL\u0005x=,\u0013ua9\u0010qu<t4GLW\u001akNpCv\u0012V\rN8j\u000fbB(p\u001az\u0010", "5dc\u0010b5?W\u001b", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007\u000eFi\u001440C7j4+rrj:\u000be\u0002", "7r;.l6Nbx\b\u0007n,\r\t.", "", ":`h<h;\u001cO \u0006wZ*\u0003", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG}:w#.WEHg?!\u0015u?C\u000fn(]5\bTHV,:NyD\u0011\u000eX\u0014$", "=m;.l6Nb", "", "1gP;Z,=", Global.COLON, "", "B", "@", AdkSettings.PLATFORM_TYPE_MOBILE, "@d`BX:M:\u0015\u0013\u0005n;", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class CustomToolbar extends Toolbar {
    private final ScreenStackHeaderConfig config;
    private boolean isLayoutEnqueued;
    private final ChoreographerCompat.FrameCallback layoutCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomToolbar(Context context, ScreenStackHeaderConfig config) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.layoutCallback = new ChoreographerCompat.FrameCallback() { // from class: com.swmansion.rnscreens.CustomToolbar$layoutCallback$1
            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j2) {
                this.this$0.isLayoutEnqueued = false;
                CustomToolbar customToolbar = this.this$0;
                customToolbar.measure(View.MeasureSpec.makeMeasureSpec(customToolbar.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.this$0.getHeight(), Integer.MIN_VALUE));
                CustomToolbar customToolbar2 = this.this$0;
                customToolbar2.layout(customToolbar2.getLeft(), this.this$0.getTop(), this.this$0.getRight(), this.this$0.getBottom());
            }
        };
    }

    public final ScreenStackHeaderConfig getConfig() {
        return this.config;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            this.config.updatePaddings(getNavigationIcon() != null ? getContentInsetStartWithNavigation() : getContentInsetStart(), getContentInsetEnd());
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        Window window;
        WindowManager.LayoutParams attributes;
        super.requestLayout();
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        Activity currentActivity = ((ThemedReactContext) context).getCurrentActivity();
        Integer numValueOf = (currentActivity == null || (window = currentActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : Integer.valueOf(attributes.softInputMode);
        if (Build.VERSION.SDK_INT > 29 || numValueOf == null || numValueOf.intValue() != 32 || this.isLayoutEnqueued || this.layoutCallback == null) {
            return;
        }
        this.isLayoutEnqueued = true;
        ReactChoreographer.Companion.getInstance().postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.layoutCallback);
    }
}
