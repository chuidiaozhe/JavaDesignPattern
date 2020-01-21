package flyweight;

public class Client {
    public static void main(String[] args){

        //创建一个工厂类
        WebSiteFactory factory = new WebSiteFactory();

        //客户需要一个以新闻形式发布的网站
        WebSite webSite = factory.getWebSiteCategory("新闻");
        webSite.use(new User("tom"));

        //客户需要一个以博客形式发布的网站
        WebSite webSite1 = factory.getWebSiteCategory("博客");
        webSite1.use(new User("jacak"));

        //客户需要一个以博客形式发布的网站
        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use(new User("smith"));

        //客户需要一个以博客形式发布的网站
        WebSite webSite3 = factory.getWebSiteCategory("博客");
        webSite3.use(new User("king"));

        System.out.println("网站的分类共 = " + factory.getWebSiteCount());
    }
}
