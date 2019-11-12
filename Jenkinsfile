pipeline {
  agent any
  stages {
    stage('Deploy to heroku') {
      steps {
        bat 'git push heroku HEAD:master'
      }
    }
  }
}