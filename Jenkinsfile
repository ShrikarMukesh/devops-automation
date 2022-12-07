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

    }

}