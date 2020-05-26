# 基础镜像
FROM openjdk:8-jdk-alpine

# 作者信息
MAINTAINER "huan.liu 963799127@qq.com"

# 添加一个存储空间,VOLUME 指向了一个/tmp的目录，由于Spring Boot使用内置的Tomcat容器，Tomcat 默认使用/tmp作为工作目录。这个命令的效果是：在宿主机的/var/lib/docker目录下创建一个临时文件并把它链接到容器中的/tmp目录
VOLUME /tmp

# 暴露9099端口
EXPOSE 9099

# 添加变量，如果使用dockerfile-maven-plugin，则会自动替换这里的变量内容
ARG JAR_FILE=target/spring-boot-demo-docker.jar

# 往容器中添加jar包
ADD ${JAR_FILE} app.jar

# 启动镜像自动运行程序
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/urandom","-jar","/app.jar"]
