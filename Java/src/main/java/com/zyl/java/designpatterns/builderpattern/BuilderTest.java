package com.zyl.java.designpatterns.builderpattern;

/**
 * @author 4869
 *  建造者模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。即将建造复杂对象的过程和组成对象的部件解耦
 *  建造者模式包含如下角色：
 *   Builder：抽象建造者(Builder)
 *   ConcreteBuilder：具体建造者(CommonBuilder、SuperBuilder)
 *   Director：指挥者(Director)
 *  Product：产品角色(Role)
 *  应用场景：
 * 需要生成的产品对象有复杂的内部结构，这些产品对象通常包含多个成员属性
 * 需要生成的产品对象的属性相互依赖，需指定其生成顺序
 *   对象的创建过程独立于创建该对象的类。在建造者模式中引入指挥者类，将创建过程封装在指挥者类中，而不在建造者类中
 *   隔离复杂对象的创建和使用，并使得相同的创建过程可创建不同的产品
 *
 *  优点：
 *  建造者模式的封装性很好。使用建造者模式可以有效的封装变化，在使用建造者模式的场景中，一般产品类和建造者类是比较稳定的，因此，将主要的业务逻辑封装在导演类中对整体而言可以取得比较好的稳定性。
 * 在建造者模式中，客户端不必知道产品内部组成的细节，将产品本身与产品的创建过程解耦，使得相同的创建过程可以创建不同的产品对象。
 * 可以更加精细地控制产品的创建过程 。将复杂产品的创建步骤分解在不同的方法中，使得创建过程更加清晰，也更方便使用程序来控制创建过程。
 * 其次，建造者模式很容易进行扩展。如果有新的需求，通过实现一个新的建造者类就可以完成，基本上不用修改之前已经测试通过的代码，因此也就不会对原有功能引入风险。符合开闭原则。
 * 缺点
 * 建造者模式所创建的产品一般具有较多的共同点，其组成部分相似，如果产品之间的差异性很大，则不适合使用建造者模式，因此其使用范围受到一定的限制。
 * 如果产品的内部变化复杂，可能会导致需要定义很多具体建造者类来实现这种变化，导致系统变得很庞大。
 */
public class BuilderTest {
    public static void main(String[] args) {

        Director director = new Director();
        AbstractBuilder commonBuilder = new CommonRoleBuilder();

        director.construct(commonBuilder);
        Role commonRole = commonBuilder.getResult();
        System.out.println(commonRole);

    }
}
