package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: SpannableStringBuilder.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d̉=!4i\bӵLc\u000b\u0004I\u0006F\u000b6B\r\"4\u0012\u000e\u0007nj?0LeV4ZS0\u0010s{BřcҕyCId\"}(\u000bWNulvJ`\u000e[/\u0014ǝ\u0011jZH\u0006\u000ek\u0012'CRqO3{qM;ptd\bN3ŕ<y\u000b\u0005`ݙN(%\tHc\f@2hphT=S\u000b\u0019 \fV /%\r|\\6`}m<?#1kRP7_^\u007f{\u000eТX'\u0013z(ӣ1X[C\u001d=S1\tz[m\u0005o\u0007K\u0005\u000187-Ys\u00068h\u0002$\u0015YR;^ę*\\\u000bU'϶-C}qQh\u000eVy#{;>4\u0014\f&V4E\u001a\u0015\u000f>H\u0003rkQ`\u0004nB.|q8'%.6Y:ӸjQg?_ג=\u00141\u001b';\u0001\u001d#\u0004T<bE\u001fb\u0002i1\u007fKm]\\\nqN}\u0006\u0001b0,\u00142W\u007f]~?/ϲ)7a=iܰq\u001a\u0006Rp\u000f\u0005\u000fj{i\u0001Jp2|\"O2\u0019\u0010`Ct\u0005\u001a[\u0003eL\u0011{'\u0005\u001c\f\b+1lyL!S\u0012^Qxi\u0019P\f\u000bɻ3f=]5\u008f\u0014Ć=^ACi\b\u001epjvBAdb3Z\u0017Wa\frm8$BH\u0019\u0012\b}TN:\u0016`@ۇ 425_©\u001b`/,RY|7a\u0003h>\u0001\u000572\u0014\u0002$#\u001b1ejp\bx\tK<|\u000f$=Ca5G)\u0004#מ8|)\u000bEͥ\u0006_\fZZdlDw}{N\u0018JN_/U$\u001f\u0001920/UN\u0003e\u007fP@(ϸ\u0001y\u0015?/ֲm \u000f~@xjxQ|\u0017Px\u000f\b1\b|\u0011\ncVzued\rk>wu1Z\u0084R8\u0003\teǎ+\u0019\u00140\u0012M-q)E\u0016&\u0016_*o]\u0002\u0001>{r\u000fTvu\u0006<cDr\u0011RЄ6;>M ˡD:Hz\u0019ZH\u0019y0B76=HVA|\u0002f:]\u000b]\u007fv\t<\r\u001fY\n;݇s}:2&͏yʾ\u0002+"}, d2 = {"0tX9W\u001aIO\"\bz]\u001a\f\u00163n\u0002", "\u001a`]1e6BRb\u000ezq;Fv:a\t1{?n&$Kx\u0010\u0012", "0tX9W,K/\u0017\u000e~h5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BRb\u000ezq;Fv:a\t1w=\b\u0017\u0005V|\u0012Ex\u0002E]\u0005\u001f7zk", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "0`R8Z9Hc\"}Xh3\u0007\u0016", "1n[<e", "", "0n[1", "7mB=T5L", "AoP;", "", "AoP;f", "", "uKP;W9HW\u0018H\n^?\fR\u001dp{1\u0005<}\u001e\u00175~\u001b@\u007f'\u0012i\u0002'6m#\u0004C*@gE\u001a^o]B\t-\u0016K{'E[$\u0013b\\\u0002D\u0018\u001b$\u0013_3V\u0006iJ\"}HA(\u0016u*\u0012Df\u0010\u0010 \u0017\u0001@4)R\u0019F\u0007\u001fy@rwFlnC5LAk3`\tf\u001dJIG(\u001dsu+lW-\n\t)", "7sP9\\*", "AbP9X", ">q^=b9MW#\b", "", "Asa6^,-V&\t\u000b`/", "AtQ@V9B^(", "At_2e:<`\u001d\n\n", "CmS2e3B\\\u0019", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SpannableStringBuilderKt {
    public static final SpannedString buildSpannedString(Function1<? super SpannableStringBuilder, Unit> function1) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        function1.invoke(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    public static final SpannableStringBuilder inSpans(SpannableStringBuilder spannableStringBuilder, Object[] objArr, Function1<? super SpannableStringBuilder, Unit> function1) {
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        for (Object obj : objArr) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder inSpans(SpannableStringBuilder spannableStringBuilder, Object obj, Function1<? super SpannableStringBuilder, Unit> function1) {
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder bold(SpannableStringBuilder spannableStringBuilder, Function1<? super SpannableStringBuilder, Unit> function1) {
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder italic(SpannableStringBuilder spannableStringBuilder, Function1<? super SpannableStringBuilder, Unit> function1) {
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder underline(SpannableStringBuilder spannableStringBuilder, Function1<? super SpannableStringBuilder, Unit> function1) {
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder color(SpannableStringBuilder spannableStringBuilder, int i2, Function1<? super SpannableStringBuilder, Unit> function1) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i2);
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder backgroundColor(SpannableStringBuilder spannableStringBuilder, int i2, Function1<? super SpannableStringBuilder, Unit> function1) {
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i2);
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder strikeThrough(SpannableStringBuilder spannableStringBuilder, Function1<? super SpannableStringBuilder, Unit> function1) {
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder scale(SpannableStringBuilder spannableStringBuilder, float f2, Function1<? super SpannableStringBuilder, Unit> function1) {
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f2);
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder superscript(SpannableStringBuilder spannableStringBuilder, Function1<? super SpannableStringBuilder, Unit> function1) {
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder subscript(SpannableStringBuilder spannableStringBuilder, Function1<? super SpannableStringBuilder, Unit> function1) {
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
