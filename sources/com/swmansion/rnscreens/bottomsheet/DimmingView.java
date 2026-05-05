package com.swmansion.rnscreens.bottomsheet;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactCompoundViewGroup;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.swmansion.rnscreens.ext.NumericExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG5LeN.ZS8\u0018s{:%c$\bCCU \u007f*\t]NogtJb\u000bQ\u0015\u000e\u0016~m4Ikxe\u0012\u00153HtU\u074ck\fm9\u000fsf\u0005N2R8(\u00069\u0019F\t%\u0007~QM$\u0012^C\u0001@X\r[\t2\u00124Cŋ\u0005\u001ejm\u0017<Vwu:]/I}\u000bd5lH|{\u0015vX5\u001b\u000faL0p;C$=S1\f\u0019o\b1M\u0002U\u0005\u00178W/W\u0006o6\u0007\bD\u00199b%]!:\r\t_u$'Yc\u0014O^$@w)\u0010=@\u0012%\u001e'vBs,/\u0018\u001cK\rr\u0002H\u0001\bl[\u0018|w5E?FHsO)\u0002iai-~;\n\u0013%\u001eQ\u0006\u001f%ic&`C \u001b\f\"C_GUH|\u0012\u0010}DՑrĊ\u0006.\u001c2M\t=\u0006¦24"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011l\u0018K\u0006/=g\u0001 7|_\rQKCo= \u0006laK\\", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\"Yy\u001eFK 6XMKt3\u000f\u0019hs\u001b\u0014m<YL", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\"Yy\u001eFX 2VR;x\u0014/\u0015qpGwg,`L", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7mXA\\(E/ \n}Z", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEn\u007fg", "0k^0^\u000e>a(\u000f\b^:", "", "5dc\u000f_6<Yz~\tm<\n\t=", "u(I", "5dc\u001db0Gb\u0019\fZo,\u0006\u0018=", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n c\u0002)Fm#\u000e^CDzBs", "7mc2e*>^(\rih<z\f\u000fv\u007f1\u000b", "F", "G", "=m;.l6Nb", "", "1gP;Z,=", Global.COLON, "", "B", "@", AdkSettings.PLATFORM_TYPE_MOBILE, "=mC<h*A3*~\u0004m", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "@dP0g\u001b:Uy\t\bM6\r\u00072", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DimmingView extends ViewGroup implements ReactCompoundViewGroup, ReactPointerEventsView {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "DimmingView";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011l\u0018K\u0006/=g\u0001 7|_\rQKCo= \u0006laKEA6V\u0002#PPX52", "", "u(E", "\"@6", "", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DimmingView(Context context, float f2) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        setAlpha(f2);
    }

    public /* synthetic */ DimmingView(Context context, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? 0.6f : f2);
    }

    private final boolean getBlockGestures() {
        return !NumericExtKt.equalWithRespectToEps$default(getAlpha(), 0.0f, 0.0f, 2, null);
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    public PointerEvents getPointerEvents() {
        return getBlockGestures() ? PointerEvents.AUTO : PointerEvents.NONE;
    }

    @Override // com.facebook.react.uimanager.ReactCompoundViewGroup
    public boolean interceptsTouchEvent(float f2, float f3) {
        return getBlockGestures();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getBlockGestures()) {
            callOnClick();
        }
        return getBlockGestures();
    }

    @Override // com.facebook.react.uimanager.ReactCompoundView
    public int reactTagForTouch(float f2, float f3) {
        throw new IllegalStateException("[RNScreens] DimmingView should never be asked for the view tag!");
    }
}
