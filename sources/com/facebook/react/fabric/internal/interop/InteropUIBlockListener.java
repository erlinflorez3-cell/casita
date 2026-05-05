package com.facebook.react.fabric.internal.interop;

import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.fabric.interop.UIBlock;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import java.util.ArrayList;
import java.util.List;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLcz\u0004I\u0006>*6B\u0015\"4\u0012}\nnjG0LeN/ZS@\u000fs{:(aҕ\bّkUH|b\fҊRgun\u0013f\u0019K'\u0006D\u0002\u001b0W_\u0011]@\u0012zP}JKM\u001eFid\u0003B\u001d `/~\u000eM\u000f(8`\u0010%\u0004sO\u001a\u001eH@\u001fG\u0019!\u0016\u0013(!\u001e>N\nN`uZNH\u001bj\u0001Ck\u000fwRf'\u000e9-Q\u001bPl';y*,9QO5C.\u0004\u0007\u0015^s?1L8QMv59CI\"`f\\\u000e -+}\u001a$\u0007vt\u0013Rx\u00127-_cyS<*N\u07bf}Ɂ@\n\u0016ͺ?J41(kX&Az\u000bYPR\u0012^p\u0003)c\rЎ'ő71Aӕ~SgB'S҂\u007f\u0018"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW@\u007f45f\u0007\u001c>7\u001a7\\CHu?gxqp9\u0014m7>Z\u0004NVL2CV\u0001L\u0014\u001bZ\u001b$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW,Z\r1by\"7z|2[R;t4+j", "u(E", "/ec2e\u001c\"0 \txd:", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW@\u007f45f\b+\u0001]y\u000bTM9q\n", "5dc\u000eY;>`\tbWe6z\u000f=$l(w>\u0010r F|\u0018@u\u001fBY\u0005 3{\u0016", "u(;7T=:\u001d)\u000e~euc\r=tU", "0dU<e,.7u\u0006\u0005\\2\u000b", "5dc\u000fX-H`\u0019n^;3\u0007\u00075s>\u0015{<~&rPn\u001bFz$/f}'7i$.", "/cS\"<\tE]\u0017\u0005", "", "0k^0^", "2hS\u0011\\:IO(|}F6\r\u0012>I\u000f(\u0004N", "Ch<.a(@S&", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW,Z\r1by\"7zk", "2hS\u001ab<Gb|\u000ezf:", "2hS V/>R)\u0006zF6\r\u0012>I\u000f(\u0004N", ">qT=X5=C|[\u0002h*\u0003", "Eh[970L^\u0015\u000exa\u001d\u0001\tAU\u000b'wO\u0001%", "Eh[9@6N\\(b\n^4\u000b", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class InteropUIBlockListener implements UIManagerListener {
    private final List<UIBlock> beforeUIBlocks = new ArrayList();
    private final List<UIBlock> afterUIBlocks = new ArrayList();

    public final synchronized void addUIBlock(UIBlock block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.afterUIBlocks.add(block);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        didMountItems(uiManager);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        if (this.afterUIBlocks.isEmpty()) {
            return;
        }
        for (UIBlock uIBlock : this.afterUIBlocks) {
            if (uiManager instanceof UIBlockViewResolver) {
                uIBlock.execute((UIBlockViewResolver) uiManager);
            }
        }
        this.afterUIBlocks.clear();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    public final List<UIBlock> getAfterUIBlocks$ReactAndroid_release() {
        return this.afterUIBlocks;
    }

    public final List<UIBlock> getBeforeUIBlocks$ReactAndroid_release() {
        return this.beforeUIBlocks;
    }

    public final synchronized void prependUIBlock(UIBlock block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.beforeUIBlocks.add(block);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        willMountItems(uiManager);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        if (this.beforeUIBlocks.isEmpty()) {
            return;
        }
        for (UIBlock uIBlock : this.beforeUIBlocks) {
            if (uiManager instanceof UIBlockViewResolver) {
                uIBlock.execute((UIBlockViewResolver) uiManager);
            }
        }
        this.beforeUIBlocks.clear();
    }
}
