#!/bin/bash
# Получаем имя текущей ветки
branch_name=$(git branch --show-current)
# Добавляем все изменения
git add .

# Создаем коммит с названием ветки
git commit -m "$branch_name"

# Пушим в репо
git push origin "$branch_name"