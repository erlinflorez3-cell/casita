package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import com.facebook.react.uimanager.events.TouchEvent;
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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r(4ߚ\u007f\u0007t\tAӄLe^.ZS0\u000fs{B$c$wDCU0}*ޛWNupvJ`\u000eK\u000f\u001c\u0016\u0001̓4Ikxe\u0012\u00152HģU\u074c}ok8!\u001eF\t.2:8(\u0006\u0011\u001e8J(v)F[\u0016 4XvJT\u001dM3\u001b@\u000bN$\u000f$tg|=Ղp]H7k+wKf'\u000e:-Q\u001bQl';y\u0012\"9LO5C(\u0004\u0007\u0015Rs?1@\"C\u0013u?)AH\"e|lHT#4g\r\f|V`\u0013\\x\fU.\u007fgY\\&(&},\u0011J\u0004&\u0006UI^1(u \u000ea\u0005#WNa\u001a^p\u0003+gD$=\u0002I*g)\u0017UoM1Ne~K!fC\u000fw9[\u0003\u0018\u0011\u0019)g\u0010Q_TpAVN\"Ykn4vp\u000fB\u0006FF.=B%v%3Ks9Q+\u001c\u0006VY\u007fv3v/g2pVT:nDAZ\r\u001aZ\\d3l\u0001XfC)MJl7\u0002\u0016,8\\&Tg9`^]h\u0002j{^@)mj\u000eղz«\u0012WAӔ\u0004G_g(gbx$?jc3]=̾U۱^\\0ί\u0003Xx\u0016\u0010{rUBƎpŭHʋ@Ϝ5\u0019dé\u0019\u0013,DY|7b\u0011ӐNз+՞0ғm$|էɿTv"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0005FY\u0007/\u0013v\u001a6IR?u=|\"lr9\u00149", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u001b+2#u3\u001e\"qAJ\u0007l;.~+V[N92", "3uT;g\u0015:[\u0019", "", "DhTDG(@", "", "3uT;g\u0017:b\u001c", "", "D`[BX\u0015HR\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u00161`\u000e \u0013v\u001a6IR;j\u001d(\u0014h7", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'\u0006\u0013(C9\u001eKz,~@\u0002.FC|,WK\u0005l0\u001c\u0015ekC\r-9Nr%V\u0016J5`ZnL\u0014\u0011$~J2\u001d\u00055J(v@F\u001f\u0007\u0015S\u0001;>D|", "@dR2\\=>3*~\u0004m", "", "Ata3T*>7\u0018", "B`a4X;-O\u001b", "3uT;g", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7U\u00129#", "1`]\u0010b(ES'|z>=|\u0012>", "", "1tbAb4\u001c]\u0015\u0006zl*|n/y", "1`c2Z6Kg", "B`a4X;+S\u0015|\nM(~", "@dR2\\=>B#\u000fxa,\u000b", "Bnd0[\fOS\"\u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u001dWS9n\u0014/\u0015qp\u000f", "Bnd0[,L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7I#;IW\u0011", "1gP;Z,=7\"}~\\,\u000b", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class EventAnimationDriver implements RCTModernEventEmitter {
    public String eventName;
    private final List<String> eventPath;
    public ValueAnimatedNode valueNode;
    public int viewTag;

    public EventAnimationDriver(String eventName, int i2, List<String> eventPath, ValueAnimatedNode valueNode) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventPath, "eventPath");
        Intrinsics.checkNotNullParameter(valueNode, "valueNode");
        this.eventName = eventName;
        this.viewTag = i2;
        this.eventPath = eventPath;
        this.valueNode = valueNode;
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i2, int i3, String eventName, WritableMap writableMap) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        receiveEvent(i2, i3, eventName, false, 0, writableMap, 2);
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i2, int i3, String eventName, boolean z2, int i4, WritableMap writableMap, int i5) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (writableMap == null) {
            throw new IllegalArgumentException("Native animated events must have event data.".toString());
        }
        WritableMap map = writableMap;
        int size = this.eventPath.size() - 1;
        ReadableArray array = null;
        for (int i6 = 0; i6 < size; i6++) {
            if (map != null) {
                String str = this.eventPath.get(i6);
                ReadableType type = map.getType(str);
                if (type == ReadableType.Map) {
                    map = map.getMap(str);
                    array = null;
                } else {
                    if (type != ReadableType.Array) {
                        throw new UnexpectedNativeTypeException("Unexpected type " + type + " for key '" + str + "'");
                    }
                    array = map.getArray(str);
                    map = null;
                }
            } else {
                int i7 = Integer.parseInt(this.eventPath.get(i6));
                ReadableType type2 = array != null ? array.getType(i7) : null;
                if (type2 == ReadableType.Map) {
                    map = array != null ? array.getMap(i7) : null;
                    array = null;
                } else {
                    if (type2 != ReadableType.Array) {
                        throw new UnexpectedNativeTypeException("Unexpected type " + type2 + " for index '" + i7 + "'");
                    }
                    array = array != null ? array.getArray(i7) : null;
                    map = null;
                }
            }
        }
        String str2 = this.eventPath.get(r1.size() - 1);
        if (map != null) {
            this.valueNode.nodeValue = map.getDouble(str2);
            return;
        }
        this.valueNode.nodeValue = array != null ? array.getDouble(Integer.parseInt(str2)) : 0.0d;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i2, String eventName, WritableMap writableMap) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        receiveEvent(-1, i2, eventName, writableMap);
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveTouches(TouchEvent touchEvent) {
        Intrinsics.checkNotNullParameter(touchEvent, "touchEvent");
        throw new UnsupportedOperationException("receiveTouches is not support by native animated events");
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String eventName, WritableArray touches, WritableArray changedIndices) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(touches, "touches");
        Intrinsics.checkNotNullParameter(changedIndices, "changedIndices");
        throw new UnsupportedOperationException("receiveTouches is not support by native animated events");
    }
}
