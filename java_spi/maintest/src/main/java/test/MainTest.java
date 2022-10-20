package test;

import service.PayService;

import java.util.ServiceLoader;

/*
* 通过java-spi项目展示springboot中的spi的原理,主要目的是为了解耦：
* 在service-common子模块中写入一个统一接口PayService
* 在ali-pay和wx-pay这两个子模块的pom.xml文件中绑定service-common的<artifactId>service-common</artifactId>，也就是PayService可以被ali-pay和wx-pay中使用
* 然后在ali-pay和wx-pay中根据实现的接口的具体类中写入不同的接口方法，
* 比如ali-pay中的AliPay类implement了PayService接口的然后实现了Pay方法的定义为输出”支付宝支付“，wx-pay中的WxPay类implement了PayService接口的然后实现了Pay方法的定义为输出”微信支付“
* 然后根据ServiceLoader类的规范是扫描 META-INF/services/ 下的路径，
* 所以需要在ali-pay和wx-pay的resources中添加META-INF.ervices文件夹，在里面放入名称为service.PayService(PayService的全路径)的文件，在文件内部写入service.impl.AliPay(Alipay类的全路径)/service.impl.WxPay(Wxpay类的全路径)。
* 根据上述操作之后，达到了ServiceLoader的规范使用，能被下列操作所利用：
* 在maintest项目的pom.xml文件中，写入统一接口service-common的artifactId和实际需要的子分块的artifactId(例如：ali-pay的artifactId和Wx-pay的artifactId)
* 在MainTest也就是本主类中，直接load PayService接口后，根据实际引入的依赖，来实现实际的接口功能。
* 本项目中依赖导入的是ali-pay的artifactId,所以运行此程序的后可以得到”支付宝支付"字样
* */

public class MainTest {

    public static void main(String[] args) {

        ServiceLoader<PayService> load = ServiceLoader.load(PayService.class);
        for (PayService payService : load) {
            System.out.println(payService);
            payService.pay();
        }

    }
}
