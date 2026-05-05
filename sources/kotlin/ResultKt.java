package kotlin;

import com.dynatrace.android.agent.Global;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
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
@Metadata(bv = {}, d1 = {"Я<\u001d̉=!,˛\bӵLc\u0003\u0005Iي8\u000bDB\u0007\"2\u0012\u007f\u0007|jA0JgP.hS2\u000f\u0002{<$a1yCIU\"}(\tWN}gvJ`\f[\u001d\u0014ǝ\u0011jZH\u0006|k\u0012'2pp\u00062e\u0019K;xzF\u000702h<(\b!\u001c0Ϻ\u001ez+MY\u0011*6PrJRSQ3 XçDơ\u007fȦ֔kNDO\u0005Ҝ9=+\u001bi\tRGa6ŧ[\u0011fV-\f\u0005jF1P9E\u0015k\\1\n\u0003zM\rW\rM\u0016x6m4ʁwa<d\u0010\u001a\u001b8_\u000fcxLj\u0015Sp\fm/}n{o\u001c7\u0010\u0016\f\u001eL\u0013<\u0007όL83&v\u000e\u0014@\u0005tYFv\u0002nD\u0010z(:E0Fę1߆\u001aƘϢaM!T=z\u0015\r,\"\u001f͙)aZ\rp\u0015)T\u0016\u0383śU@KXf8gN\u0006\u00047f\",\n\u0382U\u0004O\u0002\u0017-%._[\u007f'Iq\u0012JTg=\u000e\u000fk\u0004m`ZX\"5\u001a}ѯ\u000fɔ^Dr\u0018\u0004*blD\u0011\u0014 t\t\u0004ܱ!$|}B 3\u0019vO/m\u0013Sm\f5/-@\bq\u001c-eHvNEbs\u001f\u0010Sλ\u0018IBn\u0015^lOc\u000e`bN\"BJz\u0010>\u007frYRƖ8Ǧpʉؼ,9!b\u001bG\u0013\u001eP@\u001bȁރ^h\u001e\u0014lO2\u0019\u0002$;\u0012!Rbʙ}p!O<~p\"sJ\u007f8_ħ[ɋl4\u000b:\u001fZ\u0002\u0018_m\\I\\l\\y\u0004~@\u0018 ߙ_3]\u0015\u0015}7;*3UN\u0003e\u0018V@*+\u001c\b(S\u0004>x\u0018y75߯nTU`'(|k\u0003%\u000ej&\bqH\u000bG*X9f\u0005μxľXߢҁ8\u0005\r%$$\u0011o0{SԆϡ+\u001d$\r,}#{uo\u007f0\nbU*#h$.iܞ}fq_8:FR\u0002\u0005N$4lIKvm('P\"L(CYQs7_иQ\u00155\nv\r2\u001a\u0001Xa@9}\u000e6>_pwq\tZٳIӒ\u0010\u07bdϬkm{`t`X\u001e\"\u0011\f3~\u0012bFNYwd\u000fݵ\u0014|@<Q=r\u0005\u0003\u0012R7\\[\u0016&[oy\u0017 \n.Gݍ\u0013!8N\u0004A\\\u001bdzb\\n\u0005pGp!X\u001d-\u001ayͰ~î0܊֊F\\7i8\u007fc\u001d\u0017\u001a\tʪǎj%9Yl\u000f)2p\u0007\u001bGmC\u0010\u000bd\u0007g+s }\u0015`\u001e\r\u001fR\u0018aB\u007f\u0014\u0010\u0016>y#pt_t\u0006XoŽR,/\u000b\u000b\u0003\u0014I\u001a\u0011\u0011\u001fu\u0001\u007fd=L|\u0014eN`ݍ\u001d٦(܍ќ|kN!3\u0005E-KH\t̟ր\u007fWaP\u0016g.=?\n\u0005#lWTj8`;<\u001cފ$f\"\u000f\u0019O.\rVJ;v24\u00188_\u0002y\u000bAa\n\u000b\u0006:XB;}\u0016Qyiǰ\u000emro~[\u0011\u0010v3\\\u007f\u0015-`\u001f\u0019'\u00142Ac!Ϙ\u0017؟\u001fǅҼ\u007f\u001c\u001d,%5\u0018b7\u000fmɪ\u05cftk]p%}=\nBgA2b\u001eD#(x$,Zӏ#?vSDc\u0017e\u0015B\u001e\u0012\u0007p8f\u0005\fo\u001d+\u0002x}\u001f,La\u0003/t>e\u001a۵_\u0017Ml\u0017\nKV6#7Xe\u001bG4\u001bonz?\u000e\u0001ŏz̍)Х֟v\u007fuAE\u0005b?2-i&}dI*yHXD\u000eϴ\u001f\u001711`7.B\u0005\u001abD\u0002HO\u001e)\u0012%:\u0016oM\"ElaSk./\bӸ\u0011?\u007fP2§yڻq܌˧\u0013o)l~N3U}LU(*iZ~Sd\u0005\u0012(+ޜ9E,\u001b\u07bd@\u0005\u0012\"*ڨ6$\"ǰIS"}, d2 = {"1qT.g,\u001fO\u001d\u0006\u000bk,", "", "3wR2c;B]\"", "", "@t]\u0010T;<V\u001d\b|", "\u001aj^A_0G\u001d\u0006~\tn3\f^", Global.BLANK, "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "4n[1", "\"", "=mBBV*>a'", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "D`[BX", "=m5.\\3N`\u0019", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u00025|1VSR5&W\u0004E]\u0013j\u0017L:\u0011\u000fbOmOT@\u001d\u00170S\u000b\u0007>Dr\u001b\nFf:IR\u0019IC~rF)fU/", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "2dU.h3MD\u0015\u0006\u000b^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", "5dc\u001ce\fEa\u0019", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "5dc\u001ce\u001bA`#\u0011", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", ";`_", "BqP;f-H`!", ";`_\u0010T;<V\u001d\b|", "/bc6b5", "", "@dR<i,K", "@dR<i,K1\u0015\u000exa0\u0006\u000b", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "Bga<j\u0016G4\u0015\u0003\u0002n9|", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ResultKt {
    public static final Object createFailure(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new Result.Failure(exception);
    }

    private static final <R, T> R fold(Object obj, Function1<? super T, ? extends R> onSuccess, Function1<? super Throwable, ? extends R> onFailure) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Throwable thM8983exceptionOrNullimpl = Result.m8983exceptionOrNullimpl(obj);
        return thM8983exceptionOrNullimpl == null ? onSuccess.invoke(obj) : onFailure.invoke(thM8983exceptionOrNullimpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <R, T extends R> R getOrDefault(Object obj, R r2) {
        return Result.m8986isFailureimpl(obj) ? r2 : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <R, T extends R> R getOrElse(Object obj, Function1<? super Throwable, ? extends R> onFailure) {
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Throwable thM8983exceptionOrNullimpl = Result.m8983exceptionOrNullimpl(obj);
        return thM8983exceptionOrNullimpl == null ? obj : onFailure.invoke(thM8983exceptionOrNullimpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> T getOrThrow(Object obj) {
        throwOnFailure(obj);
        return obj;
    }

    private static final <R, T> Object map(Object obj, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (!Result.m8987isSuccessimpl(obj)) {
            return Result.m8980constructorimpl(obj);
        }
        Result.Companion companion = Result.Companion;
        return Result.m8980constructorimpl(transform.invoke(obj));
    }

    private static final <R, T> Object mapCatching(Object obj, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (!Result.m8987isSuccessimpl(obj)) {
            return Result.m8980constructorimpl(obj);
        }
        try {
            Result.Companion companion = Result.Companion;
            return Result.m8980constructorimpl(transform.invoke(obj));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.m8980constructorimpl(createFailure(th));
        }
    }

    private static final <T> Object onFailure(Object obj, Function1<? super Throwable, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Throwable thM8983exceptionOrNullimpl = Result.m8983exceptionOrNullimpl(obj);
        if (thM8983exceptionOrNullimpl != null) {
            action.invoke(thM8983exceptionOrNullimpl);
        }
        return obj;
    }

    private static final <T> Object onSuccess(Object obj, Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (Result.m8987isSuccessimpl(obj)) {
            action.invoke(obj);
        }
        return obj;
    }

    private static final <R, T extends R> Object recover(Object obj, Function1<? super Throwable, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Throwable thM8983exceptionOrNullimpl = Result.m8983exceptionOrNullimpl(obj);
        if (thM8983exceptionOrNullimpl == null) {
            return obj;
        }
        Result.Companion companion = Result.Companion;
        return Result.m8980constructorimpl(transform.invoke(thM8983exceptionOrNullimpl));
    }

    private static final <R, T extends R> Object recoverCatching(Object obj, Function1<? super Throwable, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Throwable thM8983exceptionOrNullimpl = Result.m8983exceptionOrNullimpl(obj);
        if (thM8983exceptionOrNullimpl == null) {
            return obj;
        }
        try {
            Result.Companion companion = Result.Companion;
            return Result.m8980constructorimpl(transform.invoke(thM8983exceptionOrNullimpl));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.m8980constructorimpl(createFailure(th));
        }
    }

    private static final <T, R> Object runCatching(T t2, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.Companion;
            return Result.m8980constructorimpl(block.invoke(t2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.m8980constructorimpl(createFailure(th));
        }
    }

    private static final <R> Object runCatching(Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.Companion;
            return Result.m8980constructorimpl(block.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.m8980constructorimpl(createFailure(th));
        }
    }

    public static final void throwOnFailure(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }
}
