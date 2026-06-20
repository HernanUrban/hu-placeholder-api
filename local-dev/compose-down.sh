#!/bin/bash

cd $(dirname "$0")
docker-compose -p cbl-placeholder-api down -v --remove-orphans