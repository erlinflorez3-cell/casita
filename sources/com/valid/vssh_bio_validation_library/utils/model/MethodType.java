package com.valid.vssh_bio_validation_library.utils.model;

import kotlin.Metadata;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Xg;
import yg.ZN;
import yg.ZO;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'GET' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u0014\u001d<K!&i\u000eRLш|\u0004O\f8\u000b4F\u0005ӳ+(Մ7lz;@D\u0014߉\\Q\u00147\u0015k\f82[<qq<ڈ\u001e}0\u000b8NmjWJ`\u000f,\u000f\f\u001baj2OǪ|d"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^pk8\u0007ju6v6JVM\u001bp]r\u0013", "", "5dc", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_$D\b", "\u0015DC", "\u001eNB!", "\u001eTC", "\u0012D;\u0012G\f", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class MethodType {
    private static final /* synthetic */ MethodType[] $VALUES;
    public static final MethodType DELETE;
    public static final MethodType GET;
    public static final MethodType POST;
    public static final MethodType PUT;

    static {
        int iXd = FB.Xd() ^ (1366538969 ^ 245146736);
        MethodType methodType = new MethodType(Xg.qd("HGW", (short) (FB.Xd() ^ ((684700946 ^ 1111881499) ^ 1787460352)), (short) (FB.Xd() ^ iXd)), 0, 0);
        GET = methodType;
        MethodType methodType2 = new MethodType(Jg.Wd("%2+e", (short) (C1633zX.Xd() ^ ((1454041847 ^ 678404387) ^ (-2126861888))), (short) (C1633zX.Xd() ^ ((1410780878 ^ 136577138) ^ (-1546814948)))), 1, 1);
        POST = methodType2;
        String strXd = ZO.xd("LpV", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864699024))), (short) (C1633zX.Xd() ^ (380107352 ^ (-380102708))));
        int i2 = 2070382003 ^ 2070382001;
        MethodType methodType3 = new MethodType(strXd, i2, i2);
        PUT = methodType3;
        int iXd2 = C1580rY.Xd() ^ (-831074988);
        int i3 = (1459469098 ^ 823839157) ^ 1743221404;
        MethodType methodType4 = new MethodType(C1626yg.Ud("\u0010~A`3\u000f", (short) (OY.Xd() ^ ((769617024 ^ 528301778) ^ 849498425)), (short) (OY.Xd() ^ iXd2)), i3, i3);
        DELETE = methodType4;
        $VALUES = new MethodType[]{methodType, methodType2, methodType3, methodType4};
    }

    private MethodType(String str, int i2, int i3) {
    }

    public static MethodType valueOf(String str) {
        return (MethodType) Enum.valueOf(MethodType.class, str);
    }

    public static MethodType[] values() {
        return (MethodType[]) $VALUES.clone();
    }
}
