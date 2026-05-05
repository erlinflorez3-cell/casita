package com.facebook.fresco.middleware;

import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import com.facebook.fresco.ui.common.ControllerListener2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":4\u007f\u0007tvA0JgP.hS2\u000fq{<$q$yCAV\"}0\u0012WȞog\u0005JbŏIǫ\u0006,ю\u001b,wT9b\u0018\u000f̓FoM3\u0016ڿ<Ga\r63\"b2F|\u001d\r*,X\u0010%\u007fSM\u001c\u0012^?\u001f>\u0003\u001d[\u000b2\u001e\u0016@0\u0001LawPFH\u001b\\h3S\u0015wIf5o2\rM;Kd)\u001dv\u0010\u001dA?e9E7a\u000b\u001f`kA\u0013? B\u0015j7'YH\nVd\\0\u001a#4g\u000fsqTf5Wn\u0017?-ebyU>.\u0006\u0007\u0014\u000fR\u0003<\u0013W\\<;2v\u0018\u0010Ct!XPT\u0012`X~)`L\u0016S\u0004c1G*~Sw:GMg\u0002\u000b\r,3\u0019nOl\u0005\u0014n'3V\u000eP_d\u0007B˙R\u001e"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\t\u001b\u0016Fv\u000eNr25#e$6l\u001d._?Hk$-\u0019oo\u000f", "", "u(E", "=ac.\\5\u001ef(\fvl", "\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\u0011\u001b`Ey\u0016D\u0001.~7\b)Fz 5TCHR8,$hj9\u00140j.\n6TH\\\u0002", "1n\\=b5>\\(Z\nm9\u0001\u0006?t\u00042\u0005", "", "", "Ag^?g*Nbt\u000e\nk0y\u0019>i\n1", "2`c.F6N`\u0017~Zq;\n\u0005=", "7lP4X\u001aHc&|z>?\f\u0016+s", "DhTDc6Kbw\u0003\u0003^5\u000b\r9n\u000e", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "AbP9X\u001bR^\u0019", "4nRBf\u0017HW\"\u000e", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&w\u001d", "7lP4X\fQb&z\t", "1`[9X9\u001c]\"\u000ezq;", ":nV$\\;A6\u001d\u0001}L(\u0005\u00146i\t*h<\u0010\u0017", "", ";`X;H9B", "\u001a`]1e6BRb\bzmul\u00163;", ";hS1_,PO&~tk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MiddlewareUtils {
    public static final MiddlewareUtils INSTANCE = new MiddlewareUtils();

    private MiddlewareUtils() {
    }

    @JvmStatic
    public static final ControllerListener2.Extras obtainExtras(Map<String, ? extends Object> componentAttribution, Map<String, ? extends Object> shortcutAttribution, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Rect rect, String str, PointF pointF, Map<String, ? extends Object> map3, Object obj, boolean z2, Uri uri) {
        Intrinsics.checkNotNullParameter(componentAttribution, "componentAttribution");
        Intrinsics.checkNotNullParameter(shortcutAttribution, "shortcutAttribution");
        ControllerListener2.Extras extras = new ControllerListener2.Extras();
        if (rect != null) {
            extras.viewportWidth = rect.width();
            extras.viewportHeight = rect.height();
        }
        extras.scaleType = str;
        if (pointF != null) {
            extras.focusX = Float.valueOf(pointF.x);
            extras.focusY = Float.valueOf(pointF.y);
        }
        extras.callerContext = obj;
        extras.logWithHighSamplingRate = z2;
        extras.mainUri = uri;
        extras.datasourceExtras = map;
        extras.imageExtras = map3;
        extras.shortcutExtras = shortcutAttribution;
        extras.componentExtras = componentAttribution;
        extras.imageSourceExtras = map2;
        return extras;
    }

    public static /* synthetic */ ControllerListener2.Extras obtainExtras$default(Map map, Map map2, Map map3, Map map4, Rect rect, String str, PointF pointF, Map map5, Object obj, boolean z2, Uri uri, int i2, Object obj2) {
        if ((-1) - (((-1) - i2) | ((-1) - 512)) != 0) {
            z2 = false;
        }
        return obtainExtras(map, map2, map3, map4, rect, str, pointF, map5, obj, z2, uri);
    }
}
