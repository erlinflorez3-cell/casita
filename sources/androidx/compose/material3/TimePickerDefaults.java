package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\nnjO0LeN<ZS@\u000fs{:%aӝqYП\u0006\u001a,!ITTg̊rJh\u000b\f\u001a\u0014\u001c\u0011jZK\u001c}ٕ\u0016\u000f@I8П2[uU9\u000fvf\u000b&20@\u0012\u0005/#ZN\u0016v\tMc\f@9pv@R\u001bX\u001d\u001a@\u000fn&\u0007\u001ejsf6vu\u000e@5#\u0011vZNUh`\u0003S\rTb?\r%jN1F7C$=S1\u0010\u0003aE\u0003M\u0002U\u0005\u00170W1OseGp\u007fB\u001e[U\u0013]\u00018t\u0005\u007fi<-1Oq^h\u000eV\u0001+\u0002\u0013<\u0012\"\u001e'v7] l\b\u001cH\rr\u0002I\u0001\bdB\u000e\u0011y6E.F8۸8ӕƻUcA0\\OD\u0018\u001b7;\u0001\u001d;\"Yَ_\u0014ŊSȭΦ5SFXVjZoKn\u001cp\u0011\u0004R\u0004^J6mR߿0ϲ);s;)%y\u0007҉Dp~\bfćo\u0018QP@(\u000eޔ;G"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e)=Yh$5s\u0016;,C<gD%$v7", "", "u(E", "2dU.h3MB\u001d\u0007zI0z\u000f/r]2\u0003J\u000e%", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e)=Yh$5s\u0016;+MBuA,j", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T/<c\u000b\u000e5p\u00166M\u0019", "5dc\u0011X-:c \u000eib4|s3c\u0006(\t\u001e\u000b\u001e!T}LDr45f\u0002\u001c>;\u0010;MJ;gB\u001e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZNHE,n/;\u001d\u000e,V_Eo\u000b\u0019$c", "1n[<e:", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W=/\u0015\u0005DE\"tDD|\u00123S\u000fI>", "1k^0^\u000bBO \\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1k^0^\u000bBO lze,z\u0018/d]2\u0005O\u0001 &%y\u0015F\u0004", "1k^0^\u000bBO n\u0004l,\u0004\t-t\u007f'YJ\n&\u0017P~kF}/B", "Ad[2V;H`v\t\u0002h9", "1n]AT0GS&\\\u0005e6\n", ">da6b+,S ~xm6\ne9r~(\t\u001e\u000b\u001e!T", ">da6b+,S ~xm6\nv/l\u007f&\u000b@\u007ft!P~\n@\u007f%B7\b'Az", ">da6b+,S ~xm6\nx8s\u007f/{>\u0010\u0017\u0016%y\u0017Kr)>Y\u000b}At ;", ">da6b+,S ~xm6\nv/l\u007f&\u000b@\u007ft!P~\u000eE\u0006\u0003?`\b-", ">da6b+,S ~xm6\nx8s\u007f/{>\u0010\u0017\u0016%y\u0017Kv.D7\b'Az", "Bh\\2F,ES\u0017\u000e\u0005k\u001a|\u0010/c\u000f(z\u001e\u000b &Cs\u0017<\u0004\u0003?`\b-", "Bh\\2F,ES\u0017\u000e\u0005k\u001c\u0006\u0017/l\u007f&\u000b@\u007ft!P~\n@\u007f%B7\b'Az", "Bh\\2F,ES\u0017\u000e\u0005k\u001a|\u0010/c\u000f(z\u001e\u000b &Gx\u001d\u001a\u0001,?f", "Bh\\2F,ES\u0017\u000e\u0005k\u001c\u0006\u0017/l\u007f&\u000b@\u007ft!P~\u000eE\u0006\u0003?`\b-", "1n[<e:\u0006cfrZi4X", "uI9\u0017=\u0011#8}c_C\u0011am\u0016a\t'\tJ\u0005\u0016*\u0011m\u0018D\u0002/CYG-Gv%2UC\u0005I>& ro9\u00149\u00102Zj.HW+i\\v<'[X\u0018V6\u0017\u0013Y\u000b,jS7,\f(PO\u0005W\u0005\u0014\u0016x9hvBcmQ\u0001\u001f\u0003O~", ":`h<h;-g$~", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e)=Yh$5s\u0016;4?OuD-\u0004|l9\\", ":`h<h;-g$~Bl\u000bev$n}", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq1", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TimePickerDefaults {
    public static final int $stable = 0;
    public static final TimePickerDefaults INSTANCE = new TimePickerDefaults();

    private TimePickerDefaults() {
    }

    public final TimePickerColors colors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -2085808058, "C(colors)270@13292L11:TimePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2085808058, i2, -1, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:270)");
        }
        TimePickerColors defaultTimePickerColors$material3_release = getDefaultTimePickerColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultTimePickerColors$material3_release;
    }

    /* JADX INFO: renamed from: colors-u3YEpmA, reason: not valid java name */
    public final TimePickerColors m2735colorsu3YEpmA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i2, int i3, int i4) {
        long jM4214getUnspecified0d7_KjU = j15;
        long jM4214getUnspecified0d7_KjU2 = j9;
        long jM4214getUnspecified0d7_KjU3 = j11;
        long jM4214getUnspecified0d7_KjU4 = j13;
        long jM4214getUnspecified0d7_KjU5 = j7;
        long jM4214getUnspecified0d7_KjU6 = j4;
        long jM4214getUnspecified0d7_KjU7 = j2;
        long jM4214getUnspecified0d7_KjU8 = j3;
        long jM4214getUnspecified0d7_KjU9 = j5;
        long jM4214getUnspecified0d7_KjU10 = j14;
        long jM4214getUnspecified0d7_KjU11 = j8;
        long jM4214getUnspecified0d7_KjU12 = j12;
        long jM4214getUnspecified0d7_KjU13 = j6;
        long jM4214getUnspecified0d7_KjU14 = j10;
        ComposerKt.sourceInformationMarkerStart(composer, -646352288, "C(colors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,9:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,7:c#ui.graphics.Color,6:c#ui.graphics.Color,8:c#ui.graphics.Color,10:c#ui.graphics.Color,12:c#ui.graphics.Color,11:c#ui.graphics.Color,13:c#ui.graphics.Color)317@16058L11:TimePicker.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            jM4214getUnspecified0d7_KjU7 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 2) != 0) {
            jM4214getUnspecified0d7_KjU8 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            jM4214getUnspecified0d7_KjU6 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 8) != 0) {
            jM4214getUnspecified0d7_KjU9 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 + 16) - (i4 | 16) != 0) {
            jM4214getUnspecified0d7_KjU13 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 32) != 0) {
            jM4214getUnspecified0d7_KjU5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 64) != 0) {
            jM4214getUnspecified0d7_KjU11 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 128) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 + 256) - (i4 | 256) != 0) {
            jM4214getUnspecified0d7_KjU14 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 + 512) - (i4 | 512) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 + 1024) - (i4 | 1024) != 0) {
            jM4214getUnspecified0d7_KjU12 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2048)) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 4096) != 0) {
            jM4214getUnspecified0d7_KjU10 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 8192) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-646352288, i2, i3, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:317)");
        }
        TimePickerColors timePickerColorsM2716copydVHXu7A = getDefaultTimePickerColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2716copydVHXu7A(jM4214getUnspecified0d7_KjU7, jM4214getUnspecified0d7_KjU9, jM4214getUnspecified0d7_KjU13, jM4214getUnspecified0d7_KjU5, jM4214getUnspecified0d7_KjU8, jM4214getUnspecified0d7_KjU6, jM4214getUnspecified0d7_KjU11, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU14, jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU12, jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU10, jM4214getUnspecified0d7_KjU);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return timePickerColorsM2716copydVHXu7A;
    }

    public final TimePickerColors getDefaultTimePickerColors$material3_release(ColorScheme colorScheme) {
        TimePickerColors defaultTimePickerColorsCached$material3_release = colorScheme.getDefaultTimePickerColorsCached$material3_release();
        if (defaultTimePickerColorsCached$material3_release != null) {
            return defaultTimePickerColorsCached$material3_release;
        }
        TimePickerColors timePickerColors = new TimePickerColors(ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getClockDialColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getClockDialSelectorHandleContainerColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getPeriodSelectorOutlineColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getClockDialSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getClockDialUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getPeriodSelectorSelectedContainerColor()), Color.Companion.m4213getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getPeriodSelectorSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getPeriodSelectorUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getTimeSelectorSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getTimeSelectorUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getTimeSelectorSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getTimeSelectorUnselectedLabelTextColor()), null);
        colorScheme.setDefaultTimePickerColorsCached$material3_release(timePickerColors);
        return timePickerColors;
    }

    /* JADX INFO: renamed from: layoutType-sDNSZnc, reason: not valid java name */
    public final int m2736layoutTypesDNSZnc(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 517161502, "C(layoutType)367@19209L27:TimePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(517161502, i2, -1, "androidx.compose.material3.TimePickerDefaults.layoutType (TimePicker.kt:367)");
        }
        int defaultTimePickerLayoutType = TimePicker_androidKt.getDefaultTimePickerLayoutType(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultTimePickerLayoutType;
    }
}
