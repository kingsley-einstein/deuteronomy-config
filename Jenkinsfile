pipeline {
  agent any
  stages {
    stage("Pull changes") {
      steps {
        bat 'git pull origin deployment'
      }
    }
    stage("Clean and package") {
      steps {
        bat 'mvn clean package -DskipTests'
      }
    }
    stage("Commit changes") {
      steps {
        bat 'git add .'
        bat 'git commit -m "push build  ``  [Finishes #169699626]"'
      }
    }
    stage("Push changes to branch") {
      steps {
        bat 'git push origin deployment'
      }
    }
    stage("Deploy") {
      steps {
        bat 'git push heroku master'
      }
    }
  }
}