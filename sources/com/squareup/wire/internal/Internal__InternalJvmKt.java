package com.squareup.wire.internal;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import java.util.List;
import java.util.Map;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d̉=!,i\bDJc|\u0004O%8é6B\u0015\"4ߚ\u007f\u0007t\u000eA0JeP.hS2\u000f\u0002{<$a%\niI٥2}P\boPm˧|J\u000b\u0015Q\u0010\u001e\u001c\tl<I\u001cx\f\u0014?<PrW9]qM9'td\t8\\0\u0600\u0012\u0005/\u0019JJ\u0016͌\tC{\u001a 5XzJR\u0013N\u0015\u001c\"\u0006\u0005 /$\rq\\9`rm<?#IipRG\u0005>\u0004e\u000f\\Sm\u0015\u0017g$ѨN?]\u0015S\\+\rb]O\u0003\u0006yk\u000f\u001fkݳ/M\fY<c\u000e Ƭ/\\"}, d2 = {"@dS.V;\u001eZ\u0019\u0007zg;\u000b", "", "\"", ":hbA", "", "/cP=g,K", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", ";`_", "", "7cT;g0Mg\u0003\fcn3\u0004", "\u0013", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017vP\u007f\u0016\u0012", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "5dc\u0016W,Gb\u001d\u000e\u000fH9e\u00196l", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkb>\u000b\u001f`U{\u001e8\u0004%EdG2;z\u0016w?GHk\u0014'%p7", "Eha2 9N\\(\u0003\u0003^"}, k = 5, mv = {2, 0, 0}, pn = "", xi = 48, xs = "6A>~B?B-=/>8u=.6(p*.3#/*\u001c&g\u0001%*\u001a&!\u0013\u001d")
final /* synthetic */ class Internal__InternalJvmKt {
    public static final <E extends WireEnum> E getIdentityOrNull(Class<E> cls) {
        E e2;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        E[] enumConstants = cls.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
        int length = enumConstants.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                e2 = null;
                break;
            }
            e2 = enumConstants[i2];
            E e3 = e2;
            Intrinsics.checkNotNull(e3, "null cannot be cast to non-null type com.squareup.wire.WireEnum");
            if (e3.getValue() == 0) {
                break;
            }
            i2++;
        }
        return e2;
    }

    public static final <T> void redactElements(List<T> list, ProtoAdapter<T> adapter) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.set(i2, adapter.redact(list.get(i2)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void redactElements(Map<?, T> map, ProtoAdapter<T> adapter) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        for (Map.Entry entry : map.entrySet()) {
            entry.setValue(adapter.redact(entry.getValue()));
        }
    }
}
