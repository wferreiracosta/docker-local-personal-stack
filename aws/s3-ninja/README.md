# S3 Ninja

## Rodando pelo terminal
```
1º A readily packaged docker image is available at scireum/s3-ninja

2º Run like docker run -p 9444:9000 scireum/s3-ninja:latest

3º Navigate to http://localhost:9444/ui

4º Run S3 API-Calls against http://localhost:9444/ (e.g. http://localhost:9444/test-bucket/test-object)

5º Provide an volume for /home/sirius/data to persist data across restarts.

6º S3Ninja runs as user id 2000 inside the container. If you link an existing directory into your container, change the user/group id to 2000.
```

## Rodando com docker-compose

### Iniciando container
```
docker compose -f "aws\ninja\docker-compose-s3-ninja.yaml" up -d --build
```

### Acessando a interface
```
http://localhost:9444/ui
```