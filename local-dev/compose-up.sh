#!/bin/bash

cd $(dirname "$0")
docker-compose -p cbl-placeholder-api up -d --build --remove-orphans