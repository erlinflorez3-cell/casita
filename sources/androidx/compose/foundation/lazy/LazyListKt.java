package androidx.compose.foundation.lazy;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: compiled from: LazyList.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĉ\u0014D߬)\u001ew\u007fL܀kt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u001dfrˎ8DsQ6RY*\u0017k\u00124,[*qK;c \u0006̝\u0011OdgoñRZ!C\u0017إ\u001ex\u0001,Qǁ\u0001](\u000f:ԏw?IMw=O`|6\u001b :\">y\r\u00010*P\u0010\rzKK\"\u00128@\u0007:Z҈U\u00050\u0012\u000e>6\u0001&ձoNLHtҗB/9\u0003qBT(wܷ{[ε^TU\f'e,+X7c\u0016UW\u0011\tj[m\u0006ouK\t\u0001'U0ywe<p\u007fB\u001c[S\u001be\u000b&\u000b\f\u0002d\u001a0CO\u0012U\u0001\u00126\u0003\u0013{;C4\u0014\f'V:E\u001a\u0015\u0015>;zraNh\u0004tA.\n\u0012>\u001d%\u000eCC;1e\u007frk!T7\n\u0017% 9\u007f\u001d4\f\\\u0014`#/lyg0\u007fUm]\\ qN}\u0006\u0001b0B\u00142W\u007f]z?Eϲ)7aRi Ƞ\u0006HR\u0002\u000fݮ_vn\u0002iXB2nDT:\u000b\u001cZr\u0003\u0015m`T\u0007K?iɟX\u0007\u0004!C*j\u0018T'5\u0012^O\u0017\f\u0019n\u000e\u000e31~7\bq\u001c\u0012e=v3cV\u0014\u0014oX\u000f\u0014mC\u0013\tfnZS:a\r,0>`j>\u0005,J\\\u001a+4UpJC\\7'n-J\u0019\u001dpT-\u000fmn\u0001\u0012\u0015Sa93o2\u0005!\u0003f[\u001f\u0001\u0018|WO\u0015`PQqUC>>UP\u000fd\u00011.\u0017s.N.MܤPl$\u001eʆ\u007fI"}, d2 = {"\u001a`iF?0Lb", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\"-\u0011wa\u000f", "1n]AX5M>\u0015}yb5~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "@de2e:>:\u0015\u0013\u0005n;", "", "7rE2e;BQ\u0015\u0006", "4kX;Z\t>V\u0015\u0010~h9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w.J?t6z\u0015k]J\u000bm9$", "CrT?F*K] \u0006Zg(y\u0010/d", "0dh<a+\u001b])\byl\u0010\f\t7C\n8\u0005O", "", "6na6m6Gb\u0015\u0006Ve0~\u00127e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "DdaA\\*:Zt\f\bZ5~\t7e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwwc9]z%CS$", "DdaA\\*:Zt\u0006~`5\u0005\t8t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", "6na6m6Gb\u0015\u0006Vk9x\u00121e\b(\u0005O", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J32", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\"\u001c\u001fsa\u000f", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pd6^\u007f&C[R6e\u001cy9)&$tJ@!k]O3\\S3.\b\u00020}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?B3xOX[\tKKN,1` i-k\u0004% \u0013p\u001d$jA*\u0011\fS\u001fHGnNcP\u0018\bB(=\u0001%DOw`F\u0003'hL\u0006\b\u001b1T\u0004/~6M6*Ds\u0015Xg&\b?\u007f\u00195^\u001e')2M\u0017IX9jP%\nq\u001en\u0012\u0012aHz\u0017omnR\u001d\u0007''_~=f\u00059[\u000e>R~S\nP\fFp\u0004\u001e\u0018\u0003+CLEL\u001aa\u000b\u001eoWk]\u001b\u000b\u000ep&\u001cw\u0017Gi\u0018g&n;W\u001cRo4 \u0006iR^LU\u001diTt[_o-E7\u0002I.BO:rY\u0019V\f\u001f3\u000e\u0015\u0003\u001c\u00073@\u0004>\u001e/3=#Hf*\u000b\u0012kU+!gA+]\u001e1\u000faDlZ~|{y\u0017g\n\u001fa=KK1KQu,Jc\u0015\u0006Fj[\u000f(\\\u00199i>\u001d>o}EY8i\r\u0011'\u0002\u0015\u001c4&~V]J%<j!\u0016\u0013~\u00196pg^X%T\u0017w\u0012M+\u0006%0\u0015\u0019 Ul\u001fU\u000fr$JWF\u0006#=\u0011I*l.a6\u0007m>y4j?\u001c\u000e\u0013Z\u0015\u001f\u000f(k\u001f\t{tNx?[*\u0017~d?#$\u001fx\u001cc\u000b", "@d\\2`)>`\u007fz\u0010r\u0013\u0001\u0017>M\u007f$\nP\u000e\u0017\u0002Qv\u0012:\u000b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,JP|H\u0014g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "7sT:C9Hd\u001d}zk\u0013x\u0011,d{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u0018-\u0015pLF\u0011t0Mv4\u001d", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "5qP=[0<av\t\u0004m,\u0010\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<+MDz41$>", "AsX0^@!S\u0015}zk:\\\u0012+b\u0007(z", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cuO\u00017PKJ;`\\{\u0007\u001b\u000eo\"\u0018\u0012\t\u001am((|S%.\u0004;IW\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004AriPihxCPIl3.\u0013[1fJIm~m\u0018\u001alY0zwZ!r`O\\\\+\u007fvA#Kw_EX9SF|2)Y{A\"6\"P2x/\r<*?sC.q%Bs\u0003\u001e;XH|\r2E\u0012LUgt\u007f\b\fr'l\u0012\u001cb~A\u001d/AjL\u0011\u0010e\u0017dD P\u0001Da\n<Evj\u000eB\bAh\u0004\u0019\b\u001amkoQN%b\u0001cqN2h\u0010~\u0012j\"%w\u001d9m\u0019x9)\u0013Z \u0005q:\f\u0004YL$/+\u001azO\be`~ =NwE*2XFzQV9\u000e <\f\u0015\r\u001d=jL\n?\u0012!4AcA,g+\u001fqc1bCE)\u001b63\u0002Z@wm6\u0018\u0015\u000b\u001dlz\u0011d\u0014\u001f\b=PPn+O-I\u000fIdb\u001f0V\u0015=*R Oe\u0004DNw\u000em\u00025\u0004\u0013q\u0013\"~F,q\u001f.yU\n\u0014w(9)\u0001\"^\u001a\u0017\u0015{DS\u001d\u0002Y=Nq/Bs\u0018P~7!DWWv2B]r;\u0002;WD\u0004g9\u000ej\u001fK\u001a\u0011\u0012^\u0007hR+d%}\u007fl\u0018\rkY-\u0016\u0003VLk2\u001fX\u001f&$\u0010\\I~5\belS\u0002<\u001fyHr|\u0018J};\u0006&/\u00060sP4C", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyListKt {
    public static final void LazyList(final Modifier modifier, final LazyListState lazyListState, final PaddingValues paddingValues, boolean z2, final boolean z3, final FlingBehavior flingBehavior, final boolean z4, int i2, Alignment.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, Arrangement.Horizontal horizontal2, final Function1<? super LazyListScope, Unit> function1, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        final Arrangement.Horizontal horizontal3;
        int i8;
        Alignment.Vertical vertical3 = vertical2;
        Arrangement.Vertical vertical4 = vertical;
        Alignment.Horizontal horizontal4 = horizontal;
        int i9 = i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(620764179);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LazyList)P(7,9,2,8,6,3,10!1,4,12,11,5)81@3859L50,83@3935L48,84@4009L24,85@4081L7,86@4150L7,88@4183L395,109@4816L278,117@5164L153,123@5480L7,116@5108L481,128@5650L317,105@4671L1429:LazyList.kt#428nma");
        if ((i5 & 1) != 0) {
            i6 = (-1) - (((-1) - i3) & ((-1) - 6));
        } else if ((i3 & 6) == 0) {
            i6 = (-1) - (((-1) - (composerStartRestartGroup.changed(modifier) ? 4 : 2)) & ((-1) - i3));
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 = (i6 + 48) - (i6 & 48);
        } else if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(lazyListState) ? 32 : 16)));
        }
        if ((-1) - (((-1) - i5) | ((-1) - 4)) != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(paddingValues) ? 256 : 128)));
        }
        boolean z5 = z2;
        if ((i5 + 8) - (i5 | 8) != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 3072));
        } else if ((i3 + 3072) - (i3 | 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
        }
        if ((i5 & 16) != 0) {
            i6 = (i6 + 24576) - (i6 & 24576);
        } else if ((i3 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
        }
        if ((i5 + 32) - (i5 | 32) != 0) {
            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i3 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i3 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(flingBehavior) ? 131072 : 65536)));
        }
        if ((i5 + 64) - (i5 | 64) != 0) {
            i6 = (i6 + 1572864) - (i6 & 1572864);
        } else if ((i3 + 1572864) - (i3 | 1572864) == 0) {
            int i10 = composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
            i6 = (i6 + i10) - (i6 & i10);
        }
        int i11 = (-1) - (((-1) - i5) | ((-1) - 128));
        if (i11 != 0) {
            i6 |= 12582912;
        } else if ((i3 + 12582912) - (i3 | 12582912) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(i9) ? 8388608 : 4194304)));
        }
        int i12 = i5 & 256;
        if (i12 != 0) {
            i6 = (i6 + 100663296) - (i6 & 100663296);
        } else if ((i3 & 100663296) == 0) {
            i6 |= composerStartRestartGroup.changed(horizontal4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i13 = (-1) - (((-1) - i5) | ((-1) - 512));
        if (i13 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 805306368));
        } else if ((i3 & 805306368) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(vertical4) ? 536870912 : 268435456)));
        }
        int i14 = (i5 + 1024) - (i5 | 1024);
        if (i14 != 0) {
            i7 = (i4 + 6) - (i4 & 6);
        } else if ((i4 & 6) == 0) {
            i7 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(vertical3) ? 4 : 2)));
        } else {
            i7 = i4;
        }
        int i15 = (-1) - (((-1) - i5) | ((-1) - 2048));
        if (i15 != 0) {
            i7 = (i7 + 48) - (i7 & 48);
        } else if ((i4 + 48) - (i4 | 48) == 0) {
            i7 |= composerStartRestartGroup.changed(horizontal2) ? 32 : 16;
        }
        if ((i5 & 4096) != 0) {
            i7 = (i7 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i7 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i4) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i16 = composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            i7 = (i7 + i16) - (i7 & i16);
        }
        if ((306783379 + i6) - (306783379 | i6) == 306783378 && (i7 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            i8 = i9;
            horizontal3 = horizontal2;
        } else {
            if (i11 != 0) {
                i9 = 0;
            }
            if (i12 != 0) {
                horizontal4 = null;
            }
            if (i13 != 0) {
                vertical4 = null;
            }
            if (i14 != 0) {
                vertical3 = null;
            }
            horizontal3 = i15 == 0 ? horizontal2 : null;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(620764179, i6, i7, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)");
            }
            int i17 = (-1) - (((-1) - (i6 >> 3)) | ((-1) - 14));
            int i18 = i7 >> 3;
            int i19 = (i18 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i18 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
            Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, composerStartRestartGroup, (i17 + i19) - (i17 & i19));
            int i20 = i6 >> 9;
            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z3, composerStartRestartGroup, (-1) - (((-1) - i17) & ((-1) - (i20 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ProvidableCompositionLocal<GraphicsContext> localGraphicsContext = CompositionLocalsKt.getLocalGraphicsContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localGraphicsContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CompositionLocal<Boolean> localScrollCaptureInProgress = CompositionLocalsKt.getLocalScrollCaptureInProgress();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localScrollCaptureInProgress);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            boolean z6 = !((Boolean) objConsume2).booleanValue();
            int i21 = (i6 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i6);
            int i22 = i6 & 7168;
            int i23 = i6 >> 6;
            int i24 = i7 << 21;
            i8 = i9;
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda, lazyListState, paddingValues, z5, z3, i9, horizontal4, vertical3, horizontal3, vertical4, coroutineScope, (GraphicsContext) objConsume, z6, composerStartRestartGroup, (-1) - (((-1) - (((-1) - (((-1) - (((-1) - (((-1) - (65520 & i6)) & ((-1) - (i23 & 458752)))) | (i23 & 3670016))) & ((-1) - (29360128 & i24)))) | (i24 & 234881024))) & ((-1) - ((-1) - (((-1) - 1879048192) | ((-1) - i6))))), 0);
            Orientation orientation = z3 ? Orientation.Vertical : Orientation.Horizontal;
            z5 = z5;
            Modifier modifierLazyLayoutSemantics = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier$foundation_release()).then(lazyListState.getAwaitLayoutModifier$foundation_release()), function0RememberLazyListItemProviderLambda, lazyLayoutSemanticStateRememberLazyListSemanticState, orientation, z4, z5, composerStartRestartGroup, (-1) - (((-1) - ((i23 + 57344) - (i23 | 57344))) & ((-1) - ((i6 << 6) & 458752))));
            int i25 = (i6 >> 18) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsStateRememberLazyListBeyondBoundsState = LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i8, composerStartRestartGroup, (i17 + i25) - (i17 & i25));
            LazyLayoutBeyondBoundsInfo beyondBoundsInfo$foundation_release = lazyListState.getBeyondBoundsInfo$foundation_release();
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume3 = composerStartRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(modifierLazyLayoutSemantics, lazyLayoutBeyondBoundsStateRememberLazyListBeyondBoundsState, beyondBoundsInfo$foundation_release, z5, (LayoutDirection) objConsume3, orientation, z4, composerStartRestartGroup, (-1) - (((-1) - ((MutableVector.$stable << 6) | i22)) & ((-1) - ((i6 + 3670016) - (3670016 | i6))))).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation, z4, z5, flingBehavior, lazyListState.getInternalInteractionSource$foundation_release(), null, composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - (i21 | (i20 & 7168))) & ((-1) - ((-1) - (((-1) - 57344) | ((-1) - (i6 << 3)))))))) & ((-1) - ((i6 + 458752) - (i6 | 458752)))), 64), lazyListState.getPrefetchState$foundation_release(), function2RememberLazyListMeasurePolicy, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i26 = i8;
            final Alignment.Horizontal horizontal5 = horizontal4;
            final Arrangement.Vertical vertical5 = vertical4;
            final Alignment.Vertical vertical6 = vertical3;
            final boolean z7 = z5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
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

                public final void invoke(Composer composer2, int i27) {
                    Modifier modifier2 = modifier;
                    LazyListState lazyListState2 = lazyListState;
                    PaddingValues paddingValues2 = paddingValues;
                    boolean z8 = z7;
                    boolean z9 = z3;
                    FlingBehavior flingBehavior2 = flingBehavior;
                    boolean z10 = z4;
                    int i28 = i26;
                    Alignment.Horizontal horizontal6 = horizontal5;
                    Arrangement.Vertical vertical7 = vertical5;
                    Alignment.Vertical vertical8 = vertical6;
                    Arrangement.Horizontal horizontal7 = horizontal3;
                    Function1<LazyListScope, Unit> function12 = function1;
                    int i29 = i3;
                    LazyListKt.LazyList(modifier2, lazyListState2, paddingValues2, z8, z9, flingBehavior2, z10, i28, horizontal6, vertical7, vertical8, horizontal7, function12, composer2, RecomposeScopeImplKt.updateChangedFlags((i29 + 1) - (i29 & 1)), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                }
            });
        }
    }

    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy(final Function0<? extends LazyListItemProvider> function0, final LazyListState lazyListState, final PaddingValues paddingValues, final boolean z2, final boolean z3, final int i2, final Alignment.Horizontal horizontal, final Alignment.Vertical vertical, final Arrangement.Horizontal horizontal2, final Arrangement.Vertical vertical2, final CoroutineScope coroutineScope, final GraphicsContext graphicsContext, final boolean z4, Composer composer, int i3, int i4) {
        ComposerKt.sourceInformationMarkerStart(composer, 1972347046, "C(rememberLazyListMeasurePolicy)P(7,9,1,8,6!1,4,11,5,12)170@7305L8413:LazyList.kt#428nma");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1972347046, i3, i4, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:170)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 581121742, "CC(remember):LazyList.kt#9igjgp");
        int i5 = 1;
        int i6 = (((((i3 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i3)) ^ 48) <= 32 || !composer.changed(lazyListState)) && (48 & i3) != 32) ? 0 : 1;
        int i7 = (((((i3 + 896) - (896 | i3)) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composer.changed(paddingValues)) && (384 & i3) != 256) ? 0 : 1;
        int i8 = (-1) - (((-1) - ((-1) - (((-1) - (((i6 + i7) - (i6 & i7)) | (((((7168 & i3) ^ 3072) <= 2048 || !composer.changed(z2)) && (-1) - (((-1) - i3) | ((-1) - 3072)) != 2048) ? 0 : 1))) & ((-1) - ((((((57344 + i3) - (57344 | i3)) ^ 24576) <= 16384 || !composer.changed(z3)) && (-1) - (((-1) - i3) | ((-1) - 24576)) != 16384) ? 0 : 1))))) & ((-1) - (((((3670016 & i3) ^ 1572864) <= 1048576 || !composer.changed(horizontal)) && (i3 & 1572864) != 1048576) ? 0 : 1)));
        int i9 = (((((-1) - (((-1) - 29360128) | ((-1) - i3))) ^ 12582912) <= 8388608 || !composer.changed(vertical)) && (-1) - (((-1) - i3) | ((-1) - 12582912)) != 8388608) ? 0 : 1;
        int i10 = (i8 + i9) - (i8 & i9);
        int i11 = (((((-1) - (((-1) - 234881024) | ((-1) - i3))) ^ 100663296) <= 67108864 || !composer.changed(horizontal2)) && (100663296 & i3) != 67108864) ? 0 : 1;
        int i12 = (i10 + i11) - (i10 & i11);
        int i13 = (((((-1) - (((-1) - 1879048192) | ((-1) - i3))) ^ 805306368) <= 536870912 || !composer.changed(vertical2)) && (i3 + 805306368) - (i3 | 805306368) != 536870912) ? 0 : 1;
        int i14 = (i13 + i12) - (i13 & i12);
        boolean zChanged = composer.changed(graphicsContext);
        int i15 = (i14 + (zChanged ? 1 : 0)) - (i14 & (zChanged ? 1 : 0));
        if (((((i4 + 896) - (896 | i4)) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composer.changed(z4)) && (-1) - (((-1) - i4) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) != 256) {
            i5 = 0;
        }
        int i16 = (i15 + i5) - (i15 & i5);
        Object objRememberedValue = composer.rememberedValue();
        if (i16 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m1120invoke0kLqBqw(lazyLayoutMeasureScope, constraints.m6597unboximpl());
                }

                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyListMeasureResult m1120invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j2) {
                    int i17;
                    int i18;
                    float fMo904getSpacingD9Ej5fM;
                    int iM6591getMaxWidthimpl;
                    final long jIntOffset;
                    float scrollToBeConsumed$foundation_release;
                    List<Integer> listEmptyList;
                    ObservableScopeInvalidator.m1192attachToScopeimpl(lazyListState.m1135getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                    boolean z5 = lazyListState.getHasLookaheadPassOccurred$foundation_release() || lazyLayoutMeasureScope.isLookingAhead();
                    CheckScrollableContainerConstraintsKt.m601checkScrollableContainerConstraintsK40F9xA(j2, z3 ? Orientation.Vertical : Orientation.Horizontal);
                    if (z3) {
                        i17 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(paddingValues.mo969calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i17 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    if (z3) {
                        i18 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(paddingValues.mo970calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i18 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int i19 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(paddingValues.mo971calculateTopPaddingD9Ej5fM());
                    int i20 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(paddingValues.mo968calculateBottomPaddingD9Ej5fM());
                    final int i21 = i19 + i20;
                    final int i22 = i17 + i18;
                    boolean z6 = z3;
                    int i23 = z6 ? i21 : i22;
                    if (z6 && !z2) {
                        i20 = i19;
                    } else if (!z6 || !z2) {
                        i20 = (z6 || z2) ? i18 : i17;
                    }
                    final int i24 = i23 - i20;
                    final long jM6610offsetNN6EwU = ConstraintsKt.m6610offsetNN6EwU(j2, -i22, -i21);
                    final LazyListItemProvider lazyListItemProviderInvoke = function0.invoke();
                    lazyListItemProviderInvoke.getItemScope().setMaxSize(Constraints.m6591getMaxWidthimpl(jM6610offsetNN6EwU), Constraints.m6590getMaxHeightimpl(jM6610offsetNN6EwU));
                    if (z3) {
                        Arrangement.Vertical vertical3 = vertical2;
                        if (vertical3 == null) {
                            throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                        }
                        fMo904getSpacingD9Ej5fM = vertical3.mo904getSpacingD9Ej5fM();
                    } else {
                        Arrangement.Horizontal horizontal3 = horizontal2;
                        if (horizontal3 == null) {
                            throw new IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
                        }
                        fMo904getSpacingD9Ej5fM = horizontal3.mo904getSpacingD9Ej5fM();
                    }
                    final int i25 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(fMo904getSpacingD9Ej5fM);
                    final int itemCount = lazyListItemProviderInvoke.getItemCount();
                    if (z3) {
                        iM6591getMaxWidthimpl = Constraints.m6590getMaxHeightimpl(j2) - i21;
                    } else {
                        iM6591getMaxWidthimpl = Constraints.m6591getMaxWidthimpl(j2) - i22;
                    }
                    if (!z2 || iM6591getMaxWidthimpl > 0) {
                        jIntOffset = IntOffsetKt.IntOffset(i17, i19);
                    } else {
                        boolean z7 = z3;
                        if (!z7) {
                            i17 += iM6591getMaxWidthimpl;
                        }
                        if (z7) {
                            i19 += iM6591getMaxWidthimpl;
                        }
                        jIntOffset = IntOffsetKt.IntOffset(i17, i19);
                    }
                    final boolean z8 = z3;
                    final Alignment.Horizontal horizontal4 = horizontal;
                    final Alignment.Vertical vertical4 = vertical;
                    final boolean z9 = z2;
                    final LazyListState lazyListState2 = lazyListState;
                    final int i26 = i20;
                    LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(jM6610offsetNN6EwU, z8, lazyListItemProviderInvoke, lazyLayoutMeasureScope, itemCount, i25, horizontal4, vertical4, z9, i26, i24, jIntOffset, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                        final /* synthetic */ int $afterContentPadding;
                        final /* synthetic */ int $beforeContentPadding;
                        final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ int $itemsCount;
                        final /* synthetic */ boolean $reverseLayout;
                        final /* synthetic */ int $spaceBetweenItems;
                        final /* synthetic */ LazyListState $state;
                        final /* synthetic */ LazyLayoutMeasureScope $this_null;
                        final /* synthetic */ Alignment.Vertical $verticalAlignment;
                        final /* synthetic */ long $visualItemOffset;

                        {
                            this.$isVertical = z8;
                            this.$this_null = lazyLayoutMeasureScope;
                            this.$itemsCount = itemCount;
                            this.$spaceBetweenItems = i25;
                            this.$horizontalAlignment = horizontal4;
                            this.$verticalAlignment = vertical4;
                            this.$reverseLayout = z9;
                            this.$beforeContentPadding = i26;
                            this.$afterContentPadding = i24;
                            this.$visualItemOffset = jIntOffset;
                            this.$state = lazyListState2;
                        }

                        @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                        /* JADX INFO: renamed from: createItem-X9ElhV4, reason: not valid java name */
                        public LazyListMeasuredItem mo1121createItemX9ElhV4(int i27, Object obj, Object obj2, List<? extends Placeable> list, long j3) {
                            return new LazyListMeasuredItem(i27, list, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_null.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, i27 == this.$itemsCount + (-1) ? 0 : this.$spaceBetweenItems, this.$visualItemOffset, obj, obj2, this.$state.getItemAnimator$foundation_release(), j3, null);
                        }
                    };
                    Snapshot.Companion companion = Snapshot.Companion;
                    LazyListState lazyListState3 = lazyListState;
                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        int iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyListState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProviderInvoke, lazyListState3.getFirstVisibleItemIndex());
                        int firstVisibleItemScrollOffset = lazyListState3.getFirstVisibleItemScrollOffset();
                        Unit unit = Unit.INSTANCE;
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        List<Integer> listCalculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyListItemProviderInvoke, lazyListState.getPinnedItems$foundation_release(), lazyListState.getBeyondBoundsInfo$foundation_release());
                        if (lazyLayoutMeasureScope.isLookingAhead() || !z5) {
                            scrollToBeConsumed$foundation_release = lazyListState.getScrollToBeConsumed$foundation_release();
                        } else {
                            scrollToBeConsumed$foundation_release = lazyListState.getScrollDeltaBetweenPasses$foundation_release();
                        }
                        if (z4) {
                            listEmptyList = lazyListItemProviderInvoke.getHeaderIndexes();
                        } else {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        LazyListMeasureResult lazyListMeasureResultM1125measureLazyListx0Ok8Vo = LazyListMeasureKt.m1125measureLazyListx0Ok8Vo(itemCount, lazyListMeasuredItemProvider, iM6591getMaxWidthimpl, i20, i24, i25, iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, scrollToBeConsumed$foundation_release, jM6610offsetNN6EwU, z3, listEmptyList, vertical2, horizontal2, z2, lazyLayoutMeasureScope, lazyListState.getItemAnimator$foundation_release(), i2, listCalculateLazyLayoutPinnedIndices, z5, lazyLayoutMeasureScope.isLookingAhead(), lazyListState.getPostLookaheadLayoutInfo$foundation_release(), coroutineScope, lazyListState.m1136getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                            }

                            public final MeasureResult invoke(int i27, int i28, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                return lazyLayoutMeasureScope.layout(ConstraintsKt.m6608constrainWidthK40F9xA(j2, i27 + i22), ConstraintsKt.m6607constrainHeightK40F9xA(j2, i28 + i21), MapsKt.emptyMap(), function1);
                            }
                        });
                        LazyListState.applyMeasureResult$foundation_release$default(lazyListState, lazyListMeasureResultM1125measureLazyListx0Ok8Vo, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                        return lazyListMeasureResultM1125measureLazyListx0Ok8Vo;
                    } catch (Throwable th) {
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2 = (Function2) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return function2;
    }
}
