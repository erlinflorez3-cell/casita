package com.braze.models.inappmessage;

import bo.app.ba;
import bo.app.e00;
import bo.app.f20;
import bo.app.g20;
import bo.app.h00;
import bo.app.h20;
import bo.app.h9;
import bo.app.i20;
import bo.app.tf;
import bo.app.z9;
import com.braze.enums.inappmessage.MessageType;
import com.braze.support.BrazeLogger;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLc\u0003\rI\u00066\u000b6B\u0015\"4\u0012}\u0007njO0LeN/ZS@\u000fsڔ<$q$yCAW \u00138ޛ\u007fN\u0016f/_j\u000fQ\u001a\u001e\u0016't<Mc\u0006u\u0012=>ԲsA9[}L\u0002m\u00037\u001d `\"~\u000eڱ\u0005\u001c0I\u001exKUY\u0010*0nspRcˢ\u0007ܨ\u0016\nF\"\u0007\"jl\u001fHVuu:])9>\u0019Ď)ۢ4\u0001e\u000fL[5\u0015ȡe."}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=\u0007{Bx}.[Q7m4{\u001fqpF\u0011j\u0002", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=\u0007{Bx}.[Q7m4z\u0011va\u000f", "", ":nV\u0016`7KS'\r~h5", "u(I", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "1n]Ae6E7!\n\b^:\u000b\r9nf2}B\u0001\u0016", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u001dY\f.3o\u0016\u001daN;A", "5dc\u001aX:LO\u001b~ir7|", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eq\u007fI|\"\"Oo\u001cJr'5#e E{\u00120M2Ov4s", ";db@T.>B-\nz", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "8r^;B)CS\u0017\u000e", "\u001aa^{T7I\u001d\u001cIE4", "0qPGX\u0014:\\\u0015\u0001zk", "\nh]6g\u0005", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u0014Q9\nG\u0002n8$Huz^", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public class InAppMessageControl extends InAppMessageBase {
    private final AtomicBoolean controlImpressionLogged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageControl(JSONObject jsonObject, h00 brazeManager) {
        super(jsonObject, brazeManager, false, false, 12, null);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.controlImpressionLogged = new AtomicBoolean(false);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.CONTROL;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public boolean logImpression() {
        e00 e00VarA;
        if (this.controlImpressionLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) f20.f604a, 6, (Object) null);
            return false;
        }
        String triggerId = getTriggerId();
        if (triggerId == null || triggerId.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) g20.f700a, 6, (Object) null);
            return false;
        }
        if (getBrazeManager() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) h20.f794a, 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) i20.f866a, 6, (Object) null);
        String triggerId2 = getTriggerId();
        if (triggerId2 != null) {
            z9 z9Var = ba.f257g;
            String messageExtras = getMessageExtras();
            z9Var.getClass();
            Intrinsics.checkNotNullParameter(triggerId2, "triggerId");
            e00VarA = z9Var.a(new h9(triggerId2, messageExtras));
        } else {
            e00VarA = null;
        }
        if (e00VarA != null) {
            h00 brazeManager = getBrazeManager();
            if (brazeManager != null) {
                ((tf) brazeManager).a(e00VarA);
            }
            this.controlImpressionLogged.set(true);
        }
        return true;
    }
}
