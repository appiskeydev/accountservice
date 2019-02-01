#!/usr/bin/env bash
export SERVICE_NAME=accountservice
./mvnw package
docker login -u gitlab-ci-token -p zVTStG4zXy8fseKHzD8c registry.gitlab.com

git add .
git commit -m "updated via script"
git push origin master

export VERSION=${git rev-parse --short HEAD}
echo  $VERSION

docker build -t registry.gitlab.com/resourceallocationsystem/$SERVICE_NAME:$VERSION .
docker push registry.gitlab.com/resourceallocationsystem/$SERVICE_NAME:$VERSION

cat .docs/deployment.yaml | sed -e "s/@KVERSION/$VERSION/g" | kubectl apply -f-

#kubectl delete -f ../rasroot/kube/local/deployment.yaml
#kubectl apply -f ../rasroot/kube/local/deployment.yaml