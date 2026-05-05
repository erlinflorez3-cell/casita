package com.facebook.react.animated;

import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.common.ViewUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
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
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0LeN/ZS8\u0015sڔ<$q$yّCU0}*ޛWNu\u000bvJh\u0017KƤ\u000e\u0016\u0007j4I[}c܈%˰rom2\u000e\u0003M=ntN\u0005N32<\b\u0007\u0019\u001aXKǘzzQOT(>R\t:\u0001 }\t(&\u001e>N\u000bNbucNJ\u0003\\h;k\u000fwXf'\u000eC-Q\u001bZl';\u0001*$9WO5C6\u001a\u0017OViW\u001b? PMl5@CI\"j\u0007i\u000e\u0019--e\f\fx\\!ԇUd$)1VqS!\u001a6\u0001\u0013{;FZ\u05fd\u0012όL.5Կ7\u0016\u001c>\rti?~\u000e5ې\fѐe6\u001fӛP?9;3f\u007fd\u0012ύPѼ\u007f\u0005\u0015̔s\r|.sT<nkÔVɐU1Y̵\u000e`\\\u0019qI}\u0006\u0001b0;\u00142W\u007f]\u0006?>m©9٦=#)ǽɞL^"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0010Bc\t.\u0013v\u001a6IR;j\u001d(\u0014h7", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0001>]\u0006\u001cFm\u0015\u0017WB;A", "1n]3\\.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "<`c6i,\u001a\\\u001d\u0007vm,{q9d\u007f6c<\n\u0013\u0019G|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u000e1h\u000217I\u001f2U?Jk3\u0007\u001fgaGn_5Jx'T\"", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1Xy\u001d>m}*X\u0019\"i>&^i]7\u0007`6X|pTLJ*k\u001cnF\u0018\u001aV\u001dN*VmUP(\u007fD\u0013(\f4E\u0011;gi\u0016\u0015\u000eCRlKR\u0012G\u0007j92", "1n];X*MS\u0018o~^>", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5dc\u0010b5GS\u0017\u000ez]\u001d\u0001\tA", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "1n];X*MS\u0018o~^>k\u00051", "", "1n];X*MS\u0018o~^>ll\u0017a\t$}@\u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW,Z\r1by\"7zk", ">q^=@(I", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW!r61C\u0007'KU\u00129#", ">q^=A6=S\u0001z\u0006i0\u0006\u000b", "", "", "1n];X*MB#o~^>", "", "DhTDG(@", "Ch<.a(@S&", "2hb0b5GS\u0017\u000e[k6\u0005y3e\u0012", ">qTAg@)`\u001d\b\n", "@dbAb9>2\u0019\u007fvn3\fy+l\u0010(\n", "CoS.g,/W\u0019\u0011", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class PropsAnimatedNode extends AnimatedNode {
    private int connectedViewTag;
    private UIManager connectedViewUIManager;
    private final NativeAnimatedNodesManager nativeAnimatedNodesManager;
    private final JavaOnlyMap propMap;
    private final Map<String, Integer> propNodeMapping;

    public PropsAnimatedNode(ReadableMap config, NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.connectedViewTag = -1;
        this.propMap = new JavaOnlyMap();
        ReadableMap map = config.getMap("props");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map != null ? map.keySetIterator() : null;
        this.propNodeMapping = new LinkedHashMap();
        while (readableMapKeySetIteratorKeySetIterator != null && readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            this.propNodeMapping.put(strNextKey, Integer.valueOf(map.getInt(strNextKey)));
        }
    }

    public final void connectToView(int i2, UIManager uIManager) {
        if (this.connectedViewTag == -1) {
            this.connectedViewTag = i2;
            this.connectedViewUIManager = uIManager;
        } else {
            throw new JSApplicationIllegalArgumentException("Animated node " + this.tag + " is already attached to a view: " + this.connectedViewTag);
        }
    }

    public final void disconnectFromView(int i2) {
        int i3 = this.connectedViewTag;
        if (i3 == i2 || i3 == -1) {
            this.connectedViewTag = -1;
        } else {
            throw new JSApplicationIllegalArgumentException("Attempting to disconnect view that has not been connected with the given animated node: " + i2 + " but is connected to view " + this.connectedViewTag);
        }
    }

    public final View getConnectedView() {
        Object objM8980constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            PropsAnimatedNode propsAnimatedNode = this;
            UIManager uIManager = this.connectedViewUIManager;
            objM8980constructorimpl = Result.m8980constructorimpl(uIManager != null ? uIManager.resolveView(this.connectedViewTag) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
        }
        return (View) (Result.m8986isFailureimpl(objM8980constructorimpl) ? null : objM8980constructorimpl);
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public String prettyPrint() {
        return "PropsAnimatedNode[" + this.tag + "] connectedViewTag: " + this.connectedViewTag + " propNodeMapping: " + this.propNodeMapping + " propMap: " + this.propMap;
    }

    public final void restoreDefaultValues() {
        int i2 = this.connectedViewTag;
        if (i2 == -1 || ViewUtil.getUIManagerType(i2) == 2) {
            return;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = this.propMap.keySetIterator();
        Intrinsics.checkNotNullExpressionValue(readableMapKeySetIteratorKeySetIterator, "keySetIterator(...)");
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            this.propMap.putNull(readableMapKeySetIteratorKeySetIterator.nextKey());
        }
        UIManager uIManager = this.connectedViewUIManager;
        if (uIManager != null) {
            uIManager.synchronouslyUpdateViewOnUIThread(this.connectedViewTag, this.propMap);
        }
    }

    public final void updateView() {
        if (this.connectedViewTag == -1) {
            return;
        }
        for (Map.Entry<String, Integer> entry : this.propNodeMapping.entrySet()) {
            String key = entry.getKey();
            AnimatedNode nodeById = this.nativeAnimatedNodesManager.getNodeById(entry.getValue().intValue());
            if (nodeById == null) {
                throw new IllegalArgumentException("Mapped property node does not exist".toString());
            }
            if (nodeById instanceof StyleAnimatedNode) {
                ((StyleAnimatedNode) nodeById).collectViewUpdates(this.propMap);
            } else if (nodeById instanceof ValueAnimatedNode) {
                ValueAnimatedNode valueAnimatedNode = (ValueAnimatedNode) nodeById;
                Object animatedObject = valueAnimatedNode.getAnimatedObject();
                if (animatedObject instanceof Integer) {
                    this.propMap.putInt(key, ((Number) animatedObject).intValue());
                } else if (animatedObject instanceof String) {
                    this.propMap.putString(key, (String) animatedObject);
                } else {
                    this.propMap.putDouble(key, valueAnimatedNode.getValue());
                }
            } else if (nodeById instanceof ColorAnimatedNode) {
                this.propMap.putInt(key, ((ColorAnimatedNode) nodeById).getColor());
            } else {
                if (!(nodeById instanceof ObjectAnimatedNode)) {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + nodeById.getClass());
                }
                ((ObjectAnimatedNode) nodeById).collectViewUpdates(key, this.propMap);
            }
        }
        UIManager uIManager = this.connectedViewUIManager;
        if (uIManager != null) {
            uIManager.synchronouslyUpdateViewOnUIThread(this.connectedViewTag, this.propMap);
        }
    }
}
