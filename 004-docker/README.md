手动打包：

    1,前往 Dockerfile 目录，打开命令行执行
    $ docker build -t spring-boot-demo-docker
    
    2,查看生成镜像
    $ docker images
    
    REPOSITORY                                                        TAG                 IMAGE ID            CREATED             SIZE
    spring-boot-demo-docker                                           latest	      bc29a29ffca0        2 hours ago         119MB
    openjdk                                                           8-jdk-alpine        97bc1352afde        5 weeks ago         103MB
    
    3,运行
    $ docker run -d -p 9099:9099 spring-boot-demo-docker
