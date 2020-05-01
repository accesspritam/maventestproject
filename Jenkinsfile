pipeline {
  agent any
  stages {
    stage('Welcome') {
      steps {
        echo 'Hello Pritam, Welcome to cloudbees jenkins'
      }
    }

    stage('RandomStage') {
      steps {
        pwd(tmp: true)
        sleep 5
        sh 'echo \'Jenkins cicd tool\''
      }
    }

  }
}