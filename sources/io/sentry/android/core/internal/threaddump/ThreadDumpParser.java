package io.sentry.android.core.internal.threaddump;

import com.dynatrace.android.agent.Global;
import io.sentry.SentryLevel;
import io.sentry.SentryLockReason;
import io.sentry.SentryOptions;
import io.sentry.SentryStackTraceFactory;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class ThreadDumpParser {
    private final boolean isBackground;
    private final SentryOptions options;
    private final SentryStackTraceFactory stackTraceFactory;
    private static final Pattern BEGIN_MANAGED_THREAD_RE = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");
    private static final Pattern BEGIN_UNMANAGED_NATIVE_THREAD_RE = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");
    private static final Pattern NATIVE_RE = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*?)\\s+\\((.*)\\+(\\d+)\\)(?: \\(.*\\))?");
    private static final Pattern NATIVE_NO_LOC_RE = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*)\\s*\\(?(.*)\\)?(?: \\(.*\\))?");
    private static final Pattern JAVA_RE = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");
    private static final Pattern JNI_RE = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");
    private static final Pattern LOCKED_RE = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    private static final Pattern SLEEPING_ON_RE = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    private static final Pattern WAITING_ON_RE = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    private static final Pattern WAITING_TO_LOCK_RE = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    private static final Pattern WAITING_TO_LOCK_HELD_RE = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");
    private static final Pattern WAITING_TO_LOCK_UNKNOWN_RE = Pattern.compile(" *- waiting to lock an unknown object");
    private static final Pattern BLANK_RE = Pattern.compile("\\s+");

    public ThreadDumpParser(SentryOptions sentryOptions, boolean z2) {
        this.options = sentryOptions;
        this.isBackground = z2;
        this.stackTraceFactory = new SentryStackTraceFactory(sentryOptions);
    }

    private void combineThreadLocks(SentryThread sentryThread, SentryLockReason sentryLockReason) {
        Map<String, SentryLockReason> heldLocks = sentryThread.getHeldLocks();
        if (heldLocks == null) {
            heldLocks = new HashMap<>();
        }
        SentryLockReason sentryLockReason2 = heldLocks.get(sentryLockReason.getAddress());
        if (sentryLockReason2 != null) {
            sentryLockReason2.setType(Math.max(sentryLockReason2.getType(), sentryLockReason.getType()));
        } else {
            heldLocks.put(sentryLockReason.getAddress(), new SentryLockReason(sentryLockReason));
        }
        sentryThread.setHeldLocks(heldLocks);
    }

    private Integer getInteger(Matcher matcher, int i2, Integer num) {
        String strGroup = matcher.group(i2);
        return (strGroup == null || strGroup.length() == 0) ? num : Integer.valueOf(Integer.parseInt(strGroup));
    }

    private Long getLong(Matcher matcher, int i2, Long l2) {
        String strGroup = matcher.group(i2);
        return (strGroup == null || strGroup.length() == 0) ? l2 : Long.valueOf(Long.parseLong(strGroup));
    }

    private Integer getUInteger(Matcher matcher, int i2, Integer num) {
        String strGroup = matcher.group(i2);
        if (strGroup == null || strGroup.length() == 0) {
            return num;
        }
        Integer numValueOf = Integer.valueOf(Integer.parseInt(strGroup));
        return numValueOf.intValue() >= 0 ? numValueOf : num;
    }

    private boolean matches(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    private SentryStackTrace parseStacktrace(Lines lines, SentryThread sentryThread) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = NATIVE_RE.matcher("");
        Matcher matcher2 = NATIVE_NO_LOC_RE.matcher("");
        Matcher matcher3 = JAVA_RE.matcher("");
        Matcher matcher4 = JNI_RE.matcher("");
        Matcher matcher5 = LOCKED_RE.matcher("");
        Matcher matcher6 = WAITING_ON_RE.matcher("");
        Matcher matcher7 = SLEEPING_ON_RE.matcher("");
        Matcher matcher8 = WAITING_TO_LOCK_HELD_RE.matcher("");
        Matcher matcher9 = WAITING_TO_LOCK_RE.matcher("");
        Matcher matcher10 = WAITING_TO_LOCK_UNKNOWN_RE.matcher("");
        Matcher matcher11 = BLANK_RE.matcher("");
        SentryStackFrame sentryStackFrame = null;
        while (true) {
            if (!lines.hasNext()) {
                break;
            }
            Line next = lines.next();
            if (next == null) {
                this.options.getLogger().log(SentryLevel.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                break;
            }
            String str = next.text;
            if (matches(matcher, str)) {
                SentryStackFrame sentryStackFrame2 = new SentryStackFrame();
                sentryStackFrame2.setPackage(matcher.group(1));
                sentryStackFrame2.setFunction(matcher.group(2));
                sentryStackFrame2.setLineno(getInteger(matcher, 3, null));
                arrayList.add(sentryStackFrame2);
            } else if (matches(matcher2, str)) {
                SentryStackFrame sentryStackFrame3 = new SentryStackFrame();
                sentryStackFrame3.setPackage(matcher2.group(1));
                sentryStackFrame3.setFunction(matcher2.group(2));
                arrayList.add(sentryStackFrame3);
            } else if (matches(matcher3, str)) {
                sentryStackFrame = new SentryStackFrame();
                String str2 = String.format("%s.%s", matcher3.group(1), matcher3.group(2));
                sentryStackFrame.setModule(str2);
                sentryStackFrame.setFunction(matcher3.group(3));
                sentryStackFrame.setFilename(matcher3.group(4));
                sentryStackFrame.setLineno(getUInteger(matcher3, 5, null));
                sentryStackFrame.setInApp(this.stackTraceFactory.isInApp(str2));
                arrayList.add(sentryStackFrame);
            } else if (matches(matcher4, str)) {
                sentryStackFrame = new SentryStackFrame();
                String str3 = String.format("%s.%s", matcher4.group(1), matcher4.group(2));
                sentryStackFrame.setModule(str3);
                sentryStackFrame.setFunction(matcher4.group(3));
                sentryStackFrame.setInApp(this.stackTraceFactory.isInApp(str3));
                arrayList.add(sentryStackFrame);
            } else if (matches(matcher5, str)) {
                if (sentryStackFrame != null) {
                    SentryLockReason sentryLockReason = new SentryLockReason();
                    sentryLockReason.setType(1);
                    sentryLockReason.setAddress(matcher5.group(1));
                    sentryLockReason.setPackageName(matcher5.group(2));
                    sentryLockReason.setClassName(matcher5.group(3));
                    sentryStackFrame.setLock(sentryLockReason);
                    combineThreadLocks(sentryThread, sentryLockReason);
                }
            } else if (matches(matcher6, str)) {
                if (sentryStackFrame != null) {
                    SentryLockReason sentryLockReason2 = new SentryLockReason();
                    sentryLockReason2.setType(2);
                    sentryLockReason2.setAddress(matcher6.group(1));
                    sentryLockReason2.setPackageName(matcher6.group(2));
                    sentryLockReason2.setClassName(matcher6.group(3));
                    sentryStackFrame.setLock(sentryLockReason2);
                    combineThreadLocks(sentryThread, sentryLockReason2);
                }
            } else if (matches(matcher7, str)) {
                if (sentryStackFrame != null) {
                    SentryLockReason sentryLockReason3 = new SentryLockReason();
                    sentryLockReason3.setType(4);
                    sentryLockReason3.setAddress(matcher7.group(1));
                    sentryLockReason3.setPackageName(matcher7.group(2));
                    sentryLockReason3.setClassName(matcher7.group(3));
                    sentryStackFrame.setLock(sentryLockReason3);
                    combineThreadLocks(sentryThread, sentryLockReason3);
                }
            } else if (matches(matcher8, str)) {
                if (sentryStackFrame != null) {
                    SentryLockReason sentryLockReason4 = new SentryLockReason();
                    sentryLockReason4.setType(8);
                    sentryLockReason4.setAddress(matcher8.group(1));
                    sentryLockReason4.setPackageName(matcher8.group(2));
                    sentryLockReason4.setClassName(matcher8.group(3));
                    sentryLockReason4.setThreadId(getLong(matcher8, 4, null));
                    sentryStackFrame.setLock(sentryLockReason4);
                    combineThreadLocks(sentryThread, sentryLockReason4);
                }
            } else if (matches(matcher9, str)) {
                if (sentryStackFrame != null) {
                    SentryLockReason sentryLockReason5 = new SentryLockReason();
                    sentryLockReason5.setType(8);
                    sentryLockReason5.setAddress(matcher9.group(1));
                    sentryLockReason5.setPackageName(matcher9.group(2));
                    sentryLockReason5.setClassName(matcher9.group(3));
                    sentryStackFrame.setLock(sentryLockReason5);
                    combineThreadLocks(sentryThread, sentryLockReason5);
                }
            } else if (matches(matcher10, str)) {
                if (sentryStackFrame != null) {
                    SentryLockReason sentryLockReason6 = new SentryLockReason();
                    sentryLockReason6.setType(8);
                    sentryStackFrame.setLock(sentryLockReason6);
                    combineThreadLocks(sentryThread, sentryLockReason6);
                }
            } else if (str.length() == 0 || matches(matcher11, str)) {
                break;
            }
            sentryStackFrame = null;
        }
        Collections.reverse(arrayList);
        SentryStackTrace sentryStackTrace = new SentryStackTrace(arrayList);
        sentryStackTrace.setSnapshot(true);
        return sentryStackTrace;
    }

    private SentryThread parseThread(Lines lines) {
        SentryThread sentryThread = new SentryThread();
        Matcher matcher = BEGIN_MANAGED_THREAD_RE.matcher("");
        Matcher matcher2 = BEGIN_UNMANAGED_NATIVE_THREAD_RE.matcher("");
        if (!lines.hasNext()) {
            return null;
        }
        Line next = lines.next();
        boolean z2 = false;
        if (next == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "Internal error while parsing thread dump.", new Object[0]);
            return null;
        }
        if (matches(matcher, next.text)) {
            Long l2 = getLong(matcher, 4, null);
            if (l2 == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            sentryThread.setId(l2);
            sentryThread.setName(matcher.group(1));
            String strGroup = matcher.group(5);
            if (strGroup != null) {
                if (strGroup.contains(Global.BLANK)) {
                    sentryThread.setState(strGroup.substring(0, strGroup.indexOf(32)));
                } else {
                    sentryThread.setState(strGroup);
                }
            }
        } else if (matches(matcher2, next.text)) {
            Long l3 = getLong(matcher2, 3, null);
            if (l3 == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            sentryThread.setId(l3);
            sentryThread.setName(matcher2.group(1));
        }
        String name = sentryThread.getName();
        if (name != null) {
            boolean zEquals = name.equals(SentryThread.JsonKeys.MAIN);
            sentryThread.setMain(Boolean.valueOf(zEquals));
            sentryThread.setCrashed(Boolean.valueOf(zEquals));
            if (zEquals && !this.isBackground) {
                z2 = true;
            }
            sentryThread.setCurrent(Boolean.valueOf(z2));
        }
        sentryThread.setStacktrace(parseStacktrace(lines, sentryThread));
        return sentryThread;
    }

    public List<SentryThread> parse(Lines lines) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = BEGIN_MANAGED_THREAD_RE.matcher("");
        Matcher matcher2 = BEGIN_UNMANAGED_NATIVE_THREAD_RE.matcher("");
        while (lines.hasNext()) {
            Line next = lines.next();
            if (next == null) {
                this.options.getLogger().log(SentryLevel.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return arrayList;
            }
            String str = next.text;
            if (matches(matcher, str) || matches(matcher2, str)) {
                lines.rewind();
                SentryThread thread = parseThread(lines);
                if (thread != null) {
                    arrayList.add(thread);
                }
            }
        }
        return arrayList;
    }
}
