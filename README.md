# devops-automation
Find Maven Installation
https://stackoverflow.com/questions/5312350/where-is-maven-installed-on-ubuntu

setup-sonarcube using docker image
https://www.youtube.com/watch?v=ZAfMauwNFuQ
MyGitHub SetUp for SonarCube: https://github.com/ShrikarMukesh/Devops-CI-CD/blob/main/sonar-cube

docker conatiner stop jksdhkcjsh
docker conatiner rm jksdhkcjsh

build docker image:
docker build -t devops-automation .
docker build -t my-java-app .
docker run -p 8080:8080 devops-automation

docker run -d --name sonarqube -p 9000:9000 sonarqube

docker run -d --name sonarqube -p 9000:9000 -v sonarqube_conf:/opt/sonarqube/conf -v sonarqube_extensions:/opt/sonarqube/extensions -v sonarqube_logs:/opt/sonarqube/logs -v sonarqube_data:/opt/sonarqube/data sonarqube

username: admin
password: admin (by default it will be admin but we need change)
