# AWS

## Iniciar container

```
docker compose -f aws/docker-compose-localstack.yaml up
```

## Verificar serviços disponiveis
```
http://localhost:4566/health
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

## Acessar cli do container

```
docker exec -it localstack /bin/bash
```

## SQS

### Criando uma fila
```
aws --endpoint-url=http://0.0.0.0:4566 sqs create-queue --queue-name {nome-queue}
```
### Para verificar se a fila foi criada
```
aws --endpoint-url=http://0.0.0.0:4566 sqs list-queues
```
### Enviar mensagem para a fila
```
aws --endpoint-url=http://0.0.0.0:4566 sqs send-message --queue-url http://0.0.0.0:4566/000000000000/{nome-queue} --message-body 'Hello SQS World'
```
### Ler a mensagem
```
aws --endpoint-url=http://0.0.0.0:4566 sqs receive-message --queue-url http://0.0.0.0:4566/000000000000/{nome-queue}
```

## S3

### Criar bucket

```
aws --endpoint-url=http://localhost:4566 s3api create-bucket --bucket {nome-bucket}
```

### Listar todos os buckets
```
aws --endpoint-url=http://localhost:4566 s3api list-buckets
```

### Abrir arquivo
```
http://localhost:4566/{nome-bucket}/{nome-arquivo}
```
