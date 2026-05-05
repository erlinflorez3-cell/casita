package androidx.compose.material3.carousel;

import androidx.compose.ui.util.MathHelpersKt;
import java.util.ArrayList;
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
/* JADX INFO: compiled from: KeylineList.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d̉=!4i\bDJc|\u0004O\u000b8\u000b4B\u0007\"B\u0012\u007fјnjO0Le^.ZS8\u000fs{J$c$wDCU(\u0004*\tUNog\u0005Jb\u000bI\u0013\u001e\u001c\u0007̓DI\u0004w$܈'sPoW3{nm=nuN\u0005N4R<\b\b\u0019\u001aXJ@z\tGc\f@5p\u0006HX%^\u0015\u001c\"\u0006l(\u0011 lg|?vsҺ>/)\r0ĩŰ&ڿ݁\u0001O\u0013Qb3%6o\u001eC@e4E)a\u0004\u001fR\nA3C\u007f@\u001dhU)[M\u0002dNX.\"E/]\u001curT^5fn\u0012?<_e[P<0\b|\f\rj\r<\rόL.3$-ڜ&Q\u0003\u0003k@~\u0013\u000fF\u000e\ry6E6079L3f\u007frk\u001d\\K\u0014\u0005; iЧ\u0007?id&`C\u001a\u0005{_Fi@kG~\u000egS\u0006\u0004\u001fa2.\u0012D_\u007f]}Wфϒ%<c<)\u074b\b0Gלk\u000e"}, d2 = {"3l_Al\u0012>g \u0003\u0004^\u0013\u0001\u0017>", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001e{loH\\", "9dh9\\5>:\u001d\r\nH-", "1`a<h:>Z\u0001z~g\b\u0010\r=S\u0004={", "", "7sT:F7:Q\u001d\b|", "1`a<h:>Zt\u0006~`5\u0005\t8t", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\fIPE{B\u001e\u001cDh=\tl4N\u007f6\u001d", "9dh9\\5>a", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001e{loHta6Yv|", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "9dh9\\5>:\u001d\r\nH-Dz\u0018Y\bynB", "uE5\u0016?2Hb \u0003\u0004(1\u000e\u0011xf\u00101yO\u0005! U9nL\u007f#D]\b)\u0003CY\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011TJ;\\_v9\u001b_$\fJ8\u0017\u0015gA+8*73\u000f0R\u0002\"l\u000f\u001bk", ">he<g\u0010GR\u0019\u0012", "", ">he<g\u0016?T'~\n", ":da=", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001ej", "AsP?g", "3mS", "4qP0g0H\\", "4q^:", "Bn", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class KeylineListKt {
    public static final KeylineList emptyKeylineList() {
        return KeylineList.Companion.getEmpty();
    }

    /* JADX INFO: renamed from: keylineListOf-WNYm7Xg, reason: not valid java name */
    public static final KeylineList m2905keylineListOfWNYm7Xg(float f2, float f3, int i2, Function1<? super KeylineListScope, Unit> function1) {
        KeylineListScopeImpl keylineListScopeImpl = new KeylineListScopeImpl();
        function1.invoke(keylineListScopeImpl);
        return keylineListScopeImpl.m2906createWithAlignmentwaks0t8(f2, f3, i2);
    }

    public static final KeylineList keylineListOf(float f2, float f3, int i2, float f4, Function1<? super KeylineListScope, Unit> function1) {
        KeylineListScopeImpl keylineListScopeImpl = new KeylineListScopeImpl();
        function1.invoke(keylineListScopeImpl);
        return keylineListScopeImpl.createWithPivot(f2, f3, i2, f4);
    }

    public static final Keyline lerp(Keyline keyline, Keyline keyline2, float f2) {
        return new Keyline(MathHelpersKt.lerp(keyline.getSize(), keyline2.getSize(), f2), MathHelpersKt.lerp(keyline.getOffset(), keyline2.getOffset(), f2), MathHelpersKt.lerp(keyline.getUnadjustedOffset(), keyline2.getUnadjustedOffset(), f2), f2 < 0.5f ? keyline.isFocal() : keyline2.isFocal(), f2 < 0.5f ? keyline.isAnchor() : keyline2.isAnchor(), f2 < 0.5f ? keyline.isPivot() : keyline2.isPivot(), MathHelpersKt.lerp(keyline.getCutoff(), keyline2.getCutoff(), f2));
    }

    public static final KeylineList lerp(KeylineList keylineList, KeylineList keylineList2, float f2) {
        KeylineList keylineList3 = keylineList;
        ArrayList arrayList = new ArrayList(keylineList3.size());
        int size = keylineList3.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(lerp(keylineList3.get(i2), keylineList2.get(i2), f2));
        }
        return new KeylineList(arrayList);
    }
}
