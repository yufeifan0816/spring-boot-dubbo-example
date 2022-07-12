# 访问nacos查看服务
http://192.168.233.111:8848/nacos

# 使用本工程：2021年2月6日
1. docker安装zookeeper
2. docker安装nacos
3. 修改provider和consumer对应的IP地址
4. 启动provider和consumer访问成功

# 功能
1. consumer和provider都做了注册中心负载

# 多协议
## rest协议
1. api配置好@Path@GetRest风格添加相关rest依赖
2. provider的protocol把rest协议添加上
3. 就可以通过 http://localhost:8888/say?msg=%22test%22这个链接访问了

# nacos里查看服务
nacos 管理端地址为：http://192.168.100.111:8848/nacos

# 环境安装建议
1. nacos/mysql/zookeepr 都使用docker来安装<br>
