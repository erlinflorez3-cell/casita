package androidx.compose.foundation.text.input.internal;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: TextFieldKeyEventHandler.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$c$wDCU0}*\t]NogtLb\u000bY\u000f\u000eǝ\u0001jBI]xc\u0013\u0015˰Xģo3{n}<žx6\u0013 zpFz\u001d\u0001H,x\u0014\u0005}[K:\u0016`D~?j\r{\u000bJ\u0016\u0014E8\u0001Ld\u0018RDQ\u0005]h9S\u0007wMf'\u000e2-Q\u001bRl';x\u0012(9MO;%'c\u00035a\nMISҵ<ݛص+)1Y\u0002h~\u0011\u000e&-+}\u000f\u000ev4_\u001dQ\u000f\u0010W/]hcP<.(~\n\u0016T\u0004<\u0010WL<@2f6\"cx\u0001hXP0t\t\u0014Ҧ`اа)\u00029BG3ƛQfC\u001cTѻ\u00183\f̽'\u001a"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@P?5M\u00041KK=,oaSA\u0014\u0019YsN?l\u0016YJ3Q@@\u001e\u000f,VW", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+BR\u0007\u001d%\u0012c\u001d1'\u0016\u0004`A1D", "u(E", "=m:2l\fOS\"\u000e", "", "3uT;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~?}4\u0017~\u00167\\\u0019", "BdgA90>Z\u0018l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u001a", "BdgA?(R])\u000ehm(\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\u000eC`X<k@\u00029#\u00120", "BdgA90>Z\u0018lze,z\u00183o\t\u0016\u000b<\u0010\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*z\u0005`A\"}HA(u;E\u0011;>", "3cXAT)ES", "Ah]4_,%W\"~", "=mBBU4Bb", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "=m:2l\fOS\"\u000eB/7\f\u0014z4\u000e", "uKP;W9HW\u0018H\fb,\u000fR\u0015e\u0014\b\r@\n&l.k\u0017;\u0004/9X\u0011i5w\u001e9WQ;55(%q`5\u0016g6W@6G_]u`[}M#[^\u0017]+\u001a\u000eUHm]Q3(\u0016-S\u000fCh\u007fz\u0016!DKtB]\u000f5\t\u0011\u0005A~OBb^\u0007QEDusb\u0016g(fH:m\u0015{)$gL=\u000e\u0006\\Z\u0002R\rv1K\"\u0006H3\bqdUE|^8{p\u000eK\u000f\u0007x.l~;\u0004\u001b\u0013096:kGp\u0017Kh|\u0014?&?1.AF!?\u0015d\u007f|G\rd.e\u0012\u0017,D1,t/gQ\u001a\u0017l`_>p_\u000e@N\r\bWo\u001c'D\u000eFe\u0003^w\u00077|FMC\"Sn\u001awD n\u0015\r\fT'\u0018=\u0016\u0013N\u0004O0iFT\u0017\u00122=\u001d\u0004#D%yF\u001fqU{i!P4?v M+<\u0016\u0012:G", "=m??X\u0012>gx\u0010zg;", "4nRBf\u0014:\\\u0015\u0001zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Ege\u001c@i\u0018.Z\u0019", "9dh/b(KRv\t\u0004m9\u0007\u00106e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n#c~/Ii#.3COh>\u001a\"g?C\u0010r9X}.GY$", "=m??X\u0012>gx\u0010zg;DpCF\u00103j ", "uKP;W9HW\u0018H\fb,\u000fR\u0015e\u0014\b\r@\n&l.k\u0017;\u0004/9X\u0011i5w\u001e9WQ;55(%q`5\u0016g6W@6G_]u`[}M#[^\u0017]+\u001a\u000eUHm]Q3(\u0016-S\u000fCh\u007fz\u0016!DKtB]\u000f5\t\u0011\u0005A~OBb^\u0007QEDusb\u0016g(fH:m\u0015{)$gL=\u000e\u0006\\Z\u0002R\rv1K\"\u0006H3\bqdUE|^8{p-K\u0003w\u0010A\\~4>\u001c\u0004G9\u0017h\u0005Rf\u0006>ex\u0013;`K0\u0014E8\"?!Jqu=\u001br#`\u001bW`?9$osc\u0012\u001f\u000b'\u0018e3qmJ\u0018\\\u0004NWW\u00110B\u0001BhO{\u0005\u0010#zoMB.\u001e~$xO,m\u0011L\u0013ja'5\u0012LZ\u0019u2)%W\u0014\u0018z4\u0019{?C)mR\fzJPe`~1@\u007f\u0018I.\t\u000f1", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidTextFieldKeyEventHandler extends TextFieldKeyEventHandler {
    public static final int $stable = 0;

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    /* JADX INFO: renamed from: onPreKeyEvent-MyFupTE, reason: not valid java name */
    public boolean mo1472onPreKeyEventMyFupTE(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController) {
        if (super.mo1472onPreKeyEventMyFupTE(keyEvent, transformedTextFieldState, textFieldSelectionState, focusManager, softwareKeyboardController)) {
            return true;
        }
        InputDevice device = keyEvent.getDevice();
        if (device != null && device.supportsSource(513) && !device.isVirtual() && KeyEventType.m5236equalsimpl0(KeyEvent_androidKt.m5244getTypeZmokQxo(keyEvent), KeyEventType.Companion.m5240getKeyDownCS__XNY()) && keyEvent.getSource() != 257) {
            if (TextFieldKeyEventHandler_androidKt.m1544isKeyCodeYhN2O0w(keyEvent, 19)) {
                return focusManager.mo3864moveFocus3ESFkO8(FocusDirection.Companion.m3862getUpdhqQ8s());
            }
            if (TextFieldKeyEventHandler_androidKt.m1544isKeyCodeYhN2O0w(keyEvent, 20)) {
                return focusManager.mo3864moveFocus3ESFkO8(FocusDirection.Companion.m3855getDowndhqQ8s());
            }
            if (TextFieldKeyEventHandler_androidKt.m1544isKeyCodeYhN2O0w(keyEvent, 21)) {
                return focusManager.mo3864moveFocus3ESFkO8(FocusDirection.Companion.m3858getLeftdhqQ8s());
            }
            if (TextFieldKeyEventHandler_androidKt.m1544isKeyCodeYhN2O0w(keyEvent, 22)) {
                return focusManager.mo3864moveFocus3ESFkO8(FocusDirection.Companion.m3861getRightdhqQ8s());
            }
            if (TextFieldKeyEventHandler_androidKt.m1544isKeyCodeYhN2O0w(keyEvent, 23)) {
                softwareKeyboardController.show();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    /* JADX INFO: renamed from: onKeyEvent-6ptp14s, reason: not valid java name */
    public boolean mo1471onKeyEvent6ptp14s(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, boolean z2, boolean z3, Function0<Unit> function0) {
        if (KeyEventType.m5236equalsimpl0(KeyEvent_androidKt.m5244getTypeZmokQxo(keyEvent), KeyEventType.Companion.m5240getKeyDownCS__XNY()) && keyEvent.isFromSource(257) && !TextFieldKeyEventHandler_androidKt.m1543isFromSoftKeyboardZmokQxo(keyEvent)) {
            textFieldSelectionState.setInTouchMode(false);
        }
        return super.mo1471onKeyEvent6ptp14s(keyEvent, transformedTextFieldState, textLayoutState, textFieldSelectionState, z2, z3, function0);
    }
}
