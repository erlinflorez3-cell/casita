package com.facebook.react.runtime.internal.bolts;

import com.facebook.react.bridge.UiThreadUtil;
import java.util.concurrent.Executor;
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
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$2\u009aw\u001d߿\u001b9^C\u001eH2W\u0014/\u0015kڷ8$i$BQIV2}P\u000b\u0006R>˯pН^\u000bKƤV$\u0007mDI\u0004z\u0014\u0016e˸DņC3Uڎ\u07b2=f"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006z.DY\u000b)3t_+WJJy}}(h_I\u0016m9\\L", "", "u(E", "\u0017L<\u00127\u0010\u001aBx", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "#HN!;\u0019\u001e/w", "\u0017l\\2W0:b\u0019^\u000e^*\r\u00189r", "#HC5e,:Rx\u0012z\\<\f\u0013<", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Executors {
    public static final Executors INSTANCE = new Executors();
    public static final Executor UI_THREAD = new UIThreadExecutor();
    public static final Executor IMMEDIATE = new ImmediateExecutor();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјljOӄtev-\u0013V֖\u0013k\n4li2r[;\u0004\u001c.&\u0017Rfg\u0016r\u0011nŸG\u0014"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006z.DY\u000b)3t_+WJJy}}(h_I\u0016m9\\5\u000bOTN+`N\u0002=s%Z\f^:\u0017\u0012/", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "u(E", "3wT0h;>", "", "1n\\:T5=", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class ImmediateExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            Intrinsics.checkNotNullParameter(command, "command");
            command.run();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјljOӄtev-\u0013V֖\u0013k\n4li2r[;\u0004\u001c.&\u0017Rfg\u0016r\u0011nŸG\u0014"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006z.DY\u000b)3t_+WJJy}}(h_I\u0016m9\\5\u0017+;Q9\\Nq\u001d'\u0012X\u001e]5\u001aZ", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "u(E", "3wT0h;>", "", "1n\\:T5=", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class UIThreadExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            Intrinsics.checkNotNullParameter(command, "command");
            UiThreadUtil.runOnUiThread(command);
        }
    }

    private Executors() {
    }
}
