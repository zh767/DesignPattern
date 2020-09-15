package com.zh.jdk;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/27
 */
public class RuntimeTest_singleton {
    public static void main(String[] args) {
        Runtime runtime;
    }
    /**
     * jdk源码实例: Runtime使用饿汉式实现单例
     * public class Runtime {
     *     private static Runtime currentRuntime = new Runtime();
     *
     *     private Runtime() {}
     *
     *     public static Runtime getRuntime() {
     *         return currentRuntime;
     *     }
     *
     */
}
