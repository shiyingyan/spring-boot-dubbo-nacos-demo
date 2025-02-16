#### maven模块依赖问题

[nacos-sample-provider](nacos-sample-provider)模块下，直接执行`mvn clean compile`，
可能会报错，提示找不到父模块[spring-boot-dubbo-nacos-demo](spring-boot-dubbo-nacos-demo)。
错误原因，可能是父模块未编译到本地仓库目录，执行命令编译安装
```shell
mvn clean install -N
```

如果仍然无法解决，可能是本地仓库的缓存问题。先清理缓存
```shell
mvn dependency:purge-local-repository
```
