pipeline {
  agent any
  stages {
    stage('ParallelStageExample') {
      parallel {
        stage('Ping Jenkins') {
          steps {
            echo 'Welcome to cloudbees jenkins'
          }
        }

        stage('Ping Pritam') {
          steps {
            echo 'Pritam'
          }
        }

        stage('Ping Tejas') {
          steps {
            echo 'Hello Tejas'
          }
        }

        stage('Ping Shaila') {
          steps {
            echo 'Hello Shaila'
          }
        }

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