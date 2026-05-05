package com.ticnow.sdk.idnowsecurity.api;

import android.content.Context;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.TypeCastException;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0005WيN\f^B-!d\u0011xGiʴ=0Re߲2T"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL~8_1;zC\"\u001ejo\u000f", "", "u(E", "\u0011n\\=T5B]\"", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDNowSettings {
    public static final Companion Companion = new Companion(null);

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007fјnjGGLeN0ZS8\u0018s{:$aҜrYП\u0006\u001a,!ITTg̊rJh\u000b\f\u001b\u0014\u0017\u0011jZK\u0006|k\u0015'2ps\b9[tU9\u000fz|\u0005h80?\u0012\u0005/ pHXz\tKc\f@2\ttH[%M3\u001cZ\u0014L*\u0019\u001e\u000br~:Vou:]'Ii\u000bZ5kH|{\u0018vX5\u0010\u000faL/Ñ;B"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL~8_1;zC\"\u001ejowdm4Yr0KVW\u0002", "", "u(E", "5dc\u001cf", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc6", "", "5dc6a", "5dc6a2", "5dcC", "6`b\u0014@\u001a", "", "6`b\u0015@\u001a", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final char[] geti() {
            return new char[]{'R', 'a', 'n', 'd', 'o', 'm', 'I', 'n', 'i', 't', 'V', 'e', 'c', 't', 'o', 'r'};
        }

        private final char[] getin() {
            return new char[]{'B', 'D', '8', '6', '1', '1', 'D', 'E', '1', 'D', 'F', '7', 'A', 'A', '7', '8', '8', 'F', '8', '4', 'C', '1', 'D', '2', '6', 'F', '5', '4', '6', 'E', 'E', 'E'};
        }

        private final boolean hasGMS(Context context) {
            try {
                Method method = Class.forName("com.google.android.gms.common.GoogleApiAvailability").getMethod("getInstance", new Class[0]);
                Intrinsics.checkExpressionValueIsNotNull(method, "googleApiAvailability.getMethod(\"getInstance\")");
                Object objInvoke = method.invoke(null, new Object[0]);
                if (objInvoke == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
                }
                Method method2 = objInvoke.getClass().getMethod("isGooglePlayServicesAvailable", Context.class);
                Intrinsics.checkExpressionValueIsNotNull(method2, "gmsObject.javaClass.getM…     Context::class.java)");
                Object objInvoke2 = method2.invoke(objInvoke, context);
                if (objInvoke2 != null) {
                    return ((Integer) objInvoke2).intValue() == 0;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            } catch (Exception unused) {
                return false;
            }
        }

        public final String getOs(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return hasGMS(context) ? "ANDROID" : hasHMS(context) ? "HUAWEI" : "GMS_NOR_HMS";
        }

        public final String getink() {
            String string = new StringBuilder().append(getin()).toString();
            Intrinsics.checkExpressionValueIsNotNull(string, "StringBuilder().append(getin()).toString()");
            return string;
        }

        public final String getv() {
            String string = new StringBuilder().append(geti()).toString();
            Intrinsics.checkExpressionValueIsNotNull(string, "StringBuilder().append(geti()).toString()");
            return string;
        }

        public final boolean hasHMS(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            try {
                Object objInvoke = Class.forName("com.huawei.hms.api.HuaweiApiAvailability").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = objInvoke.getClass().getMethod("isHuaweiMobileServicesAvailable", Context.class).invoke(objInvoke, context);
                if (objInvoke2 != null) {
                    return ((Integer) objInvoke2).intValue() == 0;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            } catch (Exception unused) {
                return false;
            }
        }
    }
}
