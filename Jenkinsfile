pipeline {
  agent any
  stages {
    stage('Add and commit') {
      steps {
        bat 'git add .'
        bat 'git commit -m "new commit"'
      }
    }
    stage('Deploy to heroku') {
      steps {
        bat 'git push heroku HEAD:master'
      }
    }
  }
}