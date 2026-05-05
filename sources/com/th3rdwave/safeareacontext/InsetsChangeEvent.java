package com.th3rdwave.safeareacontext;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4B\u0007\"B\u0012\u007fјnjO0LeN.ZS8\u000fsڔ<$q$yّCU(\n*\tUNm˧\u0005Ϻx\u0019s\u0015\u0016\u0018\tjZկ\u0004w\u0016\u0011\u001dre\u007fCAM\b=ga\u0005:\u0013\"J\"fz\u0015\u0005(-`\u0010%~SO\u001a\u0017H@\u001f@ň\u0011M\u0013!Z\u0014L(\u0019\u001e\u000bp~:Vvu:].I}\u000bT5kH|{\u001a\rhw\u0019\u0005f6+n=\fՙ'٨\u0007\u0007Z¹\u0010\u000fMtU\u0005\u0017+}ǥKָ[6`ÜЕ\u0019:"}, d2 = {"\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~=\u0007.7|$\fP?Dm4}&hjH\\", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000e^CDz\n", "Ata3T*>7\u0018", "", "DhTDG(@", ";H]@X;L", "\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~9|\"7Q\u001f<MRIA", ";Ea.`,", "\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~F}\u001eFC", "uH8\u0019V6F\u001d(\u0002Hk+\u000f\u0005@eI6wA\u0001\u0013$Gk\fF\u007f45l\ri\u0017l\u0018.1LIkC,jO_C\u000f-;QD4F^J=\\\u001c\u00019\u0015\u0012V\u001bN'\u000b\u000fbP$\u0002S\u0001\f\b*XW~Y", "2hb=T;<V", "", "@bc\u0012i,Gbx\u0007~m;|\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u001b+2\u001b|4'$Hi=\u0016r,[L", "5dc\u0012i,Gb\u0002z\u0003^", "", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s\u000b\u00050eG$\t@|^\u0015Qx\u001d<\n4/f}'7i$."}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class InsetsChangeEvent extends Event<InsetsChangeEvent> {
    public static final Companion Companion = new Companion(null);
    public static final String EVENT_NAME = "topInsetsChange";
    private final Rect mFrame;
    private final EdgeInsets mInsets;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~=\u0007.7|$\fP?Dm4}&hjHEA6V\u0002#PPX52", "", "u(E", "\u0013U4\u001bG&'/\u0001^", "", "@dP0gsGO(\u0003\f^s\u000b\u00050eG$\t@|^\u0015Qx\u001d<\n4/f}'7i$."}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsetsChangeEvent(int i2, int i3, EdgeInsets mInsets, Rect mFrame) {
        super(i3);
        Intrinsics.checkNotNullParameter(mInsets, "mInsets");
        Intrinsics.checkNotNullParameter(mFrame, "mFrame");
        this.mInsets = mInsets;
        this.mFrame = mFrame;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putMap("insets", SerializationUtilsKt.edgeInsetsToJsMap(this.mInsets));
        writableMapCreateMap.putMap(TypedValues.AttributesType.S_FRAME, SerializationUtilsKt.rectToJsMap(this.mFrame));
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), writableMapCreateMap);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return EVENT_NAME;
    }
}
