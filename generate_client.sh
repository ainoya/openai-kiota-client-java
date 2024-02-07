#!/usr/bin/env bash

# Generate the client

docker run -v ${PWD}:/app/output \
        -v /${PWD}/openapi.yaml:/app/openapi.yaml \
        mcr.microsoft.com/openapi/kiota generate \
        -d /app/openapi.yaml \
        --language java \
        -n dev.ainoya.kiota.openai.generated \
        -o /app/output/src/main/java/dev/ainoya/kiota/openai/generated