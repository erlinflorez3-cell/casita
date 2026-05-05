package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: TrieNode.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d̉=!,o\bDJi|\u0004O\u00158\u000b<Ȑ\u0007\"2\u001c\u007f\u0007|jA0Jg`D`WB\u000f\u001azd(i)\nCiTJ\u00020\u000fgN\u0016f5ϺrNQ\u0016\u001e\u001e\tn<Kkw\f\u001b=:bqE\u074c[y];fsD\u0010H:2<\n\u0007\u0017\u0019XQ>~+GY\u0018*0nojV\u001bZ\u001d\u001aX\u0010n$\u000f,tg\u0015A\u000flҺ>/1\u0012\u0002i\\7w8\rQ\u001dHj&;\u007f\u0010&SHG9%'i\u00025[\nG3C\u007fI\u001dhU&qIָ[6f\u0011,<9a%e\u0003*l\u0007g_:0YW\fS`\u00128y\u0011z;E2\u00166+VAE\u001a\u0015\u0007T3ϢvSNa\u001a\u001eP\u0014\u0013iF\u001b5\u0002I*g$\u0015Y\nC)RG}\u001b\fL,/vQ_b\u001ax\u0015IS(U?dX=vM:eK\u0003\u001cxr\u00020\u0005@G\u00060*'t\u0017É;[G:97\u0010`\\o\u0007\tpjih\u0001Qn*\u000f\u0018=ѧ\u0017\u0016zFj\u0004y[|`<\u0015]\u001ej\u0006,\u0011A(\r{J4=\u0010|N\u0019mxYu\nS.\u0017;g{\u0004\u000e\u001eC\u000f7C_{\u0010(]=\u0014͖@b\u0013q\u0007Naێr\\V!\tʌ=ݻ{{L\u0088,\u001f@?\n\u001cb+\bǊ/ČL\u0003&Փa\t\u0017`rh>}+՝vғm$|է!\\jr\bg'H\u0003ʊ3Ę1AYځ92c%\u00014+\"]ѩFõKgT܁ƫp0"}, d2 = {"\u0013MC\u001fL&,7\u000e^", "", "\u001aN6,@\b1MukVG\n_l\u0018Gy\tW\u001eo\u0001\u0004", "\u001b@G,5\u0019\u001a<va^G\u000evi\u000bCn\u0012h", "\u001b@G,5\u0019\u001a<va^G\u000evi\u000bCn\u0012h:hz\u007f7]\b&_\u0005", "\u001b@G,F\u000f\"4\b", "7mS2k\u001a>U!~\u0004m", "7mS2k", "AgX3g", "7mb2e;\u001e\\(\f\u000f:;`\u0012.e\u0013", "", "", "\u0019", "$", "9dh\u0016a+>f", "9dh", "D`[BX", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#*@gE\u001a^o]B\t-\u0016K{'E[$oR9w9%\u000e$\u0015J4\u000fNC>)nBFt", "@d\\<i,\u001e\\(\f\u000f:;`\u0012.e\u0013", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$D\r}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011", "@d\\<i,']\u0018~Vm\u0010\u0006\b/x", "<nS2<5=S,", "@d_9T*>3\"\u000e\br\u001e\u0001\u00182N\n'{", "<df\u001bb+>", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp*R\u001b\u0011h\"yA\u0012rEY5", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$d}\u0013Pn\u001bFz$H#{*?x <M\rH{=-\u0019pa\u0003\u0007v;N\u00040CS\u00182fayA\u001d%$\fX2\u0014\u0005WP(xMEh\f4Q\u0012Jd}\u0013\u0016W9r{IV\u0018G\u0003$qP-rOg)}OIUq&a\u0013_\u0005XE\u0004\u0013!u\u0019\u0004rO._?IwwN\u000bc1N\u0015\u0004:m(j`FC~+", "@d_9T*><#}zP0\f\f\u000fn\u000f5\u0010", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$d}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019\"p0/\u00112h5\u0010eu8s,GJ]\u0002 HYB\u0010#VWU'\u0016\u0007#+!sD5.]", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TrieNodeKt {
    public static final int ENTRY_SIZE = 2;
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    public static final int indexSegment(int i2, int i3) {
        int i4 = i2 >> i3;
        return (i4 + 31) - (i4 | 31);
    }

    public static final <K, V> Object[] insertEntryAtIndex(Object[] objArr, int i2, K k2, V v2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i2, 6, (Object) null);
        ArraysKt.copyInto(objArr, objArr2, i2 + 2, i2, objArr.length);
        objArr2[i2] = k2;
        objArr2[i2 + 1] = v2;
        return objArr2;
    }

    public static final Object[] replaceEntryWithNode(Object[] objArr, int i2, int i3, TrieNode<?, ?> trieNode) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i2, 6, (Object) null);
        ArraysKt.copyInto(objArr, objArr2, i2, i2 + 2, i3);
        objArr2[i3 - 2] = trieNode;
        ArraysKt.copyInto(objArr, objArr2, i3 - 1, i3, objArr.length);
        return objArr2;
    }

    public static final <K, V> Object[] replaceNodeWithEntry(Object[] objArr, int i2, int i3, K k2, V v2) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        ArraysKt.copyInto(objArrCopyOf, objArrCopyOf, i2 + 2, i2 + 1, objArr.length);
        ArraysKt.copyInto(objArrCopyOf, objArrCopyOf, i3 + 2, i3, i2);
        objArrCopyOf[i3] = k2;
        objArrCopyOf[i3 + 1] = v2;
        return objArrCopyOf;
    }

    public static final Object[] removeEntryAtIndex(Object[] objArr, int i2) {
        Object[] objArr2 = new Object[objArr.length - 2];
        ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i2, 6, (Object) null);
        ArraysKt.copyInto(objArr, objArr2, i2, i2 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] removeNodeAtIndex(Object[] objArr, int i2) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i2, 6, (Object) null);
        ArraysKt.copyInto(objArr, objArr2, i2, i2 + 1, objArr.length);
        return objArr2;
    }
}
