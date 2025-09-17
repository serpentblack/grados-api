# grados-api — Spring Boot + CI/CD + Render (puerto 8081)

Endpoints:
- `GET /grados/centtofahr/{grades}`
- `GET /grados/fahrtocent/{grades}`
- `GET /grados/centtokelv/{grades}`
- `GET /grados/kelvintocent/{grades}`

## Local
```bash
mvn -B -ntp clean verify
mvn spring-boot:run
# o:
mvn -DskipTests package
java -jar target/grados-api-1.0.0.jar
```
Prueba en http://localhost:8081/grados/centtofahr/0

## Docker (sin Maven local)
```bash
docker build -t grados-api .
docker run --rm -p 8081:8081 grados-api
```

## CI/CD
- `ci.yml` — CI en cualquier rama.
- `release.yml` — Release JAR al crear tag `v*`.
- `deploy-render.yml` — Deploy a Render (Deploy Hook) al crear tag `v*`.
