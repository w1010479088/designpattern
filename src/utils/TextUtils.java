package utils;

public class TextUtils {
    public static boolean isEmpty(String content) {
        return content == null || "".equals(content);
    }

    public static boolean equals(String first, String second) {
        return !isEmpty(first) && !isEmpty(second) && first.equals(second);
    }
}
