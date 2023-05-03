# AWS

## Iniciar container

```
docker compose -f aws/docker-compose-sqs.yaml up
```

## Acessar cli do container

```
docker exec -it localstack /bin/bash
```

### Verificar serviços ativos
```
https://0.0.0.0:4566/health
```
Exemplo:
```
{
    "services": {
        "sqs": "running"
    },
    "features": {
        "persistence": "disabled",
        "initScripts": "initialized"
    }
}

```

## SQS

### Criando uma fila
```
aws --endpoint-url=http://0.0.0.0:4566 sqs create-queue --queue-name my-queue
```
### Para verificar se a fila foi criada
```
aws --endpoint-url=http://0.0.0.0:4566 sqs list-queues
```
### Enviar mensagem para a fila
```
aws --endpoint-url=http://0.0.0.0:4566 sqs send-message --queue-url http://0.0.0.0:4566/000000000000/my-queue --message-body 'Hello SQS World'
```
### Ler a mensagem
```
aws --endpoint-url=http://0.0.0.0:4566 sqs receive-message --queue-url http://0.0.0.0:4566/000000000000/my-queue
```

## S3

### Criar bucket

```
aws --endpoint-url=http://localhost:4572 s3api create-bucket --bucket myBucketTest
```

### Listar todos os buckets
```
aws --endpoint-url=http://localhost:4572 s3api list-buckets
```