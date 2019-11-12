pipeline {
  agent any
  stages {
    stage("Set git global credentials") {
      steps {
        bat 'git config --global user.email "javaprodigy56@gmail.com"'
        bat 'git config --global user.name "Kingsley Victor"'
      }
    }
    stage("Clean and package") {
      steps {
        bat 'mvn clean package -DskipTests'
      }
    }
    stage("Deploy") {
      steps {
        bat 'git push heroku master'
      }
    }
  }
}