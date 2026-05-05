package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.Attachment;
import io.sentry.DateUtils;
import io.sentry.Hint;
import io.sentry.IHub;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.cache.AndroidEnvelopeCache;
import io.sentry.android.core.internal.threaddump.Lines;
import io.sentry.android.core.internal.threaddump.ThreadDumpParser;
import io.sentry.cache.EnvelopeCache;
import io.sentry.cache.IEnvelopeCache;
import io.sentry.hints.AbnormalExit;
import io.sentry.hints.Backfillable;
import io.sentry.hints.BlockingFlushHint;
import io.sentry.protocol.Message;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryThread;
import io.sentry.transport.CurrentDateProvider;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.util.HintUtils;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes6.dex */
public class AnrV2Integration implements Integration, Closeable {
    static final long NINETY_DAYS_THRESHOLD = TimeUnit.DAYS.toMillis(91);
    private final Context context;
    private final ICurrentDateProvider dateProvider;
    private SentryAndroidOptions options;

    static class AnrProcessor implements Runnable {
        private final Context context;
        private final IHub hub;
        private final SentryAndroidOptions options;
        private final long threshold;

        AnrProcessor(Context context, IHub iHub, SentryAndroidOptions sentryAndroidOptions, ICurrentDateProvider iCurrentDateProvider) {
            this.context = context;
            this.hub = iHub;
            this.options = sentryAndroidOptions;
            this.threshold = iCurrentDateProvider.getCurrentTimeMillis() - AnrV2Integration.NINETY_DAYS_THRESHOLD;
        }

