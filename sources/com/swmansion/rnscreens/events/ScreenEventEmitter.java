package com.swmansion.rnscreens.events;

import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lkA0RkP.XV2\u000fy{<$a)yCIZ\"Ԃ*\t]WogtJpŏs\u000f4\u00159u<Mcxu\u0012=3Բs?AO8HGm\r8\u001b\u001f`0أ}\u0005\u000f)rS\u001e\u0007\u0013Ea\u000b@>Ϯt:`\u001c\u0016\u0010(#\u001e@6\u007fLjʄR6V{&E=5\u001bkXMUm݁\u0001M\u001bU\u001d2\u001b\ny A?eCչ)S\u0011\u0016\u001bwM\u0017Wqk\u0013\u0019+5@as\u0006L\t\u0004\",CO;u#*j\u001ei`:?{`qNh\u0010>v)\u007fC\u0001Ǭ\u0012\n?J42(lX\u001dA{\u000bSnX8#۰\u0004~y8\u001d.\u000e={H)fiai\u001a\u05ee;\u0002\rټ6%\u0007y/gړ\u0012z"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011o\u001f<\u007f4C#k\u001eDm\u00167-T;tC}\u001dlpH\u0007p\u0002", "", "Aba2X5", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>/", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{:\u0004%5bSc(", "@dP0g\fOS\"\u000eYb:\b\u0005>c\u0003(\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000e^CDz\u0013\"#s]H\u0005f,[L", "5dc\u001fX(<bx\u0010zg;[\r=p{7yC\u0001$", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#}17v%<\u0017#Lk=-sloD\u0003r*Qv4\u001d", "@dP0g\u001aN`\u001azx^\u0010{", "", "5dc\u001fX(<b\u0007\u000f\b_(z\t\u0013d", "u(8", "5dc V9>S\"", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007u", "2hb=T;<V\u0003\bVi7|\u0005<", "", "u(;8b;EW\"Hjg0\f^", "2hb=T;<V\u0003\bYb:x\u0014:e{5", "2hb=T;<V\u0003\bYb:\u0005\r=s\u007f'", "2hb=T;<V\u0003\blb3\u0004d:p\u007f$\t", "2hb=T;<V\u0003\blb3\u0004g3s{3\u0007@|$", "2hb=T;<V\b\fvg:\u0001\u00183o\t\u0013\tJ\u0003$\u0017U}", ">q^4e,La", "", "7r4E\\;\u001a\\\u001d\u0007vm0\u0007\u0012", "", "7r6<\\5@4#\f\rZ9{", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ScreenEventEmitter {
    private final Screen screen;

    public ScreenEventEmitter(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.screen = screen;
    }

    public final Unit dispatchOnAppear() {
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher == null) {
            return null;
        }
        reactEventDispatcher.dispatchEvent(new ScreenAppearEvent(getReactSurfaceId(), this.screen.getId()));
        return Unit.INSTANCE;
    }

    public final Unit dispatchOnDisappear() {
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher == null) {
            return null;
        }
        reactEventDispatcher.dispatchEvent(new ScreenDisappearEvent(getReactSurfaceId(), this.screen.getId()));
        return Unit.INSTANCE;
    }

    public final Unit dispatchOnDismissed() {
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher == null) {
            return null;
        }
        reactEventDispatcher.dispatchEvent(new ScreenDismissedEvent(getReactSurfaceId(), this.screen.getId()));
        return Unit.INSTANCE;
    }

    public final Unit dispatchOnWillAppear() {
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher == null) {
            return null;
        }
        reactEventDispatcher.dispatchEvent(new ScreenWillAppearEvent(getReactSurfaceId(), this.screen.getId()));
        return Unit.INSTANCE;
    }

    public final Unit dispatchOnWillDisappear() {
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher == null) {
            return null;
        }
        reactEventDispatcher.dispatchEvent(new ScreenWillDisappearEvent(getReactSurfaceId(), this.screen.getId()));
        return Unit.INSTANCE;
    }

    public final void dispatchTransitionProgress(float f2, boolean z2, boolean z3) {
        float fCoerceIn = RangesKt.coerceIn(f2, 0.0f, 1.0f);
        short coalescingKey = ScreenFragment.Companion.getCoalescingKey(fCoerceIn);
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.dispatchEvent(new ScreenTransitionProgressEvent(getReactSurfaceId(), this.screen.getId(), fCoerceIn, z2, z3, coalescingKey));
        }
    }

    public final EventDispatcher getReactEventDispatcher() {
        return this.screen.getReactEventDispatcher();
    }

    public final int getReactSurfaceId() {
        return UIManagerHelper.getSurfaceId(this.screen);
    }

    public final Screen getScreen() {
        return this.screen;
    }
}
