## Java 应用性能监控系统##

### 技术约束 ###
* 支持以Spring MVC +Spring+Mybaits 架构的Web系统
* 支持以Spring为基础的Dubbo服务
* 未来支持各类Web框架、并逐步解除对Spring的依赖，实现parent-child的多模块架构
* 性能优异,内存级别写入，秒集服务端采样，后期测试LTW AOP ，字节码注入技术（BCL）
* web工程项目 controller层面的aop采用web框架本身提供的拦截器处理，其他采用一般的aop做法实现

### 定位 ###
* 配置侵入式设计，更加人性化的系统监控，oneapm类的系统工具
* 在性能优化的工程实践中，充当先锋，后续配合各类调优工具，例如：jprofiler、jvisualvm,jmc，jstack，jmap等等，此类工具分析更加细节化。

###系统架构 ###
* 分布式架构设计，在各个监控agent上部署http server，在服务器端进行接入，服务器端支持其他api接入，监控系统级别内容（如redis监控、mysql监控、操作系统监控、网络监控）
* agent 提供基于restful 接口，数据格式为json

###系统功能规划（第一阶段）###
* controller统计、service方法统计功能（执行次数、执行时间、平均、最大最小）
* 提供内置http server
* 支持dubbo服务provider监控
* 支持SQL监控、redis监控、mongodb监控、dubbo服务性能监控(均是在client端视角，不提供服务器端视角）
* 实现单机版-先work
* 界面内置在agent内部，不提供api接口

###系统功能规划（第二阶段）###
* 整合系统级监控数据
* 整合对中间件系统监控
* 整合Ganglia、Graphite，提供图形化监控功能
* vue.js angualjs等前端框架重构
* 分布式架构重构

### 提供一揽子解决方案###
* 一套系统，一套命令、一套脚本、一套工具
* 完整覆盖Java系统后端性能优化



