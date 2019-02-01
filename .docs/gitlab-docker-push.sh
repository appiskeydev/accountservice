#!/usr/bin/env bash
./mvnw package
docker login -u gitlab-ci-token -p zVTStG4zXy8fseKHzD8c registry.gitlab.com

git add .
git commit -m "updated via script"
git push origin master

export VERSION=${git rev-parse --short HEAD}

docker build -t registry.gitlab.com/resourceallocationsystem/accountservice .
docker push registry.gitlab.com/resourceallocationsystem/accountservice

#kubectl set image deployment/accountservice accountservice=registry.gitlab.com/resourceallocationsystem/accountservice:latest

cat .docs/6-accountservice.yaml | sed -e "s/@KVERSION/$VERSION/g" | kubectl apply -f-

#kubectl delete -f ../rasroot/kube/local/6-accountservice.yaml
#kubectl apply -f ../rasroot/kube/local/6-accountservice.yaml