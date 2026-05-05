package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: LazyLayoutIntervalContent.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&˛\bDZc|\u0004Oي8\u000b4B\u0007\"B\u0012\u007f\u0007lkA0RkP.XZ2\u000f\u0002{<$q$yCAX #8ޛwTm˧|I\u0003\u000bq\u000f6\u0016'kdHT9`ܫ\u00132Pq\bA[zU;vsd\u0006P60D\u0012\u0005/\"rT\u001e\u0004\u0013Cy\rB4N|RR;UMl \u0014V G-|iT5V{\u000e>=3\u001bipVW\u0014>\u000ee=Ve7\u001c%iӿ/J=H%+Y\u0017\u0017TaE)T\u0002N\u0015w]ݐȅM}]Ih\u0006\u001a);Q\u0013c\u0019<l\u0007a`R6Ya*֦Vˎ,w\t\u0013]R\u0012\u0011\u001e-X0=\u001a\u001dڜ<7KɨUĖT\u0006vD\u0006\u007fo<g4\u000e:C9In\b&ޅ\u001dRO}\u000b\u0016,-ѐr9"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u007f6GY_(c0|F#\u0012c\u001d$", "\u0017mc2e=:Z", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u007f6GY_(c0|F#\u0012c\u001d\r\u000f\u0016\u0014YN5jK\r", "", "u(E", "7mc2e=:Z'", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005O=-\u0015ur5\u000eJ0\\\u0006|", "5dc\u0016a;>`*z\u0002l", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0002\u001ewaF\u0018_35z5V\"", "7sT:66N\\(", "", "5dc\u0016g,F1#\u000f\u0004m", "u(8", "5dc\u0010b5MS\"\u000eir7|", "7mS2k", "5dc\u0018X@", "Ehc5<5MS&\u0010ve", "\"", "5k^/T3\"\\\u0018~\u000e", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", ":nR._\u0010Gb\u0019\f\fZ3`\u0012.e\u0013", "1n]AX5M", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJuzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class LazyLayoutIntervalContent<Interval extends Interval> {
    public static final int $stable = 0;

    public abstract IntervalList<Interval> getIntervals();

    public final int getItemCount() {
        return getIntervals().getSize();
    }

    public final <T> T withInterval(int i2, Function2<? super Integer, ? super Interval, ? extends T> function2) {
        IntervalList.Interval<Interval> interval = getIntervals().get(i2);
        return function2.invoke(Integer.valueOf(i2 - interval.getStartIndex()), interval.getValue());
    }

    /* JADX INFO: compiled from: LazyLayoutIntervalContent.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b<H\u0007\"B\u0012\u007f\u0007lo?\u0016Z͜x.\u0001Rz>y{LAk5\u0002RiW۟\u0002,\u000fR^mmrZ\\\u0011I5\u000b&zz,wT\u000f\\@\u0010h\u0017FЗ5ޜsAQbz<\u0013'\u0003QF\u0002\u001d\u001e*;X\u001f%|ŲO\u0016\u00183Pv@V\u001dO\u000b 8\u000bN$\u0011 rf|5vm\u0014\u000f\u0006ݡ\u0005ݦFR?a6\u0006[\u0014ѸS܋˜ve&-FVc\u0014ȕW\rߘVZ"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u007f6GY_(c0|F#\u0012c\u001d\r\u000f\u0016\u0014YN5jK\r", "", "9dh", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7mS2k", "5dc\u0018X@", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Bx_2", "5dc!l7>", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Interval {
        default Function1<Integer, Object> getKey() {
            return null;
        }

        default Function1<Integer, Object> getType() {
            return new Function1() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval$type$1
                public final Void invoke(int i2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            };
        }
    }

    public final Object getKey(int i2) {
        Object objInvoke;
        IntervalList.Interval<Interval> interval = getIntervals().get(i2);
        int startIndex = i2 - interval.getStartIndex();
        Function1<Integer, Object> key = interval.getValue().getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(startIndex))) == null) ? Lazy_androidKt.getDefaultLazyLayoutKey(i2) : objInvoke;
    }

    public final Object getContentType(int i2) {
        IntervalList.Interval<Interval> interval = getIntervals().get(i2);
        return interval.getValue().getType().invoke(Integer.valueOf(i2 - interval.getStartIndex()));
    }
}
