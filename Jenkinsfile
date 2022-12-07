pipeline {
    agent any
    stages{
        stage('Git Checkout'){
            steps{
               git 'https://github.com/ShrikarMukesh/devops-automation.git'
            }
        }
        stage('Unit testing'){
             steps{
                 sh 'mvn test'
             }
        }
         stage('Maven Build'){
               steps{
                   sh 'mvn clean install'
               }
         }
         stage('Static code Analysis'){
               steps{
                   script{
                       withSonarQubeEnv(credentialsId: 'sonar-api-key') {
                           sh 'mvn clean package sonar:sonar'
                       }
                   }
               }
         }
    }
}