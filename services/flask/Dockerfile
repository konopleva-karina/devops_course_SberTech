FROM python:3.10.7-slim-buster

WORKDIR /usr/src/app

EXPOSE 8000

RUN pip install --upgrade pip
COPY ./flask/requirements.txt /usr/src/app/requirements.txt
RUN pip install -r /usr/src/app/requirements.txt
RUN pip install docker 
RUN pip install docker-compose

COPY . /usr/src/app/

CMD ["flask", "--app", "/usr/src/app/hello", "run", "--port=8000", "--host=0.0.0.0"]