# devops_course_SberTech

Запускаются сервисы из лабы #1

Скрипты для запуска
```bash
minikube start --driver=docker --force
kubectl create -f db.yaml
kubectl create -f nginx.yaml
kubectl create -f web.yaml
```
