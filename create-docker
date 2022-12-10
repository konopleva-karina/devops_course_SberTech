FROM python:3.9-slim

EXPOSE 22

RUN apt update && apt install -y openssh-server
RUN pip install docker docker-compose ansible
RUN echo 'root:password' | chpasswd
RUN echo "PermitRootLogin yes\n" >> /etc/ssh/sshd_config

ENTRYPOINT service ssh restart && bash