package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: LifecycleEffect.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d̉=!,u\bDJc|\u0004O\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u0010s{J$c$\bCCU0}*\teNogtJb\u000bQƤ\u000e\u0016~n4Ic\be\u0012\u00155JoU3UoS9ht<\u00078]09\u0012\u0005/\u001cZL\u001ey\u0013Cy\u0010B6FpHW%M3 B\u0010L'\u0019$li^6vn\fBu(ɨmB\\0w^\u000bW%F\u0003)=|g\u001e9EO5C+\u0004\u0018\u0015]sP\u0013A\u0002=3u7);I\"eddÿ\u0018\u00151^Sbę*\\\u0013axD55gcyR>.\u0006\f\u0014\u000fR\u0003<\u0018WN4-(k \u000eaz#hN[\u001aoR\u0002\u000bad$5\u0002C+g)\u0015]ň?\u0019TFB\nڟ\"#\u000f\u00029\u001eb\u0018x\u0015IV(W?bX?^M8kms\u0012\u0005z\u0004@\u0003^Y05\u0002\u0011<\u001c=7\n?S6y\r`Uwx\u0015`\u0017`yTX@P|DCҊ\r\f`S+\n\u07fbTTfA)\u001a*^\u001f}6\u0015Pb\u0006M9'&M}z\u001ap[q\"'Eeek\u001fq\u001cmQ`I4\u007fu@gXv\"DTb3^\u0017Wa\u0017rm8$BH\u0019\u001d\b}TN:!`Kۇ 42@_aČL\u0003,YYC\u0017irh>\u0001\u0005G2\u001b\u0002.\u0005\u000f\u0007Olr\u0006f'[Z\u0016\u0001$C@\u007fGI,[\"v9\u0015#5\u0005$\u0015UrdX\\n&u\u0004\t0\u0018*9\u007f=k\u001fä\u0003)8\u0011sJʆve_g*[\t\u0018\u0012\u000fij^k\u0016o\t,\u000fpzSb3:v\r\u007fS\u001dr\u000b\u0012rV|Wc\u0003\u0018k@Yr1gjZ̞\u0001\u0005%-k\u0002Ȟ&|CJ[U+4\u0010\u0014]\u0017\u0012coo<~z\u000fTz\u0016\u0019:n.\u0001rSm2iWY[\u000f>PD\u001b\u000f\u074cLj}\u0017\t\u000eΌ\u00113VQ|)dVe\u000b]\u007f\u0017\r:\u001e\tXq9A\u0002.:4_8x[}Bds:\u001fXkx}o[\\9i\u001f\f\u001b{_\u000f@(ݞ$V]qO5Ӓw\u0018DTS%\u0013Z!$b.l\u000e\u0019Tlk\u001c\u000f)\u0012ve\u001d+JD\n:\u0005 \u0005~bVV\nxE\u000f'Z\u0016\r\u001aK/\t7A\u0005\u001ced1s2/sK\u0015ƨnO\u0005uk0\u05ffX9)=pM\u0019cuCw\u0004f\nU:\u0006m\u0006\u000bf*-#P,3;g\u0010\u000e\t`d\u0019k|Pzu@x\u0003T()\r\u007f\u0015\u000ej\u0010? 'Z\u000b\u0001r/\\N&VS\u001c\u0011\u0017rI5\u0018ƔgF!<L:ϦAIx+?BeqS}6\"P;\u0012\r9fg\u0014l\tm\u001dP\u0015 (\u0011\u001b)\u0015f\u001f2@zzx\n<\rNO092(ld\u0004\t1B7+\u001b%RMxx8\u0004\u001bo߾Y\u000b\tuw[Ӗr-^7![[O+X\t<AW.])\u007fB\u001bV#D$z)>n\u0014}~vgl\u001d-?kX\u0001A2b\u001e,?(\u0002ą.T.$\u0002W؉Bd\u0017~\rNeВvjVcK׆{ِ\u0001~P՝1\u001fBF\u000b\u001e\u0013.\u000eآq˝\u0011GhԂˀIlÁ%?`c3=B\r\u007f(%\u00131B9ߘʙ*"}, d2 = {"\u001ahU2V@<Z\u0019kzl<\u0005\t\u000ff\u0001(yOi!\u0002C|\nDV2Bc\u000b", "", "\u001ahU2V@<Z\u0019l\nZ9\fh0f\u007f&\u000b)\u000b\u0002\u0013Tk\u0016\u001c\u00042?f", "\u001ahU2V@<Z\u0019^\f^5\fh0f\u007f&\u000b", "", "3uT;g", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc\u0015j})FC", ":hU2V@<Z\u0019h\rg,\n", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "=m4CX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%s9\u000f @|k\u0015IL:x>\"\u0014{+@\u000bd,L\u000b%NL\u0018\u0013`Sr;(\u0010a\u000e8=\u0016\u0005f\u0017\u000btNF&\f5\u0013\u0007LpJ\r&\u00173ytL_\u001e\u0011Z%~?8lPb*O.=Na7n\u0010^0&8D,\u001f{'\u001b2]>\u0013\u000bW\u0019r\u001cWqoR#\t81\u0014Q?\n6", "\u001ahU2V@<Z\u0019kzl<\u0005\t\u000ff\u0001(yO", "3eU2V;L", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E>\u000b\u001f\"Q}\u000e\u0006])6Y{45t\u0016\u001bMQKs4\t\u0011xo9fd-Nt65JX7\\(", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E>\u000b\u001f\"Q}\u000e\u0006])6Y{45t\u0016\u0019ISIk\u001e+sloD\u0011q,.w(GJ]\u0019\\`\u0003D#g", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%\u001fk\u0007 DC|4WRBo=g\u001ayi\u0003\bs5L\u0006+QU\\u=b{;#\u0016d\u0017\u001a\u0001s\u0001b@1xH62Q*S\nFr\u000f\f_\u001bEs\u007fF^\u0010\u0011W\u001f}L3vFf5]+\u00056", "9dh}", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@,9Z}\u001eKk\u001d.\u0017*?l4\u001c)fh9pu5N\u0004|.RX;cV{\u0007\u0019#bWO;\u0016\u0003hE.wR\u0001\u007f\u00185G\u0011?r\nWkt1soO`\u0014F\r^sK1sPg_CTQNq.l\f)zfBE.\"q&pL4qz", "9dh~", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015IL:x>\"\u0014{+@\u000bd,L\u000b%NL\u0018\u0013`Sr;(\u0010a\u000e8=\u0016\u0005f\u0017\u000btNF&\f5\u0013\u0007LpJ\r&\u00173ytL_\u001e\u0011Z%~?8lPb+O.=Na7n\u0010^0&8D,\u001f{'\u001b2]>\u0013\u000bW\u0019r\u001cWqoR#\t81\u0014Q?\n6", "9dh\u007f", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d3J5[_|A\u0013%$\u0015R,\r\u0003m?+n\u000e\u001e#\t,G\u00169o\u0001u(\u00175wF)\\\u001aV\u0001\u0019~\u000b.yN#`\nP?Tf4m\u001a)}lC83\u0018{\"f>7*\u0013z`\u001bvQ\r1eQ!\u0006B2>7hVN~YDtp|U\u0004\u0003\u001c@X\u0002\u0001X\u0011G%", "9dh@", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q'| \u0016Ty\u0012;\nn<]~ 5\u0002\u00145M\r\"o5\u001e\u0013|_@\u0007M>Wv4\u001d3T6kYvF]\u0017k\u0016\u0018,\u001d\u000eWP(xMEhh<R\u007fJl\u000b\u0015ac\u001cfyAc\u001aKx(??3pQcmy\u0011NUk9h\u0014_f:DB/\u001e\u007f\u0019(>4\u0012Ml", "\u001ahU2V@<Z\u0019kzl<\u0005\t\u000ff\u0001(yOd\u001f\"N", "Ab^=X", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%\u001fk\u0007 DC|*VBHu8\u001d(2h=\bc*bt.G\u0016L6d]|K\u0014[A\u0012O+\u000b\u0019WH$[DE/\u0010,4}Kv\u0001k\u0017\u000f5h\u007f0T\u001aRyj\\G3wM]hCLRM,+t\u0015],`DC2]R)$f_2\u0014\u0005\u001ffYN\u0003ftQ\u001dyKm<wcQO}U\u0006\u00027(Z\u007f\u007f\u0012{6~3\u007f7\u001247\fHH<", "\u001ahU2V@<Z\u0019l\nZ9\fh0f\u007f&\u000b", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E>\u000b\u001f\"Q}\u000e\u0006])6Y{45t\u0016\u001c\\?Hz\"-\u001fsA:\bc*]d%QWN\u0002", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E>\u000b\u001f\"Q}\u000e\u0006])6Y{45t\u0016\u001c\\MFUA|\u0019vlC\u0015c\fOw'E[;,jbyLi", "\u001ahU2V@<Z\u0019l\nZ9\fh0f\u007f&\u000b$\t\"\u001e", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%\u001fk\u0007 DC|*VBHu8\u001d(2h=\bc*bt.G\u0016L6d]|K\u0014[A\u0012O+\u000b\u0019WH$\\S3,\u0017\u001aX\fFH\u0002\r\u0016\fDXnLa\u0010\u001d`\u001b\u007fP0lO#d\u000bO\u000bFr3b\u001bc'eH\u0004\u0005$z\u0017*lZ7UQ:\r{Q\u0007qkF,D6.FxeTE9bL}6#S{Ao<`\u007f5\u0003-\u0011\n\u000eyU", ":hU2V@<Z\u0019F\bn5\f\r7eG&\u0006H\f!%Gi\u001b<}%1g}", "1ta?X5M=\"^\f^5\f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LifecycleEffectKt {
    private static final String LifecycleResumeEffectNoParamError = "LifecycleResumeEffect must provide one or more 'key' parameters that define the identity of the LifecycleResumeEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";
    private static final String LifecycleStartEffectNoParamError = "LifecycleStartEffect must provide one or more 'key' parameters that define the identity of the LifecycleStartEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleEventEffect(final androidx.lifecycle.Lifecycle.Event r12, androidx.lifecycle.LifecycleOwner r13, final kotlin.jvm.functions.Function0<kotlin.Unit> r14, androidx.compose.runtime.Composer r15, final int r16, final int r17) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleEventEffect(androidx.lifecycle.Lifecycle$Event, androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleStartEffect(final java.lang.Object r11, androidx.lifecycle.LifecycleOwner r12, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> r13, androidx.compose.runtime.Composer r14, final int r15, final int r16) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Object, androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleStartEffect(final java.lang.Object r12, final java.lang.Object r13, androidx.lifecycle.LifecycleOwner r14, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> r15, androidx.compose.runtime.Composer r16, final int r17, final int r18) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Object, java.lang.Object, androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleStartEffect(final java.lang.Object r13, final java.lang.Object r14, final java.lang.Object r15, androidx.lifecycle.LifecycleOwner r16, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Object, java.lang.Object, java.lang.Object, androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleStartEffect(final java.lang.Object[] r7, androidx.lifecycle.LifecycleOwner r8, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> r9, androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Object[], androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u000fO\u0002:t\u000e\u0018c]:<{b)\u0011TbQ\f;Du!e\u000b\u0006~|]\u000b-jm\fsPR\u001cwK\u0006+BL\u0017\u0016\u0013\u0005'q\u000fzu?F\u0013\u0019L(I-\ns\u0016z\r\u0004v P\u0004\u0005k'G\u0010P\u0015~\u0004E36E\\\u0004T\u0013+t;4}'\u0004{/\u0005 \u0018$<^\u0017\u00133?Iy_\u001d,F>j\u001dL? \u000f=7\u0003*r@!\u000e\nCFlp&\u0004`k\u001d^2\r=\u0013]\f\fW].\u0001nuMs 1\u001b\u0001w!~!<m\u000eu|wpZ \u0007hNX])-cJC\u0018F5\bM0_\u000b!n[% 'g<mvV\u0004e@TI\"l.\u0003#D(7\u0011A\u0018;\u0003\u0005ClH\u0004\u001f d-")
    @InterfaceC1492Gx
    public static final void LifecycleStartEffect(final LifecycleOwner lifecycleOwner, final Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, Composer composer, final int i2, final int i3) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-50807951);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LifecycleStartEffect)P(1)348@16079L7:LifecycleEffect.kt#2vxrgp");
        int i4 = i2 & 1;
        if (i4 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                        Function1<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> function12 = function1;
                        int i6 = i2;
                        LifecycleEffectKt.LifecycleStartEffect(lifecycleOwner2, function12, composer2, RecomposeScopeImplKt.updateChangedFlags((i6 + 1) - (i6 & 1)), i3);
                    }
                });
                return;
            }
            return;
        }
        composerStartRestartGroup.startDefaults();
        if (i4 == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
            if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
                ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localLifecycleOwner);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                i2 = (i2 - 15) - (i2 | (-15));
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
                i2 = (i2 - 15) - (i2 | (-15));
            }
        }
        composerStartRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-50807951, i2, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:350)");
        }
        throw new IllegalStateException(LifecycleStartEffectNoParamError.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LifecycleStartEffectImpl(final LifecycleOwner lifecycleOwner, final LifecycleStartStopEffectScope lifecycleStartStopEffectScope, final Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(228371534);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LifecycleStartEffectImpl)P(1,2)358@16483L661,358@16443L701:LifecycleEffect.kt#2vxrgp");
        if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(lifecycleOwner) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (48 | i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(lifecycleStartStopEffectScope) ? 32 : 16;
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (384 | i2) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 147)) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(228371534, i3, -1, "androidx.lifecycle.compose.LifecycleStartEffectImpl (LifecycleEffect.kt:357)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1076218333, "CC(remember):LifecycleEffect.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(lifecycleStartStopEffectScope);
            int i6 = (i3 + 896) - (896 | i3) == 256 ? 1 : 0;
            boolean z2 = (-1) - (((-1) - (((zChangedInstance ? 1 : 0) + i6) - ((zChangedInstance ? 1 : 0) & i6))) & ((-1) - (composerStartRestartGroup.changedInstance(lifecycleOwner) ? 1 : 0))) == 1;
            LifecycleEffectKt$LifecycleStartEffectImpl$1$1 lifecycleEffectKt$LifecycleStartEffectImpl$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || lifecycleEffectKt$LifecycleStartEffectImpl$1$1RememberedValue == Composer.Companion.getEmpty()) {
                lifecycleEffectKt$LifecycleStartEffectImpl$1$1RememberedValue = new LifecycleEffectKt$LifecycleStartEffectImpl$1$1(lifecycleOwner, lifecycleStartStopEffectScope, function1);
                composerStartRestartGroup.updateRememberedValue(lifecycleEffectKt$LifecycleStartEffectImpl$1$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.DisposableEffect(lifecycleOwner, lifecycleStartStopEffectScope, (Function1) lifecycleEffectKt$LifecycleStartEffectImpl$1$1RememberedValue, composerStartRestartGroup, (i3 + 126) - (i3 | 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffectImpl.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    LifecycleEffectKt.LifecycleStartEffectImpl(lifecycleOwner, lifecycleStartStopEffectScope, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleResumeEffect(final java.lang.Object r11, androidx.lifecycle.LifecycleOwner r12, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleResumePauseEffectScope, ? extends androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult> r13, androidx.compose.runtime.Composer r14, final int r15, final int r16) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(java.lang.Object, androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleResumeEffect(final java.lang.Object r12, final java.lang.Object r13, androidx.lifecycle.LifecycleOwner r14, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleResumePauseEffectScope, ? extends androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult> r15, androidx.compose.runtime.Composer r16, final int r17, final int r18) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(java.lang.Object, java.lang.Object, androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleResumeEffect(final java.lang.Object r13, final java.lang.Object r14, final java.lang.Object r15, androidx.lifecycle.LifecycleOwner r16, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleResumePauseEffectScope, ? extends androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult> r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(java.lang.Object, java.lang.Object, java.lang.Object, androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleResumeEffect(final java.lang.Object[] r8, androidx.lifecycle.LifecycleOwner r9, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleResumePauseEffectScope, ? extends androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult> r10, androidx.compose.runtime.Composer r11, final int r12, final int r13) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(java.lang.Object[], androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u000fO\u0002:t\u000e\u0018c]9-\u000ee\"13bR\u000e*\u0019(\u0019g\nZ.z`\u0004:olQ$Q[a(HX]@I$[\f@-]a\u0002%N5$\rT\u0019X \tGA\u0007\u0014pK[O\u0003\u0002f0\r;\\\u0018D:J2-?gxOl[}\u0002_\n*IO\u0012\b!\u001a\u000eRU\u001e%\u0011CJz\b\u001c\u000bGA[`_p\u001d]=qr*t8*\r\u000e\u00124$\u0003 Ie\u0017\u001335:H\u000fY\u0013\u007fS3<:mvPdcBKqw\u001ey-Bq\\g4{c]1Sj\t\u001b_g\"aS:\u0011M=MPa\\Y$nN_\u0017lyulwYt)H\u0013@\u0015~4\u0001'\n&g\u0005\u0011\u0016r\u0012M:'?I+ZVd$@")
    @InterfaceC1492Gx
    public static final void LifecycleResumeEffect(final LifecycleOwner lifecycleOwner, final Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, Composer composer, final int i2, final int i3) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-747476210);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LifecycleResumeEffect)P(1)680@31558L7:LifecycleEffect.kt#2vxrgp");
        int i4 = i2 & 1;
        if (i4 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                        Function1<LifecycleResumePauseEffectScope, LifecyclePauseOrDisposeEffectResult> function12 = function1;
                        int i6 = i2;
                        LifecycleEffectKt.LifecycleResumeEffect(lifecycleOwner2, function12, composer2, RecomposeScopeImplKt.updateChangedFlags((i6 + 1) - (i6 & 1)), i3);
                    }
                });
                return;
            }
            return;
        }
        composerStartRestartGroup.startDefaults();
        if (i4 == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
            if ((i3 & 1) != 0) {
                ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localLifecycleOwner);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                i2 = (-1) - (((-1) - i2) | ((-1) - (-15)));
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
                i2 = (-1) - (((-1) - i2) | ((-1) - (-15)));
            }
        }
        composerStartRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-747476210, i2, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:682)");
        }
        throw new IllegalStateException(LifecycleResumeEffectNoParamError.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LifecycleResumeEffectImpl(final LifecycleOwner lifecycleOwner, final LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, final Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(912823238);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LifecycleResumeEffectImpl)P(1,2)690@31972L670,690@31932L710:LifecycleEffect.kt#2vxrgp");
        if ((6 & i2) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(lifecycleOwner) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((48 & i2) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(lifecycleResumePauseEffectScope) ? 32 : 16)));
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (384 | i2) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(912823238, i3, -1, "androidx.lifecycle.compose.LifecycleResumeEffectImpl (LifecycleEffect.kt:689)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 657407937, "CC(remember):LifecycleEffect.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(lifecycleResumePauseEffectScope);
            int i5 = (-1) - (((-1) - i3) | ((-1) - 896)) == 256 ? 1 : 0;
            int i6 = ((zChangedInstance ? 1 : 0) + i5) - ((zChangedInstance ? 1 : 0) & i5);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(lifecycleOwner);
            boolean z2 = (i6 + (zChangedInstance2 ? 1 : 0)) - (i6 & (zChangedInstance2 ? 1 : 0)) == 1;
            LifecycleEffectKt$LifecycleResumeEffectImpl$1$1 lifecycleEffectKt$LifecycleResumeEffectImpl$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || lifecycleEffectKt$LifecycleResumeEffectImpl$1$1RememberedValue == Composer.Companion.getEmpty()) {
                lifecycleEffectKt$LifecycleResumeEffectImpl$1$1RememberedValue = new LifecycleEffectKt$LifecycleResumeEffectImpl$1$1(lifecycleOwner, lifecycleResumePauseEffectScope, function1);
                composerStartRestartGroup.updateRememberedValue(lifecycleEffectKt$LifecycleResumeEffectImpl$1$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.DisposableEffect(lifecycleOwner, lifecycleResumePauseEffectScope, (Function1) lifecycleEffectKt$LifecycleResumeEffectImpl$1$1RememberedValue, composerStartRestartGroup, i3 & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffectImpl.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    LifecycleEffectKt.LifecycleResumeEffectImpl(lifecycleOwner, lifecycleResumePauseEffectScope, function1, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> LifecycleEventEffect$lambda$0(State<? extends Function0<Unit>> state) {
        return state.getValue();
    }
}
