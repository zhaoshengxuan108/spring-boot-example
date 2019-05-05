# spring-boot-actuator

## Actuator

Actuator主要用来监控应用的。Actuator创建了所谓的endpoint来暴露HTTP或者JMX来监控和管理应用。举例说明：

1. /health 提供了关于应用健康的基础信息。
2. /metrics 显示JVM内存使用情况、系统CPU使用情况、打开文件等等。
3. /loggers 显示应用日志和可以让你在运行时改变日志等级。

## 使用

找到本示例中 com.egbert.actuator.StartSpringBootMain 主类运行，启动起来后。

访问地址：<http://localhost:8080/actuator>， 会显示所有通过HTTP暴露的endpoint，如下内容：

```json
{"_links":{"self":{"href":"http://localhost:8080/actuator","templated":false},"auditevents":{"href":"http://localhost:8080/actuator/auditevents","templated":false},"beans":{"href":"http://localhost:8080/actuator/beans","templated":false},"caches-cache":{"href":"http://localhost:8080/actuator/caches/{cache}","templated":true},"caches":{"href":"http://localhost:8080/actuator/caches","templated":false},"health":{"href":"http://localhost:8080/actuator/health","templated":false},"health-component-instance":{"href":"http://localhost:8080/actuator/health/{component}/{instance}","templated":true},"health-component":{"href":"http://localhost:8080/actuator/health/{component}","templated":true},"conditions":{"href":"http://localhost:8080/actuator/conditions","templated":false},"shutdown":{"href":"http://localhost:8080/actuator/shutdown","templated":false},"configprops":{"href":"http://localhost:8080/actuator/configprops","templated":false},"env":{"href":"http://localhost:8080/actuator/env","templated":false},"env-toMatch":{"href":"http://localhost:8080/actuator/env/{toMatch}","templated":true},"info":{"href":"http://localhost:8080/actuator/info","templated":false},"loggers":{"href":"http://localhost:8080/actuator/loggers","templated":false},"loggers-name":{"href":"http://localhost:8080/actuator/loggers/{name}","templated":true},"heapdump":{"href":"http://localhost:8080/actuator/heapdump","templated":false},"threaddump":{"href":"http://localhost:8080/actuator/threaddump","templated":false},"metrics":{"href":"http://localhost:8080/actuator/metrics","templated":false},"metrics-requiredMetricName":{"href":"http://localhost:8080/actuator/metrics/{requiredMetricName}","templated":true},"scheduledtasks":{"href":"http://localhost:8080/actuator/scheduledtasks","templated":false},"httptrace":{"href":"http://localhost:8080/actuator/httptrace","templated":false},"mappings":{"href":"http://localhost:8080/actuator/mappings","templated":false}}}
```

访问地址：<http://localhost:8080/actuator/health> ， 会显示如下内容：

```json
{"status":"UP","details":{"diskSpace":{"status":"UP","details":{"total":111998398464,"free":97433739264,"threshold":10485760}}}}
```

状态“UP”表示健康的，如显示“DOWN”则表示有异常了。主要显示磁盘空间等信息。

## 打开或关闭Actuator endpoints

如想打开shutdown endpoint，在application.properties中增加如下内容：

```properties
management.endpoint.shutdown.enabled=true
```

如想关闭，直接将true改为false即可。

## Actuator endpoints列表

| Endpoint ID    | Description                                                  |
| -------------- | ------------------------------------------------------------ |
| auditevents    | 显示应用暴露的审计事件 (比如认证进入、订单失败)              |
| info           | 显示应用的基本信息                                           |
| health         | 显示应用的健康状态                                           |
| metrics        | 显示应用多样的度量信息                                       |
| loggers        | 显示和修改配置的loggers                                      |
| logfile        | 返回log file中的内容(如果logging.file或者logging.path被设置) |
| httptrace      | 显示HTTP足迹，最近100个HTTP request/repsponse                |
| env            | 显示当前的环境特性                                           |
| flyway         | 显示数据库迁移路径的详细信息                                 |
| liquidbase     | 显示Liquibase 数据库迁移的详细信息                           |
| shutdown       | 让你逐步关闭应用                                             |
| mappings       | 显示所有的@RequestMapping路径                                |
| scheduledtasks | 显示应用中的调度任务                                         |
| threaddump     | 执行一个线程dump                                             |
| heapdump       | 返回一个GZip压缩的JVM堆dump                                  |

详细内容参考[官方文档](https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-endpoints.html)



## 参考

* [Spring Boot Actuator:健康检查、审计、统计和监控](<https://www.jianshu.com/p/d5943e303a1f>)



