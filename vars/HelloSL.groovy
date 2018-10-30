#!/usr/bin/env groovy

def call(deploy) {
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
