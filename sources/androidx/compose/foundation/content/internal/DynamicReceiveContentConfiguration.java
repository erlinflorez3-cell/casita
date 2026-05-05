package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.ReceiveContentNode;
import androidx.compose.foundation.content.TransferableContent;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: ReceiveContentConfiguration.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007ln?ӄZ͜x.\u0001Rj\u001a{\u007fB$s$ DтY\u001a\f$QW\\p\u007fp`Y9GU\u0006f\u000bx/aU'ahƘ4ԲsE;ݹ\b??e\u0003<U/@\"Py3\u0002ʀ.N\u0018͌\u0013EQ\u0013 8ϴtD"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r @|_2VR;x=\u001a\u001c2@M\u0010_4Rt\u0014GJN0mRPG\u001d!Z\u0017]\t\u0017\u000eZE&~Q3.\f6RW", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r @|_2VR;x=\u001a\u001c2N9\u0005c0_v\u0005QU],eaPG\u001d\u0013^\u0010^8\t\u0014]K-D", "@dR2\\=>1#\b\n^5\fq9d\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r @|_\u001bMA;oE\u001errjH\u0007l;7\u0001&G\"", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn3c\u0007/7v%w:C9k8/\u0015FkB\u0016c5]_1FL$oM", "@dR2\\=>1#\b\n^5\fo3s\u000f(\u0005@\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r @|_\u001bMA;oE\u001errjH\u0007l;5z5VLW,i(", "5dc\u001fX*>W*~Xh5\f\t8tf,\nO\u0001 \u0017T", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~W\b)Fm\u001f=\u00170;i4\"&h?C\u0010r,W\u0006\u000eKZ],eR\u007f\u0013", "5dc\u001fX*>W*~Xh5\f\t8th2z@", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~W\b)Fm\u001f=\u00170;i4\"&h?C\u0010r,W\u0006\u0010QKN\u0002", "5dc\u001dT9>\\(kz\\,\u0001\u001a/C\n1\u000b@\n&}K}\u001d<\u007f%B", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DynamicReceiveContentConfiguration extends ReceiveContentConfiguration {
    public static final int $stable = 8;
    private final ReceiveContentListener receiveContentListener = new ReceiveContentListener() { // from class: androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration$receiveContentListener$1
        private int nodeEnterCount;

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public void onDragStart() {
            this.nodeEnterCount = 0;
            this.this$0.getReceiveContentNode().getReceiveContentListener().onDragStart();
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public void onDragEnd() {
            this.this$0.getReceiveContentNode().getReceiveContentListener().onDragEnd();
            this.nodeEnterCount = 0;
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public void onDragEnter() {
            int i2 = this.nodeEnterCount + 1;
            this.nodeEnterCount = i2;
            if (i2 == 1) {
                this.this$0.getReceiveContentNode().getReceiveContentListener().onDragEnter();
            }
            ReceiveContentListener parentReceiveContentListener = this.this$0.getParentReceiveContentListener();
            if (parentReceiveContentListener != null) {
                parentReceiveContentListener.onDragEnter();
            }
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public void onDragExit() {
            int i2 = this.nodeEnterCount;
            int iCoerceAtLeast = RangesKt.coerceAtLeast(i2 - 1, 0);
            this.nodeEnterCount = iCoerceAtLeast;
            if (iCoerceAtLeast == 0 && i2 > 0) {
                this.this$0.getReceiveContentNode().getReceiveContentListener().onDragExit();
            }
            ReceiveContentListener parentReceiveContentListener = this.this$0.getParentReceiveContentListener();
            if (parentReceiveContentListener != null) {
                parentReceiveContentListener.onDragExit();
            }
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public TransferableContent onReceive(TransferableContent transferableContent) {
            TransferableContent transferableContentOnReceive = this.this$0.getReceiveContentNode().getReceiveContentListener().onReceive(transferableContent);
            if (transferableContentOnReceive == null) {
                return null;
            }
            ReceiveContentListener parentReceiveContentListener = this.this$0.getParentReceiveContentListener();
            return parentReceiveContentListener == null ? transferableContentOnReceive : parentReceiveContentListener.onReceive(transferableContentOnReceive);
        }
    };
    private final ReceiveContentNode receiveContentNode;

    public final ReceiveContentNode getReceiveContentNode() {
        return this.receiveContentNode;
    }

    public DynamicReceiveContentConfiguration(ReceiveContentNode receiveContentNode) {
        this.receiveContentNode = receiveContentNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReceiveContentListener getParentReceiveContentListener() {
        ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.receiveContentNode);
        if (receiveContentConfiguration != null) {
            return receiveContentConfiguration.getReceiveContentListener();
        }
        return null;
    }

    @Override // androidx.compose.foundation.content.internal.ReceiveContentConfiguration
    public ReceiveContentListener getReceiveContentListener() {
        return this.receiveContentListener;
    }
}
