# devops_course_SberTech

Здесь простой maven-проект, в котором есть один класс Calculator с методом add, тест testAdd написан на этот метод.

Поднять docker compose с jenkins и sonarqube из папки hello
```bash
docker-compose --file docker-compose-jenkins.yml up
```

Отчёт Allure
![Allure](https://github.com/konopleva-karina/devops_course_SberTech/blob/hw_jenkins/screenshots/allure.png)

Отчёт Sonarqube (2 code smells - это просьба убрать модификатор public в классе и методе с тестом, но тогда maven не запустит этот тест)
![Sonarqube](https://github.com/konopleva-karina/devops_course_SberTech/blob/hw_jenkins/screenshots/sonarqube.png)
