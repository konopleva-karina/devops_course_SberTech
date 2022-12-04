FROM python:3.10.7-slim-buster

WORKDIR /usr/src/app

EXPOSE 5000

RUN pip install --upgrade pip
# COPY ./flask/requirements.txt /usr/src/app/requirements.txt
RUN pip install -r requirements.txt

# COPY . /usr/src/app/

CMD["flask", "--app", "hello", "run", "-p", "5000", "--host=0.0.0.0"]