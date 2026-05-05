package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0ReP\u008cZS@\u000fsڔ<$q$yCAU0ԂR\u0015_Vwm~Lj\u000bq\u00104\u0016'idH`9p\"\u001b@D\bGCQ\u007f?O_#93\u001fݨ&8\b\tI<8M(v)I{\u001c 7X|JZ\u001dS\u0015\u001c\"\u0006l!/\u001e\u000bo~:Vuu:]-I}\u0013b5aH\u0005]\u0011VV=\f%dL*\u0017ʽ7չ)S\u000bޗҡ_K"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w:CCuE\u001exp];\u0007R9J\u007f5HV[4DR\u00029r\u000ei\n98\u0017\u0004i?${\u001a", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u7", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#['A{\u0016*JJ;X4\u001f\u0015uaB\u0005c\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006a/?`}\u001f\u0014\u0002%.*S<l4+j", "7m_Bg\u0017K]\u0018\u000fx^9", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0017v\u00148LC:O<\u001a\u0017h7", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@0Bc|05m#<\u0017.Hu3.\u0013hn\u000fJT", ">q^1h*>@\u0019\r\u000be;\u000b", "", "1n]@h4>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w+MDyD&\u0015u7", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u?C\u0010r,a\u0006|", " d\\<i,\"[\u0015\u0001zM9x\u0012=f\n5\u0004(\u0001&\u0013&k\u001d8T/>g\u000e(7z", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RemoveImageTransformMetaDataProducer implements Producer<CloseableReference<PooledByteBuffer>> {
    private final Producer<EncodedImage> inputProducer;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jA0JeP.`S2\u000fq{<$i*yّA٨\u001c\u0014̝9c^kwp`Y9C\u001f\u000e&~z.YU'_@\u0010`A0VC]}@Ql\u0005>\u0015&B$Hy3\u0003H+v\u0014ͯ~CY\u0011ZHNvRR;T5  \u000eV\"\u0017\u001d\u000bg~:Vuu:]-I{ŒR2"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w:CCuE\u001exp];\u0007R9J\u007f5HV[4DR\u00029r\u000ei\n98\u0017\u0004i?${\u0003$\u001f\u00106Z\u0002\u001fp|\u000e\u0016|BfyPW\u001aT\u0002|uP%GBh[WQJSr2d\u00195", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w,CBk6\u001a$lj;dm5\\\u0007/GY$", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0017v\u00148LC:O<\u001a\u0017h7", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#['A{\u0016*JJ;X4\u001f\u0015uaB\u0005c\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006a/?`}\u001f\u0014\u0002%.*S<l4+j", "1n]@h4>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w+MDyD&\u0015u7", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@0Bc|05m#<\u00170;s>/\u0015Li5\tc\u001b[r0UMX9d:rL\u0010pV\u001dJ\u0016\u001a\u000fXQ\"nQ\r\u0006\u00066QK<d~\f\u0013\u0018?p:F^\fIy yL)oJb_CRNOa:b\fl+&\u0018D-\"\u0002!\u001bu&qz", "=m=2j\u0019>a)\u0006\nB4\b\u0010", "", "<df\u001fX:NZ(", "AsPAh:", "", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class RemoveImageTransformMetaDataConsumer extends DelegatingConsumer<EncodedImage, CloseableReference<PooledByteBuffer>> {
        final /* synthetic */ RemoveImageTransformMetaDataProducer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoveImageTransformMetaDataConsumer(RemoveImageTransformMetaDataProducer removeImageTransformMetaDataProducer, Consumer<CloseableReference<PooledByteBuffer>> consumer) {
            super(consumer);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            this.this$0 = removeImageTransformMetaDataProducer;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.BaseConsumer
        public void onNewResultImpl(EncodedImage encodedImage, int i2) {
            CloseableReference<PooledByteBuffer> byteBufferRef = null;
            try {
                if (EncodedImage.isValid(encodedImage) && encodedImage != null) {
                    byteBufferRef = encodedImage.getByteBufferRef();
                }
                getConsumer().onNewResult(byteBufferRef, i2);
            } finally {
                CloseableReference.closeSafely(byteBufferRef);
            }
        }
    }

    public RemoveImageTransformMetaDataProducer(Producer<EncodedImage> inputProducer) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        this.inputProducer = inputProducer;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<CloseableReference<PooledByteBuffer>> consumer, ProducerContext context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.inputProducer.produceResults(new RemoveImageTransformMetaDataConsumer(this, consumer), context);
    }
}
