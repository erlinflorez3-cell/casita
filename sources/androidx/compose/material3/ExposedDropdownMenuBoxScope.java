package androidx.compose.material3;

import android.view.View;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0007nʑA0RnP\u008cZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvJp\u000bK\u000f\u001c\u0016\u0001jBI]xc\u0013\u00172XoG\u074cUoS9hҚ>\u000562*8\u007f\u0005\t\u001a@H\u0018v\u0001LS\f(0H\u0081@\b#˟5\u001a@\u0005~%\u0007 ֔kNDH51H4;\u0003\u0018H~+m7\u0015M;N\u00051\u001b\u007fy$;BG5C+\u0002\r7Xa?\u0011J\n=3tW-1I\u0002dNX.\"EE]\u001cu\t6^\u0015Q\u000f\u001d7-_cyV<8Þ~{\u0013NǬ\u0012\u0006-[t2բj\b\u001cG=ɚRNU\u001a^p\u0006+eD\u001e=\u007fa3i%tZyA)PG{3\u0013L-1t'[b\u0019x\u0015I`(W7QNJ`N8gms\npp\u0017B\u0004^O05\u0002\u0011<-=7\nPS'q\u0002V\\\u007fv3y\u0019YoRVZ:nDRZ\u000f\u0012ZR\u0001\u001dk~o\t4\u0017M*q\u001f\u007f\u001e\u0012Nz(V/4(d_jyj{n\u001a'?fe_\u001d{ް[9dE̳Uc\u0016t\u0019{ޖ>ֺИ\tZlaa,#څ'07`j>},H\\\u0013+2myL>::1b%J\u0013\u001epG+\u0013\u0010`n\u0010\r_K$1uTz\u000f\u0001^i\to\u0016\u0007y2\u0003`0NYQc!V[(hB\u0012;\u0007-{0MmLUb\u0005\u0016$l,&\u001c\u001aGiG=A(//8\u0002;_dr\u0014l}\u0018-z\u000b\u0016';\u0017I\u0018\u0010pp:}\u0003LeSE@'x\u00012 z\u0010{qF)XsV\u001b[lO!\u0013ʾ@N>\u000fġ#\u001e+\u00146'ƕ4Ԇϡ+\u001f\u001c\u001a\"R]uk\u000e\b.(n7&#q42i\u0016}wi]`C~m\"\tLG<l1Npj&\u0014\t\u000e|3AmYd\u001fb`M9;.j\u0015R%p\u0005]j\u0019u}BUw*\"KD8ۤBљݱQUm\u0016{t-!X\u0010\"\u000b*3Eܿ\u001e\u07b4\u001f݈Ωa\bޘ\nw08G>p\t¸\b#^ɹ<\u0011\u0013FZɍ\">y\bFe.ň6m"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006V8@c\f 6L#8XBE}=\u0006\u0015qq\u0016\u0011v\u001aL\u00012G\"", "", "u(E", "/mR5b9-g$~", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006^%>iY)5p ;<WFk\n", "5dc\u000ea*A]&m\u000fi,Dp16l*xR?\u001f\u0013Vo\u001b@r,\u0003S\u000b >m\u0012<M", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\u0013w_<f,=2&\t\u0006]6\u000f\u0012\u0017e\t8", "", "3w_.a+>R", "", "=m36f4Ba'kzj<|\u0017>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "Aba<_3,b\u0015\u000ez", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00133f\b'>[%*\\C\u0011", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8TSCt\"\u001c\u001fsa\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!gA\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005i\u000b\u001c\u001f\r1ytL_Y5w\"\u007fH0VUUny\u001d(Kl9k\u0010hfaKBm\u0015\u0002\"\u0019wT8\u0013\n\u001dq\u0003[wvkQ\"H\u000e\u000b:vZSOsTO>%)S\u0007\u0002 2\"\u0002;}<\b<*\u007fB\u000fSr\"L^\u0006j\u0010@\u0005\u0018", ";`c0[\u001b>f(_~^3{z3d\u000f+", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Bn]._\fES*z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "0na1X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "\u0013w_<f,=2&\t\u0006]6\u000f\u0012\u0017e\t8CQi*\u001b\u0013Sq", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!gA\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005i\u000b\u001c\u001f\r1ytL_Y5w\"\u007fH0VUUny\u001d6,^3c\u0019i![M\u0004\"\u001ey$%vPw\u001a\u007f\u001d\u0013\u007fN\u0005jkE'D&':x[\u001c*P6#p0\u001eX\u0006{\u0011E\"r5|8\u000eB*\u007fe\u000f[p\u0017:m|\u001f5&\u001e135< -Zp\u007fr>cO%k\u0017\u0015f>z\u001evm-I\u001f\u0010[&_?jmJ\u0018b\u000f<Xs\u001f0\u0014T)W\u0003\u0014\u0016\u0011(lx\u0013A%\\\f$~Dkl!\f\u0012j \u001cwsGa\u001ar8_D#vlL{|", "4nRBf(;Z\u0019", "\u0013w_<f,=2&\t\u0006]6\u000f\u0012\u0017e\t8CF}\u0004\u0014E~}", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!gA\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005i\u000b\u001c\u001f\r1ytL_Y5w\"\u007fH0VUUny\u001d6:I&m\u000bl'`9Mm\u0012{!&r^.S\fWZt_urjK\u0017\t\u0002\u0012AifF\u001bT6\u001d[#(J\t\u0002\u00161k>)~5\u000f>86.\u0006Uw!=Z\b\u00196e\u000b\u00040C;\u0013L9r\u0003vD\u000e>\u0006g\u0012\u001di9:bjvk\u0012\u0010\u0017f\u0015j9kh\u000f\u00013\u0016GG~\u00191OL\u0018Bu\u001e\b\u0014.qd\\\r\u0019^\t%zR\")\u001e\u0013\fu\u001c$._\u001bc\u0017s4m7ZhlL\u001cOl", "3w_<f,=2&\t\u0006]6\u000f\u0012\u001di\u0015(", ";d]B45<V#\f", "Bx_2", "3mP/_,=", ";d]B45<V#\fB_:\\U\fvs", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0003\u001cHi_5IL=5\"-\"lj;\\Xo5r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b\fxC; \f,VW", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006V8@c\f 6L#8XBE}=\u0006\u0015qq\u0016\u0011v\u001aL\u00012G0V7c(", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class ExposedDropdownMenuBoxScope {
    public static final int $stable = 0;

    public /* synthetic */ ExposedDropdownMenuBoxScope(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Modifier exposedDropdownSize(Modifier modifier, boolean z2);

    /* JADX INFO: renamed from: getAnchorType-Mg6Rgbw$material3_release, reason: not valid java name */
    public abstract String mo2100getAnchorTypeMg6Rgbw$material3_release();

    /* JADX INFO: renamed from: menuAnchor-fsE2BvY, reason: not valid java name */
    public abstract Modifier mo2101menuAnchorfsE2BvY(Modifier modifier, String str, boolean z2);

    private ExposedDropdownMenuBoxScope() {
    }

    /* JADX INFO: renamed from: menuAnchor-fsE2BvY$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2097menuAnchorfsE2BvY$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, String str, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: menuAnchor-fsE2BvY");
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return exposedDropdownMenuBoxScope.mo2101menuAnchorfsE2BvY(modifier, str, z2);
    }

    public static /* synthetic */ Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ExposedDropdownMenu-vNxi1II, reason: not valid java name */
    public final void m2099ExposedDropdownMenuvNxi1II(final boolean z2, final Function0<Unit> function0, Modifier modifier, ScrollState scrollState, boolean z3, Shape shape, long j2, float f2, float f3, BorderStroke borderStroke, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        BorderStroke borderStroke2 = borderStroke;
        float fM2245getShadowElevationD9Ej5fM = f3;
        float fM2246getTonalElevationD9Ej5fM = f2;
        long containerColor = j2;
        Shape shape2 = shape;
        boolean z4 = z3;
        ScrollState scrollStateRememberScrollState = scrollState;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(720925481);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ExposedDropdownMenu)P(3,6,5,7,4,9,1:c#ui.graphics.Color,10:c#ui.unit.Dp,8:c#ui.unit.Dp)336@15550L21,338@15654L5,339@15706L14,347@16155L53,348@16238L7,349@16281L7,350@16332L10,357@16596L42,361@16795L51,363@16903L486,377@17583L27,378@17626L587,374@17403L810:ExposedDropdownMenu.android.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            int i8 = composerStartRestartGroup.changed(z2) ? 4 : 2;
            i5 = (i8 + i2) - (i8 & i2);
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 = (i5 + 48) - (i5 & 48);
        } else if ((i2 & 48) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function0) ? 32 : 16)));
        }
        int i9 = (i4 + 4) - (i4 | 4);
        if (i9 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(companion) ? 256 : 128)));
        }
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 + 8) - (i4 | 8) == 0 && composerStartRestartGroup.changed(scrollStateRememberScrollState)) ? 2048 : 1024)));
        }
        int i10 = (-1) - (((-1) - i4) | ((-1) - 16));
        if (i10 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 24576));
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(z4) ? 16384 : 8192)));
        }
        if ((i2 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            int i11 = ((i4 + 32) - (i4 | 32) == 0 && composerStartRestartGroup.changed(shape2)) ? 131072 : 65536;
            i5 = (i5 + i11) - (i5 & i11);
        }
        if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((-1) - (((-1) - i4) | ((-1) - 64)) == 0 && composerStartRestartGroup.changed(containerColor)) ? 1048576 : 524288)));
        }
        int i12 = i4 & 128;
        if (i12 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 12582912));
        } else if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            int i13 = composerStartRestartGroup.changed(fM2246getTonalElevationD9Ej5fM) ? 8388608 : 4194304;
            i5 = (i5 + i13) - (i5 & i13);
        }
        int i14 = (-1) - (((-1) - i4) | ((-1) - 256));
        if (i14 != 0) {
            i5 = (i5 + 100663296) - (i5 & 100663296);
        } else if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(fM2245getShadowElevationD9Ej5fM) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        int i15 = (-1) - (((-1) - i4) | ((-1) - 512));
        if (i15 != 0) {
            i5 = (i5 + 805306368) - (i5 & 805306368);
        } else if ((i2 & 805306368) == 0) {
            int i16 = composerStartRestartGroup.changed(borderStroke2) ? 536870912 : 268435456;
            i5 = (i5 + i16) - (i5 & i16);
        }
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32 = function3;
        if ((i4 + 1024) - (i4 | 1024) != 0) {
            i6 = (-1) - (((-1) - i3) & ((-1) - 6));
        } else if ((i3 + 6) - (i3 | 6) == 0) {
            i6 = i3 | (composerStartRestartGroup.changedInstance(function32) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2048)) != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 48));
        } else if ((i3 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i5 + 306783379) - (306783379 | i5) != 306783378 || (-1) - (((-1) - i6) | ((-1) - 19)) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i9 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-7169)));
                }
                if (i10 != 0) {
                    z4 = true;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 32)) != 0) {
                    i7 = 6;
                    shape2 = MenuDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-458753)));
                } else {
                    i7 = 6;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                    containerColor = MenuDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i7);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-3670017)));
                }
                if (i12 != 0) {
                    fM2246getTonalElevationD9Ej5fM = MenuDefaults.INSTANCE.m2246getTonalElevationD9Ej5fM();
                }
                if (i14 != 0) {
                    fM2245getShadowElevationD9Ej5fM = MenuDefaults.INSTANCE.m2245getShadowElevationD9Ej5fM();
                }
                if (i15 != 0) {
                    borderStroke2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 & 8) != 0) {
                    i5 = (i5 - 7169) - (i5 | (-7169));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 32)) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-458753)));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                    i5 = (i5 - 3670017) - (i5 | (-3670017));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(720925481, i5, i6, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.android.kt:344)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 321492941, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localView);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            View view = (View) objConsume;
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Density density = (Density) objConsume2;
            int top = WindowInsets_androidKt.getStatusBars(WindowInsets.Companion, composerStartRestartGroup, 6).getTop(density);
            composerStartRestartGroup.startReplaceGroup(321499814);
            ComposerKt.sourceInformation(composerStartRestartGroup, "353@16432L36,353@16396L72");
            if (z2) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 321501788, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            mutableState.setValue(Unit.INSTANCE);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ExposedDropdownMenu_androidKt.SoftKeyboardListener(view, density, (Function0) objRememberedValue2, composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 321507042, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new MutableTransitionState(false);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableTransitionState mutableTransitionState = (MutableTransitionState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            mutableTransitionState.setTargetState$animation_core_release(Boolean.valueOf(z2));
            if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 321513419, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4556boximpl(TransformOrigin.Companion.m4569getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                final MutableState mutableState2 = (MutableState) objRememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 321517310, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
                boolean z5 = (-1) - (((-1) - (composerStartRestartGroup.changed(density) ? 1 : 0)) & ((-1) - (composerStartRestartGroup.changed(top) ? 1 : 0))) == 1;
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = new ExposedDropdownMenuPositionProvider(density, top, mutableState, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(IntRect intRect, IntRect intRect2) {
                            mutableState2.setValue(TransformOrigin.m4556boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                        }
                    }, 8, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final Modifier modifier2 = companion;
                final boolean z6 = z4;
                final ScrollState scrollState2 = scrollStateRememberScrollState;
                final Shape shape3 = shape2;
                final long j3 = containerColor;
                final float f4 = fM2246getTonalElevationD9Ej5fM;
                final float f5 = fM2245getShadowElevationD9Ej5fM;
                final BorderStroke borderStroke3 = borderStroke2;
                function32 = function32;
                AndroidPopup_androidKt.Popup((ExposedDropdownMenuPositionProvider) objRememberedValue5, function0, ExposedDropdownMenuDefaults.INSTANCE.m2105popupPropertiespR6Bxps$material3_release(mo2100getAnchorTypeMg6Rgbw$material3_release(), composerStartRestartGroup, 48), ComposableLambdaKt.rememberComposableLambda(-1082380263, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.2
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

                    public final void invoke(Composer composer2, int i17) {
                        ComposerKt.sourceInformation(composer2, "C379@17644L555:ExposedDropdownMenu.android.kt#uh7d8r");
                        if ((-1) - (((-1) - i17) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1082380263, i17, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.android.kt:379)");
                            }
                            Modifier modifierExposedDropdownSize = ExposedDropdownMenuBoxScope.this.exposedDropdownSize(modifier2, z6);
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState3 = mutableState2;
                            ScrollState scrollState3 = scrollState2;
                            Shape shape4 = shape3;
                            long j4 = j3;
                            float f6 = f4;
                            float f7 = f5;
                            BorderStroke borderStroke4 = borderStroke3;
                            Function3<ColumnScope, Composer, Integer, Unit> function33 = function32;
                            int i18 = MutableTransitionState.$stable << 3;
                            MenuKt.m2259DropdownMenuContentQj0Zi0g(modifierExposedDropdownSize, mutableTransitionState2, mutableState3, scrollState3, shape4, j4, f6, f7, borderStroke4, function33, composer2, (i18 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i18 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((-1) - (((-1) - i5) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) | 3072, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Shape shape4 = shape2;
            final long j4 = containerColor;
            final float f6 = fM2246getTonalElevationD9Ej5fM;
            final float f7 = fM2245getShadowElevationD9Ej5fM;
            final BorderStroke borderStroke4 = borderStroke2;
            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33 = function32;
            final Modifier modifier3 = companion;
            final ScrollState scrollState3 = scrollStateRememberScrollState;
            final boolean z7 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.3
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

                public final void invoke(Composer composer2, int i17) {
                    ExposedDropdownMenuBoxScope.this.m2099ExposedDropdownMenuvNxi1II(z2, function0, modifier3, scrollState3, z7, shape4, j4, f6, f7, borderStroke4, function33, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001t\u0001\u000b\u001aidV)~\u0010)4Op\f\u001d(\u0010m\u001f\u0012cK|\u007f/\u0003'nw^X[]a(:T\"r? WN\u0006'\\\bKfP5\u001f\u0011[\u0019V.", replaceWith = @ReplaceWith(expression = "menuAnchor(type, enabled)", imports = {}))
    @InterfaceC1492Gx
    public final Modifier menuAnchor(Modifier modifier) {
        return m2097menuAnchorfsE2BvY$default(this, modifier, MenuAnchorType.Companion.m2243getPrimaryNotEditableMg6Rgbw(), false, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027b  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "\u0017N\u0001tqz$ZmZ)|\\\u001a,\u000elM\u001b(\u0012m W\t\u0006w}\u000e\n2{{Qh\u0010\rLiLY]GB\u0017\u0016\\\f1hMM%+9 !(\"G#\u0006Fu\f\u001ctv0Z=hl&\u0011\u0002Q\u0015QHN36F4}>[+\u0001;)\u00045X\u0015'\u0003fT\"A[\u0015(^U@q\u0007V.BIZiPp\"^<G\u0002&b<$\t\u0019\u001dne\u0001,SdX\u001e(%{D\tmJ")
    @yg.InterfaceC1492Gx
    /* JADX INFO: renamed from: ExposedDropdownMenu-kbRbctU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2098ExposedDropdownMenukbRbctU(boolean r54, final kotlin.jvm.functions.Function0<kotlin.Unit> r55, androidx.compose.ui.Modifier r56, androidx.compose.foundation.ScrollState r57, boolean r58, boolean r59, androidx.compose.ui.graphics.Shape r60, long r61, float r63, float r64, androidx.compose.foundation.BorderStroke r65, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r66, androidx.compose.runtime.Composer r67, final int r68, final int r69, final int r70) {
        /*
            Method dump skipped, instruction units count: 979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuBoxScope.m2098ExposedDropdownMenukbRbctU(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, boolean, boolean, androidx.compose.ui.graphics.Shape, long, float, float, androidx.compose.foundation.BorderStroke, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}\u0010\rQ{>\u0006-I?$b[z&\u0018_DyFs\u0015!Z(S(\u007fN\u0003\u0007\u0015~E[Z\u000e\u0010f1\u0016\u000f\b @\rB;-EX\u0002N!")
    @InterfaceC1492Gx
    public final /* synthetic */ void ExposedDropdownMenu(final boolean z2, final Function0 function0, Modifier modifier, ScrollState scrollState, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i4;
        ScrollState scrollStateRememberScrollState = scrollState;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1729549851);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ExposedDropdownMenu)P(1,3,2,4)449@20337L21,458@20677L5,459@20726L14,452@20429L498:ExposedDropdownMenu.android.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 & 6) == 0) {
            int i5 = composerStartRestartGroup.changed(z2) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function0) ? 32 : 16)));
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 256 : 128)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i7 = ((i3 & 8) == 0 && composerStartRestartGroup.changed(scrollStateRememberScrollState)) ? 2048 : 1024;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((i3 & 16) != 0) {
            i4 = (i4 + 24576) - (i4 & 24576);
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192)));
        }
        if ((i3 & 32) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((-1) - (((-1) - i2) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i4 |= composerStartRestartGroup.changed(this) ? 131072 : 65536;
        }
        if ((74899 + i4) - (74899 | i4) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i3 & 8) != 0) {
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    i4 &= -7169;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    i4 &= -7169;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1729549851, i4, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.android.kt:452)");
            }
            int i8 = (-1) - (((-1) - ((i4 + 14) - (14 | i4))) & ((-1) - 918577152));
            int i9 = 112 & i4;
            int i10 = (-1) - (((-1) - ((i8 + i9) - (i8 & i9))) & ((-1) - (896 & i4)));
            int i11 = (-1) - (((-1) - i4) | ((-1) - 7168));
            m2099ExposedDropdownMenuvNxi1II(z2, function0, companion, scrollStateRememberScrollState, true, MenuDefaults.INSTANCE.getShape(composerStartRestartGroup, 6), MenuDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6), MenuDefaults.INSTANCE.m2246getTonalElevationD9Ej5fM(), MenuDefaults.INSTANCE.m2245getShadowElevationD9Ej5fM(), null, function3, composerStartRestartGroup, (i10 + i11) - (i10 & i11), (i4 >> 12) & 126, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final ScrollState scrollState2 = scrollStateRememberScrollState;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.5
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

                public final void invoke(Composer composer2, int i12) {
                    ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope = ExposedDropdownMenuBoxScope.this;
                    boolean z3 = z2;
                    Function0<Unit> function02 = function0;
                    Modifier modifier3 = modifier2;
                    ScrollState scrollState3 = scrollState2;
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    int i13 = i2;
                    exposedDropdownMenuBoxScope.ExposedDropdownMenu(z3, function02, modifier3, scrollState3, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i13 + 1) - (i13 & 1)), i3);
                }
            });
        }
    }
}
