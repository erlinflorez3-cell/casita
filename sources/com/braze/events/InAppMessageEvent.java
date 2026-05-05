package com.braze.events;

import bo.app.g10;
import bo.app.k10;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.JsonUtils;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLc\u0003\u0010I\u00066\u000b6B\u0015\"4\u0012}\u0007njO0LeN.ZS@\u000fs{:+c$\u007fICU ~*\t]WogtU`ŗI%إFx\u0019+\n|\ta \u001cJB\u001eBCQ}KQ`#<\u0015$@1Py3\n*0V \u000f|YJ:\u0012ضDr@t\u001bpM' \u0007V /\u001e#{ߑ:Jr^H1k\u0011wFf'\u000e3Cָ\u000eТX)\u0013zo#sNE<-%\u0002\tMҿ\\ύ\u0007AwD\u0013po59S\fWdaFг\u0016ۣS\u000fc|4gMan\u0018?-ebyPT\u0090xߡ\u007f\u000fB\u0010\u001c\bo\u0001<>2f6ԄczxSN]\u001a^p\u0003+g<\u00173\u000eK+g!\u0017Wg;']O{3\u0016N+\u0007n/kl\u0010v\u0014IT>ϊ0ҨD?N_\u0018k\u0006{\u0012\u0005z\u0002X\u0017vб~\u009e\u007f\u00134+3L$Q19\u0004\u0002v[\u0018|\u0013v\u0001U\u007fQv?hę\u0017֖.\u000b\u0012rR}U\u0001^ap,?PRXΘ\u0002\u0012\u001b\"b\u0005J;=\u0012Tjvn;bk\u0018=/\u0015=\u0010r«\u0012aA`9C_\u007f(cX\u0014\"G\rw\u0013g~B\u0002\u0015\u0011`͈&<Pl\u0016\u0007\nbf\u000e\u0019QM|lK:A1^+G1\u001exEҴ\ribj\u0016\u000fbS<\u0005oE\u0003\u000bɿT\u0001"}, d2 = {"\u001ab^:\")KO.~D^=|\u0012>sI\f\u0005\u001c\f\"~G}\u001c8x%\u0015j})FC", "", "", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\u001aa^{T7I\u001d\u001bJE4", "1n\\=b5>\\(J", "u(;/bu:^$H|*vR", "\u001aa^{T7I\u001d\u001fJE4", "1n\\=b5>\\(K", "u(;/bu:^$H\u0001*vR", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ej", "1n\\=b5>\\(L", "u(;0b4\bP&z\u0010^u\u0005\u0013.e\u00076ED\n\u0013\"Rw\u000eJ\u0005!7YG\u0004\u001bvq9X+;yB\u001a\u0017h7", "1n\\=b5>\\(M", "BqX4Z,K3*~\u0004m", "BqX4Z,K/\u0017\u000e~h5", "7m0=c\u0014>a'z|^", "CrT?<+", "1n_F", "uKQ<\"(I^b\u0001F)\u0002c\u00069/{3\u0007\n\u0007ba\u001dV\fF~n2fy577\u001e8LCBy}\"\u001edlD\u000fc:\\r)G\u00162\u0010e.}H{\u0012h\u001cJ-\rZ@F \u007f@\u0001&\u00045KK)w\u000e\u0010\u001f\u0010\u000b.W@`\u0018\u0011v\"qV)2Fj_\u0003VO\u000fF3@\u0017j\u0005\\HH \u0016qx,hY=_", "", "6`b566=S", "u(8", "=sW2e", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "\u001aa^{T7I\u001d\u001bJE4", "5dc!e0@U\u0019\fZo,\u0006\u0018", "\u001aa^{T7I\u001d\u001fJE4", "5dc!e0@U\u0019\fV\\;\u0001\u00138", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ej", "5dc\u0016a\bI^\u0001~\tl(~\t", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\"f,K7\u0018", "\nh]6g\u0005", "uKQ<\"(I^b\u0001F)\u0002c\u00069/{3\u0007\n\u0007ba\u001dV\fF~n2fy577\u001e8LCBy}\"\u001edlD\u000fc:\\r)G\u00162\u0010e.}H{\u0012h\u001cJ-\rZ@F \u007f@\u0001&\u00045KK)w\u000e\u0010\u001f\u0010\u000b.a", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public final class InAppMessageEvent {
    private final IInAppMessage inAppMessage;
    private final k10 triggerAction;
    private final g10 triggerEvent;
    private final String userId;

    public InAppMessageEvent(g10 triggerEvent, k10 triggerAction, IInAppMessage inAppMessage, String str) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        Intrinsics.checkNotNullParameter(triggerAction, "triggerAction");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        this.triggerEvent = triggerEvent;
        this.triggerAction = triggerAction;
        this.inAppMessage = inAppMessage;
        this.userId = str;
    }

    public static /* synthetic */ InAppMessageEvent copy$default(InAppMessageEvent inAppMessageEvent, g10 g10Var, k10 k10Var, IInAppMessage iInAppMessage, String str, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            g10Var = inAppMessageEvent.triggerEvent;
        }
        if ((2 & i2) != 0) {
            k10Var = inAppMessageEvent.triggerAction;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            iInAppMessage = inAppMessageEvent.inAppMessage;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            str = inAppMessageEvent.userId;
        }
        return inAppMessageEvent.copy(g10Var, k10Var, iInAppMessage, str);
    }

    public final g10 component1() {
        return this.triggerEvent;
    }

    public final k10 component2() {
        return this.triggerAction;
    }

    public final IInAppMessage component3() {
        return this.inAppMessage;
    }

    public final String component4() {
        return this.userId;
    }

    public final InAppMessageEvent copy(g10 triggerEvent, k10 triggerAction, IInAppMessage inAppMessage, String str) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        Intrinsics.checkNotNullParameter(triggerAction, "triggerAction");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        return new InAppMessageEvent(triggerEvent, triggerAction, inAppMessage, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppMessageEvent)) {
            return false;
        }
        InAppMessageEvent inAppMessageEvent = (InAppMessageEvent) obj;
        return Intrinsics.areEqual(this.triggerEvent, inAppMessageEvent.triggerEvent) && Intrinsics.areEqual(this.triggerAction, inAppMessageEvent.triggerAction) && Intrinsics.areEqual(this.inAppMessage, inAppMessageEvent.inAppMessage) && Intrinsics.areEqual(this.userId, inAppMessageEvent.userId);
    }

    public final IInAppMessage getInAppMessage() {
        return this.inAppMessage;
    }

    public final k10 getTriggerAction() {
        return this.triggerAction;
    }

    public final g10 getTriggerEvent() {
        return this.triggerEvent;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = (this.inAppMessage.hashCode() + ((this.triggerAction.hashCode() + (this.triggerEvent.hashCode() * 31)) * 31)) * 31;
        String str = this.userId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return JsonUtils.getPrettyPrintedString(this.inAppMessage.forJsonPut());
    }
}
