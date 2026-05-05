package kotlin.text;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<;!&i\u0016DLc\u000b\u0004Iي8\u000b<Q\u0007\":\u001d\u007f\u0007ljA0ReP.XS2\u000f\u0002{<$a$yCI_\"}(\tWNumvJ`\f[B\u0014ǝ\u0011jrHu\u0003c܈\u001d1jsm36o\u001c:\tt|\u0004PF0:\u0012\u000f\u0011 0G x\u0011By\u0010@3`rPQ;Qŋ\u001e\u0012\u0014C88,b\u007fNdO\r_@ǂ1\u0002\u0012F|'H0[N=Jb/%v(\u001d[RE>-3c\u0005\u0017R\">\u0013A\u0002=3l=&YS:Ɏ͏\\\u007f\" Cb\u001bi\u000b*\u000b\u0005:`j(SS\u0012K9\u000e\u0007xAԐ\u0013T\u001f\u001c\u0012?L\\-\u0003ff\u000f[x!S)P`_r\u0004\tcN\u0017S\ryڇ?3\u0004_mS\u001d|7d\u0005k\u001fK\u0005\u001d!DTlaE!byi3g?kL\u0015˫_U#\u0012~z\u0002p\u0003PQ\u0006\u07fc\n\u0010V\u001bS7D9\u0002\"\u0014\u0002\u000fC\u0018z\u0013b\u0001S\u0018VxD0}.7X\u0019<^Ru\u001dk~d\u001f1ҭQ\u001cb\u0019ċ\f&"}, d2 = {"/o_2a+", "\"", "\u001aiPCTuEO\"\u0001D:7\b\t8d{%\u0003@V", "\u001aj^A_0G\u001d(~\u000emuX\u0014:e\t'w=\b\u0017l", "D`[BX", "", "", "uKY.i(\bZ\u0015\b|(\b\b\u0014/n~$xG\u0001l\r.t\nMrn<U\u0007\"\u0001K\u0019*Z1;wD\u001e\u001efa\u000fJJ1J\b#\u0011SJ5^\u001cNH\u001f\u0012c\rJ(\u0014\u0005/", "/o_2a+\u001eZ\u0019\u0007zg;", "", "3kT:X5M", "BqP;f-H`!", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKY.i(\bZ\u0015\b|(\b\b\u0014/n~$xG\u0001l}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011R:($oeBPh=V@(WUL;`\\{K]rj\u0017L:\u0011\u000fb\ry25", "/o_2a+%W\"~", "", "/o_2a++O\"\u0001z", "AsP?g\u0010GR\u0019\u0012", "", "3mS\u0016a+>f", "uKY.i(\bZ\u0015\b|(\b\b\u0014/n~$xG\u0001l}Lk\u001f8@,1b\u007fi\u0015p\u0012;;CG{4'\u0013h7\u001dj'\u0013Sr8C\u0016U(eT<\u0019\u001f\u001dZ\u0017M'\n\fY\u0017", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{@0B=v\u001a:7-1)4\u000b3")
public class StringsKt__AppendableKt {
    public static final <T extends Appendable> T append(T t2, CharSequence... value) throws IOException {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        for (CharSequence charSequence : value) {
            t2.append(charSequence);
        }
        return t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void appendElement(Appendable appendable, T t2, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        if (function1 != null) {
            appendable.append(function1.invoke(t2));
            return;
        }
        if (t2 == 0 ? true : t2 instanceof CharSequence) {
            appendable.append((CharSequence) t2);
        } else if (t2 instanceof Character) {
            appendable.append(((Character) t2).charValue());
        } else {
            appendable.append(String.valueOf(t2));
        }
    }

    private static final Appendable appendLine(Appendable appendable) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append('\n');
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        return appendableAppend;
    }

    private static final Appendable appendLine(Appendable appendable, char c2) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append(c2);
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        Appendable appendableAppend2 = appendableAppend.append('\n');
        Intrinsics.checkNotNullExpressionValue(appendableAppend2, "append(...)");
        return appendableAppend2;
    }

    private static final Appendable appendLine(Appendable appendable, CharSequence charSequence) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        Appendable appendableAppend2 = appendableAppend.append('\n');
        Intrinsics.checkNotNullExpressionValue(appendableAppend2, "append(...)");
        return appendableAppend2;
    }

    public static final <T extends Appendable> T appendRange(T t2, CharSequence value, int i2, int i3) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        T t3 = (T) t2.append(value, i2, i3);
        Intrinsics.checkNotNull(t3, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t3;
    }
}
