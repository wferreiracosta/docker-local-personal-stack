# AWS

## Localstack

[Documentation](https://docs.localstack.cloud/overview/)

Executar Docker Compose:
```
docker compose -f aws/docker-compose-localstack.yaml up
```

Para verificar os serviços AWS disponíveis e em execução no LocalStack:
```
http://localhost:4566/_localstack/health
```

Outros endpoints internos do Localstack:
```
https://docs.localstack.cloud/references/internal-endpoints/#localstack-endpoints
```