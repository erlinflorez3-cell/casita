package com.facebook.react.touch;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007fјnjG0LeN.ZS8\u0018sڔ<$q$yّCU0}*\tUP}˧\rZ\u000b\u000bq\u000e>\u0015\t+/֒Yxk\u0012W6PtW3{u\u0006?n{N\u0005N8h8B\u001b\u000f\"BH>\u007f+GY\u0016*0n{jV\u001bY\u001d\u001a@\u0013\u00054I4juf6vr\u000e>=2\u001bipPWe>\u007fe\u000f\\SU\u0011Gm,,X7c\u0017{و\u000f\u07baV[Gš\u0010\u007fK\b\u0001)=*ww.̯dÿ\u0018\u00153˽վa\u0004"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EO\u000b'\u0015J9r*c%Cd\b)6m#\u0011IL:r4+j", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EO\u000b'\u0015J9wEZ.DY\u000b\u001e7x%\u001dWS9n\u0014/\u0015qp \u000bq;N\u007f'T\"", "u(E", "1ta?X5M8\u0007kzl7\u0007\u0012.e\r", "", "DhTDC(KS\"\u000eWe6z\u000f3n\u0002\u0011wO\u0005(\u00174o\u001cG\u0001.4Y\u000b", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\u0013wM\u0001 &\u001d", "1kT.e\u0011,@\u0019\r\u0006h5{\t<", "", ";`h/X\u001cGP \txd\u0015x\u00183v\u007f\u0015{N\f! Fo\u001b", "=m8;g,KQ\u0019\n\nM6\r\u00072E\u0011(\u0005O", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "Adc\u0017F\u0019>a$\t\u0004],\n", "B`V", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class JSResponderHandler implements OnInterceptTouchEventListener {
    private static final Companion Companion = new Companion(null);
    private static final int JS_RESPONDER_UNSET = -1;
    private volatile int currentJSResponder = -1;
    private ViewParent viewParentBlockingNativeResponder;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0005ӯ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EO\u000b'\u0015J9r*c%Cd\b)6m#\u0011IL:r4+SFkA\u0012_5R\u00010\u001d", "", "u(E", "\u0018RN\u001f8\u001a)=\u0002]ZK&lq\u001dEn", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void maybeUnblockNativeResponder() {
        ViewParent viewParent = this.viewParentBlockingNativeResponder;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
        }
        this.viewParentBlockingNativeResponder = null;
    }

    public final void clearJSResponder() {
        this.currentJSResponder = -1;
        maybeUnblockNativeResponder();
    }

    @Override // com.facebook.react.touch.OnInterceptTouchEventListener
    public boolean onInterceptTouchEvent(ViewGroup view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        int i2 = this.currentJSResponder;
        return (i2 == -1 || event.getAction() == 1 || view.getId() != i2) ? false : true;
    }

    public final void setJSResponder(int i2, ViewParent viewParent) {
        this.currentJSResponder = i2;
        maybeUnblockNativeResponder();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.viewParentBlockingNativeResponder = viewParent;
        }
    }
}
