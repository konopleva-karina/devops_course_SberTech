# devops_course_SberTech

Запуск:
```bash
docker-compose -f docker-compose.prod.yml up -d --build
```

Создание БД
```bash
docker-compose -f docker-compose.yml exec web python manage.py create_db
```

Добавление в БД одной записи в качестве примера
```bash
docker-compose -f docker-compose.yml exec web python manage.py seed_db
```

Запускаются три контейнера: с PostgreSQL, приложением на Flask и Nginx'ом. В БД создается таблица `users`, в которую можно записывать email'ы. Nginx проксирует запросы к приложению. Есть три эндпоинта:
1. `http://0.0.0.0:1337/` - json с полями `"hello": "world"`
2. `http://0.0.0.0:1337/users` - список почт всех пользователей, добавленных в БД
3. `http://0.0.0.0:1337/static/hello.txt` - по пути `http://0.0.0.0:1337/static/*` Nginx отдаёт статику, в данном случае файл с содержимым `hi!`
