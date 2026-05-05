package com.braze.ui.contentcards;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.SdkDataWipeEvent;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.braze.ui.contentcards.adapters.EmptyContentCardsAdapter;
import com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler;
import com.braze.ui.contentcards.handlers.DefaultContentCardsViewBindingHandler;
import com.braze.ui.contentcards.handlers.IContentCardsUpdateHandler;
import com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.braze.ui.contentcards.recycler.ContentCardsDividerItemDecoration;
import com.braze.ui.contentcards.recycler.SimpleItemTouchHelperCallback;
import com.dynatrace.android.callback.Callback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.Qg;
import yg.Wg;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яċ\u0014D57\u001eq\u007fZDkt\u001aA\u000e0\u0011.J~8,\u001aՄ\u000ff\u000198DkL6Ri*\u0017k\u00027,[:qK;k\u001a\u0006\"\u000fRVg}nRZ\u0011F\u0017\u0006,xr,O\\\u0001](\u000f:BuB;M\u0006=A`z7\r H\"@y\u000b\u0004\"*^\u0010~zIL\u0014\u0012>@x:X\u0015U\u00050\u0012\u000ē(\u00014\\oޮ>H\u0003]Bǂ+\u0003\u007fBV'e;\u0003a#Ͽr\u0002=v\u0010\u001d[@e5M$.C\nқ_?\u0011@:C\u0013%?'Y\u0007:Y~o\u000eR-+}J\u000ev4\u001c\u001dQ\u000f\u001fmˈ\u000eԣJִˎ,w\t<U@\u0012O\u001e'vGu\u001etJ&3#\u0012\u001cN^EvB.8\u0012:%d\u00183YLah\u001agI]f7*BS k\u0010|fsT<\u001e[Ö\u0013ʦPĸҨD=V\u0015R}K5\u001crx\u0001XL`K\u000ex\u0014\u0011\\aU=i\u0005;#\u0002\u0001v\u0011\u0018|\u0013.\u0001U\u007fQv\u000fh\u0003^=8X$Zr\"K\u007f\u0019Zf|)MJ\u0012M\u0012P\u0019..\u0010<ObVb\u0018vw=e]8b_jE-\u0007k<&\u007fr{E_8(a\u00014DEJ0\u001dZ|A\u0002Z!pp0@\u001e\u0003\u0010&9tT\u001aiJA\b\u001bbEy'jl`\u0003L\u007fq\u0003\u00176rj&}\u0003Rl\u0015w|\r\t/\u000e\rx}A\u0011M<|f#[p\u00187i8c$\u00016\u0013\"5\u0002*\u0004\u0006k#܉X̡\u001au]ݨp<(?i1S\u0012=\u0004Y8\u00101]N\td\u007fRPiQۧ\u0006ӛ?t6Ԗ lv3nrjQZ 0\u0001/\r1\u0013|\u0002\u0010`t\u0007\u001eϏ`ߏ_JQͿ\u001b[B[F\u000b%!$4\u000f\u007fr\u001dC>[/-\u0018\b\u0014](w\\\u0018\u0002\u0005ӥnϪ*\u0001mֽDe\u001c\u0004pf}4ANWpOX0<\u0005\u0005XG\u0019\u0011^ȼ\u0015Ό\u0011?PШ|r\\R[&O\u007fl#:*ApiX+q\u00143\\~\u0001ϗO\u0382\u0018jKљ)OY\b{\u000fk^\u0011l\u001d-[\u000e?\u0013*\u001ck9-̵dס4\f{̸NCA\b\u0013WY6BRT\b9b+Ȱ\bخ~\u0006Nܪ'\u00198i\u0002\\'&b!tVv.7ѩlՃ.\r\u0007۰K ~_?0\u000eHZ[q_Qi+73n_~l&Ys\u000b{qξZ܁\u000fIuEO2D5\u0018C{\u001e\b\u000eN\u0017+P\u0019ȵ'ʦU\u001dgڻH`\u0011\nr\u0004\u0005x\u0018\u001d`\u0006rI\r3\u0015\u0016L\f\u001f\u000bG\t\tn\u0011?#Ϛ\u0004̢G&\tҿ\\+\rF\u000bxf\u001d3ACD֔Il\u001c'\u0002nŀ?Y"}, d2 = {"\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}W\u001a\u0001.DY\u0007/\u0015i#-[$Hg6&\u0015qp\u000f", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "\u001a`]1e6BR,H\tp0\b\t<e\u00015{N\u0004\u001e\u0013[y\u001eK@79X\u007f F7\u0004@QN;X4\u001f\"ho<m_@X\u00076\u00066W\u0019\\S\u007f=\"\u0015A\u0012\\:\r\u000eYNy", "u(E", "1`a14+:^(~\b", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}W8u!@h}-E7s8VR;tC{\u0011u`\u0015\u0006_7]v4\u001d", "\nrTA \u0006\u0017", "\u001a`]1e6BR,H\b^*\u0011\u00076e\r9\u007f@\u0013`)Kn\u0010<\u0006n\"Y{45t\u0016;>G;}\n", "1n]AX5M1\u0015\fyl\u0019|\u0007Cc\u0007(\t1\u0005\u0017)", "5dc\u0010b5MS\"\u000eXZ9{\u0017\u001ce}<yG\u0001$\bKo ", "u(;.a+K]\u001d}\u000e(9|\u0007Cc\u0007(\tQ\u0005\u0017)\u0011\u0002\u0012;x%D#j 5\u0002\u00145MP,o40j", "Adc\u0010b5MS\"\u000eXZ9{\u0017\u001ce}<yG\u0001$\bKo ", "uKP;W9HW\u0018\u0012Dk,z\u001d-l\u007f5\rD\u0001)`Ys\r>v4~F}\u001eKk\u001d.Z4?kFsXY", "1n]AX5M1\u0015\fyl\u001a\u000f\r:ef$\u0010J\u0011&", "\u001a`]1e6BR,H\tp0\b\t<e\u00015{N\u0004\u001e\u0013[y\u001eK@79X\u007f F7\u0004@QN;X4\u001f\"ho<m_@X\u00076\u001d", "5dc\u0010b5MS\"\u000eXZ9{\u0017\u001dw\u00043{'|+!W~", "u(;.a+K]\u001d}\u000e(:\u000f\r:e\r(|M\u0001%\u001aNk\"F\u00074~k\u0002\u001f9m%w;U?v4\u000b\u0015in9\u0015f\u0013J\u000b1W[$", "Adc\u0010b5MS\"\u000eXZ9{\u0017\u001dw\u00043{'|+!W~", "uKP;W9HW\u0018\u0012Dl>\u0001\u0014/r\u007f)\t@\u000f\u001a\u001eC\u0004\u0018L\u0006nG]|\"7|_\u001c_GFk!\u001e\u0016uaG\nJ(b\u00017V\"\u0012\u001d", "1n]AX5M1\u0015\fyl\u001c\b\b+t\u007f'iP}%\u0015Ts\u000b<\u0004", "\u001ab^:\")KO.~D^=|\u0012>sI\f[Q\u0001 &5\u007f\u000bJt29V}-\r", "\u001ab^:\")KO.~D^=|\u0012>sI\u0006\u0006I\u0010\u0017 VM\nIu3%d|\u001cFm\u0015\u000e^CDz\n", "5dc\u0010b5MS\"\u000eXZ9{\u0017\u001fp~$\u000b@\u007f\u0005'D}\fIz\"5f", "u(;0b4\bP&z\u0010^u|\u001a/n\u000f6E$`(\u0017P~{Ls33f\u0002\u001d7zk", "Adc\u0010b5MS\"\u000eXZ9{\u0017\u001fp~$\u000b@\u007f\u0005'D}\fIz\"5f", "uKR<`u;`\u0015\u0014z(,\u000e\t8t\u000eq_ \u0012\u0017 V]\u001e9\u0005#B]z DCY\u001f", "1tbAb4\u001c]\"\u000ezg;Z\u0005<do3z<\u0010\u0017yCx\rCv2", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}W?r.4`}-E7y\fWLJk=-rdn8\u0015S7Mr6G/J5[YrJi", "5dc\u0010h:M]!\\\u0005g;|\u0012>C{5z0\f\u0016\u0013Vop8\u007f$<Y\u000b", "u(;0b4\bP&z\u0010^u\r\rxc\n1\u000b@\n&\u0015C|\rJ@(1b|'7z$w1!EtC\u001e\u001ew?5\u0014b:>\u0002&C[N\u000fX[qD\u0014\u001f0", "Adc\u0010h:M]!\\\u0005g;|\u0012>C{5z0\f\u0016\u0013Vop8\u007f$<Y\u000b", "uKR<`u;`\u0015\u0014z(<\u0001R-o\t7{I\u0010\u0015\u0013Tn\u001c\u0006y!>X\u0005 D{_\u0012+MDz4'$F]F\u0006q\u001cYu#VL1(eQy=!g\u001e~", "1tbAb4\u001c]\"\u000ezg;Z\u0005<d\u000e\u0019\u007f@\u0013s\u001bPn\u0012Ex\b1b|'7z", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}W?r.4`}-E7y\fWLJk=-rdn8\u0015T0N\t\u0004KUM0eTU9\u001d\u0011a\u000e[\u0001", "5dc\u0010h:M]!\\\u0005g;|\u0012>C{5zNq\u001b\u0017YL\u0012Eu)>[`\u001c@l\u001d.Z", "u(;0b4\bP&z\u0010^u\r\rxc\n1\u000b@\n&\u0015C|\rJ@(1b|'7z$w1!EtC\u001e\u001ew?5\u0014b:?z'Y)R5[V{?v\u000ec\rU+\u001aZ", "Adc\u0010h:M]!\\\u0005g;|\u0012>C{5zNq\u001b\u0017YL\u0012Eu)>[`\u001c@l\u001d.Z", "uKR<`u;`\u0015\u0014z(<\u0001R-o\t7{I\u0010\u0015\u0013Tn\u001c\u0006y!>X\u0005 D{_\u0012+MDz4'$F]F\u0006q\u001dRv9$PW+`[t \u0010\u001bY\u0015N8bHJ", "2dU.h3M1#\b\n^5\ff+r~\u0018\u0007?|&\u0017*k\u0017;}%B", "5dc\u0011X-:c \u000eXh5\f\t8t]$\t?p\"\u0016C~\u000e\u001fr.4`}-", "2dU.h3M1#\b\n^5\ff+r~6lD\u0001)sKx\r@\u007f'\u0018U\u0007\u001f>m#", "5dc\u0011X-:c \u000eXh5\f\t8t]$\t?\u000f\b\u001bG\u0002j@\u007f$9b\u007f\u00033v\u00155MP", "2dU.h3M3!\n\nr\n\u0007\u0012>e\t7Y<\u000e\u0016%#n\nG\u0006%B", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}W8u!@h}-E7u6XROI>'$hjHd_9M\u0005\u0003FHY;\\_H", "5dc\u0011X-:c \u000eZf7\f\u001d\ro\t7{I\u0010t\u0013Tn\u001c\u0018u!@h}-", "u(;0b4\bP&z\u0010^u\r\rxc\n1\u000b@\n&\u0015C|\rJ@!4U\t/7z$w-KFzH{\u001fqp9\u0010r\nJ\u0004&U(M(garJi", "Adc\u0011X-:c \u000eZf7\f\u001d\ro\t7{I\u0010t\u0013Tn\u001c\u0018u!@h}-", "uKR<`u;`\u0015\u0014z(<\u0001R-o\t7{I\u0010\u0015\u0013Tn\u001c\u0006r$1d\r D{_\u000eUNJ\u007f\u0012(\u001ewaB\u0016A([u5#KJ7kR\u007f\u0013W\u0003", "3l_Al\n:`\u0018\rV](\b\u0018/r", "\u001a`]1e6BR,H\b^*\u0011\u00076e\r9\u007f@\u0013`)Kn\u0010<\u0006n\"Y{45t\u0016;>G;}ry\u0014dlH\u0007p\u0002", "5dc\u0012`7Mgvz\b]:X\b+p\u000f(\t", "u(;.a+K]\u001d}\u000e(9|\u0007Cc\u0007(\tQ\u0005\u0017)\u0011\u0002\u0012;x%D#j 5\u0002\u00145MP,o40SD`5\u0012r,[L", "<dcDb9DC\"z\fZ0\u0004\u0005,l\u007f\r\u0006=", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "5dc\u001bX;P]&\u0005jg(\u000e\u00053l{%\u0003@e!\u0014", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ{!DE", "Adc\u001bX;P]&\u0005jg(\u000e\u00053l{%\u0003@e!\u0014", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\ne!\u0014\u001d3~", "AcZ\u0011T;:E\u001d\nz>=|\u0012>S\u0010%\n>\u000e\u001b\u0014G|", "\u001ab^:\")KO.~D^=|\u0012>sI\u0016zF_\u0013&Ca\u0012Gv\u0005FY\u0007/\r", "5dc W2\u001dO(zlb7|h@e\t7iP}%\u0015Ts\u000b<\u0004", "Adc W2\u001dO(zlb7|h@e\t7iP}%\u0015Ts\u000b<\u0004", "/sc.V/,e\u001d\nzA,\u0004\u0014/r]$\u0003G}\u0013\u0015M", "", "1n]AX5M1\u0015\fyl\u001c\b\b+t\u007f", "3uT;g", "uKR<`u;`\u0015\u0014z(,\u000e\t8t\u000eqYJ\n&\u0017P~k8\u0004$CI\t\u001f3|\u0016--T;tCs{nkH\u000eg5\u0018t1TV^;`[rK]od\u0017]/\u0016\u0015UP(xM\rbn1E\u001372\b\b\u001f\u0010~TmGV\u000eVO", "5dc\u0010b5MS\"\u000eXZ9{x:d{7{#| \u0016No\u001b", "5dc\u0010b5MS\"\u000eXZ9{\u0017 i\u007f:XD\n\u0016\u001bPqp8\u007f$<Y\u000b", "6`]1_,\u001c]\"\u000ezg;Z\u0005<d\u000e\u0018\u0007?|&\u0017FO\u001f<\u007f4", "7mXA\\(EW.~g^*\u0011\u00076e\r\u0019\u007f@\u0013", "<dcDb9DC\"z\fZ0\u0004\u0005,l\u007f", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "=m2?X(MS\n\u0003zp", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7mU9T;>`", "\u001a`]1e6BRb\u0010~^>Fo+y\n8\u000b$\n\u0018\u001eC~\u000eIL", "1n]AT0GS&", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=m?.h:>", "=mA2Y9>a\u001c", "=mA2f<FS", "=mB.i,\"\\'\u000evg*|v>a\u000f(", "=tc g(MS", "=mE6X>,b\u0015\u000ezK,\u000b\u00189r\u007f'", "Adc\u0010b5MS\"\u000eXZ9{x:d{7{#| \u0016No\u001b", "D`[BX", "Adc\u0010b5MS\"\u000eXZ9{\u0017 i\u007f:XD\n\u0016\u001bPqp8\u007f$<Y\u000b", "AvP=E,<g\u0017\u0006zk\u001d\u0001\tAA~$\u0007O\u0001$", "<df\u000eW(Ib\u0019\f", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class ContentCardsFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {
    private static final long AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS = 2500;
    public static final Companion Companion = new Companion(null);
    private static final String KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY = "KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY";
    private static final String LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY = "LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY";
    private static final int MAX_CONTENT_CARDS_TTL_SECONDS = 60;
    private static final long NETWORK_PROBLEM_WARNING_MS = 5000;
    private static final String UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY = "UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY";
    private static final String VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY = "VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY";
    public ContentCardAdapter cardAdapter;
    private RecyclerView contentCardsRecyclerView;
    private SwipeRefreshLayout contentCardsSwipeLayout;
    private IEventSubscriber<ContentCardsUpdatedEvent> contentCardsUpdatedSubscriber;
    private IContentCardsUpdateHandler customContentCardUpdateHandler;
    private IContentCardsViewBindingHandler customContentCardsViewBindingHandler;
    private Job networkUnavailableJob;
    private IEventSubscriber<SdkDataWipeEvent> sdkDataWipeEventSubscriber;
    private EmptyContentCardsAdapter defaultEmptyContentCardsAdapter = new EmptyContentCardsAdapter();
    private final IContentCardsUpdateHandler defaultContentCardUpdateHandler = new DefaultContentCardsUpdateHandler();
    private final IContentCardsViewBindingHandler defaultContentCardsViewBindingHandler = new DefaultContentCardsViewBindingHandler();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0007\":\u001e\u007f\u0007ljA0RkP.XU0Ŧl\u0012éT[Rp\u0004@[\u001aԥ&\t]N8s|Kr\u000bq\u0011\\ǠK̶0I]ތ.\u001e\u001d5Zom7$ڑ\u0010˃dt>ӌp>0=\u0012\u0005/\u001e\u0001Ͻbͯ~CSÈb<NvRR;T[܈dĂB \tȦ-s\\>`l\f<\u0006ݍUݦFN/ڿ\u0001\t[\u0016^TU\u0011MѰpҋD7=Ֆu_\u0011\u0011j[m\u0007\u0016п\u0010ݾl'/Ǣʇwb"}, d2 = {"\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}W\u001a\u0001.DY\u0007/\u0015i#-[$Hg6&\u0015qpwdm4Yr0KVW\u0002", "", "u(E", "\u000fTC\u001cR\u000f\"2xxg>\rih\u001dHy\fd\u001fdtr6Yz6U\u0005\u001c5q\u001a\u001f[", "", "\u0019M>$A&\u001c/\u0006]tB\u0014gu\u000fSm\fe)n\u0011\u0005#`m\u001bp\t\u001eGl{ Ku(;2\u0017Z\u0014\u0018zHU", "", "\u001a@H\u001cH\u001b8;tgV@\fi\u0003\u001dAp\bZ:d\u007f\u00056Kv\u001aV\u001f#HY\u000f\u0017g{\u000eA", "\u001b@G,6\u0016'BxgiX\nXu\u000eSy\u0017j'z\u0005v%Yv\u001bd", "", "\u001cDC$B\u0019$M\u0004kd;\u0013\\p)W[\u0015d$ix\u0011/]", "#O3\u000eG\f86tgYE\fi\u0003\u001dAp\bZ:d\u007f\u00056Kv\u001aV\u001f#HY\u000f\u0017g{\u000eA", "$H4$R\t\"<wbc@&_d\u0018Df\bh:nr\b'N\b _\u0013$5f}\u0017g\u0004\u001d)2\u001be\u001a}\t", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.contentcards.ContentCardsFragment$contentCardsUpdate$5, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\bٕn"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass5 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ContentCardsFragment.this.new AnonymousClass5(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ContentCardsFragment.this.networkUnavailable(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.contentcards.ContentCardsFragment$handleContentCardsUpdatedEvent$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ContentCardsUpdatedEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ContentCardsUpdatedEvent contentCardsUpdatedEvent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$event = contentCardsUpdatedEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContentCardsFragment.this.new AnonymousClass1(this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ContentCardsFragment.this.contentCardsUpdate(this.$event, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.contentcards.ContentCardsFragment$onRefresh$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\bٕn"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09721 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        C09721(Continuation<? super C09721> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ContentCardsFragment.this.new C09721(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C09721) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SwipeRefreshLayout contentCardsSwipeLayout = ContentCardsFragment.this.getContentCardsSwipeLayout();
            if (contentCardsSwipeLayout != null) {
                contentCardsSwipeLayout.setRefreshing(false);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.contentcards.ContentCardsFragment$onViewStateRestored$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bundle $savedInstanceState;
        int label;
        final /* synthetic */ ContentCardsFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09731(Bundle bundle, ContentCardsFragment contentCardsFragment, Continuation<? super C09731> continuation) {
            super(2, continuation);
            this.$savedInstanceState = bundle;
            this.this$0 = contentCardsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C09731(this.$savedInstanceState, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ArrayList<String> stringArrayList;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) this.$savedInstanceState.getParcelable(ContentCardsFragment.LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY, Parcelable.class) : this.$savedInstanceState.getParcelable(ContentCardsFragment.LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY);
            RecyclerView contentCardsRecyclerView = this.this$0.getContentCardsRecyclerView();
            if (contentCardsRecyclerView != null) {
                RecyclerView.LayoutManager layoutManager = contentCardsRecyclerView.getLayoutManager();
                if (parcelable != null && layoutManager != null) {
                    layoutManager.onRestoreInstanceState(parcelable);
                }
            }
            ContentCardAdapter contentCardAdapter = this.this$0.cardAdapter;
            if (contentCardAdapter != null && (stringArrayList = this.$savedInstanceState.getStringArrayList(ContentCardsFragment.KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY)) != null) {
                contentCardAdapter.setImpressedCardIds(stringArrayList);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$0(ContentCardsFragment this$0, ContentCardsUpdatedEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "event");
        this$0.handleContentCardsUpdatedEvent(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$2(ContentCardsFragment this$0, SdkDataWipeEvent it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.handleContentCardsUpdatedEvent(ContentCardsUpdatedEvent.Companion.getEmptyUpdate());
    }

    protected final void attachSwipeHelperCallback() {
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            new ItemTouchHelper(new SimpleItemTouchHelperCallback(contentCardAdapter)).attachToRecyclerView(this.contentCardsRecyclerView);
        }
    }

    protected final Object contentCardsUpdate(final ContentCardsUpdatedEvent contentCardsUpdatedEvent, Continuation<? super Unit> continuation) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.contentcards.ContentCardsFragment.contentCardsUpdate.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Updating Content Cards views in response to ContentCardsUpdatedEvent: " + contentCardsUpdatedEvent;
            }
        }, 6, (Object) null);
        List<Card> listHandleCardUpdate = getContentCardUpdateHandler().handleCardUpdate(contentCardsUpdatedEvent);
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            contentCardAdapter.replaceCards(listHandleCardUpdate);
        }
        Job job = this.networkUnavailableJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.networkUnavailableJob = null;
        if (contentCardsUpdatedEvent.isFromOfflineStorage() && contentCardsUpdatedEvent.isTimestampOlderThan(60L)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.contentcards.ContentCardsFragment.contentCardsUpdate.3
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "ContentCards received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.";
                }
            }, 6, (Object) null);
            Braze.Companion companion = Braze.Companion;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
            companion.getInstance(contextRequireContext).requestContentCardsRefresh();
            if (listHandleCardUpdate.isEmpty()) {
                SwipeRefreshLayout swipeRefreshLayout = this.contentCardsSwipeLayout;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(true);
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.contentcards.ContentCardsFragment.contentCardsUpdate.4
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Old Content Cards was empty, putting up a network spinner and registering the network error message on a delay of 5000 ms.";
                    }
                }, 7, (Object) null);
                Job job2 = this.networkUnavailableJob;
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
                this.networkUnavailableJob = BrazeCoroutineScope.INSTANCE.launchDelayed(Boxing.boxLong(5000L), Dispatchers.getMain(), new AnonymousClass5(null));
                return Unit.INSTANCE;
            }
        }
        if (listHandleCardUpdate.isEmpty()) {
            swapRecyclerViewAdapter(getEmptyCardsAdapter());
        } else {
            ContentCardAdapter contentCardAdapter2 = this.cardAdapter;
            if (contentCardAdapter2 != null) {
                swapRecyclerViewAdapter(contentCardAdapter2);
            }
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setRefreshing(false);
        }
        return Unit.INSTANCE;
    }

    public final IContentCardsUpdateHandler getContentCardUpdateHandler() {
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.customContentCardUpdateHandler;
        return iContentCardsUpdateHandler == null ? this.defaultContentCardUpdateHandler : iContentCardsUpdateHandler;
    }

    public final RecyclerView getContentCardsRecyclerView() {
        return this.contentCardsRecyclerView;
    }

    protected final SwipeRefreshLayout getContentCardsSwipeLayout() {
        return this.contentCardsSwipeLayout;
    }

    protected final IEventSubscriber<ContentCardsUpdatedEvent> getContentCardsUpdatedSubscriber() {
        return this.contentCardsUpdatedSubscriber;
    }

    public final IContentCardsViewBindingHandler getContentCardsViewBindingHandler() {
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.customContentCardsViewBindingHandler;
        return iContentCardsViewBindingHandler == null ? this.defaultContentCardsViewBindingHandler : iContentCardsViewBindingHandler;
    }

    protected final IContentCardsUpdateHandler getCustomContentCardUpdateHandler() {
        return this.customContentCardUpdateHandler;
    }

    protected final IContentCardsViewBindingHandler getCustomContentCardsViewBindingHandler() {
        return this.customContentCardsViewBindingHandler;
    }

    protected final IContentCardsUpdateHandler getDefaultContentCardUpdateHandler() {
        return this.defaultContentCardUpdateHandler;
    }

    protected final IContentCardsViewBindingHandler getDefaultContentCardsViewBindingHandler() {
        return this.defaultContentCardsViewBindingHandler;
    }

    protected final EmptyContentCardsAdapter getDefaultEmptyContentCardsAdapter() {
        return this.defaultEmptyContentCardsAdapter;
    }

    protected final RecyclerView.Adapter<?> getEmptyCardsAdapter() {
        return this.defaultEmptyContentCardsAdapter;
    }

    protected final Job getNetworkUnavailableJob() {
        return this.networkUnavailableJob;
    }

    protected final IEventSubscriber<SdkDataWipeEvent> getSdkDataWipeEventSubscriber() {
        return this.sdkDataWipeEventSubscriber;
    }

    protected final void handleContentCardsUpdatedEvent(ContentCardsUpdatedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, Dispatchers.getMain(), null, new AnonymousClass1(event, null), 2, null);
    }

    protected final void initializeRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        ContentCardAdapter contentCardAdapter = new ContentCardAdapter(contextRequireContext, linearLayoutManager, new ArrayList(), getContentCardsViewBindingHandler());
        this.cardAdapter = contentCardAdapter;
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(contentCardAdapter);
        }
        RecyclerView recyclerView2 = this.contentCardsRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        attachSwipeHelperCallback();
        RecyclerView recyclerView3 = this.contentCardsRecyclerView;
        RecyclerView.ItemAnimator itemAnimator = recyclerView3 != null ? recyclerView3.getItemAnimator() : null;
        if (itemAnimator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        RecyclerView recyclerView4 = this.contentCardsRecyclerView;
        if (recyclerView4 != null) {
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext()");
            recyclerView4.addItemDecoration(new ContentCardsDividerItemDecoration(contextRequireContext2));
        }
    }

    protected final Object networkUnavailable(Continuation<? super Unit> continuation) throws Throwable {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.contentcards.ContentCardsFragment.networkUnavailable.2
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Displaying network unavailable toast.";
            }
        }, 6, (Object) null);
        Context context = getContext();
        if (context != null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.Zd("63\u0018\u0015aJ4m2-\u001c\u0011PI>f\u000b'\u0015\nJL7", (short) (Od.Xd() ^ (-29895)), (short) (Od.Xd() ^ (-23983)))).getMethod(C1561oA.Xd("DCS!QROMHG[QXX.[[bThe", (short) (C1499aX.Xd() ^ (-15415))), new Class[0]);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                if (context2 != null) {
                    int i2 = R.string.com_braze_feed_connection_error_title;
                    Class<?> cls = Class.forName(Wg.vd("%1&3/(\"j\u001f*(-\u001d%*bv\" %\u0015'\"", (short) (C1580rY.Xd() ^ (-26975))));
                    Class<?>[] clsArr = {Integer.TYPE};
                    Object[] objArr2 = {Integer.valueOf(i2)};
                    Method method2 = cls.getMethod(Qg.kd("MJX6VSIME", (short) (C1499aX.Xd() ^ (-21673)), (short) (C1499aX.Xd() ^ (-10492))), clsArr);
                    try {
                        method2.setAccessible(true);
                        Toast.makeText(context2, (String) method2.invoke(context2, objArr2), 1).show();
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        swapRecyclerViewAdapter(getEmptyCardsAdapter());
        SwipeRefreshLayout swipeRefreshLayout = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.com_braze_content_cards, viewGroup, false);
        this.contentCardsRecyclerView = (RecyclerView) viewInflate.findViewById(R.id.com_braze_content_cards_recycler);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(R.id.braze_content_cards_swipe_container);
        this.contentCardsSwipeLayout = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setColorSchemeResources(R.color.com_braze_content_cards_swipe_refresh_color_1, R.color.com_braze_content_cards_swipe_refresh_color_2, R.color.com_braze_content_cards_swipe_refresh_color_3, R.color.com_braze_content_cards_swipe_refresh_color_4);
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() throws Throwable {
        super.onPause();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.contentcards.ContentCardsFragment.onPause.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Invoked com.braze.ui.contentcards.ContentCardsFragment.onPause()";
            }
        }, 6, (Object) null);
        Braze.Companion companion = Braze.Companion;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        companion.getInstance(contextRequireContext).removeSingleSubscription(this.contentCardsUpdatedSubscriber, ContentCardsUpdatedEvent.class);
        Braze.Companion companion2 = Braze.Companion;
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext()");
        companion2.getInstance(contextRequireContext2).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        Job job = this.networkUnavailableJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.networkUnavailableJob = null;
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            contentCardAdapter.markOnScreenCardsAsRead();
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        Callback.onRefresh_enter();
        try {
            Braze.Companion companion = Braze.Companion;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
            companion.getInstance(contextRequireContext).requestContentCardsRefresh();
            BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS), null, new C09721(null), 2, null);
        } finally {
            Callback.onRefresh_exit();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Braze.Companion companion = Braze.Companion;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        companion.getInstance(contextRequireContext).removeSingleSubscription(this.contentCardsUpdatedSubscriber, ContentCardsUpdatedEvent.class);
        if (this.contentCardsUpdatedSubscriber == null) {
            this.contentCardsUpdatedSubscriber = new IEventSubscriber() { // from class: com.braze.ui.contentcards.ContentCardsFragment$$ExternalSyntheticLambda0
                @Override // com.braze.events.IEventSubscriber
                public final void trigger(Object obj) {
                    ContentCardsFragment.onResume$lambda$0(this.f$0, (ContentCardsUpdatedEvent) obj);
                }
            };
        }
        IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber = this.contentCardsUpdatedSubscriber;
        if (iEventSubscriber != null) {
            Braze.Companion companion2 = Braze.Companion;
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext()");
            companion2.getInstance(contextRequireContext2).subscribeToContentCardsUpdates(iEventSubscriber);
        }
        Braze.Companion companion3 = Braze.Companion;
        Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext()");
        companion3.getInstance(contextRequireContext3).requestContentCardsRefreshFromCache();
        Braze.Companion companion4 = Braze.Companion;
        Context contextRequireContext4 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext()");
        companion4.getInstance(contextRequireContext4).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        if (this.sdkDataWipeEventSubscriber == null) {
            this.sdkDataWipeEventSubscriber = new IEventSubscriber() { // from class: com.braze.ui.contentcards.ContentCardsFragment$$ExternalSyntheticLambda1
                @Override // com.braze.events.IEventSubscriber
                public final void trigger(Object obj) {
                    ContentCardsFragment.onResume$lambda$2(this.f$0, (SdkDataWipeEvent) obj);
                }
            };
        }
        IEventSubscriber<SdkDataWipeEvent> iEventSubscriber2 = this.sdkDataWipeEventSubscriber;
        if (iEventSubscriber2 != null) {
            Braze.Companion companion5 = Braze.Companion;
            Context contextRequireContext5 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "requireContext()");
            companion5.getInstance(contextRequireContext5).addSingleSynchronousSubscription(iEventSubscriber2, SdkDataWipeEvent.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        RecyclerView.LayoutManager layoutManager;
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            outState.putParcelable(LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY, layoutManager.onSaveInstanceState());
        }
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            outState.putStringArrayList(KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY, new ArrayList<>(contentCardAdapter.getImpressedCardIds()));
        }
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.customContentCardsViewBindingHandler;
        if (iContentCardsViewBindingHandler != null) {
            outState.putParcelable(VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY, iContentCardsViewBindingHandler);
        }
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.customContentCardUpdateHandler;
        if (iContentCardsUpdateHandler != null) {
            outState.putParcelable(UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY, iContentCardsUpdateHandler);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            IContentCardsUpdateHandler iContentCardsUpdateHandler = Build.VERSION.SDK_INT >= 33 ? (IContentCardsUpdateHandler) bundle.getParcelable(UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY, IContentCardsUpdateHandler.class) : (IContentCardsUpdateHandler) bundle.getParcelable(UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY);
            if (iContentCardsUpdateHandler != null) {
                setContentCardUpdateHandler(iContentCardsUpdateHandler);
            }
            IContentCardsViewBindingHandler iContentCardsViewBindingHandler = Build.VERSION.SDK_INT >= 33 ? (IContentCardsViewBindingHandler) bundle.getParcelable(VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY, IContentCardsViewBindingHandler.class) : (IContentCardsViewBindingHandler) bundle.getParcelable(VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY);
            if (iContentCardsViewBindingHandler != null) {
                setContentCardsViewBindingHandler(iContentCardsViewBindingHandler);
            }
            BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, Dispatchers.getMain(), null, new C09731(bundle, this, null), 2, null);
        }
        initializeRecyclerView();
    }

    public final void setContentCardUpdateHandler(IContentCardsUpdateHandler iContentCardsUpdateHandler) {
        this.customContentCardUpdateHandler = iContentCardsUpdateHandler;
    }

    protected final void setContentCardsRecyclerView(RecyclerView recyclerView) {
        this.contentCardsRecyclerView = recyclerView;
    }

    protected final void setContentCardsSwipeLayout(SwipeRefreshLayout swipeRefreshLayout) {
        this.contentCardsSwipeLayout = swipeRefreshLayout;
    }

    protected final void setContentCardsUpdatedSubscriber(IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber) {
        this.contentCardsUpdatedSubscriber = iEventSubscriber;
    }

    public final void setContentCardsViewBindingHandler(IContentCardsViewBindingHandler iContentCardsViewBindingHandler) {
        this.customContentCardsViewBindingHandler = iContentCardsViewBindingHandler;
    }

    protected final void setCustomContentCardUpdateHandler(IContentCardsUpdateHandler iContentCardsUpdateHandler) {
        this.customContentCardUpdateHandler = iContentCardsUpdateHandler;
    }

    protected final void setCustomContentCardsViewBindingHandler(IContentCardsViewBindingHandler iContentCardsViewBindingHandler) {
        this.customContentCardsViewBindingHandler = iContentCardsViewBindingHandler;
    }

    protected final void setDefaultEmptyContentCardsAdapter(EmptyContentCardsAdapter emptyContentCardsAdapter) {
        Intrinsics.checkNotNullParameter(emptyContentCardsAdapter, "<set-?>");
        this.defaultEmptyContentCardsAdapter = emptyContentCardsAdapter;
    }

    protected final void setNetworkUnavailableJob(Job job) {
        this.networkUnavailableJob = job;
    }

    protected final void setSdkDataWipeEventSubscriber(IEventSubscriber<SdkDataWipeEvent> iEventSubscriber) {
        this.sdkDataWipeEventSubscriber = iEventSubscriber;
    }

    protected final void swapRecyclerViewAdapter(RecyclerView.Adapter<?> newAdapter) {
        Intrinsics.checkNotNullParameter(newAdapter, "newAdapter");
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView == null || recyclerView.getAdapter() == newAdapter) {
            return;
        }
        recyclerView.setAdapter(newAdapter);
    }
}
