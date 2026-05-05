package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathOperation;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
/* JADX INFO: compiled from: PathOperation.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!4i\bDZc|\u0004G\u0015P'<Ȑ\u0017\"Z\u0011 \u0007\u0015jot\u001bͤJ¯V]:\u0011q|B&s&wFIY:\u001a0\u000egN\u0016f\u0017J\t\u000byS\\ǥz̶0Sezc\u0018\u001d4ZqE:[s]Un|N\u0005N1J8(\u00057^\u0001Ђ\u0012ͯ~M[\u000e\u00189NrRT\u0013W\u0013\u001e2\"L+\u0019\u001e\u000bfv6vl\u0014~\u0006ݒ\u0005ݦFX7a6\t[\u000f^V-\u001a\u0005e>GNEM\u0015SR+\u0007\u0001[uG\u0016ф?ݾl17-O\u0003e8p\u0002\u001a%9Sվa\u0004"}, d2 = {"2hU3X9>\\\u0017~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#!x\u0016;IR?u=s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#!x\u0016;IR?u=\\rriD\u0003l0X\u007f|", "5dc\u0011\\-?S&~\u0004\\,;\u00058n\n7wO\u0005! U", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:W!.Z?Jo>'SFkA\u0012_5R\u00010\u001d\u0010?", "5dc\u0011\\-?S&~\u0004\\,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:W!.Z?Jo>'SFkA\u0012_5R\u00010\u001d\u00102", "7mc2e:>Q(", "5dc\u0016a;>`'~xmjx\u00128o\u000f$\u000bD\u000b %", "5dc\u0016a;>`'~xm", "@de2e:>2\u001d\u007f{^9|\u0012-e", "5dc\u001fX=>`'~Yb-}\t<e\t&{~|  Q~\nKz/>g", "5dc\u001fX=>`'~Yb-}\t<e\t&{", "CmX<a", "5dc\"a0H\\Wz\u0004g6\f\u0005>i\n1\n", "5dc\"a0H\\", "Fna", "5dc%b9|O\"\b\u0005m(\f\r9n\u000e", "5dc%b9", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PathOperationKt {
    @Deprecated(message = "\u0018Y\u0001tau)_GW-\rQ)5]j\u001al0\u000bn\u0011d{Tqo\u000e}2y|QeF", replaceWith = @ReplaceWith(expression = "PathOperation.Difference", imports = {"androidx.compose.ui.graphics.PathOperation.Difference"}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getDifference$annotations(PathOperation.Companion companion) {
    }

    @Deprecated(message = "\u0018Y\u0001tau)_GW-\rQ)5]j\u001aq5\u0019m\u001ee{I\u0003*W\u00037zmMh", replaceWith = @ReplaceWith(expression = "PathOperation.Intersect", imports = {"androidx.compose.ui.graphics.PathOperation.Intersect"}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getIntersect$annotations(PathOperation.Companion companion) {
    }

    @Deprecated(message = "\u0018Y\u0001tau)_GW-\rQ)5]j\u001az,\u001bm\u001ee{*wpTy6kvOi\u0002Vj{MK\u001f7", replaceWith = @ReplaceWith(expression = "PathOperation.ReverseDifference", imports = {"androidx.compose.ui.graphics.PathOperation.ReverseDifference"}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getReverseDifference$annotations(PathOperation.Companion companion) {
    }

    @Deprecated(message = "\u0018Y\u0001tau)_GW-\rQ)5]j\u001a}5\u000ew\u001a\u0012\u007fT\u0002~Su(", replaceWith = @ReplaceWith(expression = "PathOperation.Union", imports = {"androidx.compose.ui.graphics.PathOperation.Union"}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getUnion$annotations(PathOperation.Companion companion) {
    }

    @Deprecated(message = "\u0018Y\u0001tau)_GW-\rQ)5]j\u001a\u00016\u0017(\u0015`\nZskR", replaceWith = @ReplaceWith(expression = "PathOperation.Xor", imports = {"androidx.compose.ui.graphics.PathOperation.Xor"}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getXor$annotations(PathOperation.Companion companion) {
    }

    public static final int getDifference(PathOperation.Companion companion) {
        return companion.m4470getDifferenceb3I0S0c();
    }

    public static final int getIntersect(PathOperation.Companion companion) {
        return companion.m4471getIntersectb3I0S0c();
    }

    public static final int getUnion(PathOperation.Companion companion) {
        return companion.m4473getUnionb3I0S0c();
    }

    public static final int getReverseDifference(PathOperation.Companion companion) {
        return companion.m4472getReverseDifferenceb3I0S0c();
    }

    public static final int getXor(PathOperation.Companion companion) {
        return companion.m4474getXorb3I0S0c();
    }
}
