package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.TextRange;
import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: compiled from: TransformedTextFieldState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<;!&i\u0016DLш|\u0004O\f8é6B\u0015\"4\u0012\u000e\u0007njO0Le^.ZS0\u0012\u0004XBřs$8B[W Ԃ0\bwN\u0016g\u001fNh\f[\u000f4\u0018)%:Lm/m\u0014\u001f2ptOD]~k?žx@\u000b'B(>\u0002\u0015\u0003 0n\u0019\u0007\fSZ:\u0018ضDz@Y\u001dS\u000b\"\"\bD&'(li^6\u000fk\f>u\u074b\tݦFN5j݇\u0001Y"}, d2 = {"5dc\u0016a+>f\b\fvg:}\u0013<m{7\u007fJ\n\u0006+Ro", Global.BLANK, "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u001a", "BqP;f-H`!~yJ<|\u0016CI\t'{S", "", "=mA2f<Eb", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PG5Mv:6YJ5jS|J\u001c\u000ei\u0012X4{\u0019dAy", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "Cmc?T5LT#\f\u0003^+", "@dc?T5LT#\f\u0003^+", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001b[r0UMX9dRq,\u0014%inR+\u0014\u0004GP }D\r\u0003n2S\u0011Bl\nU\u001b\u001f=4qR_\u000eV}\u001f~OrIVb]\tKKN0\u007f(rd\u0019m6\u0004+\u0010z\u001bdRM3\nybf", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TransformedTextFieldStateKt {
    public static final <R> R getIndexTransformationType(TransformedTextFieldState transformedTextFieldState, int i2, Function3<? super IndexTransformationType, ? super TextRange, ? super TextRange, ? extends R> function3) {
        IndexTransformationType indexTransformationType;
        long jM1566mapFromTransformedjx7JFs = transformedTextFieldState.m1566mapFromTransformedjx7JFs(i2);
        long jM1569mapToTransformedGEjPoXI = transformedTextFieldState.m1569mapToTransformedGEjPoXI(jM1566mapFromTransformedjx7JFs);
        if (TextRange.m6117getCollapsedimpl(jM1566mapFromTransformedjx7JFs) && TextRange.m6117getCollapsedimpl(jM1569mapToTransformedGEjPoXI)) {
            indexTransformationType = IndexTransformationType.Untransformed;
        } else if (!TextRange.m6117getCollapsedimpl(jM1566mapFromTransformedjx7JFs) && !TextRange.m6117getCollapsedimpl(jM1569mapToTransformedGEjPoXI)) {
            indexTransformationType = IndexTransformationType.Replacement;
        } else if (TextRange.m6117getCollapsedimpl(jM1566mapFromTransformedjx7JFs) && !TextRange.m6117getCollapsedimpl(jM1569mapToTransformedGEjPoXI)) {
            indexTransformationType = IndexTransformationType.Insertion;
        } else {
            indexTransformationType = IndexTransformationType.Deletion;
        }
        return function3.invoke(indexTransformationType, TextRange.m6111boximpl(jM1566mapFromTransformedjx7JFs), TextRange.m6111boximpl(jM1569mapToTransformedGEjPoXI));
    }
}
