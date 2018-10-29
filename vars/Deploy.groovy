def call(Map Deploy) {
pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
             sh  'mvn clean install'
                
            }
        }
    }
 }
 }
