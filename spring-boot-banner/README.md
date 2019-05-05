# spring-boot-banner

## Banner

Banner是一个有意思而又无实际用途的功能。具体是什么呢？在我们启动Spring Boot时，控制台会打印Spring Boot的Logo以及版本信息，其实这些信息我们是可以自己定义的，如何自定义，就得使用Banner接口来操作。

* org.springframework.boot.ResourceBanner

  > 文本格式，SpringBoot 会读取配置项banner.txt和banner.location，从配置项中获取真实的文件地址；如果配置中没有配置，会把配置项作为文件去加载；

* org.springframework.boot.ImageBanner

  > 图片格式，SpringBoot 加载配置项banner.image.location，从配置项中获取真实的路径，SpringBoot 会根据配置项的路径加载文件。
  > 如果没有配置banner.image.location，转而依次加载banner.gif、banner.jpg、 banner.png这三个中存在的文件；

## 使用

在spring-boot-banner项目resources目录添加文件banner.txt或banner.gif，注意文件名称不能改成别的。启动项目，会显示如下内容：

![1557019736459](https://zhaoshengxuan108.github.io/assets/images/spring-boot-example/1557024566.jpg)



输出这个Logo还有好多有意思的配置，如改变下颜色了，输出自定义的版本信息等。



## 参考

* [Spring Boot自定义Banner](https://www.jianshu.com/p/a53f324c92f2)

一些生成字符画工具

* [http://patorjk.com/software/taag](https://link.jianshu.com/?t=http://patorjk.com/software/taag)
* [http://www.network-science.de/ascii/](https://link.jianshu.com/?t=http://www.network-science.de/ascii/)
* [http://www.degraeve.com/img2txt.php](https://link.jianshu.com/?t=http://www.degraeve.com/img2txt.php)

