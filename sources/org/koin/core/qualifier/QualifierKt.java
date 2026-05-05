package org.koin.core.qualifier;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d̉=!4i\bӵLc\u0003\u0012I\u00066\f6B\u0015\"4ߚ\u007f\u0007|jAӄLeV:ZS0\u0011\u0004\u000bB(s$ H[Y Ԃ0\u000feM.ˮtbf\u0019G'\u0006D\u007f\u001b0W]\u0011]@\u0018JQ}IKM\u001eBYdzȂ\u0013&H!~э\u000b\u0019<8R(v)Bk\u0018\u0018ؓNpbX\u001dO\u0015\u001aX\u0006l!1(jrf<Xnm:u#1jZZ5iH|{\u0014vX5\u0015\u000faL4XFCՖ=S1\fr_EšMwS\u0004/Ѯ-Ck\u0002ɎNX.\u001357UՕkrNb\u0015Sp\fm+}d{Z\u001c3\u0010\u0001\f\u000fL\u0004T\u0006UIF9(Ǒ \u000ea{#WNX\u001a^p\t\u001b\u000bDЍ=\u007fa*Y'lϟo;ATG}\u0015\rd#/oIad\u0010p\u0015aT&Rg\u0016͘ALf\f_?{\u0007\u0019j\u00106$0u\t_{?7ϸ)D"}, d2 = {"?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "\u0013", "", "5dc\u001eh(EW\u001a\u0003zk", "uKY.i(\bZ\u0015\b|(\f\u0006\u00197;C\u000f\u0006M\u0003`\u001dQs\u0017\u0006t/BYG,Gi\u001d2NG;x}\n%dh=\bg,[L", "-p", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011^\"Gv\u0011EU\u0005$8q\u0016;#", "\"", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011]\u001dIz.7E\u000e\u001c>q\u00172MP\u0011", "<`\\2", "", "<`\\2W", "3md:", "\u001ftP9\\-BS&ove<|", "9nX; *H`\u0019"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class QualifierKt {
    public static final StringQualifier _q(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new StringQualifier(name);
    }

    public static final /* synthetic */ <T> TypeQualifier _q() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
    }

    public static final <E extends Enum<E>> Qualifier getQualifier(Enum<E> r3) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        String lowerCase = r3.toString().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return new StringQualifier(lowerCase);
    }

    public static final <E extends Enum<E>> Qualifier named(Enum<E> r1) {
        Intrinsics.checkNotNullParameter(r1, "enum");
        return getQualifier(r1);
    }

    public static final StringQualifier named(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new StringQualifier(name);
    }

    public static final /* synthetic */ <T> TypeQualifier named() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
    }

    public static final <E extends Enum<E>> Qualifier qualifier(Enum<E> r1) {
        Intrinsics.checkNotNullParameter(r1, "enum");
        return getQualifier(r1);
    }

    public static final StringQualifier qualifier(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new StringQualifier(name);
    }

    public static final /* synthetic */ <T> TypeQualifier qualifier() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
    }
}
