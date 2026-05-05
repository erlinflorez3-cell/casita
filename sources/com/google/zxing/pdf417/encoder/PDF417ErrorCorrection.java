package com.google.zxing.pdf417.encoder;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import com.drew.metadata.avi.AviDirectory;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusCameraSettingsMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusFocusInfoMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusImageProcessingMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusRawInfoMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.exif.makernotes.SanyoMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.imageutils.JfifUtil;
import com.google.zxing.WriterException;
import com.google.zxing.pdf417.PDF417Common;
import com.valid.vssh_bio_validation_library.utils.BioValidationConstants;
import cz.msebera.android.httpclient.HttpStatus;
import io.sentry.HttpStatusCodeRange;

/* JADX INFO: loaded from: classes7.dex */
final class PDF417ErrorCorrection {
    private static final int[][] EC_COEFFICIENTS = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, IptcDirectory.TAG_REFERENCE_NUMBER, 232, 755, HttpStatusCodeRange.DEFAULT_MAX, 524, LeicaMakernoteDirectory.TAG_COLOR_TEMPERATURE, 132, 295, 116, 442, 428, 295, 42, 176, 65}, new int[]{361, IptcDirectory.TAG_DIGITAL_TIME_CREATED, 922, OlympusMakernoteDirectory.TAG_ORIGINAL_MANUFACTURER_MODEL, 176, 586, OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE, 321, SanyoMakernoteDirectory.TAG_FLICKER_REDUCE, 742, 677, 742, 687, 284, 193, 517, 273, 494, 263, 147, 593, LeicaMakernoteDirectory.TAG_CAMERA_TEMPERATURE, 571, AviDirectory.TAG_DATETIME_ORIGINAL, LeicaMakernoteDirectory.TAG_WB_GREEN_LEVEL, 133, 231, 390, 685, ExifDirectoryBase.TAG_SUB_IFD_OFFSET, 63, HttpStatus.SC_GONE}, new int[]{539, 422, 6, 93, 862, 771, 453, 106, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, OlympusImageProcessingMakernoteDirectory.TagWbGLevel, 107, 505, 733, 877, 381, 612, 723, 476, 462, 172, 430, TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 858, 822, SanyoMakernoteDirectory.TAG_SCENE_SELECT, IptcDirectory.TAG_ARM_IDENTIFIER, FrameMetricsAggregator.EVERY_DURATION, 400, 672, 762, 283, 184, BioValidationConstants.SC_EXPIRED_SESSION_CORE, 35, 519, 31, 460, 594, JfifUtil.MARKER_APP1, SanyoMakernoteDirectory.TAG_RECORD_SHUTTER_RELEASE, 517, 352, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 158, 651, 201, 488, 502, 648, 733, 717, 83, HttpStatus.SC_NOT_FOUND, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, SanyoMakernoteDirectory.TAG_SCENE_SELECT}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, 822, 93, 217, 208, PDF417Common.MAX_CODEWORDS_IN_BARCODE, 244, 583, 620, 246, 148, 447, 631, OlympusRawInfoMakernoteDirectory.TagWbRbLevelsEveningSunlight, 908, 490, TypedValues.TransitionType.TYPE_AUTO_TRANSITION, 516, 258, 457, 907, 594, 723, 674, OlympusRawInfoMakernoteDirectory.TagWbRbLevelsEveningSunlight, 272, 96, 684, 432, 686, TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO, 860, 569, 193, 219, 129, 186, 236, OlympusImageProcessingMakernoteDirectory.TagWbGLevel, 192, OlympusCameraSettingsMakernoteDirectory.TagAfFineTuneAdj, 278, 173, 40, 379, IptcDirectory.TAG_OBJECT_PREVIEW_FILE_FORMAT, 463, 646, OlympusFocusInfoMakernoteDirectory.TagAfPoint, 171, 491, ExifDirectoryBase.TAG_PAGE_NUMBER, 763, 156, 732, 95, 270, 447, 90, 507, 48, 228, 821, OlympusFocusInfoMakernoteDirectory.TagAfInfo, 898, 784, IptcDirectory.TAG_AUDIO_SAMPLING_RATE, IptcDirectory.TAG_SOURCE, IptcDirectory.TAG_ARM_VERSION, 382, 262, 380, 602, 754, IptcDirectory.TAG_TIME_SENT, 89, 614, 87, 432, 670, 616, 157, 374, 242, 726, 600, 269, 375, 898, 845, 454, 354, 130, 814, IptcDirectory.TAG_OBJECT_CYCLE, LeicaMakernoteDirectory.TAG_WB_BLUE_LEVEL, 34, 211, ExifDirectoryBase.TAG_SUB_IFD_OFFSET, 539, ExifDirectoryBase.TAG_PAGE_NUMBER, 827, 865, 37, 517, 834, 315, IptcDirectory.TAG_EXPIRATION_TIME, 86, LeicaMakernoteDirectory.TAG_COLOR_TEMPERATURE, 4, 108, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, TypedValues.Custom.TYPE_DIMENSION, LeicaMakernoteDirectory.TAG_MEASURED_LV, 138, 720, 858, 194, 311, 913, 275, 190, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 540, 913, LeicaMakernoteDirectory.TAG_COLOR_TEMPERATURE, 700, 799, 137, 439, 418, IptcDirectory.TAG_BY_LINE, 668, 353, 859, 370, 694, ExifDirectoryBase.TAG_TILE_BYTE_COUNTS, 240, JfifUtil.MARKER_SOI, 257, 284, 549, Mp4VideoDirectory.TAG_DEPTH, 884, 315, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, IptcDirectory.TAG_ARM_IDENTIFIER, 849, 521, 307, 291, LeicaMakernoteDirectory.TAG_WB_GREEN_LEVEL, IptcDirectory.TAG_OBJECT_PREVIEW_FILE_FORMAT, 19, 358, 399, 908, 103, FrameMetricsAggregator.EVERY_DURATION, 51, 8, 517, JfifUtil.MARKER_APP1, 289, 470, IptcDirectory.TAG_RASTERIZED_CAPTION, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, 136, IptcDirectory.TAG_CONTENT_LOCATION_CODE, TypedValues.Custom.TYPE_REFERENCE, 90, 2, OlympusRawInfoMakernoteDirectory.TagWbRbLevelsFineWeather, 743, 199, 655, TypedValues.Custom.TYPE_STRING, 329, 49, LeicaMakernoteDirectory.TAG_WB_RED_LEVEL, 580, 355, 588, 188, 462, 10, 134, IptcDirectory.TAG_COPYRIGHT_NOTICE, AviDirectory.TAG_DATETIME_ORIGINAL, 479, 130, 739, 71, 263, 318, 374, 601, 192, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 142, 673, 687, 234, 722, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 177, 752, 607, OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE, 455, 193, 689, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, IptcDirectory.TAG_MASTER_DOCUMENT_ID, 755, 756, 60, 231, 773, 434, 421, 726, 528, 503, 118, 49, 795, 32, 144, 500, 238, 836, 394, 280, 566, ExifDirectoryBase.TAG_PRIMARY_CHROMATICITIES, 9, IptcDirectory.TAG_LANGUAGE_IDENTIFIER, IptcDirectory.TAG_EXPIRATION_TIME, 73, 914, ExifDirectoryBase.TAG_TRANSFER_RANGE, 126, 32, 681, 331, 792, 620, 60, TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 441, 180, 791, 893, 754, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 383, 228, 749, 760, Mp4VideoDirectory.TAG_COLOR_TABLE, 54, ExifDirectoryBase.TAG_PAGE_NUMBER, 134, 54, 834, 299, 922, 191, 910, 532, TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 829, 189, 20, 167, 29, 872, 449, 83, 402, 41, 656, 505, 579, 481, 173, HttpStatus.SC_NOT_FOUND, 251, 688, 95, 497, 555, IptcDirectory.TAG_IMAGE_TYPE, SanyoMakernoteDirectory.TAG_SCENE_SELECT, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, 504, 35, HttpStatusCodeRange.DEFAULT_MAX, 428, 207, HttpStatus.SC_CONFLICT, IptcDirectory.TAG_DIGITAL_DATE_CREATED, 118, 498, 285, 380, 350, 492, 197, 265, 920, 155, 914, 299, 229, IptcDirectory.TAG_IMAGE_ORIENTATION, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, 520, 435, SanyoMakernoteDirectory.TAG_SCENE_SELECT, 203, IptcDirectory.TAG_AUDIO_OUTCUE, 249, IptcDirectory.TAG_CODED_CHARACTER_SET, 781, 621, OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE, 268, 794, 534, 539, 781, HttpStatus.SC_REQUEST_TIMEOUT, 390, 644, 102, 476, 499, OlympusRawInfoMakernoteDirectory.TagWbRbLevelsFineWeather, IptcDirectory.TAG_CAPTION, 545, 37, 858, 916, IptcDirectory.TAG_SPECIAL_INSTRUCTIONS, 41, 542, 289, 122, 272, 383, LeicaMakernoteDirectory.TAG_CAMERA_TEMPERATURE, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, OlympusRawInfoMakernoteDirectory.TagWbRbLevelsFineWeather, 204, 681, HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, 855, 85, 99, 62, 482, 180, 20, ExifDirectoryBase.TAG_PAGE_NUMBER, 451, 593, 913, 142, OlympusFocusInfoMakernoteDirectory.TagAfInfo, 684, OlympusImageProcessingMakernoteDirectory.TagWbGLevel, SanyoMakernoteDirectory.TAG_FLICKER_REDUCE, 561, 76, 653, 899, 729, IptcDirectory.TAG_DATE_CREATED, 744, 390, 513, 192, 516, 258, 240, 518, 794, 395, 768, 848, 51, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 168, 190, 826, 328, 596, LeicaMakernoteDirectory.TAG_MEASURED_LV, 303, 570, 381, HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, 641, 156, 237, 151, 429, 531, 207, 676, 710, 89, 168, 304, 402, 40, 708, IptcDirectory.TAG_DIGITAL_TIME_CREATED, 162, 864, 229, 65, 861, 841, 512, 164, 477, 221, 92, 358, 785, 288, 357, 850, 836, 827, 736, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, 94, 8, 494, 114, 521, 2, 499, 851, SanyoMakernoteDirectory.TAG_SCENE_SELECT, 152, 729, 771, 95, 248, 361, 578, ExifDirectoryBase.TAG_TILE_LENGTH, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, TypedValues.Custom.TYPE_COLOR, 452, 167, ExifDirectoryBase.TAG_TRANSFER_RANGE, 244, 173, 35, 463, 651, 51, IptcDirectory.TAG_UNIQUE_DOCUMENT_ID, 591, 452, 578, 37, 124, 298, 332, IptcDirectory.TAG_SPECIAL_INSTRUCTIONS, 43, 427, PanasonicMakernoteDirectory.TAG_BURST_SPEED, IptcDirectory.TAG_AUDIO_TYPE, 777, 475, 850, 764, 364, 578, 911, 283, 711, 472, 420, 245, 288, 594, 394, FrameMetricsAggregator.EVERY_DURATION, 327, 589, 777, IptcDirectory.TAG_UNIQUE_DOCUMENT_ID, 688, 43, HttpStatus.SC_REQUEST_TIMEOUT, 842, 383, 721, 521, 560, 644, IptcDirectory.TAG_OBJECT_PREVIEW_DATA, 559, 62, 145, 873, IptcDirectory.TAG_AUDIO_SAMPLING_RATE, IptcDirectory.TAG_OBJECT_PREVIEW_FILE_FORMAT_VERSION, 159, 672, 729, 624, 59, 193, HttpStatus.SC_EXPECTATION_FAILED, 158, Mp4VideoDirectory.TAG_DEPTH, 563, 564, 343, 693, 109, TypedValues.MotionType.TYPE_DRAW_PATH, 563, 365, 181, 772, 677, 310, 248, 353, 708, HttpStatus.SC_GONE, 579, 870, IptcDirectory.TAG_HEADLINE, 841, IptcDirectory.TAG_CAPTION, 860, 289, SanyoMakernoteDirectory.TAG_FLICKER_REDUCE, 35, 777, 618, 586, 424, 833, 77, IptcDirectory.TAG_BY_LINE_TITLE, IptcDirectory.TAG_CODED_CHARACTER_SET, 269, 757, IptcDirectory.TAG_CAPTION, 695, 751, 331, 247, 184, 45, LeicaMakernoteDirectory.TAG_APPROXIMATE_F_NUMBER, 680, 18, 66, HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, 369, 54, 492, 228, IptcDirectory.TAG_COUNTRY_OR_PRIMARY_LOCATION_NAME, 830, 922, 437, 519, 644, TypedValues.Custom.TYPE_DIMENSION, 789, 420, 305, 441, 207, 300, 892, 827, 141, 537, 381, IptcDirectory.TAG_AUDIO_TYPE, 513, 56, 252, 341, 242, 797, 838, 837, 720, CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY, 307, 631, 61, 87, 560, 310, 756, IptcDirectory.TAG_AUDIO_DURATION, 397, OlympusFocusInfoMakernoteDirectory.TagAfInfo, 851, 309, 473, 795, IptcDirectory.TAG_ARM_VERSION, 31, IptcDirectory.TAG_LANGUAGE_IDENTIFIER, 915, 459, 806, 590, 731, TypedValues.CycleType.TYPE_WAVE_PHASE, JfifUtil.MARKER_SOI, SanyoMakernoteDirectory.TAG_SEQUENCE_SHOT_INTERVAL, 249, 321, 881, IptcDirectory.TAG_UNIQUE_DOCUMENT_ID, SanyoMakernoteDirectory.TAG_RECORD_SHUTTER_RELEASE, 673, 782, Mp4VideoDirectory.TAG_COMPRESSION_TYPE, 815, TypedValues.Custom.TYPE_DIMENSION, 303, 843, 922, 281, 73, 469, 791, 660, 162, 498, 308, 155, 422, 907, LeicaMakernoteDirectory.TAG_CCD_BOARD_VERSION, 187, 62, 16, TypedValues.CycleType.TYPE_WAVE_PHASE, SanyoMakernoteDirectory.TAG_RECORD_SHUTTER_RELEASE, IptcDirectory.TAG_TIME_SENT, 286, 437, 375, 273, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 296, 183, 923, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, ExifDirectoryBase.TAG_SUB_IFD_OFFSET, 5, 39, 923, 311, 424, 242, 749, 321, 54, 669, 316, ExifDirectoryBase.TAG_TRANSFER_RANGE, 299, 534, 105, 667, 488, OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE, 672, 576, 540, 316, 486, 721, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 46, 656, 447, 171, 616, 464, 190, 531, ExifDirectoryBase.TAG_PAGE_NUMBER, 321, 762, 752, 533, 175, 134, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, 138, 646, HttpStatus.SC_LENGTH_REQUIRED, 877, 669, 141, 919, 45, 780, HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, 164, 332, 899, 165, 726, 600, ExifDirectoryBase.TAG_TILE_BYTE_COUNTS, 498, 655, 357, 752, 768, 223, 849, IptcDirectory.TAG_LANGUAGE_IDENTIFIER, 63, 310, 863, 251, 366, 304, 282, 738, 675, HttpStatus.SC_GONE, 389, 244, 31, 121, 303, 263}};

    private PDF417ErrorCorrection() {
    }

    static String generateErrorCorrection(CharSequence charSequence, int i2) {
        int errorCorrectionCodewordCount = getErrorCorrectionCodewordCount(i2);
        char[] cArr = new char[errorCorrectionCodewordCount];
        int length = charSequence.length();
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = errorCorrectionCodewordCount - 1;
            int iCharAt = (charSequence.charAt(i3) + cArr[i4]) % PDF417Common.NUMBER_OF_CODEWORDS;
            while (i4 > 0) {
                cArr[i4] = (char) ((cArr[i4 - 1] + (929 - ((EC_COEFFICIENTS[i2][i4] * iCharAt) % PDF417Common.NUMBER_OF_CODEWORDS))) % PDF417Common.NUMBER_OF_CODEWORDS);
                i4--;
            }
            cArr[0] = (char) ((929 - ((iCharAt * EC_COEFFICIENTS[i2][0]) % PDF417Common.NUMBER_OF_CODEWORDS)) % PDF417Common.NUMBER_OF_CODEWORDS);
        }
        StringBuilder sb = new StringBuilder(errorCorrectionCodewordCount);
        for (int i5 = errorCorrectionCodewordCount - 1; i5 >= 0; i5--) {
            char c2 = cArr[i5];
            if (c2 != 0) {
                cArr[i5] = (char) (929 - c2);
            }
            sb.append(cArr[i5]);
        }
        return sb.toString();
    }

    static int getErrorCorrectionCodewordCount(int i2) {
        if (i2 < 0 || i2 > 8) {
            throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
        }
        return 1 << (i2 + 1);
    }

    static int getRecommendedMinimumErrorCorrectionLevel(int i2) throws WriterException {
        if (i2 <= 0) {
            throw new IllegalArgumentException("n must be > 0");
        }
        if (i2 <= 40) {
            return 2;
        }
        if (i2 <= 160) {
            return 3;
        }
        if (i2 <= 320) {
            return 4;
        }
        if (i2 <= 863) {
            return 5;
        }
        throw new WriterException("No recommendation possible");
    }
}
