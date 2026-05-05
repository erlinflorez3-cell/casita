package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.input.pointer.PointerId;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: PointerIdArray.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001f6Ȑ\u0007\":\u0018\u007f\u0007lnA0RnP\u008cZS@\u000fs{:%c$\u007fJC٥\"}0\tWNmttϺpŏs\u000f4\u00159m߽MU\u0007]Z%@L\b?aX AGl\r63-\u07be!\u0600ѩ\t\u0003 8V\u001f?\u0007QU$\u0012^K!>`\u001de\u0005H#NB.\u00136\\\u0016a~^zqR/Q\u000e\u001aF\\3w0+ZЮEÖܮ\u0011xg39O\u007fA#9k\u00035]\fC\u0011U\n=3yoC9`\fWde0\u0018#Cg\r\fvl؟\u0005Ƣ_\u000b̥*ՒӍOR\u0014A\u0006\u0015D\u0011J\u001f&\u0006USvC(\u0003 \u000ea\u007f#WN\\\u001a^p\rҦ`اа)\u00029HG*/]oW1Ne\u00075\u0011,9\u0019nOl\u001d\u001an33T&\\aUNU`N8]\u0006\u000f\u0012\u0010z\u0002X\u0017`K\u000eG\u0014\u0011\\\u001bU;iE;!\u001a\u000f\u000fֺgѱ\u0004\u009bĈWkXhNC7-EI!\f\tW\u0015\tyhlXZ\u0015} b\u0017\u0016\bA1#ʃ<q1\u001eOgh\u0018l$έ\u0016ɻ3f?ժ?{\u001cZQ^a9\bӶ\u0010уVz,ABg\u0013^7^a\u0014r\\V&bLx\u0017\u0010{rRJS\tŴ}ʬ829ǉt\u0017N\f,Hˉ|\u0012g]nʏ\u001b\u00032,\u0003oCڸ\r#"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001}%2T\r&u8'$hn\u001d\u0006?9[r;\u001d", "", "u(E", "7mc2e5:Zt\f\bZ@", "", ":`bA<5=S,", "", "5dc\u0019T:M7\"}zq", "u(8", "\nrTA \u0006\u0017", "Ahi2", "5dc \\A>", "/cS", "", ">nX;g,K7\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018\u001dj", "/cSy#\r<2gpn", "uI\u0018'", "D`[BX", "", "1kT.e", "", "1n]AT0Ga", "1n]AT0Ga`I[\\\u000bKz#", ">nX;g,K7\u0018ove<|", "5dc", "7mS2k", "5dcyR\u0010\u000bg\r\f\u0005", "uH\u0018\u0017", "7r4:c;R", "@d\\<i,", "@d\\<i,\u0006\u001ey|Y-\u001ep", "@d\\<i,\u001ab", "Adc", "Adcy740\u001e\u001aK\r", "uH9uI", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PointerIdArray {
    public static final int $stable = 8;
    private long[] internalArray = new long[2];
    private int size;

    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: get-_I2yYro, reason: not valid java name */
    public final long m5480get_I2yYro(int i2) {
        return PointerId.m5365constructorimpl(this.internalArray[i2]);
    }

    /* JADX INFO: renamed from: remove-0FcD4WY, reason: not valid java name */
    public final boolean m5481remove0FcD4WY(long j2) {
        return remove(j2);
    }

    public final boolean remove(long j2) {
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (j2 == m5480get_I2yYro(i3)) {
                removeAt(i3);
                return true;
            }
        }
        return false;
    }

    public final boolean removeAt(int i2) {
        int i3 = this.size;
        if (i2 >= i3) {
            return false;
        }
        int i4 = i3 - 1;
        while (i2 < i4) {
            long[] jArr = this.internalArray;
            int i5 = i2 + 1;
            jArr[i2] = jArr[i5];
            i2 = i5;
        }
        this.size--;
        return true;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean add(long j2) {
        if (contains(j2)) {
            return false;
        }
        set(this.size, j2);
        return true;
    }

    /* JADX INFO: renamed from: add-0FcD4WY, reason: not valid java name */
    public final boolean m5478add0FcD4WY(long j2) {
        return add(j2);
    }

    public final void set(int i2, long j2) {
        long[] jArr = this.internalArray;
        if (i2 >= jArr.length) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i2 + 1, jArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.internalArray = jArrCopyOf;
        }
        this.internalArray[i2] = j2;
        if (i2 >= this.size) {
            this.size = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: set-DmW0f2w, reason: not valid java name */
    public final void m5482setDmW0f2w(int i2, long j2) {
        set(i2, j2);
    }

    public final void clear() {
        this.size = 0;
    }

    /* JADX INFO: renamed from: contains-0FcD4WY, reason: not valid java name */
    public final boolean m5479contains0FcD4WY(long j2) {
        return contains(j2);
    }

    public final boolean contains(long j2) {
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.internalArray[i3] == j2) {
                return true;
            }
        }
        return false;
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }
}
