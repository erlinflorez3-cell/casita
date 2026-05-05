package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\u0015\"4\u0012}\bnjG7LeN1ZS8\u0018s{:(c$\u007fOCU ~(ޣ\u000edʴ\u0018nxYK\\\u0015\u001a&|x,aU'^\"\u00158B}AKM\u001e@˃dv<\t.7bG\u007f\u0005\u0011\u001e8N(v)Jƚ\u0010\u00146D~B\u001b%[\u00112\u00124KP\u0007,j\u007fPLG\u001b\\\u0001ș$ɨmDT6m@E[\u001bWl';w(Գ*Ë;7\u001b7a\rO`iR\u001b? QK٩&ݳ/KylDnP##+g\r\fs\\!ԇUd$)1XqU!#6y\u0013{;?:Rϳ&Ξό,\u0019Ǵ\f\u0012Kvx^NZRjP\u0006\u0013ad\u001e{į5ڢ=\u001bnϟĮ:\u001fמ6{3\u0014̗#\nv$aڌ*\u000f\u0014#T}pšUW"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000eFi#=7D<y4-j", "", "=eU@X;&W \u0006~l", "", "=eU@X;-g$~", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000eFi#=7D<y4-\u0004|l9\\", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH8u=", "D`[BX", "", "uI\u0018\u0017", "5dc\u001cY-LS(f~e3\u0001\u0017vi\b3\u0003", "uI\u0018\u0016", "5dc\u001cY-LS(m\u000fi,Dh91owM,", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class StartOffset {
    private final long value;

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ StartOffset m508boximpl(long j2) {
        return new StartOffset(j2);
    }

    /* JADX INFO: renamed from: constructor-impl */
    private static long m510constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m512equalsimpl(long j2, Object obj) {
        return (obj instanceof StartOffset) && j2 == ((StartOffset) obj).m518unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m513equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m516hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m517toStringimpl(long j2) {
        return "StartOffset(value=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m512equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m516hashCodeimpl(this.value);
    }

    public String toString() {
        return m517toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ long m518unboximpl() {
        return this.value;
    }

    private /* synthetic */ StartOffset(long j2) {
        this.value = j2;
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static long m509constructorimpl(int i2, int i3) {
        return m510constructorimpl(i2 * i3);
    }

    /* JADX INFO: renamed from: constructor-impl$default */
    public static /* synthetic */ long m511constructorimpl$default(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i4 & 2) != 0) {
            i3 = StartOffsetType.Companion.m526getDelayEo1U57Q();
        }
        return m509constructorimpl(i2, i3);
    }

    /* JADX INFO: renamed from: getOffsetMillis-impl */
    public static final int m514getOffsetMillisimpl(long j2) {
        return Math.abs((int) j2);
    }

    /* JADX INFO: renamed from: getOffsetType-Eo1U57Q */
    public static final int m515getOffsetTypeEo1U57Q(long j2) {
        boolean z2 = j2 > 0;
        if (z2) {
            return StartOffsetType.Companion.m527getFastForwardEo1U57Q();
        }
        if (z2) {
            throw new NoWhenBranchMatchedException();
        }
        return StartOffsetType.Companion.m526getDelayEo1U57Q();
    }
}
