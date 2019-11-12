pipeline {
  agent any
  stages {
    stage("Pull changes") {
      steps {
        bat 'git pull origin ${GIT_BRANCH}'
      }
    }
    stage("Clean and package") {
      steps {
        bat 'mvn clean package'
      }
    }
    stage("Commit changes") {
      bat 'git add .'
      bat 'git commit -m "push build  ``  [Finishes #169699626]"'
    }
    stage("Push changes to branch") {
      steps {
        bat 'git push origin HEAD'
      }
    }
    stage("Deploy") {
      steps {
        bat 'git push heroku master'
      }
    }
  }
}