package androidx.core.util;

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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Pair.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<;\"&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007lkQXR͜`.\u0019RJ\u0011qڔB#{&wBIUB\n2\u000b_N.f~Lj\u000b\n\u000f4\u0017?̛4֒Yxk\u0014'ZPģW3\u0014n];fҚD\u0004@4(7\b\u0005)&:J vAB[\u000e\"0\u0007phUS˧\rܨ\u0016\u0006L$\u0019Fjlf6\u000fl}<5݊\u0011hbP-^>|u\u0019VV7\r=`.-P7{\u0015STIޟZÜC\u0003MsU-v,?+\u0010sw8^Ü\"\u0014KQ\u0013\\\u0001&\u0005\u0011ab\u001c'qNsM`\u000enw)~Sɥ\f؝\n'V2EIt\u000e&?\u0005tc@\u0017\u0001nD\u0010z(6E& 51ݍ)eqcA\u0018\\7$\u0011\u001d 3\u00015 kV\u001e`[\u001b\u0003~\u0018ĿWXlVV\"eMo\u0014p)\u0001:\u0006@GF/*\u0014N\u0019+ڛi8C#q\u0001VD\u0010\u0003\u0015bxS0QXB2n\\7X\u0010RɵJ|4yYld<\u0013]\u001c\u001b\u0006\u000e\n# #wj(E\u0012Tиvh\u000bOc\t3/\u000fCip{\u000e\u001e8n5EQ*\u0010\u0010S=ܤET\u0012\u0013a~Nc\u000ej\\n!BJz\u0010>{rU,\u00158ŭ\u007f\u001bT.7\u0018j\u0015p\u000f.DQ|O^jj ~\u001b3R\u00060ˌz\u0590\u0005Z"}, d2 = {"1n\\=b5>\\(J", "\u0014", "!", "\u001a`]1e6BRb\u000f\nb3Fs+i\r}", "uKP;W9HW\u0018H\u000bm0\u0004R\u001aa\u00045Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "\u001a`]1e6BR,Hxh9|R?t\u0004/E+|\u001b$\u001d", "uKP;W9HW\u0018\u0012D\\6\n\txu\u000f,\u0003\nk\u0013\u001bTEQ#{!FUG'3v\u0018w7@@k2-j", "1n\\=b5>\\(K", "Bn0;W9HW\u0018ivb9", "\u001aj^A_0G\u001d\u0004z~k\u0002", "Bn0;W9HW\u0018qeZ0\n", "Bn:<g3B\\\u0004z~k", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PairKt {
    public static final <F, S> F component1(Pair<F, S> pair) {
        return pair.first;
    }

    public static final <F, S> S component2(Pair<F, S> pair) {
        return pair.second;
    }

    public static final <F, S> kotlin.Pair<F, S> toKotlinPair(Pair<F, S> pair) {
        return new kotlin.Pair<>(pair.first, pair.second);
    }

    public static final <F, S> Pair<F, S> toAndroidXPair(kotlin.Pair<? extends F, ? extends S> pair) {
        return new Pair<>(pair.getFirst(), pair.getSecond());
    }

    public static final <F, S> F component1(android.util.Pair<F, S> pair) {
        return (F) pair.first;
    }

    public static final <F, S> S component2(android.util.Pair<F, S> pair) {
        return (S) pair.second;
    }

    public static final <F, S> kotlin.Pair<F, S> toKotlinPair(android.util.Pair<F, S> pair) {
        return new kotlin.Pair<>(pair.first, pair.second);
    }

    public static final <F, S> android.util.Pair<F, S> toAndroidPair(kotlin.Pair<? extends F, ? extends S> pair) {
        return new android.util.Pair<>(pair.getFirst(), pair.getSecond());
    }
}
