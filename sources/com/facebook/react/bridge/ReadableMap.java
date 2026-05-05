package com.facebook.react.bridge;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u000eӵLш|\u0004O,8\u000b<f\u0007\":\u001e\u007f\u0007lkA0ZeP.XS2\u000fy\u0005<řc$\u007fGC٥\"}8\tWȞog|PbŏK\u000f\u0014\u001d\u0001j2J]xs\u0012\u00172HpG3coEʠhtL\u0005(݅(\u001d\u0010ڎ1\u001aXGX\u0007\tIc\u000e(/nwjV\u001bU\u001d\u001a@\t\u0005DI,jpf6vv\u000e>=+\u001bipQm\u0004x\u000b[\u0018^TU\u0019'e,3X7c\u0018kwK\u0015`hW\u0003m\u007fm\tv/?+wv\u001eZ!\u000e\"$CO;m#*j\ri`:*qs,Y^\u001f@w)\u000e=@\u0012\u0016\u001e'v1s>/\u0018\u001cF\rti?~\u061c\u000fF\u000e\u0003y6E(FWsI)zicQ\u0018|:,\t\u001b&;\u0001\u001d$\"xVn#0lw\u007fG\u0002DKPf\n\b@4(9p\u0010A\u001c0u\n_\u007f\u001f6/%e^\u007fGiy\u0010`\\g%\u000f\u0011laqjHn%5:\u007f0\u0017%rD\u0013\u001f2t\u001dj:,e(d\t\u000e\bA#lyL!S\u000f|k/\u000e;ok\n=AvEiz{\u0010g9\r6ESs\u0010\u0010Q%\u0016m=9ۚZڋFW$\\b,07̄iݘǱ{HV\u000e\u0019Qmpʲ8Iּ\u001d["}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "", "3mc?l\u0010MS&z\nh9", "", "", "", "5dc\u0012a;Kg|\u000ezk(\f\u0013<", "u(;7T=:\u001d)\u000e~eu`\u0018/r{7\u0006MV", "5dc\u000ee9:g", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "<`\\2", "5dc\u000fb6ES\u0015\b", "", "5dc\u0011b<;Z\u0019", "", "5dc\u0011l5:[\u001d|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001b\u000b.1a\u0002\u001e\r", "5dc\u0016a;", "", "5dc\u0019b5@", "", "5dc\u001aT7", "5dc g9B\\\u001b", "5dc!l7>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7\\*9M\u0019", "6`b\u0018X@", "7r=B_3", "9dh X;\"b\u0019\fvm6\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u001293COY4-xwaF\u0003r6[L", "Bn7.f/&O$", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface ReadableMap {
    ReadableArray getArray(String str);

    boolean getBoolean(String str);

    double getDouble(String str);

    Dynamic getDynamic(String str);

    Iterator<Map.Entry<String, Object>> getEntryIterator();

    int getInt(String str);

    long getLong(String str);

    ReadableMap getMap(String str);

    String getString(String str);

    ReadableType getType(String str);

    boolean hasKey(String str);

    boolean isNull(String str);

    ReadableMapKeySetIterator keySetIterator();

    HashMap<String, Object> toHashMap();
}
