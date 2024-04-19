docker виртуальная машина:
https://hub.docker.com/r/atmoz/sftp/

создать image: 
docker pull atmoz/sftp

Простейший пример запуска докера
docker run -p 22:22 -d atmoz/sftp foo:pass:::upload


Пользователь «foo»
Пароль «pass» 
Порт 0.0.0.0

может войти в систему с помощью sftp и загружать файлы в папку с названием «upload».


пример приложения:
https://simplesolution.dev/spring-boot-sftp-file-transfer-using-jsch-java-library/
https://github.com/simplesolutiondev/spring-boot-sftp

настройка виртуальной машины от Яндекс.clouds
https://www.youtube.com/watch?v=4K8TzGTNS2

мой вэбсервер
https://console.yandex.cloud/folders/b1g5dfipqja2s8fm1k80/compute/instance/epd5o4qs8t548bliil6d/overview

подключение через консоль "cmd"
ssh testserver@ip-adress (пример 127.0.0.0.1)

