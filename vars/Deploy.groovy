def call(Map pipelineParams) {
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
