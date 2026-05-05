package com.drew.tools;

import androidx.compose.animation.core.AnimationKt;
import com.adobe.internal.xmp.XMPException;
import com.adobe.internal.xmp.XMPIterator;
import com.adobe.internal.xmp.options.IteratorOptions;
import com.adobe.internal.xmp.properties.XMPPropertyInfo;
import com.drew.imaging.FileTypeDetector;
import com.drew.imaging.ImageMetadataReader;
import com.drew.lang.StringUtil;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.ExifIFD0Directory;
import com.drew.metadata.exif.ExifSubIFDDirectory;
import com.drew.metadata.exif.ExifThumbnailDirectory;
import com.drew.metadata.file.FileSystemDirectory;
import com.drew.metadata.xmp.XmpDirectory;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class ProcessAllImagesInFolderUtility {

    static class BasicFileHandler extends FileHandlerBase {
        BasicFileHandler() {
        }

        @Override // com.drew.tools.ProcessAllImagesInFolderUtility.FileHandlerBase, com.drew.tools.ProcessAllImagesInFolderUtility.FileHandler
        public void onExtractionSuccess(File file, Metadata metadata, String str, PrintStream printStream) {
            super.onExtractionSuccess(file, metadata, str, printStream);
            for (Directory directory : metadata.getDirectories()) {
                directory.getName();
                for (Tag tag : directory.getTags()) {
                    tag.getTagName();
                    tag.getDescription();
                }
            }
        }
    }

    interface FileHandler {
        void onBeforeExtraction(File file, PrintStream printStream, String str);

        void onExtractionError(File file, Throwable th, PrintStream printStream);

        void onExtractionSuccess(File file, Metadata metadata, String str, PrintStream printStream);

        void onScanCompleted(PrintStream printStream);

        void onStartingDirectory(File file);

        boolean shouldProcess(File file);
    }

    static abstract class FileHandlerBase implements FileHandler {
        private final Set<String> _supportedExtensions = new HashSet(Arrays.asList("jpg", "jpeg", "png", "gif", "bmp", "heic", "heif", "ico", "webp", "pcx", "ai", "eps", "nef", "crw", "cr2", "orf", "arw", "raf", "srw", "x3f", "rw2", "rwl", "dcr", "pef", "tif", "tiff", "psd", "dng", "j2c", "jp2", "jpf", "jpm", "mj2", "mp3", "wav", "3g2", "3gp", "m4v", "mov", RRWebVideoEvent.REPLAY_CONTAINER, "m2v", "m2ts", "mts", "pbm", "pnm", "pgm", "ppm", "avi", "fuzzed"));
        private int _processedFileCount = 0;
        private int _exceptionCount = 0;
        private int _errorCount = 0;
        private long _processedByteCount = 0;

        FileHandlerBase() {
        }

        protected String getExtension(File file) {
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            if (iLastIndexOf == -1 || iLastIndexOf == name.length() - 1) {
                return null;
            }
            return name.substring(iLastIndexOf + 1);
        }

        @Override // com.drew.tools.ProcessAllImagesInFolderUtility.FileHandler
        public void onBeforeExtraction(File file, PrintStream printStream, String str) {
            this._processedFileCount++;
            this._processedByteCount += file.length();
        }

        @Override // com.drew.tools.ProcessAllImagesInFolderUtility.FileHandler
        public void onExtractionError(File file, Throwable th, PrintStream printStream) {
            this._exceptionCount++;
            printStream.printf("\t[%s] %s\n", th.getClass().getName(), th.getMessage());
        }

        @Override // com.drew.tools.ProcessAllImagesInFolderUtility.FileHandler
        public void onExtractionSuccess(File file, Metadata metadata, String str, PrintStream printStream) {
            if (metadata.hasErrors()) {
                printStream.print(file);
                printStream.print('\n');
                for (Directory directory : metadata.getDirectories()) {
                    if (directory.hasErrors()) {
                        Iterator<String> it = directory.getErrors().iterator();
                        while (it.hasNext()) {
                            printStream.printf("\t[%s] %s\n", directory.getName(), it.next());
                            this._errorCount++;
                        }
                    }
                }
            }
        }

        @Override // com.drew.tools.ProcessAllImagesInFolderUtility.FileHandler
        public void onScanCompleted(PrintStream printStream) {
            int i2 = this._processedFileCount;
            if (i2 > 0) {
                printStream.print(String.format("Processed %,d files (%,d bytes) with %,d exceptions and %,d file errors\n", Integer.valueOf(i2), Long.valueOf(this._processedByteCount), Integer.valueOf(this._exceptionCount), Integer.valueOf(this._errorCount)));
            }
        }

        @Override // com.drew.tools.ProcessAllImagesInFolderUtility.FileHandler
        public void onStartingDirectory(File file) {
        }

        @Override // com.drew.tools.ProcessAllImagesInFolderUtility.FileHandler
        public boolean shouldProcess(File file) {
            String extension = getExtension(file);
            return extension != null && this._supportedExtensions.contains(extension.toLowerCase());
        }
    }

    static class MarkdownTableOutputHandler extends FileHandlerBase {
        private final Map<String, String> _extensionEquivalence;
        private final Map<String, List<Row>> _rowListByExtension;

        static class Row {
            private String exifVersion;
            final File file;
            private String makernote;
            private String manufacturer;
            final Metadata metadata;
            private String model;
            final String relativePath;
            private String thumbnail;

            Row(File file, Metadata metadata, String str) {
                boolean zContainsTag;
                this.file = file;
                this.metadata = metadata;
                this.relativePath = str;
                ExifIFD0Directory exifIFD0Directory = (ExifIFD0Directory) metadata.getFirstDirectoryOfType(ExifIFD0Directory.class);
                ExifSubIFDDirectory exifSubIFDDirectory = (ExifSubIFDDirectory) metadata.getFirstDirectoryOfType(ExifSubIFDDirectory.class);
                ExifThumbnailDirectory exifThumbnailDirectory = (ExifThumbnailDirectory) metadata.getFirstDirectoryOfType(ExifThumbnailDirectory.class);
                if (exifIFD0Directory != null) {
                    this.manufacturer = exifIFD0Directory.getDescription(271);
                    this.model = exifIFD0Directory.getDescription(272);
                }
                if (exifSubIFDDirectory != null) {
                    this.exifVersion = exifSubIFDDirectory.getDescription(ExifDirectoryBase.TAG_EXIF_VERSION);
                    zContainsTag = exifSubIFDDirectory.containsTag(ExifDirectoryBase.TAG_MAKERNOTE);
                } else {
                    zContainsTag = false;
                }
                if (exifThumbnailDirectory != null) {
                    Integer integer = exifThumbnailDirectory.getInteger(256);
                    Integer integer2 = exifThumbnailDirectory.getInteger(257);
                    this.thumbnail = (integer == null || integer2 == null) ? "Yes" : String.format("Yes (%s x %s)", integer, integer2);
                }
                Iterator<Directory> it = metadata.getDirectories().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Directory next = it.next();
                    if (next.getClass().getName().contains("Makernote")) {
                        this.makernote = next.getName().replace("Makernote", "").trim();
                        break;
                    }
                }
                if (this.makernote == null) {
                    this.makernote = zContainsTag ? "(Unknown)" : "N/A";
                }
            }
        }

        public MarkdownTableOutputHandler() {
            HashMap map = new HashMap();
            this._extensionEquivalence = map;
            this._rowListByExtension = new HashMap();
            map.put("jpeg", "jpg");
        }

        private void writeOutput(PrintStream printStream) throws IOException {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(printStream);
            outputStreamWriter.write("# Image Database Summary\n\n");
            for (Map.Entry<String, List<Row>> entry : this._rowListByExtension.entrySet()) {
                outputStreamWriter.write("## " + entry.getKey().toUpperCase() + " Files\n\n");
                outputStreamWriter.write("File|Manufacturer|Model|Dir Count|Exif?|Makernote|Thumbnail|All Data\n");
                outputStreamWriter.write("----|------------|-----|---------|-----|---------|---------|--------\n");
                List<Row> value = entry.getValue();
                Collections.sort(value, new Comparator<Row>() { // from class: com.drew.tools.ProcessAllImagesInFolderUtility.MarkdownTableOutputHandler.1
                    @Override // java.util.Comparator
                    public int compare(Row row, Row row2) {
                        int iCompare = StringUtil.compare(row.manufacturer, row2.manufacturer);
                        return iCompare != 0 ? iCompare : StringUtil.compare(row.model, row2.model);
                    }
                });
                for (Row row : value) {
                    String name = row.file.getName();
                    String str = row.relativePath;
                    String strUrlEncode = StringUtil.urlEncode(row.file.getName());
                    String str2 = "";
                    String str3 = row.manufacturer == null ? "" : row.manufacturer;
                    String str4 = row.model == null ? "" : row.model;
                    Integer numValueOf = Integer.valueOf(row.metadata.getDirectoryCount());
                    String str5 = row.exifVersion == null ? "" : row.exifVersion;
                    String str6 = row.makernote == null ? "" : row.makernote;
                    if (row.thumbnail != null) {
                        str2 = row.thumbnail;
                    }
                    outputStreamWriter.write(String.format("[%s](https://raw.githubusercontent.com/drewnoakes/metadata-extractor-images/master/%s/%s)|%s|%s|%d|%s|%s|%s|[metadata](https://raw.githubusercontent.com/drewnoakes/metadata-extractor-images/master/%s/metadata/%s.txt)\n", name, str, strUrlEncode, str3, str4, numValueOf, str5, str6, str2, row.relativePath, StringUtil.urlEncode(row.file.getName()).toLowerCase()));
                }
                outputStreamWriter.write(10);
            }
            outputStreamWriter.flush();
        }

        @Override // com.drew.tools.ProcessAllImagesInFolderUtility.FileHandlerBase, com.drew.tools.ProcessAllImagesInFolderUtility.FileHandler
        public void onExtractionSuccess(File file, Metadata metadata, String str, PrintStream printStream) {
            super.onExtractionSuccess(file, metadata, str, printStream);
            String extension = getExtension(file);
            if (extension == null) {
                return;
            }
            String lowerCase = extension.toLowerCase();
            if (this._extensionEquivalence.containsKey(lowerCase)) {
                lowerCase = this._extensionEquivalence.get(lowerCase);
            }
            List<Row> arrayList = this._rowListByExtension.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this._rowListByExtension.put(lowerCase, arrayList);
            }
            arrayList.add(new Row(file, metadata, str));
        }

        @Override // com.drew.tools.ProcessAllImagesInFolderUtility.FileHandlerBase, com.drew.tools.ProcessAllImagesInFolderUtility.FileHandler
        public void onScanCompleted(PrintStream printStream) throws Throwable {
            FileOutputStream fileOutputStream;
            PrintStream printStream2;
            super.onScanCompleted(printStream);
            try {
                try {
                    try {
                        fileOutputStream = new FileOutputStream("../wiki/ImageDatabaseSummary.md", false);
                        try {
                            printStream2 = new PrintStream((OutputStream) fileOutputStream, false);
                        } catch (IOException e2) {
                            e = e2;
                            printStream2 = null;
                        } catch (Throwable th) {
                            th = th;
                            printStream2 = null;
                            if (printStream2 != null) {
                                printStream2.close();
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        printStream2 = null;
                        fileOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        printStream2 = null;
                        fileOutputStream = null;
                    }
                    try {
                        writeOutput(printStream2);
                        printStream2.flush();
                        printStream2.close();
                        fileOutputStream.close();
                    } catch (IOException e5) {
                        e = e5;
                        e.printStackTrace();
                        if (printStream2 != null) {
                            printStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    }
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    static class TextFileOutputHandler extends FileHandlerBase {
        private static final String NEW_LINE = "\n";

        TextFileOutputHandler() {
        }

        private static void closeWriter(Writer writer) throws IOException {
            if (writer != null) {
                writer.write("Generated using metadata-extractor\n");
                writer.write("https://drewnoakes.com/code/exif/\n");
                writer.flush();
                writer.close();
            }
        }

        private static void deleteRecursively(File file) {
            String[] list;
            if (!file.isDirectory()) {
                throw new IllegalArgumentException("Must be a directory.");
            }
            if (file.exists() && (list = file.list()) != null) {
                for (String str : list) {
                    File file2 = new File(str);
                    if (file2.isDirectory()) {
                        deleteRecursively(file2);
                    } else {
                        file2.delete();
                    }
                }
            }
            file.delete();
        }

        private static PrintWriter openWriter(File file) throws Throwable {
            File file2 = new File(String.format("%s/metadata", file.getParent()));
            if (!file2.exists()) {
                file2.mkdir();
            }
            File file3 = new File(String.format("%s/metadata/java", file.getParent()));
            if (!file3.exists()) {
                file3.mkdir();
            }
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(String.format("%s/metadata/java/%s.txt", file.getParent(), file.getName())), "UTF-8");
            outputStreamWriter.write("FILE: " + file.getName() + "\n");
            BufferedInputStream bufferedInputStream = null;
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    outputStreamWriter.write(String.format("TYPE: %s\n", FileTypeDetector.detectFileType(bufferedInputStream2).toString().toUpperCase()));
                    outputStreamWriter.write("\n");
                    bufferedInputStream2.close();
                    return new PrintWriter(outputStreamWriter);
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[LOOP:1: B:14:0x0029->B:16:0x002d, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void writeHierarchyLevel(com.drew.metadata.Metadata r4, java.io.PrintWriter r5, com.drew.metadata.Directory r6, int r7) {
            /*
                java.lang.Iterable r0 = r4.getDirectories()
                java.util.Iterator r3 = r0.iterator()
            L8:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L4c
                java.lang.Object r2 = r3.next()
                com.drew.metadata.Directory r2 = (com.drew.metadata.Directory) r2
                if (r6 != 0) goto L1d
                com.drew.metadata.Directory r0 = r2.getParent()
                if (r0 == 0) goto L28
                goto L8
            L1d:
                com.drew.metadata.Directory r0 = r2.getParent()
                boolean r0 = r6.equals(r0)
                if (r0 != 0) goto L28
                goto L8
            L28:
                r1 = 0
            L29:
                int r0 = r7 * 4
                if (r1 >= r0) goto L35
                r0 = 32
                r5.write(r0)
                int r1 = r1 + 1
                goto L29
            L35:
                java.lang.String r0 = "- "
                r5.write(r0)
                java.lang.String r0 = r2.getName()
                r5.write(r0)
                java.lang.String r0 = "\n"
                r5.write(r0)
                int r0 = r7 + 1
                writeHierarchyLevel(r4, r5, r2, r0)
                goto L8
            L4c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.drew.tools.ProcessAllImagesInFolderUtility.TextFileOutputHandler.writeHierarchyLevel(com.drew.metadata.Metadata, java.io.PrintWriter, com.drew.metadata.Directory, int):void");
        }

        @Override // com.drew.tools.ProcessAllImagesInFolderUtility.FileHandlerBase, com.drew.tools.ProcessAllImagesInFolderUtility.FileHandler
        public void onBeforeExtraction(File file, PrintStream printStream, String str) {
            super.onBeforeExtraction(file, printStream, str);
            printStream.print(file.getAbsoluteFile());
            printStream.print("\n");
        }

        @Override // com.drew.tools.ProcessAllImagesInFolderUtility.FileHandlerBase, com.drew.tools.ProcessAllImagesInFolderUtility.FileHandler
        public void onExtractionError(File file, Throwable th, PrintStream printStream) throws Throwable {
            PrintWriter printWriterOpenWriter;
            super.onExtractionError(file, th, printStream);
            try {
                try {
                    printWriterOpenWriter = openWriter(file);
                } catch (Throwable th2) {
                    th = th2;
                    printWriterOpenWriter = null;
                }
                try {
                    printWriterOpenWriter.write("EXCEPTION: " + th.getMessage() + "\n");
                    printWriterOpenWriter.write("\n");
                    closeWriter(printWriterOpenWriter);
                } catch (Throwable th3) {
                    th = th3;
                    closeWriter(printWriterOpenWriter);
                    throw th;
                }
            } catch (IOException e2) {
                printStream.printf("IO exception writing metadata file: %s%s", e2.getMessage(), "\n");
            }
        }

        @Override // com.drew.tools.ProcessAllImagesInFolderUtility.FileHandlerBase, com.drew.tools.ProcessAllImagesInFolderUtility.FileHandler
        public void onExtractionSuccess(File file, Metadata metadata, String str, PrintStream printStream) throws Throwable {
            PrintWriter printWriterOpenWriter;
            Iterator<Directory> it;
            boolean z2;
            String description;
            super.onExtractionSuccess(file, metadata, str, printStream);
            PrintWriter printWriter = null;
            try {
                try {
                    printWriterOpenWriter = openWriter(file);
                    try {
                        if (metadata.hasErrors()) {
                            for (Directory directory : metadata.getDirectories()) {
                                if (directory.hasErrors()) {
                                    Iterator<String> it2 = directory.getErrors().iterator();
                                    while (it2.hasNext()) {
                                        printWriterOpenWriter.format("[ERROR: %s] %s%s", directory.getName(), it2.next(), "\n");
                                    }
                                }
                            }
                            printWriterOpenWriter.write("\n");
                        }
                        it = metadata.getDirectories().iterator();
                    } catch (Throwable th) {
                        th = th;
                        printWriter = printWriterOpenWriter;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                while (true) {
                    boolean z3 = false;
                    if (!it.hasNext()) {
                        writeHierarchyLevel(metadata, printWriterOpenWriter, null, 0);
                        printWriterOpenWriter.write("\n");
                        closeWriter(printWriterOpenWriter);
                        return;
                    }
                    Directory next = it.next();
                    String name = next.getName();
                    Iterator<Tag> it3 = next.getTags().iterator();
                    while (true) {
                        String str2 = "";
                        if (!it3.hasNext()) {
                            break;
                        }
                        Tag next2 = it3.next();
                        String tagName = next2.getTagName();
                        try {
                            description = next2.getDescription();
                        } catch (Exception e2) {
                            description = "ERROR: " + e2.getMessage();
                        }
                        if (description != null) {
                            str2 = description;
                        }
                        if ((next instanceof FileSystemDirectory) && next2.getTagType() == 3) {
                            str2 = "<omitted for regression testing as checkout dependent>";
                        }
                        printWriterOpenWriter.format("[%s - %s] %s = %s%s", name, next2.getTagTypeHex(), tagName, str2, "\n");
                    }
                    if (next.getTagCount() != 0) {
                        printWriterOpenWriter.write("\n");
                    }
                    if (next instanceof XmpDirectory) {
                        try {
                            XMPIterator it4 = ((XmpDirectory) next).getXMPMeta().iterator(new IteratorOptions().setJustLeafnodes(true));
                            z2 = false;
                            while (it4.hasNext()) {
                                try {
                                    XMPPropertyInfo xMPPropertyInfo = (XMPPropertyInfo) it4.next();
                                    String namespace = xMPPropertyInfo.getNamespace();
                                    String path = xMPPropertyInfo.getPath();
                                    String value = xMPPropertyInfo.getValue();
                                    if (path != null) {
                                        if (namespace == null) {
                                            namespace = "";
                                        }
                                        if (value == null) {
                                            value = "";
                                        } else if (value.length() > 512) {
                                            value = String.format("%s <truncated from %d characters>", value.substring(0, 512), Integer.valueOf(value.length()));
                                        }
                                        printWriterOpenWriter.format("[XMPMeta - %s] %s = %s%s", namespace, path, value, "\n");
                                        z2 = true;
                                    }
                                } catch (XMPException e3) {
                                    e = e3;
                                    z3 = z2;
                                    e.printStackTrace();
                                    z2 = z3;
                                }
                            }
                        } catch (XMPException e4) {
                            e = e4;
                        }
                        if (z2) {
                            printWriterOpenWriter.write("\n");
                        }
                    }
                    th = th;
                    printWriter = printWriterOpenWriter;
                    closeWriter(printWriter);
                    throw th;
                }
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }

        @Override // com.drew.tools.ProcessAllImagesInFolderUtility.FileHandlerBase, com.drew.tools.ProcessAllImagesInFolderUtility.FileHandler
        public void onStartingDirectory(File file) {
            super.onStartingDirectory(file);
            File file2 = new File(file + "/metadata/java");
            if (file2.exists()) {
                deleteRecursively(file2);
            }
        }
    }

    static class UnknownTagHandler extends FileHandlerBase {
        private HashMap<String, HashMap<Integer, Integer>> _occurrenceCountByTagByDirectory = new HashMap<>();

        UnknownTagHandler() {
        }

        @Override // com.drew.tools.ProcessAllImagesInFolderUtility.FileHandlerBase, com.drew.tools.ProcessAllImagesInFolderUtility.FileHandler
        public void onExtractionSuccess(File file, Metadata metadata, String str, PrintStream printStream) {
            super.onExtractionSuccess(file, metadata, str, printStream);
            for (Directory directory : metadata.getDirectories()) {
                for (Tag tag : directory.getTags()) {
                    if (!tag.hasTagName()) {
                        HashMap<Integer, Integer> map = this._occurrenceCountByTagByDirectory.get(directory.getName());
                        if (map == null) {
                            map = new HashMap<>();
                            this._occurrenceCountByTagByDirectory.put(directory.getName(), map);
                        }
                        Integer num = map.get(Integer.valueOf(tag.getTagType()));
                        if (num == null) {
                            num = 0;
                            map.put(Integer.valueOf(tag.getTagType()), 0);
                        }
                        map.put(Integer.valueOf(tag.getTagType()), Integer.valueOf(num.intValue() + 1));
                    }
                }
            }
        }

        @Override // com.drew.tools.ProcessAllImagesInFolderUtility.FileHandlerBase, com.drew.tools.ProcessAllImagesInFolderUtility.FileHandler
        public void onScanCompleted(PrintStream printStream) {
            super.onScanCompleted(printStream);
            for (Map.Entry<String, HashMap<Integer, Integer>> entry : this._occurrenceCountByTagByDirectory.entrySet()) {
                String key = entry.getKey();
                ArrayList<Map.Entry> arrayList = new ArrayList(entry.getValue().entrySet());
                Collections.sort(arrayList, new Comparator<Map.Entry<Integer, Integer>>() { // from class: com.drew.tools.ProcessAllImagesInFolderUtility.UnknownTagHandler.1
                    @Override // java.util.Comparator
                    public int compare(Map.Entry<Integer, Integer> entry2, Map.Entry<Integer, Integer> entry3) {
                        return entry3.getValue().compareTo(entry2.getValue());
                    }
                });
                for (Map.Entry entry2 : arrayList) {
                    printStream.format("%s, 0x%04X, %d\n", key, (Integer) entry2.getKey(), (Integer) entry2.getValue());
                }
            }
        }
    }

    public static void main(String[] strArr) throws IOException {
        ArrayList arrayList = new ArrayList();
        PrintStream printStream = System.out;
        FileHandler basicFileHandler = null;
        int i2 = 0;
        while (i2 < strArr.length) {
            String str = strArr[i2];
            if (str.equalsIgnoreCase("--text")) {
                basicFileHandler = new TextFileOutputHandler();
            } else if (str.equalsIgnoreCase("--markdown")) {
                basicFileHandler = new MarkdownTableOutputHandler();
            } else if (str.equalsIgnoreCase("--unknown")) {
                basicFileHandler = new UnknownTagHandler();
            } else if (str.equalsIgnoreCase("--log-file")) {
                if (i2 == strArr.length - 1) {
                    printUsage();
                    System.exit(1);
                }
                i2++;
                printStream = new PrintStream((OutputStream) new FileOutputStream(strArr[i2], false), true);
            } else {
                arrayList.add(str);
            }
            i2++;
        }
        if (arrayList.isEmpty()) {
            System.err.println("Expects one or more directories as arguments.");
            printUsage();
            System.exit(1);
        }
        if (basicFileHandler == null) {
            basicFileHandler = new BasicFileHandler();
        }
        long jNanoTime = System.nanoTime();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            processDirectory(new File((String) it.next()), basicFileHandler, "", printStream);
        }
        basicFileHandler.onScanCompleted(printStream);
        System.out.println(String.format("Completed in %d ms", Long.valueOf((System.nanoTime() - jNanoTime) / AnimationKt.MillisToNanos)));
        if (printStream != System.out) {
            printStream.close();
        }
    }

    private static void printUsage() {
        System.out.println("Usage:");
        System.out.println();
        System.out.println("  java com.drew.tools.ProcessAllImagesInFolderUtility [--text|--markdown|--unknown] [--log-file <file-name>]");
    }

    private static void processDirectory(File file, FileHandler fileHandler, String str, PrintStream printStream) {
        fileHandler.onStartingDirectory(file);
        String[] list = file.list();
        if (list == null) {
            return;
        }
        Arrays.sort(list);
        for (String str2 : list) {
            File file2 = new File(file, str2);
            if (file2.isDirectory()) {
                if (str.length() != 0) {
                    str2 = str + RemoteSettings.FORWARD_SLASH_STRING + str2;
                }
                processDirectory(file2, fileHandler, str2, printStream);
            } else if (fileHandler.shouldProcess(file2)) {
                fileHandler.onBeforeExtraction(file2, printStream, str);
                try {
                    fileHandler.onExtractionSuccess(file2, ImageMetadataReader.readMetadata(file2), str, printStream);
                } catch (Throwable th) {
                    fileHandler.onExtractionError(file2, th, printStream);
                }
            }
        }
    }
}
