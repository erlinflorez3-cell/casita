package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d̉=!4i\bӵLc\u0003\u0010I\u00066\f6B\u0015\"4ߚ\u007f\u0007|jA0ZeP.hS2\u000fy{<$iҕyCQU\"}(\tWN}gvJ`\u000fK\u000f\u0014%\u0001j2Jm+k\u0016'2ptoX[uUZfsF\u000702P@\n\r\u0011 :J v)My\u0015\"4PrPQ;X3!Ū\n>&\rɉ`g\\C`7kHG#1xjNUn`\u0003[\u001d^V=\f%lN1NHM\u0017;R1\u0012\u0003\u0001M\u0015W\u0013C\u0004x)7+w{g>h\u0006$\u0017;O;g!/l\tab\"&YZ\u0012Rח\u0012(}\u0007ԫ\u0011<\u0012!\u001egV<E\u001a\u0015\u001763#\u0002\u0004F^\u0012vD\u0016y\u0010AGJ\u000eECZ!eacK\u0019|?\f\r\u001d$3\u0003~!\n^<i%\u001fdyg0\u007fKkOݳ\u000eYCyձtb\u0010>\u001c~U\u000eG{?=?%eji7/\u0001\u001aRTm|\u0004pjih\u0001Sn8\u000f\u0018M)7\u0017\u000bir\u0017\u0004qZW<\u0013]\u001c\u0003\u000f\u000e\u0010#&lyL!S\u001a|XxmzOs\tS:\u0015>֍rk\u0014cߍb3Ch{Ho`\u000f\u0014mK\u000b\u0005\u0007urx\u001altI(1Xl w*L^\u0014#8Os,4Z;Ge%L\u0013 X@+\u0014\u000eaӳ\u0014~Z?j\bȐ(t\u0017\u0019ph~ב\u007fxw+Sʣ$έEQ=ӧFg0hL|Q\bU͡RěkROƂ|\u0018{W\n#گ\u001eR"}, d2 = {"\u0013l_Al\u0017HW\"\u000ezk\f\u000e\t8t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", "\u001enX;g,K7\"\n\u000bm\u0014\u0007\b3f\u0004(\t)\u000b\u0002\u0013Tk\u0016\u001c\u00042?f", "", "5dc\u001db0Gb\u0019\f^g7\r\u0018\u0017o~,|D\u0001$\u007fQZ\nIr-\u0015f\u000b*D,\u00127VMJgC\"\u001fqo", "u(E", "!tb=X5=W\"\u0001eh0\u0006\u0018/rc1\u0007P\u0010~!Fs\u000f@v2\u001ec| ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001[&<XCDj8'\u0017Sk=\u0010r,[Z0R\\]\u0014fQv>\u0018\u0012gvX*\rZ", ">nX;g,K7\"\n\u000bm\u000fx\u0012.l\u007f5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u0011PW7la<H\u001e\u0016c\u001dN8VriO/nM6#\u0011.4\f?q\u0010\f#q>u\u0001Q>\u001aF}\u0016yA6QPX_O", ">nX;g,K7\"\n\u000bm", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "9dh}", "9dh~", "0k^0^", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0003\u001cHi_5IL=5\u001e\u001b\u001ah_H\\J1J\b#\u0011SJ5^\u001c\\:\u0019\u0012X\u001d$\u0012\u0013\u000fhH(w\u000e<0\u0010uJ\u0012Df\u0010\u0010 \u0017C4QR_\u000eV}\u001f~\u000e~,-UhxTKIa=.\ni%gDH$]\u0002\u001ddPZ-\u000e|W\u0011\u007f(", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0003\u001cHi_5IL=5\u001e\u001b\u001ah_H\\J2X\u0006.KU\u00181mZ<>$\u001bX\u001dR5\u0016\u0013#\"4wBF#\u00125\u0016W~O|\u0015\u0015\u001b?noU \u000eQ\u0002 \u007fO)2V])aQ@Ic.d\u00195", "9dh@", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000bOd%3~\u0012wT?Dm}\b\u0012ma7\u00169\u0013T\u00016NPWuacz\u0007\u0015\"c\f]/\u0017\u000eg\u000b\u0005~M5.\f6RN\u0011,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icC/KDf+h\flr", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\niUA\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005x\u0005U}\u00184nqFV\u001d\u001d", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SuspendingPointerInputFilterKt {
    private static final PointerEvent EmptyPointerEvent = new PointerEvent(CollectionsKt.emptyList());
    private static final String PointerInputModifierNoParamError = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";

    private static /* synthetic */ void getPointerInputModifierNoParamError$annotations() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0010U\u007f>w}\u001ai&W7\u0004^)1`EZ\u0019<\u0019(\u0019g\nZ.z`\u0004:olQ$Q[a(HX]@I$[\f@-]a\u0002%N5$\rT\u0019X \tGA\u0007\u0014pK[O\u0003\u0002f0\r;\\\u0018D:J2-?gxOl[}\u0002_\n*IO3\u000e\u001f\u001e\u0011BW$_ L;%~\u001c:FMcfY6[fA7|diG+?\u0015\u00164zt'Yj\u0017\u0013-2\u0010L<d\u000f\u0006G#<\u000eq~Q\u001fc=\u001e}} s&3(aj\u0004}gR[Ik\t\u001c[6\"eQC\u0011EpIZ&\u001bL_=R7Hlh<ltg/25hB\u0017q+\u0002^\u000b1:>\u0016\f8=S:~pO\u00194\u0019")
    @InterfaceC1492Gx
    public static final Modifier pointerInput(Modifier modifier, Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        throw new IllegalStateException(PointerInputModifierNoParamError.toString());
    }

    public static final Modifier pointerInput(Modifier modifier, Object obj, Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return modifier.then(new SuspendPointerInputElement(obj, null, null, function2, 6, null));
    }

    public static final Modifier pointerInput(Modifier modifier, Object obj, Object obj2, Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return modifier.then(new SuspendPointerInputElement(obj, obj2, null, function2, 4, null));
    }

    public static final Modifier pointerInput(Modifier modifier, Object[] objArr, Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return modifier.then(new SuspendPointerInputElement(null, null, objArr, function2, 3, null));
    }

    public static final SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode(Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new SuspendingPointerInputModifierNodeImpl(null, null, null, function2);
    }
}
