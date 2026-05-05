package androidx.compose.animation;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u000bnjO0LeN2ZS8\u0018sڔ<$iҕyّCU(\u0004*ޛWNusvJ`\u000bIƥ\f,ю\tDyU'\\J\u000eJ\u0003\u0003O7[oU9\u000fuF\t.4:8(\bв\u001e*V\u0014?\u0002QX$\u0012^A7ĴSUT\u0013(*\u0006l#Gɭ]0iDW\u0005]hǂS\toB\\'w0+N=LZ'\u001bxy\u001eYC}\u0094\u0014md\u0011\u0017j[m\u0014owK\u0017\u0001)=*w\u0007\u001e\u0383YH\u001b#?g\r\f\blٯ\u0004\u001ag\u001a=CO\u0012b\u0017̂'H\n\n\u000fT\u0004<\tόL45Կ~\n\u00148\u0003x$O^\u0002vB.{ˋ:\u001d-ĮK-?\"tY2Q'WO\u007f\u0015\r$$/xW*+צbڠ\u001fX\u0010S7\\NI˙R#"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006T/>h})F[\u0014*TC*x0'#lp=\u0011l\fOw'E[$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006e21b\f$Fq 7-D<k2-j", "1n]AX5MA\u0017z\u0002^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006T/>h})F[\u0014*TC\u0011", "/kX4a4>\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0003?b\r @|\u0004,IJ;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]ma\u0012P4\u0015\u0005bPy25", "5dc\u000e_0@\\!~\u0004m", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`rNs\u0010E~%>hS", "5dc\u0010b5MS\"\u000eh\\(\u0004\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u0013c\u0007/7v%\u001cK?Bk\n", "9dh", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006e21b\f$Fq 7-D<k2-zhu\u000f", "5dc\u0018X@|O\"\u0003\u0003Z;\u0001\u00138_\r(\u0003@|%\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn$fy)Eq%2WL\u001bl5\u001e\u0013wG9\u001b9", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "\u0019dh", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ContentScaleTransitionEffect extends TransitionEffect {
    public static final int $stable = 0;
    public static final Key Key = new Key(null);
    private final Alignment alignment;
    private final ContentScale contentScale;

    public static /* synthetic */ ContentScaleTransitionEffect copy$default(ContentScaleTransitionEffect contentScaleTransitionEffect, ContentScale contentScale, Alignment alignment, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            contentScale = contentScaleTransitionEffect.contentScale;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            alignment = contentScaleTransitionEffect.alignment;
        }
        return contentScaleTransitionEffect.copy(contentScale, alignment);
    }

    public final ContentScale component1() {
        return this.contentScale;
    }

    public final Alignment component2() {
        return this.alignment;
    }

    public final ContentScaleTransitionEffect copy(ContentScale contentScale, Alignment alignment) {
        return new ContentScaleTransitionEffect(contentScale, alignment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentScaleTransitionEffect)) {
            return false;
        }
        ContentScaleTransitionEffect contentScaleTransitionEffect = (ContentScaleTransitionEffect) obj;
        return Intrinsics.areEqual(this.contentScale, contentScaleTransitionEffect.contentScale) && Intrinsics.areEqual(this.alignment, contentScaleTransitionEffect.alignment);
    }

    public int hashCode() {
        return (this.contentScale.hashCode() * 31) + this.alignment.hashCode();
    }

    public String toString() {
        return "ContentScaleTransitionEffect(contentScale=" + this.contentScale + ", alignment=" + this.alignment + ')';
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b4ȗ\u007f8ܥB}\u0017hz9^D\u0014GnWY*Ƃo{B%Ӵ(s"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006T/>h})F[\u0014*TC*x0'#lp=\u0011l\fOw'E[\r\u0012\\fH", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006e21b\f$Fq 7-D<k2-zhu\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006T/>h})F[\u0014*TC*x0'#lp=\u0011l\fOw'E[$", "u(E", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Key implements TransitionEffectKey<ContentScaleTransitionEffect> {
        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Key() {
        }
    }

    public ContentScaleTransitionEffect(ContentScale contentScale, Alignment alignment) {
        super(null);
        this.contentScale = contentScale;
        this.alignment = alignment;
    }

    @Override // androidx.compose.animation.TransitionEffect
    public TransitionEffectKey<?> getKey$animation_release() {
        return Key;
    }
}
