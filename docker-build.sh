#!/usr/bin/env bash
set -euo pipefail

IMAGE_NAME="hu-placeholder-api"
IMAGE_TAG="${1:-latest}"

./mvnw package -DskipTests -q
docker build -t "${IMAGE_NAME}:${IMAGE_TAG}" .
echo "Built ${IMAGE_NAME}:${IMAGE_TAG}"
