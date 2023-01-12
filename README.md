# devops_course_SberTech

Запуск одностраничного приложения на Flask:

```bash
docker image build -t flask_docker .
docker run -d -p 8001:8001 --name flask_app flask_docker
```

Теперь можно перейти на `http:://0.0.0.0:8001` и увидеть страничку.
