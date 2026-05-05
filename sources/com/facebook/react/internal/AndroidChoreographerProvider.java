package com.facebook.react.internal;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.internal.ChoreographerProvider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005#2 w\u001d߿\u001b9^C\u001eG2\u0013X0\u000fө\u007f42[lwQ<m\u001a,$Oc\u0017muqbZ9¼U\u000bȆ|o"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@\u0001>X\u000b*;ls1WP;u6+\u0011sd9\u0014N9X\b+FL[\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@\u00038c\u000b Ao#*XF;x\u001f+\u001fye8\u0007p\u0002", "u(E", "5dc\u0010[6KS#\u0001\bZ7\u007f\t<", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@\u00038c\u000b Ao#*XF;x\u001f+\u001fye8\u0007pj,y1TLX.iN}@\u0014\u001f0", "5dc\u0016a:MO\"|z", "\u000fmS?b0=1\u001c\t\b^6~\u0016+p\u0003(\t", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class AndroidChoreographerProvider implements ChoreographerProvider {
    public static final AndroidChoreographerProvider INSTANCE = new AndroidChoreographerProvider();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0012\u007fјnjO0LeN.XS@ş\u001c{b#\u001c'ڱG;c\u001aF0\u0017Rfg\u0016rz^\u0019H'\u0006D~1@\u0012c\u0007d*\u000f`F CAR\b=gf;JU,@#Py3\u0003pݕJǘzzKŷñ\u00168"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@\u0001>X\u000b*;ls1WP;u6+\u0011sd9\u0014N9X\b+FL[j8[qJ\u001e\u0016YkQ5\u001a\u0005cC1jO:\u001f\u0015\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@\u00038c\u000b Ao#*XF;x\u001f+\u001fye8\u0007pj,y1TLX.iN}@\u0014\u001f0", "u(E", "7mbAT5<S", "\u001a`]1e6BRb\u0010~^>Ff2o\r(\u0006B\u000e\u0013\"Jo\u001b\u0012", ">nbA99:[\u0019\\ve3y\u0005-k", "", "1`[9U(<Y", "\u001a`]1e6BRb\u0010~^>Ff2o\r(\u0006B\u000e\u0013\"Jo\u001bzW21a}}3t\u001d+IAAA", "@d\\<i,\u001f`\u0015\u0007z<(\u0004\u0010,a}.", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class AndroidChoreographer implements ChoreographerProvider.Choreographer {
        private final Choreographer instance;

        public AndroidChoreographer() {
            Choreographer choreographer = Choreographer.getInstance();
            Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance(...)");
            this.instance = choreographer;
        }

        @Override // com.facebook.react.internal.ChoreographerProvider.Choreographer
        public void postFrameCallback(Choreographer.FrameCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.instance.postFrameCallback(callback);
        }

        @Override // com.facebook.react.internal.ChoreographerProvider.Choreographer
        public void removeFrameCallback(Choreographer.FrameCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.instance.removeFrameCallback(callback);
        }
    }

    private AndroidChoreographerProvider() {
    }

    @JvmStatic
    public static final AndroidChoreographerProvider getInstance() {
        return INSTANCE;
    }

    @Override // com.facebook.react.internal.ChoreographerProvider
    public ChoreographerProvider.Choreographer getChoreographer() {
        UiThreadUtil.assertOnUiThread();
        return new AndroidChoreographer();
    }
}
