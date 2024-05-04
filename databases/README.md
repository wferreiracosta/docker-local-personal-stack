# Database

## MySQL + phpMyAdmin

Executar Docker Compose:
```
docker compose -f databases/mysql/docker-compose-mysql.yaml up
```

Acessar phpMyAdmin:
```
http://localhost:80
```

Dados de login no phpMyAdmin:
```
Server: mysql
Username: root
Password: password
```

## Postgres + pgAdmin

Executar Docker Compose:
```
docker compose -f databases/postgres/docker-compose-postgres.yaml up
```

Acessar pgAdmin:
```
http://localhost:5050
```

Dados para login no pgAdmin:
```
Username: admin@admin.com
Password: password
```