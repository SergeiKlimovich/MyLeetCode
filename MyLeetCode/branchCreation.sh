#!/bin/bash

# Введите имя новой ветки
echo "Введите имя новой ветки:"
read BRANCH_NAME

# Переход на ветку main
git checkout main

# Обновление ветки main
git pull

# Создание новой ветки
git branch $BRANCH_NAME

# Переход на созданную ветку
git checkout $BRANCH_NAME