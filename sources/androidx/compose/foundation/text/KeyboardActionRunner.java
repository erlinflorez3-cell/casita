package androidx.compose.foundation.text;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: KeyboardActionRunner.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lmA0ZeP.XV2\u000fy{<řc$\bCCU \u0001(ޛeȞ\u0018g\u001dI\u001b\u0018S\u0015\u0014\u0016\u0011lBH\u0004yٕ\u0016\u000f@D8WA\\\b=gp%:\u00131J\"f\fK\u0015˖)Ϻǘz|I^\u001a&xV~Oj\r{\u0015J\u0016\u0014O8\u0001Ln˚MȤՂp_@E1\u0017:Z\\*w0+QcІ\u0001ܮ\u0011\u0003iӜCB=:#+s\u0005\rYiGSW\u007fF\u001dhU1\u0002ɥ ɱ:d\bϬ--U\u0018k~F^\u000b^n\u001aw9]ccR$'&{Rȡ>Ǭ\u0012\u0006/Ξ͖-\u001fn\u000b\u0014\u07b9\u0011!RĜT\u0019"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u0010\u001c$lkBss5Wv4\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u0010\u001c$lkBta6Yv|", "9dh/b(KRv\t\u0004m9\u0007\u00106e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n#c~/Ii#.3COh>\u001a\"g?C\u0010r9X}.GY$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~G\b!F\u007f\u0012;M);\u007f1(\u0011u`\u0017\u0011l;[\u0001.NL[\u0002 C", "4nRBf\u0014:\\\u0015\u0001zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Ege\u001c@i\u0018.Z\u0019", "5dc\u0013b*Na\u0001z\u0004Z.|\u0016", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0018Qm\u001eJ@\u0006?W\u000e.\u001fi\u001f*OCHA", "Adc\u0013b*Na\u0001z\u0004Z.|\u0016", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\b3v\u00120MP\u0011/%", "9dh/b(KRt|\nb6\u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u0010\u001c$lkB\u00159", "5dc\u0018X@;]\u0015\fy:*\f\r9n\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7{.a@EgA\u001dpfp=\u0011l:$", "Adc\u0018X@;]\u0015\fy:*\f\r9n\u000e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001S\u0016BJM7x3y\u0013weC\u0010q\u0002\u0012g", "2dU.h3M9\u0019\u0013wh(\n\b\u000bc\u000f,\u0006I", "", "7lT\u000eV;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7I\u0014=QMDA", "2dU.h3M9\u0019\u0013wh(\n\b\u000bc\u000f,\u0006IH|\u001e3xr\u001aI", "uH\u0018#", "@t]\u000eV;B]\"", "@t]\u000eV;B]\"F`e\u0018\u0006m\r8", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class KeyboardActionRunner implements KeyboardActionScope {
    public static final int $stable = 8;
    public FocusManager focusManager;
    public KeyboardActions keyboardActions;
    private final SoftwareKeyboardController keyboardController;

    public KeyboardActionRunner(SoftwareKeyboardController softwareKeyboardController) {
        this.keyboardController = softwareKeyboardController;
    }

    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        Intrinsics.throwUninitializedPropertyAccessException("keyboardActions");
        return null;
    }

    public final void setKeyboardActions(KeyboardActions keyboardActions) {
        this.keyboardActions = keyboardActions;
    }

    public final FocusManager getFocusManager() {
        FocusManager focusManager = this.focusManager;
        if (focusManager != null) {
            return focusManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("focusManager");
        return null;
    }

    public final void setFocusManager(FocusManager focusManager) {
        this.focusManager = focusManager;
    }

    /* JADX INFO: renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final void m1336runActionKlQnJC8(int i2) {
        Function1<KeyboardActionScope, Unit> onSend;
        Unit unit = null;
        if (ImeAction.m6288equalsimpl0(i2, ImeAction.Companion.m6302getDoneeUduSuo())) {
            onSend = getKeyboardActions().getOnDone();
        } else if (ImeAction.m6288equalsimpl0(i2, ImeAction.Companion.m6303getGoeUduSuo())) {
            onSend = getKeyboardActions().getOnGo();
        } else if (ImeAction.m6288equalsimpl0(i2, ImeAction.Companion.m6304getNexteUduSuo())) {
            onSend = getKeyboardActions().getOnNext();
        } else if (ImeAction.m6288equalsimpl0(i2, ImeAction.Companion.m6306getPreviouseUduSuo())) {
            onSend = getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m6288equalsimpl0(i2, ImeAction.Companion.m6307getSearcheUduSuo())) {
            onSend = getKeyboardActions().getOnSearch();
        } else if (ImeAction.m6288equalsimpl0(i2, ImeAction.Companion.m6308getSendeUduSuo())) {
            onSend = getKeyboardActions().getOnSend();
        } else {
            if (!(ImeAction.m6288equalsimpl0(i2, ImeAction.Companion.m6301getDefaulteUduSuo()) ? true : ImeAction.m6288equalsimpl0(i2, ImeAction.Companion.m6305getNoneeUduSuo()))) {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
            onSend = null;
        }
        if (onSend != null) {
            onSend.invoke(this);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            mo1335defaultKeyboardActionKlQnJC8(i2);
        }
    }

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* JADX INFO: renamed from: defaultKeyboardAction-KlQnJC8, reason: not valid java name */
    public void mo1335defaultKeyboardActionKlQnJC8(int i2) {
        if (!ImeAction.m6288equalsimpl0(i2, ImeAction.Companion.m6304getNexteUduSuo())) {
            if (!ImeAction.m6288equalsimpl0(i2, ImeAction.Companion.m6306getPreviouseUduSuo())) {
                if (!ImeAction.m6288equalsimpl0(i2, ImeAction.Companion.m6302getDoneeUduSuo())) {
                    if (ImeAction.m6288equalsimpl0(i2, ImeAction.Companion.m6303getGoeUduSuo()) ? true : ImeAction.m6288equalsimpl0(i2, ImeAction.Companion.m6307getSearcheUduSuo()) ? true : ImeAction.m6288equalsimpl0(i2, ImeAction.Companion.m6308getSendeUduSuo()) ? true : ImeAction.m6288equalsimpl0(i2, ImeAction.Companion.m6301getDefaulteUduSuo())) {
                        return;
                    }
                    ImeAction.m6288equalsimpl0(i2, ImeAction.Companion.m6305getNoneeUduSuo());
                    return;
                } else {
                    SoftwareKeyboardController softwareKeyboardController = this.keyboardController;
                    if (softwareKeyboardController != null) {
                        softwareKeyboardController.hide();
                        return;
                    }
                    return;
                }
            }
            getFocusManager().mo3864moveFocus3ESFkO8(FocusDirection.Companion.m3860getPreviousdhqQ8s());
            return;
        }
        getFocusManager().mo3864moveFocus3ESFkO8(FocusDirection.Companion.m3859getNextdhqQ8s());
    }
}
