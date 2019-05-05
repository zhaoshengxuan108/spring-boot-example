# spring-boot-commandLineRunner

## CommandLineRunner

它的主要作用是在项目启动后，随后要执行的组件，而且我们还可以为这些要执行的组件设置执行顺序。

## 使用

在本项目中有三个执行组件，分别是：

* OrderRunner1
* OrderRunner2
* Runner

而OrderRunner1和OrderRunner2分别有注解@Order(1)和@Order(2)，这分别代表执行顺序，执行顺序是由小到大依次执行。运行该项目，得到如下结果：

![1557019736459](https://zhaoshengxuan108.github.io/assets/images/spring-boot-example/1557026057.jpg)

由上图可以看出这三个组件执行顺序，没有注解的Runner默认排到最后执行的。



## 参考



