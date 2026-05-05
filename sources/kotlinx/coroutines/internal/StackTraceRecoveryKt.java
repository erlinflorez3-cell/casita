package kotlinx.coroutines.internal;

import _COROUTINE.ArtificialStackFrames;
import _COROUTINE.CoroutineDebuggingKt;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.DebugKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яh\u001d̉=!,u\bDJc|\u0004W\u00068\u000b4F\u0007\":\u0013\u007f\u0007llA0ZeP.XS2\u000f\u0002{<$q$yCAX\"}8\tWN}gvJ`\u000bK\u000f\u001c\u0016\u0001j:X]xc\u0012\u00172PoG3SpE9ns>\u0005&6*8\b\u000e\t\u001a0H\u0018v\tIS\f\u00187X\u000eHY%MK\"2\fDĨ\u000f&\u0005g|?xpkDG#Iq\t÷Ϯc0\u000bX%_b3%v(&KF=ߎ#-{\u00035[\u0004?IG8=ݾl'56a\u001ee=p\u007fZ\u001dKU\u0013ƞ\u0001.\u0005\u0005\u007fi<+9Y{K\u0017\u0016X\u007f\t\t%@\u0014\u000e\f(v<sՀlڿ\u00123\u0003\u0002ki^\u0012vBF\u0003\u0002<\u001dӛ\u000e;S9Io\u0002eI#f7B\r=&1\u000e\u0007%\nfv`s,\u001bwΦ5QNP`\u0006\u0018mUmJx\u0003\b0ʶ>O(/*\u001a^\u001b3Ls9i)\u001c\u0006VZ\u007fvKh\u0019awi`J2t&;X\u000btZ#}3\u0004\u0017Tг0\u0011[6l6\f#+6lyL!k\u0018^[xszSm\u000eS1O78\b\u001a+\u0006U~9;ȡq\u0018\nR%\u001dg<)\r\u001ff͞W\fhz@Q@g\u0003\u0010&\u001ct\\\u001a4JI\u0002\"D0_\u001bE\u0015'\u001cL_q\u000b\u0017urr \u0005d7R\u0005R$S\"/h#p״kxWN\u0015t0PYQc=VY0rL|Q\u0010E͟FěkLUq\u00054\u0004{\u0014 \\\"YW5ˋ!\u0017')`\u000b]IZ|}Q\u0014\u001amϗ\u0003ɍ\u0013;v9\u007f%x\u0018D`1RoZ\u001dǱ\u0005f\u001b#6m0}oP\u0013G*\\QZƏMr\u0011dToF%\u001d).+\u0011sP~\u001e-\"@K.(\u001c=\"ya\u0018\u0002\u0017yA ltФ\b,q?\bu_\bJ;ft\u0002\u0003l$\rla[\u000f۳͎\fB\u0017`%TVn|p\u0005fu\u0015?\u0004v\u000bZ\u000fYV:SA\r.8<\u000fBsq|Z^ǜ)\u0011[\u0004\u007f\r{|t\u000bx:2\u000f*3W\u0012zVP^e\u0015!44u\u00016 T)\u0005Ø\r$B_T\u001a\u0019yli40#\u007fth?\u001b@W\f;\u0005\u0017\u001bۿ|bVγxE\u000f \u0001܃Qܓ7\u001e\u0001߶Q\u0011{Fl/\u00121WҸo͢\u001fjWƫ\u000719El9I*/ۡ\r\u0558aCQ\u0379V\u001aU,\u0006s\u000e\u0010`\u001a\u0013\u001cp\u0017I8(Μa۞4`\u0013UrS\u0005\r ljV@-'|\u0013\rj\t=\no\u06ddtƚf/TN\u0006<k$\u0007ҿR]'\f+uv\u001b[\u0018]7CƖxIG{\u0006Uk}6\"Ē+;"}, d2 = {"0`b266Gb\u001d\b\u000bZ;\u0001\u00138I\b3\u0003\u001e\b\u0013%U", "", "AsP0^\u001bKO\u0017~g^*\u0007\u001a/r\u0014\u0006\u0003<\u000f%", "\u000fQC\u00169\u0010\u001c7tet?\u0019Xp\u000f", "\u001aiPCTuEO\"\u0001DL;x\u00075T\r$y@`\u001e\u0017Oo\u0017KL", "0`b266Gb\u001d\b\u000bZ;\u0001\u00138I\b3\u0003\u001e\b\u0013%UX\nDv", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "AsP0^\u001bKO\u0017~g^*\u0007\u001a/r\u0014\u0006\u0003<\u000f%\u007fCw\u000e", "@dR<i,KA(zxd\u001b\n\u0005-e", "\u0013", "", "3wR2c;B]\"", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@VZ}Lk\u001f8@,1b\u007fi&p#8_?8r4s", "A`]6g0SS\u0007\u000ev\\2k\u0016+c\u007f", "1n]A\\5NO(\u0003\u0005g", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@V}\u001dQ~\u0015@\u007fn3c\u000b*G|\u001a7MQ\u0005I>'$ljI\u0003r0X\u007f|\u000b3S(mN<D\u0010\u001b\\W=.\u001a\u000fk=!uD\r", "@dR<i,K4&\t\u0003L;x\u00075F\r$\u0004@", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0003?f\b0Fq\u001f.;R7i:~\"di9\\", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eq\u0001Q\t`\u001bP~\u000eI\u007f!<#[*Dw&=QL;YC\u001a\u0013nBF\u0003k,$", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@V}\u001dQ~\u0015@\u007fn3c\u000b*G|\u001a7MQ\u0005pE&^ljH\u0007p5J}p%V[6lavF\u0014\u007fi\nL1m\u0012UI$D\b\u001e$\u0004=EKBd\n\u000e_|8wzTR\rNyj", "1qT.g,\u001fW\"z\u0002>?z\t:t\u00042\u0005", "1`d@X", "@dbB_;", "@dbB_;,b\u0015|\u0001M9x\u0007/", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CD\u007f4\f@V", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0013DU{&&z\u0012,M#Bk<\u001e\u001ew7", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@V}\u001cC\u0001\n\u0006}!>[G\u000f:z @I@Bk\n\u0005\u001adr5Ps;R}p#Y[(p1rI$\u00120Q50\t\u0016U\u000b+jM9hv/V\fMd}\u0013\u0016c", "1`d@X\bGR\u0007\u000ev\\2\f\u0016+c\u007f", "\u001aj^A_0G\u001d\u0004z~k\u0002", "", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@VZ}My\u001dCz.~Dy$DC", ";da4X\u0019>Q#\u0010zk,{w<a}(\n", "", "@dR<i,KS\u0018l\nZ*\u0003\u0018<a}(", "uZ;7T=:\u001d z\u0004`uj\u0018+c\u0006\u0017\t<~\u0017vNo\u0016<\u007f4\u000b@\u0003\u001cHi_>\\GB5\u0010+\"du\u0018\u0007o<NLj8", "@dR<i,K/\"}ia9\u0007\u001b", "", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@V}\u001dQ~\u0015@\u007fn3c\u000b*G|\u001a7MQ\u0005I>'$ljI\u0003r0X\u007f|\u000b3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPy", "Cmf?T7", "Cmf?T7\"[$\u0006", "1qT.g,,b\u0015|\u0001M9x\u0007/", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6EE\u0012\u001f`Kx\u001d<\u0004.1`G}Az >\\GDk\"-\u0011fg\u001a\u0014_4NLj.QJ=X\u001c\u0003L\u0018\u0019$i[8\t\u00198A0~D\r", "7r0?g0?W\u0017\u0003ve", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u0005-kn5w>\u0001v\u001eGw\u000eE\u0006zxN", "4ha@g\rKO!~^g+|\u001c", "", ";dc5b+'O!~", "uZ;7T=:\u001d z\u0004`uj\u0018+c\u0006\u0017\t<~\u0017vNo\u0016<\u007f4\u000b@\u0003\u001cHi_5IL=5\"-\"lj;\\'\u0010", "3kT:X5ME\u001d\rz>8\r\u00056s", ExifInterface.GPS_MEASUREMENT_3D, "uKY.i(\bZ\u0015\b|(\u001a\f\u0005-kn5w>\u0001v\u001eGw\u000eE\u0006z\u001c^y137\u001d*VE\u0005YC\u001a\u0013nPF\u0003a,.}'OLW;2\u0016g", "\u0011na<h;B\\\u0019l\nZ*\u0003i<a\b(", "!sP0^\u001bKO\u0017~Ze,\u0005\t8t", "7mXA6(Na\u0019", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class StackTraceRecoveryKt {
    private static final StackTraceElement ARTIFICIAL_FRAME;
    private static final String baseContinuationImplClass = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    private static final String baseContinuationImplClassName;
    private static final String stackTraceRecoveryClass = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    private static final String stackTraceRecoveryClassName;

    static {
        Object objM8980constructorimpl;
        Object objM8980constructorimpl2;
        Object obj = stackTraceRecoveryClass;
        Object obj2 = baseContinuationImplClass;
        ARTIFICIAL_FRAME = new ArtificialStackFrames().coroutineBoundary();
        try {
            Result.Companion companion = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl(Class.forName(baseContinuationImplClass).getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8983exceptionOrNullimpl(objM8980constructorimpl) == null) {
            obj2 = objM8980constructorimpl;
        }
        baseContinuationImplClassName = (String) obj2;
        try {
            Result.Companion companion3 = Result.Companion;
            objM8980constructorimpl2 = Result.m8980constructorimpl(Class.forName(stackTraceRecoveryClass).getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            objM8980constructorimpl2 = Result.m8980constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m8983exceptionOrNullimpl(objM8980constructorimpl2) == null) {
            obj = objM8980constructorimpl2;
        }
        stackTraceRecoveryClassName = (String) obj;
    }

    public static /* synthetic */ void CoroutineStackFrame$annotations() {
    }

    public static /* synthetic */ void StackTraceElement$annotations() {
    }

    private static final <E extends Throwable> Pair<E, StackTraceElement[]> causeAndStacktrace(E e2) {
        Throwable cause = e2.getCause();
        if (cause == null || !Intrinsics.areEqual(cause.getClass(), e2.getClass())) {
            return TuplesKt.to(e2, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e2.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (isArtificial(stackTraceElement)) {
                return TuplesKt.to(cause, stackTrace);
            }
        }
        return TuplesKt.to(e2, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E createFinalException(E e2, E e3, ArrayDeque<StackTraceElement> arrayDeque) throws Throwable {
        arrayDeque.addFirst(ARTIFICIAL_FRAME);
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int iFirstFrameIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int i2 = 0;
        if (iFirstFrameIndex == -1) {
            e3.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e3;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + iFirstFrameIndex];
        for (int i3 = 0; i3 < iFirstFrameIndex; i3++) {
            stackTraceElementArr[i3] = stackTrace[i3];
        }
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i2 + iFirstFrameIndex] = (StackTraceElement) it.next();
            i2++;
        }
        e3.setStackTrace(stackTraceElementArr);
        return e3;
    }

    private static final ArrayDeque<StackTraceElement> createStackTrace(CoroutineStackFrame coroutineStackFrame) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = coroutineStackFrame.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            if (!(coroutineStackFrame instanceof CoroutineStackFrame)) {
                coroutineStackFrame = null;
            }
            if (coroutineStackFrame == null || (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) == null) {
                break;
            }
            StackTraceElement stackTraceElement2 = coroutineStackFrame.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
        return arrayDeque;
    }

    private static final boolean elementWiseEquals(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("A7K5\u0001>2>6{ @,-4\u001c9'()\b.&-$,1", (short) (C1633zX.Xd() ^ (-24049)))).getMethod(C1593ug.zd("xw\b`~\u0005|f\u000f\b}\u0002\u0010", (short) (C1633zX.Xd() ^ (-19472)), (short) (C1633zX.Xd() ^ (-16250))), new Class[0]);
        try {
            method.setAccessible(true);
            int iIntValue = ((Integer) method.invoke(stackTraceElement, objArr)).intValue();
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.od("SI]G\u0013PDPH\u000e2R>?F.K9:;\u001a@8?6>C", (short) (OY.Xd() ^ 3924))).getMethod(C1561oA.Kd("+*:\u001317/\u0019A:04B", (short) (OY.Xd() ^ 14996)), new Class[0]);
            try {
                method2.setAccessible(true);
                if (iIntValue == ((Integer) method2.invoke(stackTraceElement2, objArr2)).intValue()) {
                    short sXd = (short) (FB.Xd() ^ 11461);
                    short sXd2 = (short) (FB.Xd() ^ 8153);
                    int[] iArr = new int["k^\u000erI\u0010~&)[\u001b6-G9<dO[WA\u0003c\u0006\b\u000b-".length()];
                    QB qb = new QB("k^\u000erI\u0010~&)[\u001b6-G9<dO[WA\u0003c\u0006\b\u000b-");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                        i2++;
                    }
                    Class<?> cls = Class.forName(new String(iArr, 0, i2));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr3 = new Object[0];
                    short sXd3 = (short) (C1607wl.Xd() ^ 24673);
                    int[] iArr2 = new int["\f\u000b\u001bt\u000e\u001e\u0013\u001b\u0011{\u0010\u001d\u0016".length()];
                    QB qb2 = new QB("\f\u000b\u001bt\u000e\u001e\u0013\u001b\u0011{\u0010\u001d\u0016");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
                        i3++;
                    }
                    Method method3 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                    try {
                        method3.setAccessible(true);
                        String str = (String) method3.invoke(stackTraceElement, objArr3);
                        Object[] objArr4 = new Object[0];
                        Method method4 = Class.forName(Wg.vd("dZr\\$aYei/Ww_`kS|jopKqmtw\u007f\t", (short) (C1633zX.Xd() ^ (-8527)))).getMethod(Qg.kd("=:H 7E8>2\u001b-8/", (short) (C1607wl.Xd() ^ 11401), (short) (C1607wl.Xd() ^ 24404)), new Class[0]);
                        try {
                            method4.setAccessible(true);
                            if (Intrinsics.areEqual(str, (String) method4.invoke(stackTraceElement2, objArr4))) {
                                Class<?> cls2 = Class.forName(hg.Vd("\u001d\u0013'\u0011\\\u001a\u000e\u001a\u0012W{\u001c\b\t\u0010w\u0015\u0003\u0004\u0005c\n\u0002\t\u007f\b\r", (short) (C1607wl.Xd() ^ 9290), (short) (C1607wl.Xd() ^ 29021)));
                                Class<?>[] clsArr2 = new Class[0];
                                Object[] objArr5 = new Object[0];
                                short sXd4 = (short) (C1607wl.Xd() ^ 17260);
                                int[] iArr3 = new int["\u000f\f\u001aj\r\u000f\u0007n\u0001\f\u0003".length()];
                                QB qb3 = new QB("\u000f\f\u001aj\r\u000f\u0007n\u0001\f\u0003");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3));
                                    i4++;
                                }
                                Method method5 = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
                                try {
                                    method5.setAccessible(true);
                                    String str2 = (String) method5.invoke(stackTraceElement, objArr5);
                                    Object[] objArr6 = new Object[0];
                                    Method method6 = Class.forName(C1561oA.yd("xn\u0003l@}q}m3Wwkls[\u0011~\u007f\u0001g\u000e\u0006\r{\u0004\t", (short) (C1499aX.Xd() ^ (-18009)))).getMethod(C1561oA.Yd("`_oBfjdNboh", (short) (C1580rY.Xd() ^ (-31448))), new Class[0]);
                                    try {
                                        method6.setAccessible(true);
                                        if (Intrinsics.areEqual(str2, (String) method6.invoke(stackTraceElement2, objArr6))) {
                                            Object[] objArr7 = new Object[0];
                                            Method method7 = Class.forName(Xg.qd("D<R>\fKAOI\u00117YGJS=\\LOR3[U^Wah", (short) (Od.Xd() ^ (-5138)), (short) (Od.Xd() ^ (-9712)))).getMethod(Jg.Wd("C$dGas\u0018\rw85C", (short) (C1580rY.Xd() ^ (-13961)), (short) (C1580rY.Xd() ^ (-6249))), new Class[0]);
                                            try {
                                                method7.setAccessible(true);
                                                String str3 = (String) method7.invoke(stackTraceElement, objArr7);
                                                Object[] objArr8 = new Object[0];
                                                Method method8 = Class.forName(ZO.xd("C?AK_D\b\r9\u000fBX_Nr\u0010\u001bL,\u0019ZR_d\u000b@Z", (short) (ZN.Xd() ^ 687), (short) (ZN.Xd() ^ 8092))).getMethod(C1626yg.Ud("+e\u000fK\u00051\u0001,3\u00074\\", (short) (C1633zX.Xd() ^ (-14806)), (short) (C1633zX.Xd() ^ (-1299))), new Class[0]);
                                                try {
                                                    method8.setAccessible(true);
                                                    if (Intrinsics.areEqual(str3, (String) method8.invoke(stackTraceElement2, objArr8))) {
                                                        return true;
                                                    }
                                                } catch (InvocationTargetException e2) {
                                                    throw e2.getCause();
                                                }
                                            } catch (InvocationTargetException e3) {
                                                throw e3.getCause();
                                            }
                                        }
                                    } catch (InvocationTargetException e4) {
                                        throw e4.getCause();
                                    }
                                } catch (InvocationTargetException e5) {
                                    throw e5.getCause();
                                }
                            }
                        } catch (InvocationTargetException e6) {
                            throw e6.getCause();
                        }
                    } catch (InvocationTargetException e7) {
                        throw e7.getCause();
                    }
                }
                return false;
            } catch (InvocationTargetException e8) {
                throw e8.getCause();
            }
        } catch (InvocationTargetException e9) {
            throw e9.getCause();
        }
    }

    private static final int firstFrameIndex(StackTraceElement[] stackTraceElementArr, String str) throws Throwable {
        int length = stackTraceElementArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            short sXd = (short) (FB.Xd() ^ 4994);
            int[] iArr = new int["\u0017EH\u0010DEb\u007f9d\f\u000bH@H;\u0011\u001eG]~a||*[\u0003".length()];
            QB qb = new QB("\u0017EH\u0010DEb\u007f9d\f\u000bH@H;\u0011\u001eG]~a||*[\u0003");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
                i3++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i3)).getMethod(EO.Od("\u001dTQ|}7yy+\u000f\u001dr", (short) (C1633zX.Xd() ^ (-17751))), new Class[0]);
            try {
                method.setAccessible(true);
                if (Intrinsics.areEqual(str, (String) method.invoke(stackTraceElement, objArr))) {
                    return i2;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return -1;
    }

    public static final void initCause(Throwable th, Throwable th2) {
        th.initCause(th2);
    }

    public static final boolean isArtificial(StackTraceElement stackTraceElement) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.Qd("6,@*u3'3+p\u00155!\")\u0011.\u001c\u001d\u001e|#\u001b\"\u0019!&", (short) (FB.Xd() ^ 14086)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 7421);
        short sXd2 = (short) (ZN.Xd() ^ 13658);
        int[] iArr = new int["zy\nY\u0004y\r\u000ei}\u000b\u0004".length()];
        QB qb = new QB("zy\nY\u0004y\r\u000ei}\u000b\u0004");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return StringsKt.startsWith$default((String) method.invoke(stackTraceElement, objArr), CoroutineDebuggingKt.getARTIFICIAL_FRAME_PACKAGE_NAME(), false, 2, (Object) null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static final void mergeRecoveredTraces(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (isArtificial(stackTraceElementArr[i2])) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = i2 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i3 > length2) {
            return;
        }
        while (true) {
            if (elementWiseEquals(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i3) {
                return;
            } else {
                length2--;
            }
        }
    }

    public static final Object recoverAndThrow(Throwable th, Continuation<?> continuation) throws Throwable {
        if (DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof CoroutineStackFrame)) {
            throw recoverFromStackFrame(th, (CoroutineStackFrame) continuation);
        }
        throw th;
    }

    private static final Object recoverAndThrow$$forInline(Throwable th, Continuation<?> continuation) throws Throwable {
        if (!DebugKt.getRECOVER_STACK_TRACES()) {
            throw th;
        }
        InlineMarker.mark(0);
        if (continuation instanceof CoroutineStackFrame) {
            throw recoverFromStackFrame(th, (CoroutineStackFrame) continuation);
        }
        throw th;
    }

    public static final <E extends Throwable> E recoverFromStackFrame(E e2, CoroutineStackFrame coroutineStackFrame) {
        Pair pairCauseAndStacktrace = causeAndStacktrace(e2);
        Throwable th = (Throwable) pairCauseAndStacktrace.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) pairCauseAndStacktrace.component2();
        Throwable thTryCopyException = ExceptionsConstructorKt.tryCopyException(th);
        if (thTryCopyException == null) {
            return e2;
        }
        ArrayDeque<StackTraceElement> arrayDequeCreateStackTrace = createStackTrace(coroutineStackFrame);
        if (arrayDequeCreateStackTrace.isEmpty()) {
            return e2;
        }
        if (th != e2) {
            mergeRecoveredTraces(stackTraceElementArr, arrayDequeCreateStackTrace);
        }
        return (E) createFinalException(th, thTryCopyException, arrayDequeCreateStackTrace);
    }

    public static final <E extends Throwable> E recoverStackTrace(E e2) {
        Throwable thTryCopyException;
        return (DebugKt.getRECOVER_STACK_TRACES() && (thTryCopyException = ExceptionsConstructorKt.tryCopyException(e2)) != null) ? (E) sanitizeStackTrace(thTryCopyException) : e2;
    }

    public static final <E extends Throwable> E recoverStackTrace(E e2, Continuation<?> continuation) {
        return (DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof CoroutineStackFrame)) ? (E) recoverFromStackFrame(e2, (CoroutineStackFrame) continuation) : e2;
    }

    private static final <E extends Throwable> E sanitizeStackTrace(E e2) throws Throwable {
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i2 = length2 - 1;
                StackTraceElement stackTraceElement = stackTrace[length2];
                String str = stackTraceRecoveryClassName;
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.od("tj~h4qeqi/Ss_`gOlZ[\\;aY`W_d", (short) (C1499aX.Xd() ^ (-14022)))).getMethod(C1561oA.Kd("QP`0ZPcd@TaZ", (short) (FB.Xd() ^ 12225)), new Class[0]);
                try {
                    method.setAccessible(true);
                    if (Intrinsics.areEqual(str, (String) method.invoke(stackTraceElement, objArr))) {
                        break;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        } else {
            length2 = -1;
        }
        int i3 = length2 + 1;
        int iFirstFrameIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int i4 = 0;
        int i5 = (length - length2) - (iFirstFrameIndex == -1 ? 0 : length - iFirstFrameIndex);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i5];
        while (i4 < i5) {
            stackTraceElementArr[i4] = i4 == 0 ? ARTIFICIAL_FRAME : stackTrace[(i3 + i4) - 1];
            i4++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    public static final <E extends Throwable> E unwrap(E e2) {
        return !DebugKt.getRECOVER_STACK_TRACES() ? e2 : (E) unwrapImpl(e2);
    }

    public static final <E extends Throwable> E unwrapImpl(E e2) {
        E e3 = (E) e2.getCause();
        if (e3 != null && Intrinsics.areEqual(e3.getClass(), e2.getClass())) {
            for (StackTraceElement stackTraceElement : e2.getStackTrace()) {
                if (isArtificial(stackTraceElement)) {
                    return e3;
                }
            }
        }
        return e2;
    }
}
