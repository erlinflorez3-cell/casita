package androidx.compose.ui.text.input;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: TextInputService.kt */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "\u0018Y\u0001ta\u0001\u0016k^V:\bD\u001aDbEZ\u0019<\u0019U\u001bV\u007fLwo`b3jm\fmP`pm:Jk")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007|jA0ZeP.XU2\u000fy{<$a%yCQU\"Ԃ*\teNo˧vJp\u000bK\u000f\u00144\u0001jBI]ތe\u0012%2JoE4S\u0005Sʠ\u0011td\u0004`=2<\b\u0005\u0019\u001aXIǘzzQMT\u0018>J\t:\u0001\u0018\u0014\nb\u0018\u0014J8\u0001Lg.S~NzjR/Q\u000e0G\u0017km=\u0015M;K\u0005+\u001b\u0005y\u001eYOg9#5k\u00035c\fU\u0011Q\nO\u0015p7-;K\u0004Wdm.(%-_\r\f}To5an\"?7_e[P<?\b|\f\rj\u000f<\u0019m\\v3(~ \u000ea\u007f9X\t^\u0010vZ\u007f)lf\u001b3\u0019K+g -e2['QO\u0010\u0015\u0011.%\u0017mO`\u0003\u0012I\u001d+X\bSGPnB'T`Բ?ъ\bpj̣z\u0018>N\u00181\u0012\u0010\\\u001c[u2ݾ%\u074co\u0006`Fm~\u0013i9_wR`@Polն,Á\u0010ZLߟʶoj"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|y7XSJY4+&l_9\\", "", ">kPAY6K[\b~\u000em\u0010\u0006\u0014?tm(\tQ\u0005\u0015\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#h'3|\u00178ZK*kG-xqlI\u0016Q,[\b+EL$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W@\u007f0EhG\u000b>i%/WPCZ41$LjD\u0017r\u001aN\u00048KJN\u0002 C", "-bd?e,Gb|\b\u0006n;j\t=s\u00042\u0005", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Z\u0016/MP;t2\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|y7XSJY4,#lkB\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iK\u0001-9Wj 8m#.VA;A", "1ta?X5M7\"\n\u000bm\u001a|\u0017=i\n1", "5dc\u0010h9KS\"\u000e^g7\r\u0018\u001de\u000e6\u007fJ\nU'Ki\u001d<\n4/f}'7i$.", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri&m)=1LF{C\f\u0015vo=\u0011l\u0002", "6hS2F6?b+z\b^\u0012|\u001d,o{5z", "", "Ag^DF6?b+z\b^\u0012|\u001d,o{5z", "AsP?g\u0010G^)\u000e", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "7lT\u001cc;B]\"\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7W!=QMDy\n", "=m41\\;\u001c]!\u0007vg+", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|s8UK7t3s", "=m8:X\b<b\u001d\t\u0004I,\n\n9r\b(z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7I\u0014=QMDA", "As^=<5Ic(", "Adb@\\6G", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class TextInputService {
    public static final int $stable = 8;
    private final AtomicReference<TextInputSession> _currentInputSession = new AtomicReference<>(null);
    private final PlatformTextInputService platformTextInputService;

    public TextInputService(PlatformTextInputService platformTextInputService) {
        this.platformTextInputService = platformTextInputService;
    }

    public final TextInputSession getCurrentInputSession$ui_text_release() {
        return this._currentInputSession.get();
    }

    public TextInputSession startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, Function1<? super List<? extends EditCommand>, Unit> function1, Function1<? super ImeAction, Unit> function12) {
        this.platformTextInputService.startInput(textFieldValue, imeOptions, function1, function12);
        TextInputSession textInputSession = new TextInputSession(this, this.platformTextInputService);
        this._currentInputSession.set(textInputSession);
        return textInputSession;
    }

    public final void startInput() {
        this.platformTextInputService.startInput();
        this._currentInputSession.set(new TextInputSession(this, this.platformTextInputService));
    }

    public void stopInput(TextInputSession textInputSession) {
        if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this._currentInputSession, textInputSession, null)) {
            this.platformTextInputService.stopInput();
        }
    }

    public final void stopInput() {
        this.platformTextInputService.stopInput();
    }

    @Deprecated(message = "\u0018Y\u0001td\u0004\u001bkoH:\u007f;\u001aEPkM\u001b+gw\u001af\tUzvS\u0007qyp[{\u0002\\n(-K6G# fa\u000e\u0015][NnMB_\u001fO#[\u000e\u0006:\u0016\n\r\u0002<\u0007P\u0017}l#\u001a\u007f\b\u0019M\u000eU3)5!", replaceWith = @ReplaceWith(expression = "textInputSession.showSoftwareKeyboard()", imports = {}))
    @InterfaceC1492Gx
    public final void showSoftwareKeyboard() {
        if (getCurrentInputSession$ui_text_release() != null) {
            this.platformTextInputService.showSoftwareKeyboard();
        }
    }

    @Deprecated(message = "\u0018Y\u0001td\u0004\u001bkoH:\u007f;\u001aEPkM\u001b+gw\u001af\tUzvS\u0007qnqPi\u0002\\n(-K6G# fa\u000e\u0015][NnMB_\u0014P\u0018I\u000e\u0006:\u0016\n\r\u0002<\u0007P\u0017}l#\u001a\u007f\b\u0019M\u000eU3)5!", replaceWith = @ReplaceWith(expression = "textInputSession.hideSoftwareKeyboard()", imports = {}))
    @InterfaceC1492Gx
    public final void hideSoftwareKeyboard() {
        this.platformTextInputService.hideSoftwareKeyboard();
    }
}
