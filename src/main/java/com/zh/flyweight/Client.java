package com.zh.flyweight;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/29
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite = factory.getWebSiteCategory("新闻");
        WebSite webSite2 = factory.getWebSiteCategory("博客");
        User zs = new User("zs");
        User ls = new User("ls");
        webSite.use(zs);
        webSite2.use(ls);
        webSite2.use(zs);
        webSite.use(ls);
        System.out.println(factory.getWebSiteCount());
    }
}
