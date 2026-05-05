package com.ticnow.sdk.idnowonboarding.steps.helper;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

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
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0005WيN\f^B-!d\u0011xGiʴ=0Re߲2T"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wPCBv4+^L@'\u0016c7,v.N7[6ZR\u0001K\u001e\u001f0", "", "u(E", "\u0011n\\=T5B]\"", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDStepCellProcessor {
    public static final Companion Companion = new Companion(null);

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007fјnjG5L͜N\u0093Siճ?k*3d`*qٴ?U(}j\u001d]O\u007fg\u001dL\u000b\u000fQ\u0012\u001e\u0016'n\\Mc}u\u0012=8ԸsF"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wPCBv4+^L@'\u0016c7,v.N7[6ZR\u0001K\u001e\u001f\u0019kX3\u0018\u0001bE.w\u001a", "", "u(E", "1`[0h3:b\u0019]\u0006A,\u0001\u000b2t", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "6dX4[;", "", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int calculateDpHeight(Context context, float f2) throws Throwable {
            short sXd = (short) (C1633zX.Xd() ^ (-13895));
            int[] iArr = new int["3><A1C>".length()];
            QB qb = new QB("3><A1C>");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Intrinsics.checkParameterIsNotNull(context, new String(iArr, 0, i2));
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Kd("\u0012 \u0017&$\u001f\u001be\u001c))0\",3m\u0004118*>;", (short) (ZN.Xd() ^ 25387))).getMethod(Wg.Zd("i:?xB\"\u0013s'jbJ", (short) (Od.Xd() ^ (-17288)), (short) (Od.Xd() ^ (-8294))), new Class[0]);
            try {
                method.setAccessible(true);
                Resources resources = (Resources) method.invoke(context, objArr);
                short sXd2 = (short) (Od.Xd() ^ (-16296));
                int[] iArr2 = new int["\u001a''. 41k1%4186(+:".length()];
                QB qb2 = new QB("\u001a''. 41k1%4186(+:");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
                    i3++;
                }
                Intrinsics.checkExpressionValueIsNotNull(resources, new String(iArr2, 0, i3));
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                Intrinsics.checkExpressionValueIsNotNull(displayMetrics, Wg.vd("v\u0002\u007f\u0005|\u000f\nB}o|w\u0005\u0001pq\u0017P\u0006\n\u001b\u0017\u0012\u0006\u0015g~\r\u0012\b\u0001\u0010", (short) (C1607wl.Xd() ^ 18542)));
                return (int) ((displayMetrics.density * f2) + 0.5f);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
