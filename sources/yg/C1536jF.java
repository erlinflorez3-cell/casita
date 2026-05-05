package yg;

import android.os.Build;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: yg.jF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1536jF {
    private static final long Xd = 1000;

    public static ArrayList<String> Kd(String str) {
        return ud(new String[]{str}, (5279072885250219323L ^ 3802522947727769659L) ^ 9045003387919769320L);
    }

    private static ArrayList<String> Xd(Process process) {
        String line;
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        boolean z2 = true;
        while (z2) {
            try {
                line = bufferedReader.readLine();
            } catch (Exception e2) {
                z2 = false;
            }
            if (line == null) {
                break;
            }
            arrayList.add(line);
        }
        return arrayList;
    }

    public static ArrayList<String> Yd(String[] strArr) {
        return ud(strArr, C1580rY.Kd() ^ (8352379124830949471L ^ 8191220418650650710L));
    }

    public static ArrayList<String> ud(String[] strArr, long j2) {
        ArrayList<String> arrayListXd = null;
        try {
            Process processExec = Runtime.getRuntime().exec(strArr);
            if (Build.VERSION.SDK_INT >= (1543964171 ^ 1543964177)) {
                processExec.waitFor(j2, TimeUnit.MILLISECONDS);
            } else {
                Date date = new Date();
                long time = date.getTime();
                while (true) {
                    try {
                        processExec.exitValue();
                        break;
                    } catch (IllegalThreadStateException e2) {
                        if (date.getTime() - time > (6096774520816654188L ^ 6096774520816653444L)) {
                            return null;
                        }
                        Thread.sleep(8097253565494287675L ^ 8097253565494287665L);
                    }
                }
            }
            arrayListXd = Xd(processExec);
            return arrayListXd;
        } catch (Exception e3) {
            return arrayListXd;
        }
    }
}
