package androidx.compose.foundation.text.input;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: compiled from: InputTransformation.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b<M\u0007\"B\u0012\u007f\u0007lqA0RnP\u008cZS8şsڔ<$i*yّCU(\n*ޛWNugvJp\u000bKƤ\fǠ~\u0001ߚyU'\\RJBv}?K}\u007fNIo#8ӯ$<(;\n\u000b\u0007\u001e:J\u0016|!H[\u001d\"?nrĐV\u0017S\b*\u0018\fB0\u0003$b\u000eTFJ|]h1Q\u0004ݦFN5fx4[\u0017^\u00057\u001e\u0007pL-Ë;?\u001b(c\t\rVkA\tE\u0018B\u0015y76YKָ[@^\u0003$\u001b1S\u001d_x,\u0003\u000bab\u001c'YQ\u0012L\u0017˲)@<\n\u0018T\u0004<ͺW~4-(f >C\u0006\u0003bnRؿbL\u0006}q<\u001d)\u001051?AkarK(|9߉\t\u0017$&\u0011t'_d\u0010f\u001bAZ\bSAQn?vOPն<6\u0015~n\u001a*2=w\u0006=\n)0-$ej\u007fّ\"4\tVT\u007fv3q/\u061ch\u001bNN4\u0007\u0016e=O #Nr\u0019\u0004P\u0003mT\u0011{2\u001b\u001bNG! t(L25\u001f|QŹmtS`\u001a+5jG[tq4\\IoCD\u007feߧe\\|\u0017OBh\thhHY2`l*22vl>xԞHT\u0014ƎJAw$B5֤\u001ds"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r\u001ft?.$Wn5\u0010q-X\u0004/C[R6e/\u0007.\u0010\u0019j\u000e$", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r\u001ft?.$Wn5\u0010q-X\u0004/C[R6e(", "BqP;f-H`!z\nb6\u0006", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1ta?X5M", ">q^=b:>R", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc(", "5dc!e(Ga\u001a\t\bf(\f\r9n", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "BqP;f-H`!b\u0004i<\f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006@<Ow'T\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class InputTransformationByValue implements InputTransformation {
    private final Function2<CharSequence, CharSequence, CharSequence> transformation;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputTransformationByValue copy$default(InputTransformationByValue inputTransformationByValue, Function2 function2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            function2 = inputTransformationByValue.transformation;
        }
        return inputTransformationByValue.copy(function2);
    }

    public final Function2<CharSequence, CharSequence, CharSequence> component1() {
        return this.transformation;
    }

    public final InputTransformationByValue copy(Function2<? super CharSequence, ? super CharSequence, ? extends CharSequence> function2) {
        return new InputTransformationByValue(function2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InputTransformationByValue) && Intrinsics.areEqual(this.transformation, ((InputTransformationByValue) obj).transformation);
    }

    public int hashCode() {
        return this.transformation.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InputTransformationByValue(Function2<? super CharSequence, ? super CharSequence, ? extends CharSequence> function2) {
        this.transformation = function2;
    }

    public final Function2<CharSequence, CharSequence, CharSequence> getTransformation() {
        return this.transformation;
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(TextFieldBuffer textFieldBuffer) {
        TextFieldCharSequence textFieldCharSequenceM1438toTextFieldCharSequenceudt6zUU$foundation_release$default = TextFieldBuffer.m1438toTextFieldCharSequenceudt6zUU$foundation_release$default(textFieldBuffer, 0L, null, 3, null);
        CharSequence charSequenceInvoke = this.transformation.invoke(textFieldBuffer.getOriginalValue$foundation_release(), textFieldCharSequenceM1438toTextFieldCharSequenceudt6zUU$foundation_release$default);
        if (charSequenceInvoke == textFieldCharSequenceM1438toTextFieldCharSequenceudt6zUU$foundation_release$default) {
            return;
        }
        if (charSequenceInvoke == textFieldBuffer.getOriginalValue$foundation_release()) {
            textFieldBuffer.revertAllChanges();
        } else {
            textFieldBuffer.setTextIfChanged$foundation_release(charSequenceInvoke);
        }
    }

    public String toString() {
        return "InputTransformation.byValue(transformation=" + this.transformation + ')';
    }
}