        private byte[] getDumpBytes(InputStream inputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i2 = inputStream.read(bArr, 0, 1024);
                    if (i2 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        private ParseResult parseThreadDump(ApplicationExitInfo applicationExitInfo, boolean z2) {
            try {
                InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                try {
                    if (traceInputStream == null) {
                        ParseResult parseResult = new ParseResult(ParseResult.Type.NO_DUMP);
                        if (traceInputStream != null) {
                            traceInputStream.close();
                        }
                        return parseResult;
                    }
                    byte[] dumpBytes = getDumpBytes(traceInputStream);
                    if (traceInputStream != null) {
                        traceInputStream.close();
                    }
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(dumpBytes)));
                        try {
                            List<SentryThread> list = new ThreadDumpParser(this.options, z2).parse(Lines.readLines(bufferedReader));
                            if (list.isEmpty()) {
                                ParseResult parseResult2 = new ParseResult(ParseResult.Type.NO_DUMP);
                                bufferedReader.close();
                                return parseResult2;
                            }
                            ParseResult parseResult3 = new ParseResult(ParseResult.Type.DUMP, dumpBytes, list);
                            bufferedReader.close();
                            return parseResult3;
                        } finally {
                        }
                    } catch (Throwable th) {
                        this.options.getLogger().log(SentryLevel.WARNING, "Failed to parse ANR thread dump", th);
                        return new ParseResult(ParseResult.Type.ERROR, dumpBytes);
                    }
                } finally {
                }
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.WARNING, "Failed to read ANR thread dump", th2);
                return new ParseResult(ParseResult.Type.NO_DUMP);
            }
        }

        private void reportAsSentryEvent(ApplicationExitInfo applicationExitInfo, boolean z2) {
            long timestamp = applicationExitInfo.getTimestamp();
            boolean z3 = applicationExitInfo.getImportance() != 100;
            ParseResult threadDump = parseThreadDump(applicationExitInfo, z3);
            if (threadDump.type == ParseResult.Type.NO_DUMP) {
                this.options.getLogger().log(SentryLevel.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                return;
            }
            AnrV2Hint anrV2Hint = new AnrV2Hint(this.options.getFlushTimeoutMillis(), this.options.getLogger(), timestamp, z2, z3);
            Hint hintCreateWithTypeCheckHint = HintUtils.createWithTypeCheckHint(anrV2Hint);
            SentryEvent sentryEvent = new SentryEvent();
            if (threadDump.type == ParseResult.Type.ERROR) {
                Message message = new Message();
                message.setFormatted("Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.");
                sentryEvent.setMessage(message);
            } else if (threadDump.type == ParseResult.Type.DUMP) {
                sentryEvent.setThreads(threadDump.threads);
            }
            sentryEvent.setLevel(SentryLevel.FATAL);
            sentryEvent.setTimestamp(DateUtils.getDateTime(timestamp));
            if (this.options.isAttachAnrThreadDump() && threadDump.dump != null) {
                hintCreateWithTypeCheckHint.setThreadDump(Attachment.fromThreadDump(threadDump.dump));
            }
            if (this.hub.captureEvent(sentryEvent, hintCreateWithTypeCheckHint).equals(SentryId.EMPTY_ID) || anrV2Hint.waitFlush()) {
                return;
            }
            this.options.getLogger().log(SentryLevel.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", sentryEvent.getEventId());
        }

        private void reportNonEnrichedHistoricalAnrs(List<ApplicationExitInfo> list, Long l2) {
            Collections.reverse(list);
            for (ApplicationExitInfo applicationExitInfo : list) {
                if (applicationExitInfo.getReason() == 6) {
                    if (applicationExitInfo.getTimestamp() < this.threshold) {
                        this.options.getLogger().log(SentryLevel.DEBUG, "ANR happened too long ago %s.", applicationExitInfo);
                    } else if (l2 == null || applicationExitInfo.getTimestamp() > l2.longValue()) {
                        reportAsSentryEvent(applicationExitInfo, false);
                    } else {
                        this.options.getLogger().log(SentryLevel.DEBUG, "ANR has already been reported %s.", applicationExitInfo);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Context context = this.context;
            String strUd = C1626yg.Ud("JRgsq\u00033G", (short) (FB.Xd() ^ 15899), (short) (FB.Xd() ^ 32151));
            short sXd = (short) (ZN.Xd() ^ 28457);
            int[] iArr = new int["_%In3\u0001W`G34\u001c>MSv3i n![-".length()];
            QB qb = new QB("_%In3\u0001W`G34\u001c>MSv3i n![-");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            Object[] objArr = {strUd};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("hesQvoo_fK\\hk]VW", (short) (Od.Xd() ^ (-17634))), Class.forName(EO.Od(".r\u0018\u001c+'qx!\u0005&k\u0015\u001c;W", (short) (C1633zX.Xd() ^ (-26413)))));
            try {
                method.setAccessible(true);
                ApplicationExitInfo applicationExitInfo = null;
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) method.invoke(context, objArr)).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() == 0) {
                    this.options.getLogger().log(SentryLevel.DEBUG, C1593ug.zd("_\u00023\u0007zy\u0007\u000b}\u000e;\u0006\f>\b\n\u0015\u0017\u0013\u0017\u000f\n\t\u0015I\u0010$\u0016\"N\"\u0016\u0013&##)d", (short) (C1499aX.Xd() ^ (-15502)), (short) (C1499aX.Xd() ^ (-15377))), new Object[0]);
                    return;
                }
                IEnvelopeCache envelopeDiskCache = this.options.getEnvelopeDiskCache();
                if ((envelopeDiskCache instanceof EnvelopeCache) && this.options.isEnableAutoSessionTracking()) {
                    EnvelopeCache envelopeCache = (EnvelopeCache) envelopeDiskCache;
                    if (!envelopeCache.waitPreviousSessionFlush()) {
                        this.options.getLogger().log(SentryLevel.WARNING, C1561oA.od("Pdg^\\\u0017ejh\u0013iRYcW[S\u000b^X\bMRZWK\u0002QRDTFKPMxK<IH=B@pD>m6@>i8?5e+-/'n", (short) (ZN.Xd() ^ 6111)), new Object[0]);
                        envelopeCache.flushPreviousSession();
                    }
                }
                ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
                Long lLastReportedAnr = AndroidEnvelopeCache.lastReportedAnr(this.options);
                Iterator<ApplicationExitInfo> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ApplicationExitInfo next = it.next();
                    if (next.getReason() == 6) {
                        arrayList.remove(next);
                        applicationExitInfo = next;
                        break;
                    }
                }
                if (applicationExitInfo == null) {
                    this.options.getLogger().log(SentryLevel.DEBUG, C1561oA.Kd("\t+\\~\r\u00124a+%;+f*./9k3=D>5q<BtJ?=xBDOQMQIDCO\u0004J^P\\\t\\PM`]]c\u0011^\\gi$", (short) (OY.Xd() ^ 229)), new Object[0]);
                    return;
                }
                if (applicationExitInfo.getTimestamp() >= this.threshold) {
                    if (lLastReportedAnr != null && applicationExitInfo.getTimestamp() <= lLastReportedAnr.longValue()) {
                        this.options.getLogger().log(SentryLevel.DEBUG, C1561oA.Xd("7MaSbd\u00113AF\u0015^Xk\u0019[gnb_cy!dhis&ymyy}\u0001rr;0\u0004w\b\n\b\u0005\u0001\u0007\u0001:\u0001}\u0010\u000b\u0019N", (short) (Od.Xd() ^ (-26698))), new Object[0]);
                        return;
                    }
                    if (this.options.isReportHistoricalAnrs()) {
                        reportNonEnrichedHistoricalAnrs(arrayList, lLastReportedAnr);
                    }
                    reportAsSentryEvent(applicationExitInfo, true);
                    return;
                }
                ILogger logger = this.options.getLogger();
                SentryLevel sentryLevel = SentryLevel.DEBUG;
                short sXd2 = (short) (OY.Xd() ^ 5663);
                short sXd3 = (short) (OY.Xd() ^ 4241);
                int[] iArr2 = new int["\u0017F\u0013\u0019`\u007fd\u001bQ\u0014zx\u000bXq\u001cNb\u001cpz\u000fM\u0017\tEb\u0015b]\u0002C%2BO\u0014.d~#]ofEv!Y\u0010Y".length()];
                QB qb2 = new QB("\u0017F\u0013\u0019`\u007fd\u001bQ\u0014zx\u000bXq\u001cNb\u001cpz\u000fM\u0017\tEb\u0015b]\u0002C%2BO\u0014.d~#]ofEv!Y\u0010Y");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                    i3++;
                }
                logger.log(sentryLevel, new String(iArr2, 0, i3), new Object[0]);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public static final class AnrV2Hint extends BlockingFlushHint implements Backfillable, AbnormalExit {
        private final boolean isBackgroundAnr;
        private final boolean shouldEnrich;
        private final long timestamp;

        public AnrV2Hint(long j2, ILogger iLogger, long j3, boolean z2, boolean z3) {
            super(j2, iLogger);
            this.timestamp = j3;
            this.shouldEnrich = z2;
            this.isBackgroundAnr = z3;
        }

        @Override // io.sentry.hints.AbnormalExit
        public boolean ignoreCurrentThread() {
            return false;
        }

        @Override // io.sentry.hints.DiskFlushNotification
        public boolean isFlushable(SentryId sentryId) {
            return true;
        }

        @Override // io.sentry.hints.AbnormalExit
        public String mechanism() {
            return this.isBackgroundAnr ? "anr_background" : "anr_foreground";
        }

        @Override // io.sentry.hints.DiskFlushNotification
        public void setFlushable(SentryId sentryId) {
        }

        @Override // io.sentry.hints.Backfillable
        public boolean shouldEnrich() {
            return this.shouldEnrich;
        }

        @Override // io.sentry.hints.AbnormalExit
        public Long timestamp() {
            return Long.valueOf(this.timestamp);
        }
    }

    static final class ParseResult {
        final byte[] dump;
        final List<SentryThread> threads;
        final Type type;

        enum Type {
            DUMP,
            NO_DUMP,
            ERROR
        }

        ParseResult(Type type) {
            this.type = type;
            this.dump = null;
            this.threads = null;
        }

        ParseResult(Type type, byte[] bArr) {
            this.type = type;
            this.dump = bArr;
            this.threads = null;
        }

        ParseResult(Type type, byte[] bArr, List<SentryThread> list) {
            this.type = type;
            this.dump = bArr;
            this.threads = list;
        }
    }

    public AnrV2Integration(Context context) {
        this(context, CurrentDateProvider.getInstance());
    }

    AnrV2Integration(Context context, ICurrentDateProvider iCurrentDateProvider) {
        this.context = ContextUtils.getApplicationContext(context);
        this.dateProvider = iCurrentDateProvider;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.Integration
    public void register(IHub iHub, SentryOptions sentryOptions) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.options.isAnrEnabled()));
        if (this.options.getCacheDirPath() == null) {
            this.options.getLogger().log(SentryLevel.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.options.isAnrEnabled()) {
            try {
                sentryOptions.getExecutorService().submit(new AnrProcessor(this.context, iHub, this.options, this.dateProvider));
            } catch (Throwable th) {
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Failed to start AnrProcessor.", th);
            }
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "AnrV2Integration installed.", new Object[0]);
            IntegrationUtils.addIntegrationToSdkVersion("AnrV2");
        }
    }
}
