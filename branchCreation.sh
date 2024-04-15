#!/bin/bash

# Введите имя новой ветки
echo "Введите имя новой ветки:"
# shellcheck disable=SC2162
read BRANCH_NAME

# Создание новой ветки
git branch "$BRANCH_NAME"

# Переход на созданную ветку
git checkout "$BRANCH_NAME"