package com.swmansion.gesturehandler.core;

import android.view.MotionEvent;
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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000f6B\u0005\"4\u0012\u0006\fnʑA0ZeP\u008cZS8\u0018s{:$aӜqYП\u0006\u001a,!ITTg̊rJh\u000b\f\u001b\u0014\u0017\u0011jZK\u0006|k\u0015'2pq\bG[sU9\u000fyf\t.8:8(\f1\u001e8P(v)L\u0014  :XphW=Q\u0013 *\u0006l'1\"jof6vuӀ>:"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk$-\u0019oo\u000f", "", "u(E", "1n]2G6\u001dS*\u0003vm0\u0007\u0012", "", "/mV9X", "5dc\u0019T:M>#\u0003\u0004m,\n{", "", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "/uT?T.>B#\u000fxa,\u000b", "", "5dc\u0019T:M>#\u0003\u0004m,\n|", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class GestureUtils {
    public static final GestureUtils INSTANCE = new GestureUtils();

    private GestureUtils() {
    }

    public final double coneToDeviation(double d2) {
        return Math.cos(Math.toRadians(d2 / 2.0d));
    }

    public final float getLastPointerX(MotionEvent event, boolean z2) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionIndex = event.getActionMasked() == 6 ? event.getActionIndex() : -1;
        if (!z2) {
            int pointerCount = event.getPointerCount();
            int i2 = pointerCount - 1;
            if (i2 == actionIndex) {
                i2 = pointerCount - 2;
            }
            return event.getX(i2);
        }
        int pointerCount2 = event.getPointerCount();
        float x2 = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < pointerCount2; i4++) {
            if (i4 != actionIndex) {
                x2 += event.getX(i4);
                i3++;
            }
        }
        return x2 / i3;
    }

    public final float getLastPointerY(MotionEvent event, boolean z2) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionIndex = event.getActionMasked() == 6 ? event.getActionIndex() : -1;
        if (!z2) {
            int pointerCount = event.getPointerCount();
            int i2 = pointerCount - 1;
            if (i2 == actionIndex) {
                i2 = pointerCount - 2;
            }
            return event.getY(i2);
        }
        int pointerCount2 = event.getPointerCount();
        float y2 = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < pointerCount2; i4++) {
            if (i4 != actionIndex) {
                y2 += event.getY(i4);
                i3++;
            }
        }
        return y2 / i3;
    }
}
