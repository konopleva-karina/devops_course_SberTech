# devops_course_SberTech

Написана ansible-роль, поднимающая docker-compose с одним контейнером, в котором запускается простое приложение на flask.

Собрать докер образ и стартовать контейнер, с которого будет запускаться ansible
```bash
docker build -t debian-ssh -f create-docker .

docker run -d -i -p 2200:22 -p 8002:8000 --name debian-ssh -v /var/run/docker.sock:/var/run/docker.sock debian-ssh
```

Запустить плейбук
```bash
ansible-playbook -i inventory.yml all.yml 
```
Troubleshooting: подключиться по ssh к контейнеру debian-ssh(root:password)
```bash
ssh root@127.0.0.1 -p 2200 
```
