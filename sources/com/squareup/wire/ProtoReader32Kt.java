package com.squareup.wire;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d̉=!4i\bDZc|İI\u0006F\u000b6B\r(4\u0012\u0006јnj?3LeV>ZݷB6yڔL$\n#\u001aCiUJ\u000e0\ngZwi~J\t\u000eS\u0011\u0016\u0016'nZK\u001cޔcށ\u000e˰Բs?9R\b]Gf\r63 b&F\u0001\u001d\u0001H)x\u0016|zQS$\u0012^C!@X\r[\u000e2\u00124A8!,b\u007fNdH\u001daH6;\u0003\u0018L~-e0\u000bU%F\u0003*=|g\u001e9IO5C(و\u0003\fZ^EŻo <ބl2"}, d2 = {"4na\u0012T*AB\u0015\u0001", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u0003&S", "B`V\u0015T5=Z\u0019\f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", "ze^?8(<V\bz|", "\u001eq^Ab\u0019>O\u0018~\b,x", "And?V,", ">nb", ":h\\6g", "", "Eha2 9N\\(\u0003\u0003^"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ProtoReader32Kt {
    /* JADX INFO: renamed from: -forEachTag */
    public static final ByteString m8720forEachTag(ProtoReader32 protoReader32, Function1<? super Integer, ? extends Object> tagHandler) throws IOException {
        Intrinsics.checkNotNullParameter(protoReader32, "<this>");
        Intrinsics.checkNotNullParameter(tagHandler, "tagHandler");
        int iBeginMessage = protoReader32.beginMessage();
        while (true) {
            int iNextTag = protoReader32.nextTag();
            if (iNextTag == -1) {
                return protoReader32.endMessageAndGetUnknownFields(iBeginMessage);
            }
            tagHandler.invoke(Integer.valueOf(iNextTag));
        }
    }

    public static final ProtoReader32 ProtoReader32(ByteString source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new ByteArrayProtoReader32(source.toByteArray(), i2, i3);
    }

    public static final ProtoReader32 ProtoReader32(byte[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new ByteArrayProtoReader32(source, i2, i3);
    }

    public static /* synthetic */ ProtoReader32 ProtoReader32$default(ByteString byteString, int i2, int i3, int i4, Object obj) {
        if ((i4 + 2) - (2 | i4) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = byteString.size();
        }
        return ProtoReader32(byteString, i2, i3);
    }

    public static /* synthetic */ ProtoReader32 ProtoReader32$default(byte[] bArr, int i2, int i3, int i4, Object obj) {
        if ((2 & i4) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            i3 = bArr.length;
        }
        return ProtoReader32(bArr, i2, i3);
    }
}
