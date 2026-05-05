package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: FocusOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007lkA0ZeP.XT2\u000fy\u0005<$a&yCQU\"}(\u000bWN}gvJ`\rK\u000f\u001c\u0016\u0001j2K]xs\u0012\u00172HoG3coEʠhtL\u0005(288\u0002\u0005\u0007\u001c2H\u001ev\u0003CQ\u000f\u001a0VpBR#M\r\u001a\u0018\bD~\u0017Ȧ\rg|5\u0011\u001dkFG#1vrR5mH|{\u001avX5\u001c\u000faL8p;C%=S1\u0014\u0003_M\u0014Wqk\u0017/K߉*ɞָ[8^\u0013\")sg\u001br\u000b&\u000b\u0012\u0002d\u001a=CO\u0012b\u00172Âv\u07beԫ\u0011>\n&\u0014@\u0011V;4~\b<@%vaVh\u0002\rY0\u0007g6%@\u00189;;+f\u007fni5\u0015[\u009e\u0004ټ̷'\u0003t>irVn#:lw\u007f>\u0002DKhf\n\b^4(9\u001b\u0010L\u001c2]~]\tA2%6O[g5Qq\u0010k\\i\r\u0004\u000f\r\u0004y`mX.~\u0018G*73jFt\u0005\u001a]\u0003~r5ݬ\u001b\u0381Θ\u0002\n\u0019Hj!\u0005)3:fQ~h\u0019q$.m5tbqn\u001a:\u001e]'UC~{\u0010\u0010_'\u001aMMz\u0007nepe<`jV:4^i>\u001cBhā\u000bƎ\u0558Cq\"ct?'\r-H1JrE\u000b:wZ\u0017BEx{2\u0011\u001a<t7-\u0001`~!\u007fxw_C\u0005j;O\u0002M\u0019T\u0002RlB.;\u0007-\u001bFk0nU\u0001\u0005\u0016$b,$$+QQ]OC\u0015\rWJ\u0004CDz\u0017,u͠\u0011\u05fdϸ\u0001{\u0015pvd8\u0018xpD`\u0019K&ݞ\u0019Ȕzb\u000b%\u000ef\u000e|2V\tK{T9`\u0015ϛtè]@f:\u0003\u000b-%u\u0011}*\u00155[L}ޛ\u0018߳\u00183-ccs}9ՙa\u000eձtp\f/i݀\f\u0011Pe4AWwX̃BYٻp\u0002"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egg2@m#\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Ege\u001c@i\u0018.Z\u0019", "4nRBf\u001bKO\"\rv\\;\u0001\u00138M{1wB\u0001$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egl-3v$*KR?u=\u0006\u0011q];\u0007p\u0002", "5dc\u0013b*Na\b\fvg:x\u0007>i\n1c<\n\u0013\u0019G|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0018Qm\u001eJ@\u0006?W\u000e.&z\u00127[?9z8(\u001eP]B\u0003e,[L", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "5dc\u001ab+BT\u001d~\b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/", "@n^AF;:b\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egk/3|\u0016\u0004", "5dc\u001fb6MA(z\n^", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0018Qm\u001eJ@\u0006?W\u000e.%|\u0012=M\u0019", "1kT.e\rHQ)\r", "", "4na0X", "@dU?X:A4#|\u000bl\f\u000e\t8t\u000e", "1kT.e\u0016P\\\u0019\f[h*\r\u0017", "4nRBf\u000bB`\u0019|\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Eg\\$Dm\u0014=QMDA", "1kT.e\rHQ)\rBB}\u0004\u0016\u001aN\u0002", "uYI'<o3", "2hb=T;<V|\b\n^9z\t:t\u007f'iJ\u0002&|G\u0004\u000bFr249\u000f @|", "9dh\u0012i,Gb", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~?}4\u0017~\u00167\\\u0019", "2hb=T;<V|\b\n^9z\t:t\u007f'iJ\u0002&|G\u0004\u000bFr249\u000f @|]#UMAWG(", "uKP;W9HW\u0018H\fb,\u000fR\u0015e\u0014\b\r@\n&l\u000bd", "2hb=T;<V~~\u000f>=|\u0012>", "=m5<V<LS\u0018b\n^4", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "2hb=T;<V~~\u000f>=|\u0012>-s+d\rja)", "uKP;W9HW\u0018H\fb,\u000fR\u0015e\u0014\b\r@\n&l.u\u0018K})>#\u00031?7\u0017>VAJo>'#2BI\u0010a;R\u00010\u0012\"\u0012!", "2hb=T;<V\u0006\t\nZ9\u0011h@e\t7", "3uT;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WI\u000141f\u0012i$w%*ZW)iA(\u001coAJ\u0007l;$", "4nRBf\u001a>O&|}", "4nRBf,=@\u0019|\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "=m5<h5=", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egl\u001cDo\u0016=6M:k\n", "4nRBf\u001a>O&|}&\u001cc|\u0002qa:", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#j 5|k\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WvbH@F \u007f@\u0001&\u00045KK\u0018r\u000b\u0013\u0016\n>@", "5dc\u0013b*Na\u0006~xm", "@d[2T:>4#|\u000bl", "", "@d`BX:M4#|\u000bl\r\u0007\u0016\u0019w\t(\t", ">qTC\\6Na \u0013[h*\r\u0017/dl(yO", "@d`BX:M4#|\u000bl\r\u0007\u0016\u0019w\t(\t\bR!g\u0014z\u0017F", "AbW2W<ES|\b\fZ3\u0001\b+t\u00042\u0005", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Eg]17v%\u0016WB?l8\u001e\"Qk8\u00079", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egh-Ax\u0016;\\G;y\u001c(\u0014lb=\u0007p\u0015Xu'\u001d", "B`Z296<c'", "B`Z296<c'FvM6`\u00106A", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#j 5|kqB", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface FocusOwner extends FocusManager {
    /* JADX INFO: renamed from: clearFocus-I7lrPNg */
    boolean mo3866clearFocusI7lrPNg(boolean z2, boolean z3, boolean z4, int i2);

    /* JADX INFO: renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    boolean mo3867dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent keyEvent);

    /* JADX INFO: renamed from: dispatchKeyEvent-YhN2O0w */
    boolean mo3868dispatchKeyEventYhN2O0w(KeyEvent keyEvent, Function0<Boolean> function0);

    boolean dispatchRotaryEvent(RotaryScrollEvent rotaryScrollEvent);

    /* JADX INFO: renamed from: focusSearch-ULY8qGw */
    Boolean mo3869focusSearchULY8qGw(int i2, Rect rect, Function1<? super FocusTargetNode, Boolean> function1);

    Rect getFocusRect();

    FocusTransactionManager getFocusTransactionManager();

    Modifier getModifier();

    FocusState getRootState();

    void releaseFocus();

    /* JADX INFO: renamed from: requestFocusForOwner-7o62pno */
    boolean mo3870requestFocusForOwner7o62pno(FocusDirection focusDirection, Rect rect);

    void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode);

    void scheduleInvalidation(FocusPropertiesModifierNode focusPropertiesModifierNode);

    void scheduleInvalidation(FocusTargetNode focusTargetNode);

    /* JADX INFO: renamed from: takeFocus-aToIllA */
    boolean mo3871takeFocusaToIllA(int i2, Rect rect);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: dispatchKeyEvent-YhN2O0w$default */
    static /* synthetic */ boolean m3865dispatchKeyEventYhN2O0w$default(FocusOwner focusOwner, KeyEvent keyEvent, Function0 function0, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function0 = new Function0<Boolean>() { // from class: androidx.compose.ui.focus.FocusOwner$dispatchKeyEvent$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return false;
                }
            };
        }
        return focusOwner.mo3868dispatchKeyEventYhN2O0w(keyEvent, function0);
    }
}
