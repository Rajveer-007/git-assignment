# Task API

A minimal Task/Todo REST API (Spring Boot 3.2, Java 17, Maven) demonstrating a full DevOps pipeline:
Git -> Maven -> Jenkins CI (with tests) -> Ansible -> Docker -> Kubernetes (with scaling + ConfigMap).

## Endpoints

| Method | Path                | Description                           |
|--------|---------------------|---------------------------------------|
| GET    | `/api/todos`        | List all tasks                        |
| POST   | `/api/todos`        | Create a task `{"title":"..."}` (201) |
| GET    | `/api/todos/{id}`   | Get one task, or 404                  |
| GET    | `/actuator/health`  | Health check                          |

## Run locally

    mvn clean package
    java -jar target/taskapi.jar

Port 8080 by default (override with `SERVER_PORT`).
