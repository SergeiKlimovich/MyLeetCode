#!/bin/bash
# Получаем имя текущей ветки
branch_name=$(git branch --show-current)
# Добавляем все изменения
git add .

# Создаем коммит с названием ветки
git commit -m "$branch_name"

# Переключаемся на ветку main
git checkout main

# Мержим рабочую ветку в main
git merge "$branch_name"

# Обновляем remote ветку main
git push origin main